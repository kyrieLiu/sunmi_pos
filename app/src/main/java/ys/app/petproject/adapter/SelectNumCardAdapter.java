package ys.app.petproject.adapter;

import android.app.Activity;

import java.util.List;

import ys.app.petproject.model.NumCardListInfo;


/**
 * Created by Administrator on 2017/12/13/013.
 */

public class SelectNumCardAdapter extends SelectAdapter {
    public SelectNumCardAdapter(Activity activity, List<NumCardListInfo> list) {
        super(activity, list);
    }

    @Override
    public void onBindView(MyViewHolder holder, int position) {
        NumCardListInfo type = (NumCardListInfo) mList.get(position);
        holder.setName(type.getName());
        holder.setSelect(type.isSelect());
    }

}
