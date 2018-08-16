package ys.app.petproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.callback.OnItemClickListener;


/**
 * Created by admin on 2017/6/11.
 */

public class FosterCareAdapter extends RecyclerView.Adapter<FosterCareAdapter.MyViewHolder> {

    private final Context mContext;


    private LayoutInflater mInflater;
    public List<Integer> filterList = new ArrayList<>();
    private String[] hairDressings;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    private OnItemClickListener listener;

    public FosterCareAdapter(Context context, String[] hairDressings) {
        this.hairDressings = hairDressings;
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        for (int i = 0; i < hairDressings.length; i++) {
            filterList.add(0);
        }
    }

    @Override
    public FosterCareAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_foster_care, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.tv_title = (TextView) view.findViewById(R.id.tv_item_hairdressing_organ_title);
        viewHolder.cb_item_first = (CheckBox) view.findViewById(R.id.cb_item_first);
        viewHolder.cb_item_second = (CheckBox) view.findViewById(R.id.cb_item_second);
        viewHolder.cb_item_third = (CheckBox) view.findViewById(R.id.cb_item_third);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final FosterCareAdapter.MyViewHolder holder, final int position) {
        holder.tv_title.setText(hairDressings[position]);
        holder.cb_item_first.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                holder.cb_item_second.setChecked(false);
                holder.cb_item_third.setChecked(false);
                if (!isChecked) {
                    holder.number = 0;
                    holder.cb_item_first.setChecked(false);
                } else {
                    holder.number = 1;
                    holder.cb_item_first.setChecked(true);
                }
                notifyList(position, holder);
            }
        });
        holder.cb_item_second.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                holder.cb_item_first.setChecked(false);
                holder.cb_item_third.setChecked(false);
                if (!isChecked) {
                    holder.number = 0;
                    holder.cb_item_second.setChecked(false);
                } else {
                    holder.number = 2;
                    holder.cb_item_second.setChecked(true);
                }
                notifyList(position, holder);
            }
        });
        holder.cb_item_third.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                holder.cb_item_first.setChecked(false);
                holder.cb_item_second.setChecked(false);
                if (!isChecked) {
                    holder.number = 0;
                    holder.cb_item_third.setChecked(false);
                } else {
                    holder.number = 3;
                    holder.cb_item_third.setChecked(true);
                }
                notifyList(position, holder);
            }
        });

    }


    private void notifyList(int position, MyViewHolder holder) {
        if (filterList.size() > 0 && position < filterList.size()) {
            filterList.set(position, holder.number);
        } else {
            filterList.add(holder.number);
        }
    }


    @Override
    public int getItemCount() {
        return hairDressings.length;
    }


//    public void setList(List<HairDressingInfo> list) {
//        mList.clear();
//        mList.addAll(list);
//        notifyDataSetChanged();
//    }
//
//    public void setList(int startHttp, List<HairDressingInfo> list) {
//        if( 0 == startHttp){
//            if (list != null && !list.isEmpty()){
//                this.mList.clear();
//                this.mList.addAll(list);
//                notifyDataSetChanged();
//            }
//        }else if (startHttp > 0){
//            if (list != null && !list.isEmpty() ){
//                this.mList.addAll(list);
//                notifyItemRangeInserted(this.mList.size() - list.size() , list.size());
//            }
//        }
//
//
//    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title;
        CheckBox cb_item_first, cb_item_second, cb_item_third;
        int number = 0;

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
