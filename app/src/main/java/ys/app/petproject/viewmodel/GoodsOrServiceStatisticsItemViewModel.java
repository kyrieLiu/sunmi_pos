package ys.app.petproject.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ys.app.petproject.model.StatisticsDataInfo;

/**
 * Created by aaa on 2017/6/8.
 */

public class GoodsOrServiceStatisticsItemViewModel extends BaseObservable {

    private StatisticsDataInfo.ProductTypeListBean model;
    private Context mContext;


    public GoodsOrServiceStatisticsItemViewModel(StatisticsDataInfo.ProductTypeListBean model, Context context) {
        this.model = model;
        this.mContext = context;
    }


    @Bindable
    public StatisticsDataInfo.ProductTypeListBean getModel() {
        return model;
    }

    public void setModel(StatisticsDataInfo.ProductTypeListBean model) {
        this.model = model;
    }
}

