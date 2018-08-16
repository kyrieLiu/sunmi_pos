package ys.app.petproject.activity.inventory;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.InventoryRecordsDetailBinding;
import ys.app.petproject.model.InventoryRecordsInfo;
import ys.app.petproject.viewmodel.inventory.InventoryRecordsDetailViewModel;

public class InventoryRecordsDetailActivity extends BaseActivity {

    private InventoryRecordsInfo mInfo;
    private InventoryRecordsDetailBinding mBinding;
    private InventoryRecordsDetailViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_inventory_records_detail);
        mViewModel = new InventoryRecordsDetailViewModel(this,mBinding);
        mBinding.setViewModel(mViewModel);
        mInfo = (InventoryRecordsInfo)getIntent().getExtras().getSerializable("InventoryRecords");
        mViewModel.init(mInfo);
        setBackVisiable();
        setTitle("盘点详情");
        setBgWhiteStatusBar();

    }
}
