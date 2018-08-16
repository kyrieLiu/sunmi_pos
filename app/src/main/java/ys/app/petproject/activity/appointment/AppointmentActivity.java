package ys.app.petproject.activity.appointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.adapter.FragmentPageAdapter;
import ys.app.petproject.fragment.appointment.AppointmentAreadyFragment;

public class AppointmentActivity extends BaseActivity {
    private android.support.design.widget.TabLayout tableLayout;
    private ViewPager viewPager;
    private String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        setBackVisiable();
        date=getIntent().getStringExtra(Constants.intent_flag);
        setTitle("当天预约  ("+date+")");
        TextView addTV = (TextView) findViewById(R.id.sreach_tv);
        addTV.setVisibility(View.VISIBLE);
        addTV.setText("添加");
        addTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AppointmentActivity.this,AddAppointmentActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_from_left);
            }
        });
        setBgWhiteStatusBar();
        tableLayout= (android.support.design.widget.TabLayout) findViewById(R.id.tl_vp_with_tab);
        viewPager= (ViewPager) findViewById(R.id.vp_vp_with_tab);

        initView();

    }
    private void initView(){
        //0待审核   1已预约    4预约失败
        List<Fragment> fragmentList = new ArrayList<>();

            AppointmentAreadyFragment areadyFragment=getFragment(1);
            AppointmentAreadyFragment waitFragment=getFragment(0);
            AppointmentAreadyFragment failFragment=getFragment(4);

            fragmentList.add(areadyFragment);
            fragmentList.add(waitFragment);
            fragmentList.add(failFragment);

        String []arrTitle={"已预约","待审核","预约失败"};
        FragmentPageAdapter pageAdapter = new FragmentPageAdapter(getSupportFragmentManager(), fragmentList,arrTitle);
        viewPager.setAdapter(pageAdapter); //添加适配器
        tableLayout.setupWithViewPager(viewPager);   //设置tablayout
        tableLayout.setTabsFromPagerAdapter(pageAdapter);

    }
    private AppointmentAreadyFragment getFragment(int state){
        AppointmentAreadyFragment areadyFragment=new AppointmentAreadyFragment();
        Bundle bundle=new Bundle();
        bundle.putInt(Constants.intent_search_from,state);
        bundle.putString(Constants.intent_flag,date);
        areadyFragment.setArguments(bundle);
        return areadyFragment;
    }
}
