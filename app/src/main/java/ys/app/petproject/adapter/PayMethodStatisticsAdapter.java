package ys.app.petproject.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ItemPayMethodStatisticsBinding;
import ys.app.petproject.model.StatisticsDataInfo;
import ys.app.petproject.viewmodel.PayMethodStatisticsItemViewModel;

/**
 * Created by aaa on 2017/6/8.
 */

public class PayMethodStatisticsAdapter extends RecyclerView.Adapter<PayMethodStatisticsAdapter.MyViewHolder> {

    private final Context mContext;
    private List<StatisticsDataInfo.PayMethodListBean> mList;

    public static void setListener(OnItemClickListener listener) {
        PayMethodStatisticsAdapter.listener = listener;
    }

    private static OnItemClickListener listener;

    public PayMethodStatisticsAdapter(Context context, List<StatisticsDataInfo.PayMethodListBean> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public PayMethodStatisticsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemPayMethodStatisticsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_paymethod_statistics, parent, false);
        return new PayMethodStatisticsAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(PayMethodStatisticsAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position, mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size()-1;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ItemPayMethodStatisticsBinding mBinding;

        public MyViewHolder(@NonNull ItemPayMethodStatisticsBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(StatisticsDataInfo.PayMethodListBean itemModle, final int position, Context mContext) {
            PayMethodStatisticsItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new PayMethodStatisticsItemViewModel(itemModle, mContext);
                mBinding.setItemViewModel(itemViewModel);
            } else {
                itemViewModel = mBinding.getItemViewModel();
                itemViewModel.setModel(itemModle);
            }

            if (mBinding != null) {
                final View root = mBinding.getRoot();
                root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (listener != null) {
                            listener.onItemClick(root, position);
                        }
                    }
                });
            }
        }
    }
}

