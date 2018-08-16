package ys.app.petproject.activity.vip;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.adapter.MyPagerAdapter;
import ys.app.petproject.databinding.VipRecordActivityBinding;
import ys.app.petproject.fragment.VipConsumesFragment;
import ys.app.petproject.fragment.VipRechargeRecordsFragment;
import ys.app.petproject.viewmodel.vip.VipRecordViewModel;

/**
 * Created by Administrator on 2017/6/8.
 */

public class VipRecordActivity extends BaseActivity {
    private VipRecordActivityBinding binding;
    private VipRecordViewModel mViewModel;
    private List<Fragment> fragmentList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(VipRecordActivity.this, R.layout.activity_vip_record);
        setBackVisiable(true);
        mViewModel = new VipRecordViewModel(this, binding);
        binding.setViewModel(mViewModel);
        init();
    }

    private void init() {
        int shopId = getIntent().getIntExtra(Constants.intent_vip_shop_id,0);
        long vipUserId = getIntent().getLongExtra(Constants.intent_vip_user_id,0);
        LinearLayout addLl = (LinearLayout) findViewById(R.id.vip_ll);
        final TextView vipRechargeTv = (TextView) findViewById(R.id.vip_recharge_tv);
        final TextView vipConsumeTv = (TextView) findViewById(R.id.vip_consume_tv);

        addLl.setVisibility(View.VISIBLE);
        vipRechargeTv.setSelected(true);
        vipConsumeTv.setSelected(false);

        vipRechargeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(0);
            }
        });
        vipConsumeTv.setOnClickListener(new View.OnClickListener() {
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
                vipRechargeTv.setSelected(0 == position ? true : false);
                vipConsumeTv.setSelected(1 == position ? true : false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        VipRechargeRecordsFragment fragment1 = new VipRechargeRecordsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.intent_vip_shop_id,shopId);
        bundle.putLong(Constants.intent_vip_user_id,vipUserId);
        fragment1.setArguments(bundle);
        VipConsumesFragment fragment2 = new VipConsumesFragment();
        fragment2.setArguments(bundle);
        fragmentList.add(fragment1);
        fragmentList.add(fragment2);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragmentList);
        binding.viewPager.setAdapter(pagerAdapter);
        binding.viewPager.setCurrentItem(0);
        setBgWhiteStatusBar();

    }
}
