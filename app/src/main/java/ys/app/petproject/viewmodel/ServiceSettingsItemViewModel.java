package ys.app.petproject.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.CompoundButton;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.model.ServiceTypeInfo;

/**
 * Created by aaa on 2017/3/23.
 */

public class ServiceSettingsItemViewModel  extends BaseObservable {

    private final int mPosition;
    private ServiceTypeInfo model;
    private BaseActivity mActivity;


    public ServiceSettingsItemViewModel(int position,ServiceTypeInfo model, BaseActivity activity)
    {
        this.model = model;
        this.mActivity = activity;
        this.mPosition = position;
    }



    @Bindable
    public ServiceTypeInfo getModel() {
        return model;
    }

    public void setModel(ServiceTypeInfo model) {
        this.model = model;
    }


    public CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            model.setCardType(isChecked?1:0);
        }
    };
}
