package ys.app.petproject.callback;

import ys.app.petproject.model.OrderInfo;

/**
 * Created by admin on 2017/4/25.
 */

public interface ItemDataClickListener {
    public void onExpandChildren(OrderInfo itemData);

    public void onHideChildren(OrderInfo itemData);
}
