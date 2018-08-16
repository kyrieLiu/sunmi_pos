package ys.app.petproject.activity.vip;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAddVipBinding;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.viewmodel.vip.AddVipViewModel;

/**
 * Created by aaa on 2017/3/1.
 */

public class AddVipActivity extends BaseActivity {

    private ActivityAddVipBinding binding;
    private AddVipViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_add_vip);
        setBackVisiable();

        getDataFromIntent();
        setBgWhiteStatusBar();

    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        String type = intent.getStringExtra(Constants.intent_type);
        int flag = intent.getIntExtra(Constants.intent_flag,0);
        VipInfo  info = (VipInfo)intent.getSerializableExtra(Constants.intent_info);
        mViewModel = new AddVipViewModel(this,binding,flag);
        if(Constants.intent_modify.equals(type)){//修改
            if (flag==0){
                setTitle("修改折扣会员");
            }else{
                setTitle("修改次卡会员");
            }
            mViewModel.setData(info);
            binding.okBtn.setText("修改");
        }else {
            if(flag == 0){//新增次卡
                setTitle("新增折扣会员");
            } else if (flag==0){//新增折扣会员
                setTitle("新增次卡会员");

            }
            mViewModel.getRandomCarNo();
        }
        binding.setViewModel(mViewModel);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mViewModel.actvityResult(requestCode,resultCode,data);
    }

    @Override
    protected void onDestroy() {
        mViewModel.destroy();
        super.onDestroy();
    }

}
