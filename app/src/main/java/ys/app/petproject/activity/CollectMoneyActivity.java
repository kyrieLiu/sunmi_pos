package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.adapter.MyPagerAdapter;
import ys.app.petproject.databinding.ActivityCollectMoneyBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.GoodsFragment;
import ys.app.petproject.fragment.ServiceFragment;
import ys.app.petproject.viewmodel.CollectMoneyViewModel;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by lyy on 2017/2/20 17:14.
 * email：2898049851@qq.com
 */

public class CollectMoneyActivity extends BaseActivity {

    private ActivityCollectMoneyBinding binding;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> mTitle = new ArrayList<>();
    private RxManager rxManager;
    private CollectMoneyViewModel viewModel;
    private PopupWindow popupWindow;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_collect_money);
        setBackVisiable(true);
        final ImageView blueSearchIv = (ImageView) findViewById(R.id.blue_search_iv);
        final ImageView blueScanIv = (ImageView) findViewById(R.id.blue_scan_iv);
        blueSearchIv.setVisibility(View.VISIBLE);
        blueScanIv.setVisibility(View.VISIBLE);
        blueScanIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scan();
            }
        });
        viewModel = new CollectMoneyViewModel(this, binding,blueSearchIv);
        binding.setViewModel(viewModel);
        init();
    }

    private void init() {
        //清除购物车数据库
        GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao().deleteAll();
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        final TextView goodsTv = (TextView) findViewById(R.id.goods_tv);
        final TextView serviceTv = (TextView) findViewById(R.id.service_tv);

        ll.setVisibility(View.VISIBLE);
        goodsTv.setSelected(true);
        serviceTv.setSelected(false);
//        addImageView.setVisibility(View.VISIBLE);
        mTitle.add("商品");
        mTitle.add("服务");
        goodsTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(0);
            }
        });
        serviceTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(1);
            }
        });

        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                goodsTv.setSelected(0 == position ? true : false);
                serviceTv.setSelected(1 == position ? true : false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                goodsTv.setSelected(0 == position ? true : false);
                serviceTv.setSelected(1 == position ? true : false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

//        addImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showPopupWindow(view);
//            }
//        });


        GoodsFragment fragment1 = new GoodsFragment();
        ServiceFragment fragment2 = new ServiceFragment();

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragmentList);
        binding.viewPager.setAdapter(pagerAdapter);
        binding.viewPager.setOffscreenPageLimit(2);
        setBgWhiteStatusBar();
    }



    /**
     * 扫描
     */
    private void scan() {
        Intent intent = new Intent(this,ScannerActivity.class);
        startActivityForResult(intent, Constants.scan_result_code);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.scan_result_code && null != data){
            String info = data.getStringExtra(Constants.scan_result);
            if (!TextUtil.isEmpty(info) && viewModel != null) {
                viewModel.setScanResult(info);
            }
        }
    }

    @Override
    public void onBackPressed() {

        if (rxManager == null) {
            rxManager = new RxManager();
        }
        rxManager.post(Constants.delete_select, null);
        rxManager.post(Constants.bus_db, Constants.type_delete_commitOrder_db);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (rxManager != null){
            rxManager.clear();
            rxManager = null;
        }
        if (viewModel != null){
            viewModel.reset();
        }
    }
}
