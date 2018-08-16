package ys.app.petproject.viewmodel.manage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.greendao.NumCardEntityInfoDao;
import com.greendao.ServiceTypeInfoDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.AppApplication;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.manage.NumCardDetailActivity;
import ys.app.petproject.adapter.MyPagerAdapter;
import ys.app.petproject.adapter.ServiceTitleAdapter;
import ys.app.petproject.adapter.manage.NumCardTopAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.NumCardDetailBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.NumCardFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.itemmodel.CardNumberList2Bean;
import ys.app.petproject.itemmodel.NumCardEntityInfo;
import ys.app.petproject.model.BaseDataResult;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.NumCardListInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.utils.StringUtils;

/**
 * Created by admin on 2017/6/7.
 */

public class NumCardDetailViewModel extends BaseActivityViewModel {


    private List<Fragment> activityList = new ArrayList<>();
    private final NumCardDetailBinding mBinding;
    private NumCardDetailActivity mActivity;
    private List<ServiceTypeInfo> mServiceTypeInfos = new ArrayList<>();
    private boolean isShow = false;
    private ObjectAnimator closeAnim1;
    private LinearLayout mLL;
    private int lineCout;
    private float mDensity;
    private ServiceTitleAdapter adapter;
    private RxManager mRxManager;
    private ApiClient<BaseListResult> mClient;
    private ApiClient<BaseDataResult> commitClient;
    private NumCardEntityInfoDao numCardEntityInfoDao;
    private NumCardTopAdapter cardTopAdapter;

    private Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() {
        @Override
        public void onAnimationStart(Animator animation) {

        }

        @Override
        public void onAnimationEnd(Animator animation) {
            mBinding.bgView.setVisibility(View.GONE);
            mBinding.qiehuanTv.setVisibility(View.GONE);
            mLL.setVisibility(View.GONE);
            if (closeAnim1 != null) {
                closeAnim1.removeListener(this);
            }
        }

        @Override
        public void onAnimationCancel(Animator animation) {

        }

        @Override
        public void onAnimationRepeat(Animator animation) {

        }
    };
    private int mLastPosition = -1;

    public NumCardDetailViewModel(NumCardDetailActivity activity, NumCardDetailBinding binding) {
        this.mBinding = binding;
        this.mActivity = activity;
        mRxManager = new RxManager();
        numCardEntityInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getNumCardEntityInfoDao();
        init();
    }
    public void setNumCardInformation(NumCardListInfo info){
        mBinding.etCardName.setText(info.getName());
        mBinding.etCardMoney.setText(info.getRealAmt()+"");
        List<CardNumberList2Bean> list=info.getCardNumberList2();
        for (CardNumberList2Bean itemModle:list){
            NumCardEntityInfo unique = new NumCardEntityInfo();
            unique.setNum(itemModle.getNumber());
            unique.setId(itemModle.getProductId());
            unique.setName(itemModle.getProductName());
            unique.setRealAmt(itemModle.getRealAmt());
            numCardEntityInfoDao.insert(unique);
        }
        updateRecyclerView();
    }

    /**
     * 更新该次卡已经选择的服务
     */
    private void updateRecyclerView(){
        List<NumCardEntityInfo> numCardList= numCardEntityInfoDao.loadAll();
        Collections.reverse(numCardList);
        cardTopAdapter.setList(numCardList);
    }

    public void init() {

        if (mRxManager==null) mRxManager = new RxManager();
        mRxManager.on(Constants.type_card, new Action1<Integer>() {

            @Override
            public void call(Integer integer) {
                if (integer==0){
                    updateRecyclerView();
                }
            }
        });

        cardTopAdapter = new NumCardTopAdapter(mActivity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mActivity);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mBinding.rvNumCardTop.setLayoutManager(linearLayoutManager);
        mBinding.rvNumCardTop.setAdapter(cardTopAdapter);


        ServiceTypeInfoDao serviceTypeInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getServiceTypeInfoDao();
        List<ServiceTypeInfo> serviceTypeInfos = serviceTypeInfoDao.loadAll();
        if (serviceTypeInfos == null || serviceTypeInfos.isEmpty()) {//没有初始化成功,进行初始化
            loadServiceTypeHttp();
            return;
        }
        initServiceTypeView(serviceTypeInfos);
    }

    private void initServiceTypeView(List<ServiceTypeInfo> list) {
        mServiceTypeInfos.addAll(list);
        if (mServiceTypeInfos == null || mServiceTypeInfos.size() == 0) {
            return;
        }
        TextView tabTv;
        View view;
        for (int i = 0; i < mServiceTypeInfos.size(); i++) {
            ServiceTypeInfo info = mServiceTypeInfos.get(i);
            NumCardFragment fragment = new NumCardFragment();
            Bundle b = new Bundle();
            b.putSerializable(Constants.intent_info, info);
            fragment.setArguments(b);
            activityList.add(fragment);

            view = LayoutInflater.from(mActivity).inflate(R.layout.custom_tab, null);
            tabTv = (TextView) view.findViewById(R.id.tab_tv);
            tabTv.setText(info.getName());
            mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setCustomView(view));
        }


        if (mServiceTypeInfos.size() < 5) {
            mBinding.tabLayout.setTabMode(TabLayout.MODE_FIXED);
        } else {
            mBinding.tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        }

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(mActivity.getSupportFragmentManager(), activityList);
        mBinding.viewPager.setAdapter(pagerAdapter);
        mBinding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mBinding.tabLayout));
        mBinding.tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mBinding.viewPager));
        mBinding.viewPager.setCurrentItem(0);
        mBinding.viewPager.setOffscreenPageLimit(2);
        mBinding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mServiceTypeInfos.get(position).setSelect(1);
                if (mLastPosition != -1) {
                    mServiceTypeInfos.get(mLastPosition).setSelect(0);
                }
                mLastPosition = position;
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        addTitleListView();

        mServiceTypeInfos.get(0).setSelect(1);
        mLastPosition = 0;
        adapter.notifyDataSetChanged();

        mRxManager.on(Constants.delete_select, new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                mServiceTypeInfos.get(mLastPosition).setSelect(0);
            }
        });
    }

    private void addTitleListView() {
        int row = 4;
        if (mServiceTypeInfos == null) return;
        int size = mServiceTypeInfos.size();
        if (size == 0) return;
        lineCout = size / row;
        if (!(size % row == 0)) {//不整除
            lineCout++;
        }
        mDensity = mActivity.getResources().getDisplayMetrics().density;
        mLL = new LinearLayout(mActivity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, (int) (mDensity * (10 + 50 * lineCout) + 0.5));
        layoutParams.setMargins(0, -(int) (mDensity * (10 + 50 * lineCout - 42) + 0.5), 0, 0);
        mLL.setLayoutParams(layoutParams);
        mLL.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        mLL.setVisibility(View.GONE);

        RecyclerView recyclerView = new RecyclerView(mActivity);
        recyclerView.setLayoutManager(new GridLayoutManager(mActivity, row));
        adapter = new ServiceTitleAdapter(mActivity, mServiceTypeInfos);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (mLastPosition == position) return;

                mBinding.tabLayout.getTabAt(position).select();
                closeAnim();
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, (int) (mDensity * (10 + 50 * lineCout) + 0.5));
        layoutParams2.setMargins(0, 0, 0, (int) (mDensity * 10 + 0.5));

        mLL.addView(recyclerView);
        mBinding.rootView.addView(mLL, 4);

    }


    /**
     * 点击了箭头
     *
     * @param v
     */
    public void clickArrow(View v) {
        if (isShow) {
            closeAnim();
        } else {
            openAnim();
        }
    }


    private void openAnim() {
        isShow = true;
        mBinding.bgView.setVisibility(View.VISIBLE);
        mBinding.qiehuanTv.setVisibility(View.VISIBLE);
        mLL.setVisibility(View.VISIBLE);
        ObjectAnimator openAnim1 = ObjectAnimator.ofFloat(mBinding.bgView, "alpha", 0, 0.5f);
        ObjectAnimator openAnim2 = ObjectAnimator.ofFloat(mLL, "translationY", 0, (int) (mDensity * (50 * lineCout) + 0.5));
        ObjectAnimator openAnim3 = ObjectAnimator.ofFloat(mBinding.arrowIv, "rotationX", 0, 180);
        AnimatorSet animSet = new AnimatorSet();
        animSet.setDuration(300);
        animSet.setInterpolator(new LinearInterpolator());
        animSet.playTogether(openAnim1, openAnim2, openAnim3);
        animSet.start();
    }

    private void closeAnim() {
        isShow = false;

        closeAnim1 = ObjectAnimator.ofFloat(mBinding.bgView, "alpha", 0.5f, 0);
        ObjectAnimator closeAnim2 = ObjectAnimator.ofFloat(mLL, "translationY", (int) (mDensity * (50 * lineCout) + 0.5), 0);
        ObjectAnimator closeAnim3 = ObjectAnimator.ofFloat(mBinding.arrowIv, "rotationX", 180, 0);
        AnimatorSet animSet = new AnimatorSet();
        animSet.setDuration(300);
        animSet.setInterpolator(new LinearInterpolator());
        animSet.playTogether(closeAnim1, closeAnim2, closeAnim3);
        animSet.start();
        closeAnim1.addListener(animatorListener);
    }

    private void loadServiceTypeHttp() {
        if (mClient == null) {
            mClient = new ApiClient<>();
        }
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mClient.reqApi("serviceType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult>() {
                    @Override
                    public void onSuccess(BaseListResult result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            ServiceTypeInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getServiceTypeInfoDao();
                            List<ServiceTypeInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (ServiceTypeInfo info : list) {
                                    info.setRequestTime(nowTime);
                                }
                            }
                            dao.deleteAll();
                            dao.insertInTx(list);
                        }
                    }
                })
                .updateUI(new Callback<BaseListResult>() {
                    @Override
                    public void onSuccess(BaseListResult result) {
                        if (result.isSuccess()) {
                            initServiceTypeView(result.getData());
                        } else {
                            showToast(mActivity, "获取数据失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        showToast(mActivity, "获取数据失败");
                    }
                });
    }

    public void commitData(){
        Map<String,String> params=new HashMap<>();
        List<NumCardEntityInfo> numCardList= numCardEntityInfoDao.loadAll();
        if (numCardList.size()<=0){
            showToast(mActivity,"请输入服务次数");
            return;
        }
        String json=new Gson().toJson(numCardList);
        String cardName=mBinding.etCardName.getText().toString();
        if (!StringUtils.isEmpty(cardName)){
            params.put("name",cardName);
        }
        String realAmt=mBinding.etCardMoney.getText().toString();
        if (StringUtils.isEmpty(realAmt)){
            showToast(mActivity,"请输入卡片金额");
            return;
        }
        double money=Double.parseDouble(realAmt);
        if (money<=0){
            showToast(mActivity,"套餐金额需大于0元");
            return;
        }
        params.put("realAmt",realAmt);
        params.put("shopId",SpUtil.getShopId());
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("classification","1");
        params.put("cardNumberList",json);

        mActivity.showRDialog();
        if (commitClient==null)commitClient=new ApiClient<>();
        commitClient.reqApi("insertNumberCard", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseDataResult>() {
                    @Override
                    public void onSuccess(BaseDataResult result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            if (mRxManager == null) {
                                mRxManager = new RxManager();
                            }
                            mRxManager.post(Constants.bus_type_http_result, Constants.type_addVipCard_success);
                            mActivity.finish();
                            showToast(mActivity,"添加成功");
                        } else {
                            showToast(AppApplication.getAppContext(), result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                    }
                });


    }

    public void clear() {
        if (null != mServiceTypeInfos && mLastPosition != -1 && mServiceTypeInfos.size() > mLastPosition) {
            mServiceTypeInfos.get(mLastPosition).setSelect(0);
        }
        if (mRxManager!=null){
            mRxManager.clear();
            mRxManager=null;
        }
        numCardEntityInfoDao.deleteAll();

    }

}
