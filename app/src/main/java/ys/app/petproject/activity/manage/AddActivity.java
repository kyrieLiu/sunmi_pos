package ys.app.petproject.activity.manage;

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
import ys.app.petproject.R;
import ys.app.petproject.adapter.MyPagerAdapter;
import ys.app.petproject.databinding.ActivityAddBinding;
import ys.app.petproject.fragment.AddGoodsFragment;
import ys.app.petproject.fragment.AddServiceFragment;
import ys.app.petproject.viewmodel.AddViewModel;

/**
 * Created by aaa on 2017/3/8.
 */

public class AddActivity extends BaseActivity {

    private ActivityAddBinding binding;
    private AddViewModel mViewModel;
    private List<Fragment> fragmentList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add);
        setBackVisiable(true);
        mViewModel = new AddViewModel(this,binding);
        binding.setViewModel(mViewModel);
        init();
    }

    private void init() {
        LinearLayout addLl = (LinearLayout) findViewById(R.id.add_ll);
        final TextView addGoodsTv = (TextView) findViewById(R.id.add_goods_tv);
        final TextView addServiceTv = (TextView) findViewById(R.id.add_service_tv);

        addLl.setVisibility(View.VISIBLE);
        addGoodsTv.setSelected(true);
        addServiceTv.setSelected(false);

        addGoodsTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(0);
            }
        });
        addServiceTv.setOnClickListener(new View.OnClickListener() {
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
                addGoodsTv.setSelected(0==position?true:false);
                addServiceTv.setSelected(1==position?true:false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        AddGoodsFragment fragment1 = new AddGoodsFragment();
        AddServiceFragment fragment2 = new AddServiceFragment();

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),fragmentList);
        binding.viewPager.setAdapter(pagerAdapter);
        setBgWhiteStatusBar();

    }
}



