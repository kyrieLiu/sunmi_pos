package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.adapter.ConfirmCheckOutAdapter;
import ys.app.petproject.adapter.VipCardAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.DialogCustomerTypeBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.nfc.MagneticCardActivity;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widget.dialog.CustomerTypeDialog;

/**
 * Created by aaa on 2017/3/15.
 */

public class CustomerTypeViewModel extends BaseActivityViewModel {
    private  BaseActivity mActivity;
    private final DialogCustomerTypeBinding mBinding;
    private final CustomerTypeDialog mDialog;
    public int mPosition;
    public ObservableField<String> mVipPhone = new ObservableField<>();
    public ObservableField<String> mVipCard = new ObservableField<>();
    public ObservableField<String> mName = new ObservableField<>();
    public ObservableField<String> mPhone = new ObservableField<>();
    public ObservableField<String> mAnimalName = new ObservableField<>();
    public ObservableInt obPosition = new ObservableInt();
    private ConfirmCheckOutAdapter mConfirmCheckOutAdapter;
    private final ApiClient<BaseListResult<VipInfo>> mVipListClient;
    private ApiClient<BaseListResult<VipCardInfo>> mClient;
    private boolean isGuadan;
    private int flag;
    private int numCardID;
    private VipCardAdapter cardAdapter;

    public CustomerTypeViewModel(CustomerTypeDialog dialog, BaseActivity activity, DialogCustomerTypeBinding binding,boolean isGuadan,
                                 int flag,int numCardID) {
        this.mActivity = activity;
        this.mDialog = dialog;
        this.mBinding = binding;
        this.mVipListClient = new ApiClient<>();
        this.isGuadan=isGuadan;
        this.flag=flag;
        this.numCardID=numCardID;

        init();
    }

    private void init() {

        if (flag==0){
            mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("会员"));
            mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("非会员"));
            mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("折扣卡"));
            obPosition.set(0);
            mBinding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    mPosition = tab.getPosition();
                    obPosition.set(mPosition);
                    if (mPosition==2){
                        initOnlyDiscountCard();////初始化纯折扣列表
                    }
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
        }else{
            mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("次卡"));
            obPosition.set(0);
        }

        setVipListener();
    }
    private void setVipListener(){
        mBinding.vipPhoneEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable == null) return;
                String s = editable.toString();
                if (!StringUtils.isEmptyOrWhitespace(s)) {
                    getSearchVipHttp(s);
                } else {
                    if (mConfirmCheckOutAdapter != null){
                        mConfirmCheckOutAdapter.clearData();
                    }
                }
            }
        });


        mBinding.rlDialogCollectVip.setLayoutManager(new LinearLayoutManager(mActivity));

        mConfirmCheckOutAdapter = new ConfirmCheckOutAdapter(mActivity,isGuadan);
        mBinding.rlDialogCollectVip.setAdapter(mConfirmCheckOutAdapter);
    }

    private void initOnlyDiscountCard(){
        if (cardAdapter==null)cardAdapter = new VipCardAdapter(mActivity,2);

        cardAdapter.setShowType(1);
        mBinding.rlDialogCollectOnlyDiscount.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.rlDialogCollectOnlyDiscount.setAdapter(cardAdapter);
        cardAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                VipCardInfo vipCardInfo= cardAdapter.getList().get(position);
                mDialog.selectDiscountCard(vipCardInfo);
            }
        });
        loadDiscountCard();
    }

    private void loadDiscountCard(){
        if (mClient==null)mClient=new ApiClient<>();
        Map<String, String> params = new HashMap<>();
        params.put("branchId", SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("limit","100");
        params.put("isClasssification","2");
        isLoadingVisible.set(true);
        isNetWorkErrorVisible.set(false);
        isNoneDataVisible.set(false);
        mClient.reqApi("queryVipList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult<VipCardInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipCardInfo> vipCardInfoBaseListResult) {
                    }
                })
                .updateUI(new Callback<BaseListResult<VipCardInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipCardInfo> info) {
                        isLoadingVisible.set(false);
                        if (info.isSuccess()) {
                            List<VipCardInfo> list = info.getData();
                            if(list.size()>0){
                                cardAdapter.setList(info.getData());
                            }else{
                                isNoneDataVisible.set(true);
                            }

                        } else {
                            Toast.makeText(mActivity,info.getErrorMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        isNetWorkErrorVisible.set(true);
                        isLoadingVisible.set(false);
                        Toast.makeText(mActivity,"网络异常",Toast.LENGTH_SHORT).show();
                    }
                });
    }


    /**
     * 会员搜索
     *
     * @param s
     */
    private void getSearchVipHttp(String s) {
        Map<String, String> params = new HashMap<>();
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", s);
        params.put("classification",flag+"");
        if (flag==1){
            params.put("typeId", numCardID+"");
            params.put("branchId",SpUtil.getBranchId()+"");
        }
        isLoadingVisible.set(true);
        isNetWorkErrorVisible.set(false);
        isNoneDataVisible.set(false);
        mVipListClient.reqApi("queryVip", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<VipInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipInfo> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            List<VipInfo> mList = result.getData();
                            if (mConfirmCheckOutAdapter != null && mList != null && !mList.isEmpty()) {
                                mConfirmCheckOutAdapter.setList(mList);
                            }else{
                                isNoneDataVisible.set(true);
                            }
                        } else {
                            Toast.makeText(mActivity,result.getErrorMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        isNetWorkErrorVisible.set(true);
                        isLoadingVisible.set(false);
                        Toast.makeText(mActivity,"网络异常",Toast.LENGTH_SHORT).show();
                    }
                });

    }

    /**
     * 跳过
     *
     * @param v
     */
    public void clickJump(View v) {
        mDialog.dismiss();
        mDialog.onClickJump();
    }

    /**
     * 确定
     *
     * @param v
     */
    public void clickButton(View v) {
        if (0 == mPosition) {
            mDialog.onClickButton(mPosition, null, mVipPhone.get(), mVipCard.get());
        } else {
            mDialog.onClickButton(mPosition, mName.get(), mPhone.get(), mAnimalName.get());
        }
    }
    public void searchCardNo(){
        Intent intent=new Intent(mActivity, MagneticCardActivity.class);
        intent.putExtra(Constants.intent_flag,"shouyin");
        intent.putExtra(Constants.intent_vip_name,flag);
        mActivity.startActivity(intent);
    }
}
