package ys.app.petproject.viewmodel.inventory;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ys.app.petproject.BR;
import ys.app.petproject.model.InventoryRecordsInfo;

/**
 * Created by admin on 2017/7/12.
 */

public class InventoryRecordItemViewModel extends BaseObservable {

    private Context mContext;
    public InventoryRecordsInfo.InventoryList2Bean model;

    public InventoryRecordItemViewModel(InventoryRecordsInfo.InventoryList2Bean bean, Context context) {
        this.mContext = context;
        this.model = bean;
    }

    @Bindable
    public InventoryRecordsInfo.InventoryList2Bean getModel() {
        return model;
    }

    public void setModel(InventoryRecordsInfo.InventoryList2Bean model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }
}
