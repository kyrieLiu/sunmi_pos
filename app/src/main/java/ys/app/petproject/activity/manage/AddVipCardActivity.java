package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAddVipCardBinding;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.viewmodel.manage.AddVipCardViewModel;

/**
 * Created by aaa on 2017/3/17.
 */

public class AddVipCardActivity extends BaseActivity {

    private ActivityAddVipCardBinding binding;
    private AddVipCardViewModel mViewModel;
    private int classification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_vip_card);
        setBackVisiable();
        classification = getIntent().getIntExtra(Constants.intent_flag,0);
        mViewModel = new AddVipCardViewModel(this,binding, classification);
        binding.setViewModel(mViewModel);
        getDataFromIntent();
        mViewModel.init();
        setBgWhiteStatusBar();
    }

    private void getDataFromIntent() {
        VipCardInfo info = (VipCardInfo)getIntent().getSerializableExtra(Constants.intent_info);
        if(info!=null){
            mViewModel.setIntentData(info);
            if (classification==0)setTitle("编辑会员卡");
            else if (classification==2)setTitle("编辑折扣卡");
            else setTitle("编辑生日折扣卡");
        }else {
            if (classification==0)setTitle("添加会员卡");
            else if (classification==2)setTitle("添加折扣卡");
            else setTitle("添加生日折扣卡");
        }
    }

}
