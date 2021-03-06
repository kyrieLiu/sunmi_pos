package ys.app.petproject.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.model.GoodTypeInfo;

/**
 * Created by aaa on 2017/6/1.
 */

public class TitleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<GoodTypeInfo> list;
    private final Context context;
    private OnItemClickListener listener;

    public TitleAdapter(Context context, List<GoodTypeInfo> list) {
        this.context = context;
        this.list = list;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(context)
                .inflate(R.layout.item_title, null, false);
        return new TitleAdapter.TitleViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        GoodTypeInfo info = (GoodTypeInfo) list.get(position);
        ((TitleAdapter.TitleViewHolder) holder).setTitle(position, info.getName());
        ((TitleAdapter.TitleViewHolder) holder).isSelect(info.getSelect());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public class TitleViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv;

        public TitleViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        listener.onItemClick(view, getAdapterPosition());
                    }
                }
            });
        }

        public void setTitle(int position, String name) {
            tv.setText(name);
        }

        public void isSelect(int select) {
            if (1 == select) {
                tv.setTextColor(Color.parseColor("#0d76e5"));
                tv.setBackgroundResource(R.drawable.shape_b_input);
            } else {
                tv.setTextColor(Color.parseColor("#666666"));
                tv.setBackgroundResource(R.drawable.shape_grey_input);
            }
        }
    }
}
