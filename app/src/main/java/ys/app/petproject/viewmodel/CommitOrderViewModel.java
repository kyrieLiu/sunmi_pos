package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableDouble;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.CommitOrderActivity;
import ys.app.petproject.activity.ShoppingPayActivity;
import ys.app.petproject.adapter.ShoppingCarAdapter;
import ys.app.petproject.databinding.ActivityCommitOrderBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.SummitOrderInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;

/**
 * Created by aaa on 2017/3/16.
 */

public class CommitOrderViewModel extends BaseActivityViewModel {
    private final CommitOrderActivity mActivity;
    private final ActivityCommitOrderBinding mBinding;
    private final ApiClient<BaseListResult<SummitOrderInfo>> mClient;
    private final ApiClient<BaseResult> mCommitClient;
    private List<SummitOrderInfo> mCommitOrderTempInfos;
    private ShoppingCarAdapter mServiceAdapter;
    private List<SummitOrderInfo> mServiceList = new ArrayList<>();
    private List<SummitOrderInfo> mGoodsList = new ArrayList<>();
    private ShoppingCarAdapter mGoodsAdapter;
    public ObservableBoolean isServiceVisible = new ObservableBoolean(true);
    public ObservableBoolean isGoodsVisible = new ObservableBoolean(true);
    public ObservableDouble obCountMoney = new ObservableDouble(0.00);
    public ObservableBoolean obIsVipOrder = new ObservableBoolean(false);
    private double countMoney = 0.00;
    private double normalCountMoney=0.00;//所有商品按非会员价格的总和
    private String mOrderNo;
    private CustomDialog mBackDialog;
    private double vipMoney;
    private String userName;//非会员名字
    private String userPhone;//非会员电话
    private int isClassification;

    public CommitOrderViewModel(CommitOrderActivity activity, ActivityCommitOrderBinding binding,double vipMoney,String userName,String userPhone) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.userName=userName;
        this.userPhone=userPhone;
        this.mClient = new ApiClient<>();
        this.mCommitClient = new ApiClient<>();
        this.vipMoney=vipMoney;
    }


    public void init() {
        mBinding.scrollView.setNestedScrollingEnabled(false);

        mServiceAdapter = new ShoppingCarAdapter(mActivity,vipMoney);
        mBinding.seviceRecylerView.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.seviceRecylerView.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division_line));
        mBinding.seviceRecylerView.setAdapter(mServiceAdapter);


        mGoodsAdapter = new ShoppingCarAdapter(mActivity,vipMoney);
        mBinding.goodsRecylerView.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.goodsRecylerView.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division_line));
        mBinding.goodsRecylerView.setAdapter(mGoodsAdapter);

    }

    public void getDataFromIntent(String idStr) {
        this.mOrderNo = idStr;
        loadHttpData();
    }

    @Override
    public void reloadData(View view) {
        loadHttpData();
    }

    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            getDataList();
        } else {//无网显示断网连接
            mActivity.showToast(Constants.network_error_warn);
            isNetWorkErrorVisible.set(true);
        }
    }

    private void getDataList() {
        isLoadingVisible.set(true);
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("orderId", mOrderNo);
        params.put("limit","1000");
        mClient.reqApi("queryOrderList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<SummitOrderInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<SummitOrderInfo> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            if (result.getData()!=null && result.getData().size()>0) {
                                setData(result.getData());
                            }else {
                                isNoneDataVisible.set(true);
                            }
                        } else {
                            isNetWorkErrorVisible.set(true);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                        super.onError(e);
                    }
                });
    }

    private void setData(List<SummitOrderInfo> data) {
        BigDecimal total=new BigDecimal(0);
        for (SummitOrderInfo info : data) {
            if (!(1 == info.getIsGift())) {
                total = add(total, info.getRealMoney());
            }

            if (info.getType() == 2) {
                mServiceList.add(info);
            } else if (info.getType() == 1) {
                mGoodsList.add(info);
            }
        }
        countMoney=total.doubleValue();
        obCountMoney.set(countMoney);
        SummitOrderInfo summitOrderInfo=data.get(0);
        isClassification =summitOrderInfo.getIsClassification();


        if (mServiceList.size() == 0) {
            isServiceVisible.set(false);
        } else {
            mServiceAdapter.setList(mServiceList);
        }

        if (mGoodsList.size() == 0) {
            isGoodsVisible.set(false);
        } else {
            mGoodsAdapter.setList(mGoodsList);
        }
    }

    private BigDecimal add(BigDecimal b1, double v2) {
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }

    public void clickButton(View v) {
        commitOrderHttp(true);
    }

    public void commitOrderHttp(final Boolean isPay) {
        mBinding.okBtn.setEnabled(false);
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("orderId", mOrderNo);
        params.put("shopId", SpUtil.getShopId() );
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        if(!TextUtil.isEmpty(userPhone)){
            if (userName==null)userName="";
            params.put("userName",userName);//非会员名字
            params.put("userPhone",userPhone);//非会员电话
        }
        params.put("isClassification",isClassification+"");

        mCommitClient.reqApi("insertOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            if (isPay) {
                                Intent intent = new Intent(mActivity, ShoppingPayActivity.class);
                                intent.putExtra(Constants.intent_money, result.getData());
                                intent.putExtra(Constants.intent_id, mOrderNo);
                                intent.putExtra(Constants.intent_boolean, obIsVipOrder.get());
                                mActivity.startActivity(intent);
                            }
                            mActivity.finish();
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        mBinding.okBtn.setEnabled(true);
                        super.onError(e);
                    }
                });
    }


    public void back() {
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
        if (!mActivity.isFinishing()) {
            mBackDialog.show();
        }

    }
}
