package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityCommitOrderBinding;
import ys.app.petproject.viewmodel.CommitOrderViewModel;

/**
 * Created by aaa on 2017/3/15.
 */

public class CommitOrderActivity extends BaseActivity {

    private ActivityCommitOrderBinding binding;
    private CommitOrderViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_commit_order);
        setBackVisiable();
        setTitle("提交订单");
        Intent intent=getIntent();
        double money=intent.getDoubleExtra(Constants.intent_money,-1);
        String userName=intent.getStringExtra("userName");
        String userPhone=intent.getStringExtra("userPhone");
        mViewModel = new CommitOrderViewModel(this,binding,money,userName,userPhone);
        binding.setViewModel(mViewModel);
        mViewModel.init();
        String idStr = intent.getStringExtra(Constants.intent_id);

        mViewModel.getDataFromIntent(idStr);
        setBgWhiteStatusBar();

    }

    @Override
    public void onBackPressed() {
        if (mViewModel != null){
            mViewModel.back();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Constants.type_gua_dan_success){
            mViewModel.commitOrderHttp(false);
        }else if(resultCode == Constants.type_jie_zhang_success){
            mViewModel.commitOrderHttp(true);
        }

    }
}
