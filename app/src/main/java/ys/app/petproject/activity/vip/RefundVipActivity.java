package ys.app.petproject.activity.vip;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityRefundVipBinding;
import ys.app.petproject.viewmodel.vip.RefundVipViewModel;

public class RefundVipActivity extends BaseActivity {
    private ActivityRefundVipBinding binding;
    private RefundVipViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_refund_vip);
        setBackVisiable();
        setTitle("退卡");
        Intent intent=getIntent();
        long vipUserId=intent.getLongExtra("vipUserId",0);
        viewModel = new RefundVipViewModel(this,vipUserId,binding);
        binding.setViewModel(viewModel);
        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.clear();
    }
}
