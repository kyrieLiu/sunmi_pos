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
import ys.app.petproject.databinding.ItemGoodsOrServiceStatisticsBinding;
import ys.app.petproject.model.StatisticsDataInfo;
import ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel;

/**
 * Created by aaa on 2017/6/8.
 */

public class GoodsOrServiceStatisticsAdapter  extends RecyclerView.Adapter<GoodsOrServiceStatisticsAdapter.MyViewHolder> {

    private final Context mContext;
    private List<StatisticsDataInfo.ProductTypeListBean> mList;

    public static void setListener(OnItemClickListener listener) {
        GoodsOrServiceStatisticsAdapter.listener = listener;
    }

    private static OnItemClickListener listener;

    public GoodsOrServiceStatisticsAdapter(Context context, List<StatisticsDataInfo.ProductTypeListBean> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public GoodsOrServiceStatisticsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemGoodsOrServiceStatisticsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_goods_or_service_statistics, parent, false);
        return new GoodsOrServiceStatisticsAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(GoodsOrServiceStatisticsAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position, mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ItemGoodsOrServiceStatisticsBinding mBinding;

        public MyViewHolder(@NonNull ItemGoodsOrServiceStatisticsBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(StatisticsDataInfo.ProductTypeListBean itemModle, final int position, Context mContext) {
            GoodsOrServiceStatisticsItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new GoodsOrServiceStatisticsItemViewModel(itemModle, mContext);
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
