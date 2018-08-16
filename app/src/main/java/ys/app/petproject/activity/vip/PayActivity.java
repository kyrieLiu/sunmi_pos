package ys.app.petproject.activity.vip;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityPayBinding;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.viewmodel.PayViewModel;

/**
 * Created by aaa on 2017/3/1.
 */

public class PayActivity extends BaseActivity {

    private ActivityPayBinding binding;
    private PayViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pay);
        setBackVisiable();
        setTitle("结算");

       ChargeInfo chargeInfo = (ChargeInfo)getIntent().getSerializableExtra(Constants.intent_info);
        mViewModel = new PayViewModel(this,binding);
        binding.setViewModel(mViewModel);
        mViewModel.setIntentData(chargeInfo);
        setBgWhiteStatusBar();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
