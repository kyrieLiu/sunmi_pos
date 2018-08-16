package ys.app.petproject.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;

import com.android.databinding.library.baseAdapters.BR;

import ys.app.petproject.Constants;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.utils.AppUtil;

/**
 * Created by Administrator on 2017/6/10.
 */
public class GoodsSearchItemViewModel  extends BaseObservable {


    private final RxManager rxManager;
    private GoodInfo model;
    private Context mContext;
    public ObservableField<String> price = new ObservableField<>();
    public ObservableField<String> costPrice = new ObservableField<>();


    public GoodsSearchItemViewModel(GoodInfo model, Context context) {
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
        costPrice.set(AppUtil.formatStandardMoney(model.getCostAmt()));
    }
    public void clickAddShoppingButton(View view){
        rxManager.post(Constants.bus_type_info,model);
    }

}
