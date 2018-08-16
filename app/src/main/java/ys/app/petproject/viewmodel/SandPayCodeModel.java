package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.ShoppingPayResultActivity;
import ys.app.petproject.activity.ScanPayActivity;
import ys.app.petproject.activity.vip.PayResultActivity;
import ys.app.petproject.databinding.SunmiScanBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.model.OrderCancelResult;
import ys.app.petproject.model.OrderPayParam;
import ys.app.petproject.model.OrderPayResult;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.utils.CashierSign;
import ys.app.petproject.widget.dialog.CustomDialog;

/**
 * Created by WBJ on 2018/4/13 17:29.
 */

public class SandPayCodeModel extends BaseActivityViewModel {
    ScanPayActivity mActivity;
    SunmiScanBinding mBinding;

    private OrderPayParam orderPayParam;

    public ObservableField<String> obPayStatus = new ObservableField<>();
    private RxManager mRxManager;
    private String sandPayNO;
    private Map<String, String> params = new HashMap<>();
    private ApiClient<BaseResult> mClient;
    private OrderPayResult payResult;
    private String intentFrom;
    private ChargeInfo mChargeInfo;

    public SandPayCodeModel(ScanPayActivity mActivity, SunmiScanBinding mBinding, ChargeInfo chargeInfo) {
        this.mActivity = mActivity;
        this.mBinding = mBinding;
        mClient = new ApiClient<>();
        mChargeInfo=chargeInfo;
        init();
    }

    private void init() {
        Intent intent = mActivity.getIntent();
        intentFrom=intent.getStringExtra(Constants.intent_name);
        orderPayParam = (OrderPayParam) intent.getSerializableExtra(Constants.intent_info);
        sandPayNO= AppUtil.getOrderNoAppendRandom(orderPayParam.getOrderNo());
        mBinding.tvPersonalPay.setText("应支付金额"+orderPayParam.getAmount()+"元");
    }

    public void pay(String authCode){
        long time = System.currentTimeMillis();
        Map<String, String> params = new HashMap();

        params.put("mchNo", SpUtil.getSandMchNo());
        params.put("orderNo", sandPayNO);
        params.put("amount", orderPayParam.getAmount());
        params.put("goodsName", orderPayParam.getGoodsName());
        params.put("payChannelTypeNo", orderPayParam.getPayChannelTypeNo());
        params.put("timeStamp", time + "");
        params.put("authCode", authCode);
        String sign = CashierSign.getSign(SpUtil.getSandKey(), params);
        params.put("sign", sign);

        ApiClient<OrderPayResult> client=new ApiClient();
        mActivity.showRDialog();
        client.reqOtherURL("doPay",params, ApiRequest.RespDataType.RESPONSE_JSON,Constants.base_sand_url)
                .updateUI(new Callback<OrderPayResult>() {
                    @Override
                    public void onSuccess(OrderPayResult orderPayResult) {
                        mActivity.hideRDialog();
                        if ("SUCCESS".equals(orderPayResult.getResult())){
                            SandPayCodeModel.this.payResult = orderPayResult;
                            updatePayResult();
                        }else{
                            showToast(mActivity,orderPayResult.getMsg());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                        obPayStatus.set("网络异常,请稍后再试");
                    }
                });

    }

    private int count = 0;

    private void updatePayResult() {
        Map map = getRequestParams();
        mClient.reqLongTimeApi("shandeVirtualReturnUrl", map, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        operateNext();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        count++;
                        if (count >= 2) {
                            Toast.makeText(mActivity, e.getMessage() + "", Toast.LENGTH_LONG).show();
                            updateOtherURL();//如果两次没有执行成功执行另外的接口
                        } else {
                            updatePayResult();
                        }
                    }
                });
    }

    private void updateOtherURL() {
        final Map map = getRequestParams();

        mClient.reqOtherURL("shandeVirtualReturnUrl", map, ApiRequest.RespDataType.RESPONSE_JSON, Constants.base_update_url)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        operateNext();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        count++;
                        if (count >= 4) {
                            mActivity.hideRDialog();
                            Toast.makeText(mActivity, e.getMessage() + "", Toast.LENGTH_LONG).show();
                            operateNext();
                            updateWithTimer(map);//如果更新失败,进行循环调用
                        } else {
                            updateOtherURL();
                        }
                    }
                });
    }

    private Timer timer;

    //如果更新失败,进行循环调用
    private void updateWithTimer(final Map map) {
        final ApiClient<BaseResult> updateClient = new ApiClient<>();
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                updateClient.reqOtherURL("shandeVirtualReturnUrl", map, ApiRequest.RespDataType.RESPONSE_JSON, Constants.base_update_url)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult result) {
                                Log.i("okHttp", "okHttp更新完成");
                                timer.cancel();
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                Log.i("okHttp", "okHttp重新更新");
                                updateClient.reset();
                            }
                        });
            }
        };
        timer.schedule(task, 0, 10000);
    }


    /*
       0103：支付宝条码支付
       0104：支付宝扫码支付
       0105: 平安银行支付宝条码
       0106: 平安银行支付宝扫码
       0201：微信扫码支付
       0202：微信H5支付(暂未开放)
       0203：微信刷卡支付
       0204: 平安银行微信刷卡
       0205: 平安银行微信扫码
       0301: 银联条码支付
       0302：银联扫码支付
        */
    private Map getRequestParams() {
        params.clear();
        params.put("pay_info", "业务请求成功");
        params.put("out_trade_no", payResult.getData().getOrderNo());
        params.put("cashier_trade_no", payResult.getData().getGwTradeNo());
        params.put("mcode", SpUtil.getBranchId() + "");
        params.put("device_en", SpUtil.getShopId());
        params.put("trade_status", "SUCCESS");
        params.put("time_create", payResult.getData().getCompleteDate());
        params.put("time_end", payResult.getData().getCompleteDate());
        double payAmount = Double.parseDouble(payResult.getData().getAmount());
        String totalFee = Math.round(payAmount * 100) + "";
        params.put("total_fee", totalFee);
        params.put("pay_fee", totalFee);
        switch (orderPayParam.getPayChannelTypeNo()) {//跟旺pos的回调保持一致
            case "0204":
                params.put("pay_type", "0012");
                break;
            case "0105":
                params.put("pay_type", "0013");
                break;
        }

        return params;
    }


    private void operateNext(){
        if ("shoppingViewModel".equals(intentFrom)){
            toNextPage( false);
        }else{
            vipChargeNext();
        }

    }
    private void toNextPage( boolean isVipPay) {
        if (mRxManager == null) {
            mRxManager = new RxManager();
        }
        mRxManager.post(Constants.bus_type_http_result, Constants.type_order_pay_finish);
        Intent intent = new Intent(mActivity, ShoppingPayResultActivity.class);
        intent.putExtra(Constants.intent_orderNo, orderPayParam.getOrderNo());
        intent.putExtra(Constants.intent_is_vip_pay, isVipPay);
        mActivity.startActivity(intent);
        mActivity.finish();
    }

    private void vipChargeNext(){
        mActivity.hideRDialog();
        if (mRxManager == null) mRxManager = new RxManager();
        mRxManager.post(Constants.bus_type_http_result, Constants.type_charge_finish);
        Intent intent = new Intent(mActivity, PayResultActivity.class);
        intent.putExtra(Constants.intent_info, mChargeInfo);
        intent.putExtra(Constants.intent_orderNo, orderPayParam.getOrderNo());
        mActivity.startActivity(intent);
        mActivity.finish();
    }

    public void onBackPress() {

        final CustomDialog cancelDialog = new CustomDialog(mActivity);
        cancelDialog.setCancelVisiable();
        cancelDialog.setContent("订单已生成,确认取消支付吗?");
        cancelDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelDialog.dismiss();
                if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
                    cancelOrder();
                } else {//无网显示断网连接
                    showToast(mActivity, Constants.network_error_warn);
                }


            }
        });
        cancelDialog.show();
    }

    /**
     * 若不支付则取消订单
     */
    public void cancelOrder() {
        long time = System.currentTimeMillis();
        Map<String, String> params = new HashMap();
        params.put("mchNo", SpUtil.getSandMchNo());
        params.put("orderNo", sandPayNO);
        params.put("timeStamp", time + "");
        String sign = CashierSign.getSign(SpUtil.getSandKey(), params);
        params.put("sign", sign);

        mActivity.showRDialog();
        ApiClient<OrderCancelResult> client = new ApiClient<>();
        client.reqOtherURL("cancelPay", params, ApiRequest.RespDataType.RESPONSE_JSON, Constants.base_sand_url)
                .updateUI(new Callback<OrderCancelResult>() {
                    @Override
                    public void onSuccess(OrderCancelResult cancelResult) {
                        mActivity.hideRDialog();
                        if ("SUCCESS".equals(cancelResult.getResult())||"TRADE_NOT_EXSITS".equals(cancelResult.getResult())||"API_ERROR_3RD".equals(cancelResult.getResult())||"PARAM_ERROR".equals(cancelResult.getResult())){
                            mActivity.finish();
                        }else{
                            showToast(mActivity,"订单已支付,不能取消");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                    }
                });
    }

    public void onDestroy() {
        if (mRxManager != null) {
            mRxManager.clear();
            mRxManager = null;
        }
    }



}
