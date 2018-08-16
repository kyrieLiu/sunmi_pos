package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.SandQRCodeBinding;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.model.OrderPayParam;
import ys.app.petproject.viewmodel.SandQRCodeModel;

public class SandQRCodeActivity extends BaseActivity {

    SandQRCodeBinding mBinding;
    SandQRCodeModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_sand_qrcode);
        setBackVisiable();
        Intent intent = getIntent();
        OrderPayParam orderPayParam = (OrderPayParam) intent.getSerializableExtra(Constants.intent_info);
        String channelType=orderPayParam.getPayChannelTypeNo();
        if ("0201".equals(channelType) || "0205".equals(channelType)){
            setTitle("微信收款");
        }else if("0104".equals(channelType) || "0106".equals(channelType)){
            setTitle("支付宝收款");
        }else {
            setTitle("银联支付");
        }
        ChargeInfo chargeInfo= (ChargeInfo) intent.getSerializableExtra("chargeModel");
        mViewModel = new SandQRCodeModel(this,mBinding,chargeInfo);
        mBinding.setViewModel(mViewModel);
        setBgWhiteStatusBar();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        mViewModel.onBackPress();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.onDestroy();
    }
}

