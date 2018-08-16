package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityShoppingPayBinding;
import ys.app.petproject.service.BlueToothService;
import ys.app.petproject.viewmodel.ShoppingPayViewModel;

/**
 * Created by aaa on 2017/3/16.
 */

public class ShoppingPayActivity extends BaseActivity {

    private ActivityShoppingPayBinding binding;
    private ShoppingPayViewModel mViewModel;
    private BlueToothService mService = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_shopping_pay);
        setBackVisiable();
        setTitle("提交订单");
        mViewModel = new ShoppingPayViewModel(this,binding);
        binding.setViewModel(mViewModel);
        Intent intent = getIntent();
        String orderNo = intent.getStringExtra(Constants.intent_id);
        mViewModel.setPayMoney(orderNo);
        setBgWhiteStatusBar();

    }

    @Override
    public void onBackPressed() {
        if (mViewModel != null){
            mViewModel.back();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
