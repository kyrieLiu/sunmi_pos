package ys.app.petproject.adapter;

import android.app.Activity;

import java.util.List;

import ys.app.petproject.model.BackGoodsReasonInfo;

/**
 * Created by aaa on 2017/4/1.
 */

public class SelectBackReasonAdapter extends SelectAdapter<BackGoodsReasonInfo> {

    public SelectBackReasonAdapter(Activity activity, List<BackGoodsReasonInfo> list) {
        super(activity,list);
    }

    @Override
    public void onBindView(SelectAdapter.MyViewHolder holder, int position) {
        BackGoodsReasonInfo info = (BackGoodsReasonInfo)mList.get(position);
        holder.setName(info.getReasons());
        holder.setSelect(info.isSelect());
    }
}
