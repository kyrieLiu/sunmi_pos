package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.AppApplication;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.PersonPayActivity;
import ys.app.petproject.activity.SandQRCodeActivity;
import ys.app.petproject.activity.ShoppingPayActivity;
import ys.app.petproject.activity.ShoppingPayResultActivity;
import ys.app.petproject.activity.ScanPayActivity;
import ys.app.petproject.activity.vip.ChargeActivity;
import ys.app.petproject.databinding.ActivityShoppingPayBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.OrderPayParam;
import ys.app.petproject.model.SummitOrderInfo;
import ys.app.petproject.model.VipListResult;
import ys.app.petproject.utils.MathUtil;
import ys.app.petproject.widget.dialog.CustomDialog;


/**
 * Created by aaa on 2017/3/16.
 */

public class ShoppingPayViewModel extends BaseActivityViewModel {

    private final ShoppingPayActivity mActivity;
    private ApiClient<BaseResult> mClient;
    private final ApiClient<BaseListResult<SummitOrderInfo>> mOrderClient;
    public ObservableInt payType = new ObservableInt(0);
    public VipListResult mResult = new VipListResult();
    public ObservableField<String> obPayMoney = new ObservableField<>();
    public ObservableInt orderType = new ObservableInt(-1);//区分订单类型 0会员订单 1次卡订单 2普通订单
    private String mOrderNo;
    private double mPayMoney;
    private int mVipUserId;
    private CustomDialog mDialog;

    public ObservableBoolean obButtonEnable = new ObservableBoolean(false);
    private RxManager mRxManager ;

    private OrderPayParam sandPayParam;//杉德统一支付参数

    public ShoppingPayViewModel(ShoppingPayActivity activity, ActivityShoppingPayBinding binding) {
        this.mActivity = activity;
        this.mClient = new ApiClient<>();
        this.mOrderClient = new ApiClient<>();

    }

    public void setPayMoney(String orderNo) {
        this.mOrderNo = orderNo;
        if (mRxManager==null)mRxManager=new RxManager();
        mRxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                //收款成功
                if (integer==Constants.type_order_pay_finish){
                    mActivity.finish();
                }
            }
        });
        queryOrder();
    }

    private void queryOrder() {
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("orderId", mOrderNo);
        params.put("branchId", SpUtil.getBranchId() + "");
        params.put("headOfficeId", SpUtil.getHeadOfficeId() + "");
        params.put("limit", "1000");
        mOrderClient.reqApi("queryOrderList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<SummitOrderInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<SummitOrderInfo> result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            List<SummitOrderInfo> data = result.getData();
                            if (data.size() > 0) setData(data);
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

    private void setData(List<SummitOrderInfo> data) {

        mPayMoney = 0.00;
        BigDecimal total = new BigDecimal(0);
        for (SummitOrderInfo info : data) {
            if (!(1 == info.getIsGift())) {

                total = add(total, info.getRealMoney());
            }
        }
        mPayMoney = total.doubleValue();
        SummitOrderInfo summitOrderInfo = data.get(0);
        int isClassification = summitOrderInfo.getIsClassification();

        if (isClassification == 0 || isClassification == 3) {//会员卡
            mVipUserId = summitOrderInfo.getVipUserId();
            orderType.set(0);
        } else if (isClassification == 1) {//次卡
            mVipUserId = summitOrderInfo.getVipUserId();
            orderType.set(1);
        }
        Double orderMoney = MathUtil.retainTwoDecimal(mPayMoney);
        obPayMoney.set(orderMoney + "");
        obButtonEnable.set(true);

        setOrderToParam(data);
    }

    public BigDecimal add(BigDecimal b1, double v2) {
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }

    /**
     * @param data
     */
    private void setOrderToParam(List<SummitOrderInfo> data) {
        sandPayParam = new OrderPayParam();
        List<SummitOrderInfo> orderInfoList = data;
        sandPayParam.setOrderNo(orderInfoList.get(0).getOrderId());                            //目前取列表第一项的OrderId
        sandPayParam.setAmount(obPayMoney.get()); //付款金额
        sandPayParam.setGoodsName(SpUtil.getShopName());       //商品描述
        sandPayParam.setPayChannelTypeNo("0205");
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



    /**
     * 結算
     *
     * @param v
     */
    public void clickButton(View v) {
        if (orderType.get() == 0 || orderType.get() == 1) {//是VIP订单
            payHttp();
        } else if (payType.get() == Constants.type_int_boss_weixin_pay || payType.get() == Constants.type_int_boss_zhifubao_pay || payType.get() ==  Constants.type_int_xianjin_pay) {
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

    /**
     * 会员卡支付
     */
    private void payHttp() {

        Map<String, String> params = new HashMap<>();
        params.put("orderId", mOrderNo);
        params.put("shopId", SpUtil.getShopId() + "");
        params.put("branchId", SpUtil.getBranchId() + "");
        params.put("headOfficeId", SpUtil.getHeadOfficeId() + "");
        mActivity.showRDialog();
        obButtonEnable.set(false);
        mClient.reqApi("vipPay", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        obButtonEnable.set(true);
                        if (result.isSuccess()) {
                            if (mRxManager == null) mRxManager = new RxManager();
                            mRxManager.post(Constants.bus_type_http_result, Constants.type_order_pay_finish);
                            toNextPage(true, true);
                        } else {
                            if ("余额不足".equals(result.getData())) {
                                showDiaolog();//提示充值
                            } else {
                                toNextPage(false, true);
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                        obButtonEnable.set(true);
                        toNextPage(false, true);
                    }
                });
    }


    private void toNextPage(boolean isSuccess, boolean isVipPay) {
        if (mRxManager == null) mRxManager = new RxManager();
        mRxManager.post(Constants.bus_type_http_result, Constants.type_order_pay_finish);

        Intent intent = new Intent(mActivity, ShoppingPayResultActivity.class);
        intent.putExtra(Constants.intent_boolean, isSuccess);
        intent.putExtra(Constants.intent_orderNo, mOrderNo);
        intent.putExtra(Constants.intent_is_vip_pay, isVipPay);
        mActivity.startActivity(intent);
        mActivity.finish();
    }

    private void showDiaolog() {
        if (mDialog == null) {
            mDialog = new CustomDialog(mActivity);
            mDialog.setContent("会员卡余额不足，请充值后再支付");
            mDialog.setCancelable(false);
            mDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDialog.dismiss();
                    Intent intent = new Intent(mActivity, ChargeActivity.class);
                    intent.putExtra(Constants.intent_id, (long) mVipUserId);//卡号
                    mActivity.startActivity(intent);
                    mActivity.finish();
                }
            });

            mDialog.setCancelVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDialog.dismiss();
                    toNextPage(false, true);
                }
            });
        }
        mDialog.show();
    }

    /**
     * 个人微信支付宝收款
     */
    private void bossPay() {
        Intent intent=new Intent(mActivity, PersonPayActivity.class);
        intent.putExtra(Constants.intent_flag,sandPayParam.getPayChannelTypeNo());
        intent.putExtra("money", obPayMoney.get());
        intent.putExtra(Constants.intent_name,"shoppingViewModel");
        intent.putExtra(Constants.intent_orderNo, mOrderNo);
        mActivity.startActivityForResult(intent,Constants.request_code);
    }



    public void back() {
        final CustomDialog mBackDialog = new CustomDialog(mActivity);
        mBackDialog.setContent("确认放弃此订单？");
        mBackDialog.setCancelVisiable();
        mBackDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "可在挂单列表中查询该订单", Toast.LENGTH_SHORT).show();
                mBackDialog.dismiss();
                mActivity.finish();
            }
        });
        if (!mActivity.isFinishing()) {
            mBackDialog.show();
        }
    }

    public void clear() {
        if (mRxManager != null) {
            mRxManager.clear();
            mRxManager = null;
        }
    }
}
