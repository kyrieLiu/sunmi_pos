package ys.app.petproject.viewmodel.manage;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import ys.app.petproject.BR;
import ys.app.petproject.Constants;
import ys.app.petproject.activity.manage.EmployeeDetailActivity;
import ys.app.petproject.model.EmployeeInfo;

/**
 * Created by aaa on 2017/6/5.
 */

public class EmployeeListItemViewModel  extends BaseObservable {

    @Bindable
    private EmployeeInfo model;
    private Context mContext;


    public EmployeeListItemViewModel(EmployeeInfo model, Context context) {
        this.model = model;
        this.mContext = context;
        setModel(model);
    }


    @Bindable
    public EmployeeInfo getModel() {
        return model;
    }

    public void setModel(EmployeeInfo model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }

    public void clickRootView(View v){
        Intent intent = new Intent(mContext, EmployeeDetailActivity.class);
        intent.putExtra(Constants.intent_info,model);
        mContext.startActivity(intent);
    }
}
