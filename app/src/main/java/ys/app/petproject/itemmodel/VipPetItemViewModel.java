package ys.app.petproject.itemmodel;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.android.databinding.library.baseAdapters.BR;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.activity.vip.VipDetailActivity;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.utils.StringUtils;


/**
 * Created by aaa on 2017/3/17.
 */

public class VipPetItemViewModel extends BaseObservable {

    private VipInfo model;
    private BaseActivity activity;
    public ObservableField<String> vipName=new ObservableField<>();
    public ObservableField<String> vipPhone=new ObservableField<>();


    public VipPetItemViewModel(int position, VipInfo model, BaseActivity activity)
    {
        this.model = model;
        this.activity=activity;
        setModel(model);
    }



    @Bindable
    public VipInfo getModel() {
        return model;
    }

    public void setModel(VipInfo model) {
        this.model = model;
        vipName.set("会员: "+model.getName());
        vipPhone.set("电话: "+model.getPhone());
        notifyPropertyChanged(BR.model);
    }
    public void clickDetail(){
        Intent intent = new Intent(activity,VipDetailActivity.class);
        intent.putExtra(Constants.intent_info,model);
        if (StringUtils.isEmpty(model.getProductList())){
            intent.putExtra(Constants.intent_type,0);
        }else{
            intent.putExtra(Constants.intent_type,1);
        }

        activity.startActivity(intent);
    }


}
