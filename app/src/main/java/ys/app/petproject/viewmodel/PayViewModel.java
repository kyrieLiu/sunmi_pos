package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.PersonPayActivity;
import ys.app.petproject.activity.SandQRCodeActivity;
import ys.app.petproject.activity.ScanPayActivity;
import ys.app.petproject.activity.vip.PayActivity;
import ys.app.petproject.databinding.ActivityPayBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.model.OrderPayParam;
import ys.app.petproject.utils.StringUtils;

/**
 * Created by aaa on 2017/3/1.
 */

public class PayViewModel extends BaseActivityViewModel {


    private final PayActivity mActivity;
    private final ApiClient<BaseResult> mClient;
    public ObservableInt payType = new ObservableInt(Constants.type_int_weixin_pay);
    public ObservableBoolean obButtonEnable=new ObservableBoolean(false);
    public ObservableBoolean seePresenter=new ObservableBoolean(false);
    public ChargeInfo mChargeInfo;
    private RxManager mRxManager=new RxManager();
    private OrderPayParam sandPayParam;


    public PayViewModel(PayActivity activity, ActivityPayBinding binding) {
        this.mActivity = activity;
        this.mClient = new ApiClient<>();
        mRxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                if (integer==Constants.type_charge_finish){
                    mActivity.finish();
                }
            }
        });
    }

    //微信支付
    public void clickWeixinPay(View v) {
        payType.set(Constants.type_int_weixin_pay);
        sandPayParam.setPayChannelTypeNo("0205");
    }

    //支付宝支付
    public void clickZhifubaoPay(View v) {
        payType.set(Constants.type_int_zhifubao_pay);
        sandPayParam.setPayChannelTypeNo("0106");
    }

    public void clickXinhangkaPay(View v) {
        payType.set(Constants.type_int_yinhangka_pay);
        sandPayParam.setPayChannelTypeNo("1006");

    }

    public void clickXianjinPay(View v) {
        payType.set(Constants.type_int_xianjin_pay);
        sandPayParam.setPayChannelTypeNo("1001");
    }

    public void clickWeixinScannerPay(View v) {
        payType.set(Constants.type_int_scan_weixin_pay);
        sandPayParam.setPayChannelTypeNo("0204");
    }

    public void clickZhifubaoScannerPay(View v) {
        payType.set(Constants.type_int_scan_zhifubao_pay);
        sandPayParam.setPayChannelTypeNo("0105");
    }

    public void clickBossWeixin(View view) {
        payType.set(Constants.type_int_boss_weixin_pay);
        sandPayParam.setPayChannelTypeNo("0112");
    }

    public void clickBossZhifubao(View view) {
        payType.set(Constants.type_int_boss_zhifubao_pay);
        sandPayParam.setPayChannelTypeNo("0113");
    }



    public void setIntentData(ChargeInfo chargeInfo) {
        this.mChargeInfo = chargeInfo;
        sandPayParam = new OrderPayParam();
        sandPayParam.setOrderNo(chargeInfo.getOrderNo());                            //目前取列表第一项的OrderId
        sandPayParam.setGoodsName(SpUtil.getShopName());       //商品描述
        sandPayParam.setPayChannelTypeNo("0205");
        if (mChargeInfo != null) {
            double charge = Double.parseDouble(mChargeInfo.getChargeMoney());
            double presenter=Double.parseDouble(mChargeInfo.getPresentAmt());
            sandPayParam.setAmount(charge+""); //付款金额
            if (presenter>0){
                seePresenter.set(true);
            }
            obButtonEnable.set(true);
        }
    }

    /**
     * 結算
     *
     * @param v
     */
    public void clickButton(View v) {
            payHttp();
    }


    private void payHttp() {

        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId());
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("vipCardNo", mChargeInfo.getCardNo());
        params.put("orderNo", mChargeInfo.getOrderNo());
        if (StringUtils.isEmpty(mChargeInfo.getProductList())){
            params.put("isClassification","0");
        }else{
            params.put("isClassification","1");
        }
        mActivity.showRDialog();
        obButtonEnable.set(false);
        mClient.reqApi("insertRechargeOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            operaOrder();
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                        obButtonEnable.set(true);
                    }
                });
    }

    //处理支付逻辑
    private void operaOrder(){
        obButtonEnable.set(true);

        if (payType.get() == Constants.type_int_boss_weixin_pay || payType.get() == Constants.type_int_boss_zhifubao_pay || payType.get() ==  Constants.type_int_xianjin_pay) {
            bossPay();
        } else if(payType.get() == Constants.type_int_weixin_pay || payType.get() == Constants.type_int_zhifubao_pay){//调启旺pos支付
            Intent intent = new Intent(mActivity, SandQRCodeActivity.class);
            intent.putExtra(Constants.intent_info, sandPayParam);
            intent.putExtra(Constants.intent_name, "shoppingViewModel");
            mActivity.startActivity(intent);
        }else if (payType.get() == Constants.type_int_scan_weixin_pay || payType.get() == Constants.type_int_scan_zhifubao_pay){
            Intent intent1 = new Intent(mActivity, ScanPayActivity.class);
            intent1.putExtra(Constants.intent_info, sandPayParam);
            intent1.putExtra(Constants.intent_name, "shoppingViewModel");
            mActivity.startActivity(intent1);
        }
    }

    private void bossPay(){
        Intent intent=new Intent(mActivity, PersonPayActivity.class);
        intent.putExtra(Constants.intent_flag,sandPayParam.getPayChannelTypeNo());
        intent.putExtra("money",mChargeInfo.getChargeMoney());
        intent.putExtra("chargeModel",mChargeInfo);
        intent.putExtra(Constants.intent_name,"payViewModel");
        intent.putExtra(Constants.intent_orderNo,sandPayParam.getOrderNo())        ;
        mActivity.startActivityForResult(intent,Constants.request_code);
    }


    public void clear(){
        if (mRxManager!=null){
            mRxManager.clear();
            mRxManager=null;
        }
    }

}
