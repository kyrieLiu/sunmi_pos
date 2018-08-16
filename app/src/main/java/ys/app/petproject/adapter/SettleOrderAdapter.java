package ys.app.petproject.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.callback.OnAdapterFinishListener;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ItemSettleOrderBinding;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.viewmodel.SettleOrderItemViewModel;
import ys.app.petproject.widget.wrapperRecylerView.IViewHolder;

/**
 * Created by aaa on 2017/4/28.
 */

public class SettleOrderAdapter extends RecyclerView.Adapter<SettleOrderAdapter.MyViewHolder> {

    private final Context mContext;

    public List<OrderInfo> getList() {
        return mList;
    }

    private List<OrderInfo> mList = new ArrayList<>();
    private static OnItemClickListener listener;

    public SettleOrderAdapter(Context context) {
        this.mContext = context;
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }
    public double totalMoney;


    public void setOnAdapterFinishListener(OnAdapterFinishListener listener) {
        this.OnAdapterFinishListener = listener;
    }

    private OnAdapterFinishListener OnAdapterFinishListener;

    @Override
    public SettleOrderAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemSettleOrderBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_settle_order, parent, false);
        return new SettleOrderAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(SettleOrderAdapter.MyViewHolder holder, int position) {
        OrderInfo orderInfo = mList.get(position);
        holder.bind(orderInfo, position, mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setList(int startHttp, List<OrderInfo> list) {
        if (0 == startHttp) {
            if (list != null && !list.isEmpty()) {
                this.mList.clear();
                this.mList.addAll(list);
                notifyDataSetChanged();
            }
        } else if (startHttp > 0) {
            if (list != null && !list.isEmpty()) {
                this.mList.addAll(list);
                notifyItemRangeInserted(this.mList.size() - list.size(), list.size());
            }
        }
    }


    public static class MyViewHolder extends IViewHolder {

        private ItemSettleOrderBinding mBinding;

        public MyViewHolder(@NonNull ItemSettleOrderBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(OrderInfo itemModle, final int position, Context mContext) {

//            totalMoney += orderInfo.getRealAmt();
////        if(orderInfo.getOrderInfo().contains("充值")){
////            totalMoney += orderInfo.getRealAmt();
////        }else {
////            totalMoney += orderInfo.getTotalAmt();
////        }
//            if(position==mList.size() - 1){
//                if(listener !=null){
//                    OnAdapterFinishListener.onAdapterFinish(totalMoney);
//                }
//            }
//            Logger.w("------------------------------------------"+position);
            SettleOrderItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new SettleOrderItemViewModel(itemModle, mContext);
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