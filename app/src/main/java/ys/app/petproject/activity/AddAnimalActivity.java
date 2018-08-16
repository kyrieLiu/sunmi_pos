package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import java.io.Serializable;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAddAnimalBinding;
import ys.app.petproject.model.AnimalInfo;
import ys.app.petproject.viewmodel.AddAnimalViewModel;

/**
 * 作者：lv
 * 时间：2017/3/18 11:28
 */
public class AddAnimalActivity extends BaseActivity {

    private ActivityAddAnimalBinding binding;
    private AddAnimalViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_animal);
        setBackVisiable();
        Intent intent=getIntent();
        Serializable serializableExtra = intent.getSerializableExtra(Constants.intent_info);
        if(serializableExtra instanceof AnimalInfo){//编辑
            setTitle("编辑宠物");
        }else {
            setTitle("新增宠物");
        }
        String normalUserName=intent.getStringExtra("userName");
        String normalUserPhone=intent.getStringExtra("userPhone");

        mViewModel = new AddAnimalViewModel(this,binding,serializableExtra,normalUserName,normalUserPhone);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mViewModel.activityResult(requestCode,resultCode,data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mViewModel != null){
            mViewModel.reset();
        }
    }
}
