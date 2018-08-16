package ys.app.petproject.adapter;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ItemChildOrderBinding;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.viewmodel.OrderChildItemViewModel;
import ys.app.petproject.widget.viewholder.BaseViewHolder;

/**
 * Created by aaa on 2017/4/25.
 */
public class PayChildViewHolder extends BaseViewHolder {

    private ItemChildOrderBinding mBinding;

    public PayChildViewHolder(ViewDataBinding binding) {
        super(binding);
        mBinding = (ItemChildOrderBinding)binding;
    }

    private  List<OrderInfo.OrderDetailedListBean> mList = new ArrayList<>();
    private static OnItemClickListener listener;

    public void bind(OrderInfo.OrderDetailedListBean itemModle, final int position, Context mContext) {
        OrderChildItemViewModel itemViewModel;
        if (mBinding.getItemViewModel() == null) {
            itemViewModel = new OrderChildItemViewModel(itemModle, mContext);
            mBinding.setItemViewModel(itemViewModel);
        } else {
            itemViewModel = mBinding.getItemViewModel();
            itemViewModel.setModel(itemModle);
        }

        if(mBinding!=null){
            final View root = mBinding.getRoot();
            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    if(listener != null){
//                        listener.onItemClick(root, position);
//                    }
                }
            });
        }
    }


}

