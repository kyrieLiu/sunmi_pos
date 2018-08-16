package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityShoppingPayResultBinding;
import ys.app.petproject.viewmodel.ShoppingPayResultViewModel;

/**
 * Created by aaa on 2017/3/16.
 */
public class ShoppingPayResultActivity extends BaseActivity {

    private ActivityShoppingPayResultBinding binding;
    private ShoppingPayResultViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_shopping_pay_result);
        setBackVisiable();
        setTitle("支付结果");
        mViewModel = new ShoppingPayResultViewModel(this, binding);
        binding.setViewModel(mViewModel);
        Intent intent = getIntent();
        String orderNo = intent.getStringExtra(Constants.intent_orderNo);
        boolean isVipPay = intent.getBooleanExtra(Constants.intent_is_vip_pay,false);
        boolean isPaySuccess = intent.getBooleanExtra(Constants.intent_boolean,false);
        mViewModel.setIntentData(orderNo,isVipPay,isPaySuccess);
        setBgWhiteStatusBar();

    }
}
