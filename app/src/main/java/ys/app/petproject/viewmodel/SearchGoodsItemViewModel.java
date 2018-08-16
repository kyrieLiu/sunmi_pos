package ys.app.petproject.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;


import ys.app.petproject.BR;
import ys.app.petproject.Constants;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.utils.AppUtil;

/**
 * Created by aaa on 2017/6/9.
 */

public class SearchGoodsItemViewModel extends BaseObservable {


    private final RxManager rxManager;
    public GoodInfo model;
    private Context mContext;
    public ObservableField<String> price = new ObservableField<>();
    public ObservableField<String> costPrice = new ObservableField<>();


    public SearchGoodsItemViewModel(GoodInfo model, Context context) {
        this.model = model;
        this.mContext = context;
        setPrice(model);
        rxManager = new RxManager();
    }


    @Bindable
    public GoodInfo getModel() {
        return model;
    }

    public void setModel(GoodInfo model) {
        this.model = model;
        setPrice(model);
        notifyPropertyChanged(BR.model);
    }
    private void setPrice(GoodInfo model) {
        price.set(AppUtil.formatStandardMoney(model.getRealAmt()));
        costPrice.set(AppUtil.formatStandardMoney(model.getPromotionAmt()));
    }
    public void clickAddShoppingButton(View view){
        rxManager.post(Constants.bus_type_info,model);
    }

}
