package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.PersonalPayBinding;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.viewmodel.PersonalPayModel;

public class PersonPayActivity extends BaseActivity {

    private PersonalPayBinding binding;
    private PersonalPayModel payModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_personal_pay);
        setBackVisiable();

        Intent intent=getIntent();
        String  pay_type=intent.getStringExtra(Constants.intent_flag);
        String money=intent.getStringExtra("money");
        String intentFrom=intent.getStringExtra(Constants.intent_name);
        String orderNO=intent.getStringExtra(Constants.intent_orderNo);
        if ("0112".equals(pay_type)){
            setTitle("微信收款");
        }else if ("0113".equals(pay_type)){
            setTitle("支付宝收款");
        }else{
            setTitle("现金收款");
        }
        ChargeInfo chargeInfo= (ChargeInfo) intent.getSerializableExtra("chargeModel");
        payModel = new PersonalPayModel(this,binding,pay_type,money,intentFrom,chargeInfo,orderNO);
        binding.setViewModel(payModel);

        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        payModel.clear();
    }
}
