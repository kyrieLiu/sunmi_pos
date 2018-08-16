package ys.app.petproject.adapter;

import android.app.Activity;

import java.util.List;

import ys.app.petproject.model.SelectInfo;

/**
 * Created by aaa on 2017/3/20.
 */

public class SelectSimpleAdapter extends SelectAdapter<SelectInfo> {

    public SelectSimpleAdapter(Activity activity, List<SelectInfo> list) {
        super(activity,list);
    }

    @Override
    public void onBindView(SelectAdapter.MyViewHolder holder, int position) {
        SelectInfo info = (SelectInfo)mList.get(position);
        holder.setName(info.getName());
        holder.setSelect(info.isSelect());
    }
}
