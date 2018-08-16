package ys.app.petproject.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableDouble;
import android.databinding.ObservableField;
import android.os.Bundle;

import com.android.databinding.library.baseAdapters.BR;

import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.FosterCareActivity;
import ys.app.petproject.activity.HairdressingActivity;
import ys.app.petproject.model.SummitOrderInfo;


/**
 * 作者：lv
 * 时间：2017/4/3 18:42
 */

public class ShoppingCarAdapterViewModel extends BaseObservable {

    public   SummitOrderInfo model;
    private Activity mContext;
    public ObservableField<String> imgUrl = new ObservableField<>();
    public ObservableDouble vipMoney=new ObservableDouble();
    public ObservableBoolean seeDetail=new ObservableBoolean(false);
    public ObservableField<String> obTitle = new ObservableField<>();

    public ShoppingCarAdapterViewModel(Context context, SummitOrderInfo info,double money){
       this.mContext = (Activity) context;
       this.model = info;
        vipMoney.set(money);
        imgUrl.set(Constants.base_img_url+model.getImg());
        if (("寄养".equals(model.getProductTypeName()))){
            seeDetail.set(true);
            obTitle.set("寄养协议");
        }else if("美容".equals(model.getProductTypeName())){
            seeDetail.set(true);
            obTitle.set("美容确认单");
        }else{
            seeDetail.set(false);
        }
    }

    @Bindable
    public SummitOrderInfo getModel() {
        return model;
    }

    public void setModel(SummitOrderInfo model,double money) {
        this.model = model;
        notifyPropertyChanged(BR.model);
        vipMoney.set(money);
        imgUrl.set(Constants.base_img_url+model.getImg());
        if (("寄养".equals(model.getProductTypeName()))){
            seeDetail.set(true);
            obTitle.set("寄养协议");
        }else if("美容".equals(model.getProductTypeName())){
            seeDetail.set(true);
            obTitle.set("美容确认单");
        }else{
            seeDetail.set(false);
        }
    }

    public void clickDetail(){
        Intent intent =new Intent();
        intent.putExtra(Constants.intent_info,model);
        if ("寄养".equals(model.getProductTypeName())){
            intent.setClass(mContext,FosterCareActivity.class);
        }else{
            intent.setClass(mContext,HairdressingActivity.class);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.intent_info,model);
        intent.putExtras(bundle);
        mContext.startActivityForResult(intent,Constants.type_gua_dan_success);
    }
}
