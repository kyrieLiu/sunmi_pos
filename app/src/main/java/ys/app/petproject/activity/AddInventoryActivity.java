package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAddInventoryBinding;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.viewmodel.AddInventoryViewModel;

/**
 * Created by aaa on 2017/3/7.
 */

public class AddInventoryActivity extends BaseActivity {

    private ActivityAddInventoryBinding binding;
    private AddInventoryViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_inventory);
        setBackVisiable();
        setTitle("入库");
        getDataFromIntent();
        setBgWhiteStatusBar();

    }

    private void getDataFromIntent() {
        Bundle extras = getIntent().getExtras();
        GoodInfo result = (GoodInfo) extras.getSerializable(Constants.intent_info);
        mViewModel = new AddInventoryViewModel(this,binding,result);
        binding.setViewModel(mViewModel);
    }
}
