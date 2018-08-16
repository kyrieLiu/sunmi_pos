package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ServiceDetailActivityBinding;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.viewmodel.ServiceDetailViewModel;

/**
 * Created by aaa on 2017/5/31.
 */

public class ServiceDetailActivity extends BaseActivity {
    private ServiceDetailActivityBinding binding;
    private ServiceDetailViewModel mViewModel;
    private ServiceInfo result;
    private String mFlag;
    private TextView mModifyTv;
    private String mSale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_service_detail);
        setBackVisiable();
        setTitle("服务详情");
        mModifyTv = (TextView)findViewById(R.id.modify_tv);
        mModifyTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceDetailActivity.this,ModifyServiceDetailActivity.class);
                intent.putExtra(Constants.intent_service_info,result);
                startActivity(intent);
            }
        });
        getDataFromIntent();
        setBgWhiteStatusBar();

    }

    private void getDataFromIntent() {
        Bundle extras = getIntent().getExtras();
        result = (ServiceInfo) extras.getSerializable(Constants.intent_service_info);
        int position =  extras.getInt(Constants.intent_service_position);
        boolean aBoolean = extras.getBoolean(Constants.intent_promotion);
        mViewModel = new ServiceDetailViewModel(this,binding,result,position,aBoolean);
        binding.setViewModel(mViewModel);
        mViewModel.init();
        if (aBoolean){
             mModifyTv.setVisibility(View.GONE);
        }else {
            mModifyTv.setVisibility(View.VISIBLE);
        }
    }
}
