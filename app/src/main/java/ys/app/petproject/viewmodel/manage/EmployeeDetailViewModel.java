package ys.app.petproject.viewmodel.manage;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

import ys.app.petproject.activity.manage.EmployeeDetailActivity;
import ys.app.petproject.databinding.ActivityEmployeeDetailBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.model.EmployeeInfo;

/**
 * Created by lyy on 2017/6/26.
 */

public class EmployeeDetailViewModel extends BaseObservable{
    private final EmployeeDetailActivity mActivity;
    private final ActivityEmployeeDetailBinding mBinding;
    public EmployeeInfo model;
    private RxManager rxManager;

    public EmployeeDetailViewModel(EmployeeDetailActivity activity, ActivityEmployeeDetailBinding binding) {
        this.mActivity = activity;
        this.mBinding = binding;
    }
    @Bindable
    public EmployeeInfo getModel() {
        return model;
    }

    public void setModel(EmployeeInfo model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }
}
