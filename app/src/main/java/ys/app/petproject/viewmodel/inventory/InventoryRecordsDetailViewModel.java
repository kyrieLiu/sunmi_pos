package ys.app.petproject.viewmodel.inventory;

import android.databinding.ObservableField;
import android.support.v7.widget.LinearLayoutManager;

import java.util.List;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.activity.inventory.InventoryRecordsDetailActivity;
import ys.app.petproject.adapter.inventory.InventoryRecordsDetailAdapter;
import ys.app.petproject.databinding.InventoryRecordsDetailBinding;
import ys.app.petproject.model.InventoryRecordsInfo;

/**
 * Created by admin on 2017/7/12.
 */

public class InventoryRecordsDetailViewModel extends BaseActivityViewModel{

    private InventoryRecordsDetailActivity mActivity;
    private InventoryRecordsDetailBinding mBinding;
    public ObservableField<List<InventoryRecordsInfo.InventoryListBean>> listData = new ObservableField<>();

    public InventoryRecordsDetailViewModel(InventoryRecordsDetailActivity activity, InventoryRecordsDetailBinding binding){
        this.mActivity = activity;
        this.mBinding = binding;
    }

    public void init(InventoryRecordsInfo info){
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        InventoryRecordsDetailAdapter adapter = new InventoryRecordsDetailAdapter(mActivity);
        mBinding.recyclerView.setAdapter(adapter);

        //listData.set(info.getInventoryList());
        adapter.setList(info.getInventoryList());
    }
}
