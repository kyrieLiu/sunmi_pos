package ys.app.petproject.activity.vip;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import java.io.Serializable;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityChargeBinding;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.viewmodel.ChargeViewModel;

/**
 * Created by aaa on 2017/3/1.
 */

public class ChargeActivity extends BaseActivity {

    private ActivityChargeBinding binding;
    private ChargeViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_charge);
        setBackVisiable();
        setTitle("充值");

        mViewModel = new ChargeViewModel(this,binding);
        binding.setViewModel(mViewModel);

        long id=getIntent().getLongExtra(Constants.intent_id,-1);
        if (id!=-1) mViewModel.setVipId(id);
        Serializable serializable=getIntent().getSerializableExtra(Constants.intent_info);
        if (serializable!=null){
            VipInfo vipInfo= (VipInfo) serializable;
            mViewModel.setVipIntentData(vipInfo);
        }

        mViewModel.init();
        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
    
}
