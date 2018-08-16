package ys.app.petproject.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;
import android.text.Editable;
import android.text.TextWatcher;

import com.android.databinding.library.baseAdapters.BR;

import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.utils.StringUtils;

/**
 * Created by aaa on 2017/3/7.
 */

public class CheckItemViewModel extends BaseObservable {
    private GoodInfo model;
    private Context mContext;
    public TextWatcher textChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String text = s.toString();
            if (!StringUtils.isEmptyOrWhitespace(text)) {
                int i;
                if ("-".equals(text)){
                    i=0;
                }else{
                    i = Integer.parseInt(text);
                }
                model.setInventoryNum(i);
                obLossNum.set(model.getInventoryNum()-model.getStockNum());
            }
        }
    };


    public ObservableInt obLossNum = new ObservableInt();


    public CheckItemViewModel(GoodInfo model, Context context) {
        this.mContext = context;
        this.model=model;
    }


    @Bindable
    public GoodInfo getModel() {
        return model;
    }

    public void setModel(GoodInfo model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }
}
