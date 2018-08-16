package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.vip.PayActivity;
import ys.app.petproject.activity.vip.PayResultActivity;
import ys.app.petproject.databinding.ActivityPayResultBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.model.ChargeResultInfo;
import ys.app.petproject.shangmi.printer.AidlUtil;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.CustomDialog;

/**
 * Created by aaa on 2017/3/2.
 */

public class PayResultViewModel extends BaseActivityViewModel {

    private final PayResultActivity mActivity;
    private final ApiClient<BaseListResult<ChargeResultInfo>> mClient;
    private final ActivityPayResultBinding mBinding;
    public ObservableInt obSelectPayResultImg = new ObservableInt(R.mipmap.chongzhichenggong);
    public ObservableBoolean seePresenterMoney = new ObservableBoolean(false);
    public ObservableField<String> presenterMoney = new ObservableField<String>();


    public ObservableBoolean isOrderErrorVisible = new ObservableBoolean(false);
    public ObservableField<String> obSelectPayMoney = new ObservableField<>();
    public ObservableField<String> obSelectPayType = new ObservableField<>();
    public ObservableField<String> obSelectOrderNo = new ObservableField<>();
    private int countHttp;
    public ObservableBoolean obIsPaySuccess = new ObservableBoolean(false);
    private ChargeInfo mChargeInfo;
    private CustomDialog mBackDialog;
    private ChargeResultInfo mChargeResultInfo;
    private ChargeResultInfo.OrderDetailedListBean chargeDetail;
    private String orderNO;

    public PayResultViewModel(PayResultActivity activity, ActivityPayResultBinding binding) {
        this.mActivity = activity;
        this.mClient = new ApiClient<>();
        this.mBinding = binding;
    }

    public void setIntentData(ChargeInfo chargeInfo,String orderNO) {
        this.mChargeInfo = chargeInfo;
        this.orderNO=orderNO;
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
        params.put("orderId", orderNO);
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        mClient.reqApi("queryChargeOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ChargeResultInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ChargeResultInfo> result) {
                        isLoadingVisible.set(false);
                        List<ChargeResultInfo> data = result.getData();
                        if (data.size() != 0) {
                            ChargeResultInfo chargeResultInfo = data.get(0);
                             chargeDetail=chargeResultInfo.getRechargeList().get(0);
                            if (!"1".equals(chargeResultInfo.getStatus())) {
                                isOrderErrorVisible.set(true);
                            } else {
                                setData(chargeResultInfo);
                            }
                        } else {
                            isOrderErrorVisible.set(true);
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

    private void setData(ChargeResultInfo resultInfo) {
        this.mChargeResultInfo = resultInfo;
        obIsPaySuccess.set(true);
        obSelectPayResultImg.set(R.mipmap.chongzhichenggong);
        obSelectPayMoney.set(AppUtil.formatStandardMoney(resultInfo.getRealAmt()));
        obSelectPayType.set(AppUtil.getPayType(resultInfo.getPayedMethod()));
        obSelectOrderNo.set(resultInfo.getOrderNo());
        presenterMoney.set(AppUtil.formatStandardMoney(chargeDetail.getPresentAmt()));
        if (chargeDetail.getPresentAmt()>0){seePresenterMoney.set(true);}
        printPayInformation();
    }

    public void onClickButton(View view) {
        if (obIsPaySuccess.get()) {
            mActivity.finish();
        } else {//重新支付
            Intent intent = new Intent(mActivity, PayActivity.class);
            intent.putExtra(Constants.intent_info, mChargeInfo);
            mActivity.startActivity(intent);
            mActivity.finish();
        }
    }

    public void onClickPrintReceipt(View view) {
        if (obIsPaySuccess.get()) {
            printPayInformation();
        } else {//取消
            showDialog();
        }
    }

    public void showDialog() {
        if (mBackDialog == null) {
            mBackDialog = new CustomDialog(mActivity);
            mBackDialog.setContent("确认放弃此订单？");
            mBackDialog.setCancelVisiable();
            mBackDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mBackDialog.dismiss();
                    mActivity.finish();
                }
            });
        }
        if (!mActivity.isFinishing()) {
            mBackDialog.show();
        }
    }
    /**
     * 打印支付信息
     * isSupply:是否是补打小票
     */
    private void printPayInformation() {
        AidlUtil.getInstance().printChargePayInformation(mChargeResultInfo,chargeDetail);
    }
}
