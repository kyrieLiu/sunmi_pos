package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.RefundMoneyResultActivity;
import ys.app.petproject.activity.TransactionDetailActivity;
import ys.app.petproject.adapter.ModifyTransactionAdapter;
import ys.app.petproject.adapter.TransactionDetailAdapter;
import ys.app.petproject.databinding.TransactionDetailBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.ChargeResultInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.model.RefundResult;
import ys.app.petproject.shangmi.printer.AidlUtil;
import ys.app.petproject.shangmi.printer.BlueToothPrintUtil;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.Logger;
import ys.app.petproject.utils.CashierSign;
import ys.app.petproject.widget.FullyLinearLayoutManager;
import ys.app.petproject.widget.dialog.DeleteDialog;
import ys.app.petproject.widget.dialog.SelectDialog;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;

/**
 * Created by admin on 2017/6/11.
 */

public class TransactionDetailViewModel extends BaseActivityViewModel {
    private TransactionDetailActivity mActivity;
    private final TransactionDetailBinding mBinding;
    private TransactionDetailAdapter mAdapter;
    public OrderInfo orderInfo;
    private android.os.Handler mHandler = new android.os.Handler();
    public ObservableBoolean isVis = new ObservableBoolean(false);
    private ApiClient<BaseResult> mApiClient;
    private ApiClient<BaseListResult<ChargeResultInfo>> mClient;
    private List<EmployeeInfo> mEmployeeInfos;
    private ModifyTransactionAdapter mModifyTransactionAdapter;
    private SelectDialog mTypeSelectDialog;
    private EmployeeInfo mEmployeeInfo;
    private List<OrderInfo.RechargeListBean> mRechargeList;
    public OrderInfo.RechargeListBean mRechargeListBean;
    public ObservableBoolean obIsChargeType = new ObservableBoolean(false);
    private RxManager rxManager;
    private Map<String, String> params = new HashMap<String, String>();
    public ObservableField<String> orderMoney = new ObservableField<>();

    DeleteDialog mConfirmDeleteDialog;

    public TransactionDetailViewModel(TransactionDetailActivity activity, TransactionDetailBinding binding, OrderInfo orderInfo) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.orderInfo = orderInfo;
    }

    public void init() {
        String orderType = this.orderInfo.getOrderInfo();
        if (!TextUtils.isEmpty(orderType)) {
            if (orderType.contains("充值")) {
                obIsChargeType.set(true);
                mRechargeList = this.orderInfo.getRechargeList();
                if (mRechargeList != null && !mRechargeList.isEmpty()) {
                    mRechargeListBean = mRechargeList.get(0);
                    Logger.e(mRechargeListBean.getUserName());
                    isVis.set(true);
                } else {
                    isVis.set(false);
                }
            }
        }
        if (orderInfo.getRealAmt() < 0) {
            orderMoney.set("-¥" + AppUtil.formatStandardMoney(0 - orderInfo.getRealAmt()));
        } else {
            orderMoney.set("¥" + AppUtil.formatStandardMoney(orderInfo.getRealAmt()));
        }
        mAdapter = new TransactionDetailAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new FullyLinearLayoutManager(mActivity));
        mBinding.recyclerView.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division_line));
        mBinding.recyclerView.setAdapter(mAdapter);
        mAdapter.setOrderInfo(this.orderInfo);
        final List<OrderInfo.OrderDetailedListBean> orderDetailedList = this.orderInfo.getOrderDetailedList();
        mAdapter.setList(0, orderDetailedList);
        mBinding.recyclerView.setNestedScrollingEnabled(false);
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                mBinding.scrollView.smoothScrollTo(0, 0);
            }
        });

        if (rxManager == null) {
            rxManager = new RxManager();
        }
        rxManager.on(Constants.type_today_achivement_detail, new Action1<Integer>() {

            @Override
            public void call(Integer action) {
                if ("M1".equals(Build.MODEL)){
                    BlueToothPrintUtil.getInstance().printRefoundItemInformation(orderDetailedList.get(action));
                }else{
                    AidlUtil.getInstance().printRefoundItemInformation(orderDetailedList.get(action));
                }

                orderDetailedList.get(action).setIsRefund(1);
                mAdapter.setList(0, orderDetailedList);
                mActivity.canRefund = false;
            }
        });
    }

    /**
     * 修改绩效
     */
    public void modifyClick() {
        mEmployeeInfos = GreenDaoUtils.getSingleTon().getmDaoSession().getEmployeeInfoDao().loadAll();
        if (mModifyTransactionAdapter == null) {
            if (mEmployeeInfos != null) {
                for (EmployeeInfo info : mEmployeeInfos) {
                    if (info.isSelect()) {
                        info.setSelect(false);
                    }
                }
            }
            mModifyTransactionAdapter = new ModifyTransactionAdapter(mActivity, mEmployeeInfos);
            mTypeSelectDialog = new SelectDialog(mActivity, mModifyTransactionAdapter);
            mTypeSelectDialog.setListenner(new SelectDialog.SelectListenner() {
                @Override
                public void onSelect(int position) {
                    mEmployeeInfo = mEmployeeInfos.get(position);
                    updateRecharge();
                }
            });
        } else {
            mTypeSelectDialog.setModifyTransactionData(mEmployeeInfos);
        }

        mTypeSelectDialog.show();

    }

    /**
     * 校验店长密码
     */
    public void showConfirmDialog() {
        if (mActivity == null) {
            return;
        }
        if (mConfirmDeleteDialog == null){
            mConfirmDeleteDialog = new DeleteDialog(mActivity);
        }
        mConfirmDeleteDialog.setOkVisiable(new DeleteDialog.IDeleteDialogCallback() {
            @Override
            public void verificationPwd(boolean b) {
                if (b) {
                    if (mConfirmDeleteDialog != null) {
                        mConfirmDeleteDialog.dismiss();
                    }
                    modifyClick();
                } else {
                    Toast.makeText(mActivity, "密码输入错误请重新输入", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onDismiss() {
                mConfirmDeleteDialog = null;
            }
        });
        mConfirmDeleteDialog.show();
    }

    private void updateRecharge() {
        if (mApiClient == null) {
            mApiClient = new ApiClient<BaseResult>();
        }
        params.clear();
        params.put("shopId", orderInfo.getShopId() + "");
        params.put("branchId", SpUtil.getBranchId() + "");
        params.put("headOfficeId", SpUtil.getHeadOfficeId() + "");
        params.put("id", mRechargeListBean.getId() + "");
        params.put("userId", mEmployeeInfo.getId() + "");
        params.put("userName", mEmployeeInfo.getName());
        mApiClient.reqApi("updateRecharge", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult baseResult) {
                        if (baseResult.isSuccess()) {
                            if (rxManager == null) {
                                rxManager = new RxManager();
                            }
                            rxManager.post(Constants.type_today_achivement, 0);
                            mRechargeListBean.setUserName(mEmployeeInfo.getName());
                            showToast(mActivity, "修改成功");
                        } else {
                            showToast(mActivity, baseResult.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }


    /**
     * 补打小票
     */
    public void printOrder(TextView tv_print) {
        List<OrderInfo.RechargeListBean> mRechargeList = orderInfo.getRechargeList();
        if (mRechargeList != null && !mRechargeList.isEmpty()) {
            getRechargeOrder(orderInfo.getOrderNo(), tv_print);
        } else {
            if (orderInfo.getIsClassification() == 1) {
                if ("M1".equals(Build.MODEL)) {
                    BlueToothPrintUtil.getInstance().printNumOrderPayInformation(orderInfo);
                } else {
                    AidlUtil.getInstance().printNumOrderPayInformation(orderInfo);
                }
            } else {
                if ("M1".equals(Build.MODEL)) {
                    BlueToothPrintUtil.getInstance().printOrderPayInformation(orderInfo);
                } else {
                    AidlUtil.getInstance().printOrderPayInformation(orderInfo);
                }
            }
        }
    }

    private void getRechargeOrder(String orderNO, final TextView tv_print) {
        params.clear();
        params.put("orderId", AppUtil.getOrderNoCutRandom(orderNO));
        params.put("branchId", SpUtil.getBranchId() + "");
        params.put("headOfficeId", SpUtil.getHeadOfficeId() + "");

        mActivity.showRDialog();
        tv_print.setTextColor(mActivity.getResources().getColor(R.color.input_grey));
        tv_print.setEnabled(false);
        if (mClient == null) {
            mClient = new ApiClient<>();
        }
        mClient.reqApi("queryChargeOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ChargeResultInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ChargeResultInfo> result) {
                        mActivity.hideRDialog();
                        tv_print.setTextColor(mActivity.getResources().getColor(R.color.color_main));
                        tv_print.setEnabled(true);
                        List<ChargeResultInfo> data = result.getData();
                        if (data.size() != 0) {
                            ChargeResultInfo chargeResultInfo = data.get(0);
                            ChargeResultInfo.OrderDetailedListBean chargeDetail = chargeResultInfo.getRechargeList().get(0);
                            if ("1".equals(chargeResultInfo.getStatus())) {
                                if ("M1".equals(Build.MODEL)){
                                    BlueToothPrintUtil.getInstance().printChargePayInformation(chargeResultInfo, chargeDetail);
                                }else{
                                    AidlUtil.getInstance().printChargePayInformation(chargeResultInfo, chargeDetail);
                                }

                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        tv_print.setTextColor(mActivity.getResources().getColor(R.color.color_main));
                        tv_print.setEnabled(true);
                        mActivity.hideRDialog();
                        mActivity.showToast("网络异常,请稍后重试!");
                    }
                });

    }

    /**
     * 退款
     */
    public void turnBackMoney() {

        long time = System.currentTimeMillis();
        Map<String, String> params = new HashMap();

        params.put("mchNo", SpUtil.getSandMchNo());
        params.put("orderNo", orderInfo.getRandomOrderNo());
        params.put("gwTradeNo", orderInfo.getCashierTradeNo());
        params.put("refundNo", time + "");
        params.put("refundAmount", orderInfo.getTotalAmt() + "");
        params.put("timeStamp", time + "");

        String sign = CashierSign.getSign(SpUtil.getSandKey(), params);
        params.put("sign", sign);
        ApiClient<RefundResult> client = new ApiClient<>();
        mActivity.showRDialog();
        client.reqOtherURL("doRefund", params, ApiRequest.RespDataType.RESPONSE_JSON, Constants.base_sand_url)
                .updateUI(new Callback<RefundResult>() {
                    @Override
                    public void onSuccess(RefundResult refundResult) {
                        mActivity.hideRDialog();
                        if ("SUCCESS".equals(refundResult.getResult())) {
                            updateOrder(orderInfo.getCashierTradeNo());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        showToast(mActivity, "网络异常,请稍后再试");
                    }
                });
    }

    /**
     * 退款后改变订单状态
     */
    public void updateOrder(String cashierTradeNo) {
        if (mApiClient == null) {
            mApiClient = new ApiClient<BaseResult>();
        }
        params.clear();
        params.put("shopId", SpUtil.getShopId());
        params.put("branchId", SpUtil.getBranchId() + "");
        params.put("headOfficeId", SpUtil.getHeadOfficeId() + "");
        params.put("orderNo", orderInfo.getOrderNo());
        params.put("cashierTradeNo", cashierTradeNo);
        mActivity.showRDialog();
        mApiClient.reqApi("refundOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult baseResult) {
                        mActivity.hideRDialog();
                        if (baseResult.isSuccess()) {
                            if (rxManager == null) {
                                rxManager = new RxManager();
                            }
                            rxManager.post(Constants.type_today_achivement, 0);
                            Intent intent = new Intent(mActivity, RefundMoneyResultActivity.class);
                            intent.putExtra(Constants.intent_info, orderInfo);
                            mActivity.startActivity(intent);
                            mActivity.finish();
                        } else {
                            showToast(mActivity, baseResult.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                    }
                });
    }

    public void reset() {
        if (mApiClient != null) {
            mApiClient.reset();
            mApiClient = null;
        }
        if (mClient != null) {
            mClient.reset();
            mClient = null;
        }
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
            mHandler = null;
        }
        mActivity = null;
        mTypeSelectDialog = null;
        mEmployeeInfo = null;
        if (mEmployeeInfos != null) {
            mEmployeeInfos.clear();
        }
        if (rxManager != null) {
            rxManager.clear();
            rxManager = null;
        }
        mEmployeeInfos = null;
        mModifyTransactionAdapter = null;
        mAdapter = null;

    }
}
