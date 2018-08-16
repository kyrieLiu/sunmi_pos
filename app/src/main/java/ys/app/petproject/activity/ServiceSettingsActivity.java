package ys.app.petproject.activity;


import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ServiceSettingsBinding;
import ys.app.petproject.viewmodel.ServiceSettingsViewModel;

/**
 * 作者：lv
 * 时间：2017/3/18 12:25
 */

public class ServiceSettingsActivity extends BaseActivity {

    private ServiceSettingsBinding mServiceSettingsBinding;
    private ServiceSettingsViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mServiceSettingsBinding = DataBindingUtil.setContentView(this, R.layout.activity_service_settings);
        mViewModel = new ServiceSettingsViewModel(this,mServiceSettingsBinding);
        mServiceSettingsBinding.setViewModel(mViewModel);
        setBackVisiable();
        setTitle("服务设置");
        mViewModel.init();
        String cardId = getIntent().getStringExtra(Constants.intent_id);
        mViewModel.getDataHttp(cardId);
        setBgWhiteStatusBar();

    }
}
