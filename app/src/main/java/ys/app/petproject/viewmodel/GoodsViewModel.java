package ys.app.petproject.viewmodel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.greendao.GoodTypeInfoDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.adapter.MyPagerAdapter;
import ys.app.petproject.adapter.TitleAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.FragmentGoodsBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.GoodsFragment;
import ys.app.petproject.fragment.GoodsListFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.GoodTypeInfo;

/**
 * Created by aaa on 2017/5/31.
 */

public class GoodsViewModel extends BaseFragmentViewModel {

    private List<Fragment> fragmentList = new ArrayList<>();
    private boolean isAddOrder = true;
    private final GoodsFragment mFragment;
    private final FragmentGoodsBinding mBinding;
    private FragmentActivity mActivity;
    private List<GoodTypeInfo> mGoodTypeInfos = new ArrayList<>();
    private boolean isShow = false;
    private ObjectAnimator closeAnim1;
    private LinearLayout mLL;
    private int lineCout;
    private float mDensity;
    private TitleAdapter adapter;
    private RxManager mRxManager;
    private ApiClient<BaseListResult> mClient;

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

    public GoodsViewModel(GoodsFragment fragment, FragmentGoodsBinding binding) {
        this.mFragment = fragment;
        this.mBinding = binding;
        this.mActivity = fragment.getActivity();
        mRxManager = new RxManager();
    }


    public void init(Bundle arguments) {
        if (arguments != null) {
            isAddOrder = arguments.getBoolean(Constants.intent_boolean, true);
        }

        GoodTypeInfoDao goodTypeInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getGoodTypeInfoDao();
        List<GoodTypeInfo> goodTypeInfos = goodTypeInfoDao.loadAll();
        if (goodTypeInfos == null || goodTypeInfos.isEmpty()) {//没有初始化成功,进行初始化
            loadGoodsTypeHttp();
        }else{
            initGoodTypeView(goodTypeInfos);
        }

    }

    private void initGoodTypeView(List<GoodTypeInfo> list) {
        mGoodTypeInfos.addAll(list);
        if (mGoodTypeInfos == null || mGoodTypeInfos.size() == 0) {
            return;
        }
        TextView tabTv;
        View view;
        for (int i = 0; i < mGoodTypeInfos.size(); i++) {
            GoodTypeInfo info = mGoodTypeInfos.get(i);
            GoodsListFragment fragment = new GoodsListFragment();
            Bundle b = new Bundle();
            b.putSerializable(Constants.intent_info, info);

            b.putInt(Constants.intent_search_from, Constants.intent_form_shangpin_goumai);
            fragment.setArguments(b);
            fragmentList.add(fragment);

            view = LayoutInflater.from(mActivity).inflate(R.layout.custom_tab, null);
            tabTv = (TextView) view.findViewById(R.id.tab_tv);
            tabTv.setText(info.getName());
            mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setCustomView(view));
        }

        if (mGoodTypeInfos.size() < 5) {
            mBinding.tabLayout.setTabMode(TabLayout.MODE_FIXED);
        } else {
            mBinding.tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        }

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(mFragment.getChildFragmentManager(), fragmentList);
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
                mGoodTypeInfos.get(position).setSelect(1);
                if (mLastPosition != -1) {
                    mGoodTypeInfos.get(mLastPosition).setSelect(0);
                }
                mLastPosition = position;
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        addTitleListView();

        mGoodTypeInfos.get(0).setSelect(1);
        mLastPosition = 0;
        adapter.notifyDataSetChanged();

        mRxManager.on(Constants.delete_select, new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                mGoodTypeInfos.get(mLastPosition).setSelect(0);
            }
        });
    }

    private void addTitleListView() {
        int row = 4;
        if (mGoodTypeInfos == null) return;
        int size = mGoodTypeInfos.size();
        if (size == 0) return;
        lineCout = size / row;
        if (!(size % row == 0)) {//不整除
            lineCout++;
        }
        mDensity = mActivity.getResources().getDisplayMetrics().density;
//        int height = (int) (mDensity * (10 + 40 * lineCout-42) + 0.5);//计算布局的总高度
        mLL = new LinearLayout(mActivity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, (int) (mDensity * (10 + 50 * lineCout) + 0.5));
        layoutParams.setMargins(0, -(int) (mDensity * (10 + 50 * lineCout - 42) + 0.5), 0, 0);
        mLL.setLayoutParams(layoutParams);
        mLL.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        mLL.setVisibility(View.GONE);

        RecyclerView recyclerView = new RecyclerView(mActivity);
        recyclerView.setLayoutManager(new GridLayoutManager(mActivity, row));
        adapter = new TitleAdapter(mActivity, mGoodTypeInfos);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (mLastPosition == position) return;
                //mGoodTypeInfos.get(position).setSelect(1);
//                if (mLastPosition != -1) {
//                    mGoodTypeInfos.get(mLastPosition).setSelect(0);
//                }
//                mLastPosition = position;
//                adapter.notifyDataSetChanged();

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

    private void loadGoodsTypeHttp() {
        if (mClient == null) {
            mClient = new ApiClient<>();
        }
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mClient.reqApi("goodsType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult>() {
                    @Override
                    public void onSuccess(BaseListResult result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            GoodTypeInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getGoodTypeInfoDao();
                            List<GoodTypeInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (GoodTypeInfo info : list) {
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
                            initGoodTypeView(result.getData());
                        } else {
                            showToast(mActivity, "商品数据初始化失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        showToast(mActivity, "商品加载连接异常");
                    }
                });
    }

    public void clear() {
        if (null != mGoodTypeInfos && mLastPosition != -1 && mGoodTypeInfos.size() > mLastPosition) {
            mGoodTypeInfos.get(mLastPosition).setSelect(0);
        }
    }

}
