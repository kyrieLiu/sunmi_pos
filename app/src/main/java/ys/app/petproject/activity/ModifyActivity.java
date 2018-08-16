package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityModifyBinding;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.viewmodel.ModifyViewModel;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by aaa on 2017/3/8.
 */

public class ModifyActivity extends BaseActivity {

    private ActivityModifyBinding binding;
    private ModifyViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_modify);
        setBackVisiable();
        setTitle("修改商品");
        getDataFormIntent();
        setBgWhiteStatusBar();

    }

    private void getDataFormIntent() {
        GoodInfo result = (GoodInfo)getIntent().getSerializableExtra(Constants.intent_info);
        mViewModel = new ModifyViewModel(this,binding,result);
        binding.setViewModel(mViewModel);
        mViewModel.getTypeHttp();
        mViewModel.getUnitHttp();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.scan_result_code && null != data){
            String info = data.getStringExtra(Constants.scan_result);
            if (!TextUtil.isEmpty(info) && mViewModel != null) {
                mViewModel.obBarCode.set(info);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.onRest();
    }
}
