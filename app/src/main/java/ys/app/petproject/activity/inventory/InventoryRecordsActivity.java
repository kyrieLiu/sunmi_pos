package ys.app.petproject.activity.inventory;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.InventoryRecordsBinding;
import ys.app.petproject.viewmodel.inventory.InventoryRecordsViewModel;

public class InventoryRecordsActivity extends BaseActivity {

    private InventoryRecordsBinding mBinding;
    private InventoryRecordsViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_inventory_records);
        setBackVisiable();
        setTitle("盘点记录");
        mViewModel = new InventoryRecordsViewModel(this,mBinding);
        mBinding.setViewModel(mViewModel);
        mViewModel.init();
        setBgWhiteStatusBar();
    }
}
