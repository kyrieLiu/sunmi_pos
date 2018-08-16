package ys.app.petproject.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;

import ys.app.petproject.Constants;
import ys.app.petproject.activity.ShoppingPayActivity;
import ys.app.petproject.model.OrderInfo;

/**
 * Created by admin on 2017/4/25.
 */

public class OrderItemViewModel extends BaseObservable {


    private OrderInfo model;
    private Context mContext;


    public OrderItemViewModel(OrderInfo model, Context context) {
        this.model = model;
        this.mContext = context;
    }


    @Bindable
    public OrderInfo getModel() {
        return model;
    }

    public void setModel(OrderInfo model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }

    public void clickPay(View v) {
        if ("订单".equals(model.getOrderInfo())) {
            Intent intent = new Intent(mContext, ShoppingPayActivity.class);
            intent.putExtra(Constants.intent_id, model.getOrderNo());
            intent.putExtra(Constants.intent_boolean, model.getVipUserId() > 0);
            mContext.startActivity(intent);
        } else {
//            Intent intent = new Intent(mContext, PayActivity.class);
//            intent.putExtra(Constants.intent_orderNo,model.getOrderNo());
//            mContext.startActivity(intent);
            Toast.makeText(mContext, "非订单", Toast.LENGTH_SHORT).show();
        }

    }

}
