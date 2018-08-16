package ys.app.petproject.activity.vip;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.SearchActivity;
import ys.app.petproject.adapter.FragmentPageAdapter;
import ys.app.petproject.adapter.vip.VipPetAdapter;
import ys.app.petproject.fragment.VipCardFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.nfc.MagneticCardActivity;

public class VipActivity extends BaseActivity {
    private android.support.design.widget.TabLayout tableLayout;
    private ViewPager viewPager;
    private int flag=0;
    private int classification;
    ImageView iv_card_search;
    private ApiClient<BaseListResult<VipInfo>> apiClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        setBackVisiable();

        setBgWhiteStatusBar();
        tableLayout= (android.support.design.widget.TabLayout) findViewById(R.id.tl_vp_with_tab);
        viewPager= (ViewPager) findViewById(R.id.vp_vp_with_tab);
        classification =getIntent().getIntExtra(Constants.intent_type,0);
        checkWarnVip();
        initTopView();
        initViewPager();


    }
    private void initViewPager(){
        List<Fragment> fragmentList = new ArrayList<>();

        VipCardFragment vipFragment=getFragment(0);
        VipCardFragment numFragment=getFragment(1);

        fragmentList.add(vipFragment);
        fragmentList.add(numFragment);

        String []arrTitle={"会员卡","次卡"};
        FragmentPageAdapter pageAdapter = new FragmentPageAdapter(getSupportFragmentManager(), fragmentList,arrTitle);
        viewPager.setAdapter(pageAdapter); //添加适配器
        tableLayout.setupWithViewPager(viewPager);   //设置tablayout
        tableLayout.setTabsFromPagerAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0){
                    setFlag(0);
                }else {
                   setFlag(1);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        int type=getIntent().getIntExtra(Constants.intent_type,0);
        if (type==1){
            viewPager.setCurrentItem(1);
        }else{
            viewPager.setCurrentItem(0);
        }

    }

    private void initTopView() {
        ImageView mAddTv = (ImageView) findViewById(R.id.add_iv);
        mAddTv.setVisibility(View.VISIBLE);
        mAddTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VipActivity.this, AddVipActivity.class);
                intent.putExtra(Constants.intent_flag, flag);
                startActivity(intent);
            }
        });

        TextView searchAllTv = (TextView) findViewById(R.id.search_all_tv);
        searchAllTv.setVisibility(View.VISIBLE);
        searchAllTv.setHint("搜索会员");
        searchAllTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VipActivity.this, SearchActivity.class);
                intent.putExtra(Constants.intent_search_type, Constants.intent_search_type_vip);
                intent.putExtra(Constants.intent_flag,flag);
                startActivity(intent);
            }
        });

        iv_card_search = (ImageView) findViewById(R.id.iv_search_card);
        if (Constants.P1N.equals(SpUtil.getDeviceModel())) {
            iv_card_search.setVisibility(View.VISIBLE);//暂时不支持NFC
        }
        iv_card_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VipActivity.this, MagneticCardActivity.class);
                intent.putExtra(Constants.intent_flag, "huiyuan");
                intent.putExtra(Constants.intent_vip_name, flag);
                startActivity(intent);
            }
        });
    }

    private VipCardFragment getFragment(int flag){
        VipCardFragment vipCardFragment=new VipCardFragment();
        Bundle bundle=new Bundle();
        bundle.putInt(Constants.intent_flag,flag);
        int  cardNO = getIntent().getIntExtra(Constants.intent_vip_card_no,-1);
        bundle.putSerializable(Constants.intent_vip_card_no,cardNO);
        bundle.putInt(Constants.intent_type,classification);
        vipCardFragment.setArguments(bundle);
        return vipCardFragment;
    }


    /**
     * 设置fragment的类型  0：折扣会员，1：次卡会员
     * @param flag
     */
    public void setFlag(int flag){
        this.flag = flag;
    }

    private void checkWarnVip(){
        final Dialog dialog=new Dialog(this,R.style.ThemeCustomDialog);

        dialog.setContentView(R.layout.dialog_vip_pet_warn);
        TextView tv_close= (TextView) dialog.findViewById(R.id.tv_dialog_pet_warn_close);
        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        RecyclerView recyclerView= (RecyclerView) dialog.findViewById(R.id.recyclerView);
        final VipPetAdapter adapter=new VipPetAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        if (apiClient==null)apiClient=new ApiClient<>();
        Map params=new HashMap();
        params.put("branchId", SpUtil.getBranchId() + "");
        params.put("headOfficeId", SpUtil.getHeadOfficeId() + "");
        params.put("limit", "1000");
        apiClient.reqApi("selectVipUserMessage", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<VipInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipInfo> result) {
                        if (result.isSuccess()) {
                            List<VipInfo> data = result.getData();
                            if (data.size()>0) {
                                adapter.setList(data);
                                dialog.show();
                            }
                        } else {
                            showToast(result.getErrorCode());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });


    }
}
