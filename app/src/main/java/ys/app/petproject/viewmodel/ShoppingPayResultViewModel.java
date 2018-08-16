package ys.app.petproject.viewmodel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.os.Build;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.PayListActivity;
import ys.app.petproject.activity.ShoppingPayResultActivity;
import ys.app.petproject.databinding.ActivityShoppingPayResultBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.shangmi.printer.AidlUtil;
import ys.app.petproject.shangmi.printer.BlueToothPrintUtil;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.CustomDialog;

/**
 * Created by aaa on 2017/3/16.
 */

public class ShoppingPayResultViewModel extends BaseActivityViewModel {

    private final ShoppingPayResultActivity mActivity;
    private final ApiClient<BaseListResult<OrderInfo>> mClient;
    private final ActivityShoppingPayResultBinding mBinding;
    private final ApiClient<BaseResult> mUpdateClient;
    public ObservableBoolean isOrderErrorVisible = new ObservableBoolean(false);
    public ObservableBoolean obIsPaySuccess = new ObservableBoolean(false);
    public ObservableField<String> obSelectPayType = new ObservableField<>();
    public ObservableField<String> obSelectOrderNo = new ObservableField<>();
    public ObservableField<String> obSelectPayMoney = new ObservableField<>();
    private int countHttp;
    private CustomDialog dialog;
    private String mOrderNo;
    private boolean mIsVipPay;
    private OrderInfo mOrderInfo;

    public ShoppingPayResultViewModel(ShoppingPayResultActivity activity, ActivityShoppingPayResultBinding binding) {
        this.mActivity = activity;
        this.mClient = new ApiClient<>();
        this.mUpdateClient = new ApiClient<>();
        this.mBinding = binding;

    }

    public void setIntentData(String orderNo, boolean isVipPay, boolean isPaySucces) {

        this.mOrderNo = orderNo;
        this.mIsVipPay = isVipPay;
        loadDataHttp();


    }


    @Override
    public void reloadData(View view) {
        loadDataHttp();
    }

    private void loadDataHttp() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            countHttp++;
            getData();
        } else {//无网显示断网连接
            countHttp = 0;
            isNetWorkErrorVisible.set(true);
            mActivity.showToast(Constants.network_error_warn);
        }
    }

    private void getData() {
        isLoadingVisible.set(true);
        Map<String, String> params = new HashMap<>();
        params.put("orderId", mOrderNo);
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        mClient.reqApi("queryOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<OrderInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<OrderInfo> result) {
                        isLoadingVisible.set(false);
                        List<OrderInfo> data = result.getData();
                        if (data.size() != 0) {
                            OrderInfo orderInfo = data.get(0);

                            if (!"1".equals(orderInfo.getStatus())) {
                                onceMore();
                            } else {
                                setData(orderInfo);
                            }
                        } else {
                            onceMore();
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        isLoadingVisible.set(false);
                        onceMore();
                        super.onError(e);
                    }
                });

    }


    private void onceMore() {
        if (countHttp == 5) {
            isOrderErrorVisible.set(true);
        } else {
            loadDataHttp();
        }
    }

    private void setData(OrderInfo resultInfo) {
        if (resultInfo.getIsClassification()==1){
            mBinding.rlShoppingPayMoney.setVisibility(View.GONE);
        }
        this.mOrderInfo = resultInfo;
        obIsPaySuccess.set(true);
        obSelectPayMoney.set(resultInfo.getRealAmt() + "");
        obSelectPayType.set(AppUtil.getPayType(resultInfo.getPayedMethod()));
        obSelectOrderNo.set(resultInfo.getOrderNo());

        printPayInformation();
    }

    public void clickLeftButton(View v) {
        if (obIsPaySuccess.get()) {//支付成功,补打小票
            printPayInformation();
        } else {//支付失败,取消支付
            showDialog();
        }

    }


    public void clickRightButton(View v) {
        if (obIsPaySuccess.get()) {//支付成功,确定
            mActivity.finish();
        } else {//支付失败,挂单
            insertPayListHttp();
        }
    }

    private void showDialog() {
        if (dialog == null) {
            dialog = new CustomDialog(mActivity);
            dialog.setContent("确定放弃此订单?");
            dialog.setCancelVisiable();
            dialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    mActivity.finish();
                }
            });
        }
        dialog.show();
    }

    /**
     * 加入待支付订单中
     */
    private void insertPayListHttp() {
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("orderId", mOrderNo);
        params.put("type", "0");
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mUpdateClient.reqApi("updateOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            mActivity.turnToActivityByFinish(PayListActivity.class);
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                        mActivity.showToast(e.toString());
                    }
                });

    }


    /**
     * 打印支付信息
     * isSupply:是否是补打小票
     */
    private void printPayInformation() {
        if (mOrderInfo.getIsClassification()==1){
            if ("M1".equals(Build.MODEL)) {
                BlueToothPrintUtil.getInstance().printNumOrderPayInformation(mOrderInfo);
            } else {
                AidlUtil.getInstance().printNumOrderPayInformation(mOrderInfo);
            }
        }else{
            if ("M1".equals(Build.MODEL)) {
                BlueToothPrintUtil.getInstance().printOrderPayInformation(mOrderInfo);
            } else {
                AidlUtil.getInstance().printOrderPayInformation(mOrderInfo);
            }
        }

    }

}
