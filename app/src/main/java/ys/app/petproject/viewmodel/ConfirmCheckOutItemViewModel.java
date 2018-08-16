package ys.app.petproject.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;

import ys.app.petproject.BR;
import ys.app.petproject.Constants;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.model.VipInfo;

/**
 * Created by xyy on 17-7-15.
 */

public class ConfirmCheckOutItemViewModel extends BaseObservable {


    private final RxManager rxManager;
    private VipInfo model;
    private Context mContext;

    public ObservableField<String> obAnimal1Name = new ObservableField<String>();
    public ObservableField<String> obAnimal2Name = new ObservableField<String>();
    public ObservableField<String> obAnimal3Name = new ObservableField<String>();
    public ObservableField<String> obAnimal4Name = new ObservableField<String>();
    public ObservableField<String> typeName = new ObservableField<String>();//是否挂单
    public ObservableField<String> isVipName = new ObservableField<String>();//是否是会员价


    public ConfirmCheckOutItemViewModel(VipInfo model, Context context,boolean isGuadan) {
        this.model = model;
        this.mContext = context;
        if (isGuadan){
            typeName.set("折扣价挂单");
            isVipName.set("会员价挂单");
        }else{
            typeName.set("折扣价结账");
            isVipName.set("会员价结账");
        }
        rxManager = new RxManager();

    }


    @Bindable
    public VipInfo getModel() {
        return model;
    }

    public void setModel(VipInfo model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }

    /**
     * 会员价
     * @param view
     */
    public void clickVipPay(View view){
        rxManager.post(Constants.confirm_vip_info,model);
    }

    /**
     * 销售价支付
     * @param view
     */
    public void clickOriginalPay(View view){
        rxManager.post(Constants.confirm_type_info,model);
    }

}