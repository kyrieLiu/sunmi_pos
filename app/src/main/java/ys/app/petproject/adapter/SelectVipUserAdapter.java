package ys.app.petproject.adapter;

import android.app.Activity;

import java.util.List;

import ys.app.petproject.model.VipInfo;

/**
 * Created by aaa on 2017/4/12.
 */

public class SelectVipUserAdapter extends  SelectAdapter{

    public SelectVipUserAdapter(Activity activity, List<VipInfo> list) {
        super(activity, list);
    }

    @Override
    public void onBindView(SelectAdapter.MyViewHolder holder, int position) {
        VipInfo type = (VipInfo) mList.get(position);
        holder.setName("卡号: "+type.getCardNo());
        holder.setSelect(type.isSelect());
    }
}
