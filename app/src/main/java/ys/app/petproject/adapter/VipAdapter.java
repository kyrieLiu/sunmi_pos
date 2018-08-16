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
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.callback.OnItemLongClickListener;
import ys.app.petproject.databinding.ItemVipBinding;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.viewmodel.vip.VipItemViewModel;
import ys.app.petproject.widget.wrapperRecylerView.IViewHolder;

/**
 * Created by aaa on 2017/3/1.
 */

public class VipAdapter extends RecyclerView.Adapter<VipAdapter.MyViewHolder> {

    private final Context mContext;

    public List<VipInfo> getList() {
        return mList;
    }

    private List<VipInfo> mList;

    private  OnItemClickListener listener;

    private  OnItemLongClickListener longClicklistener;

    public void setOnItemLongClickListener(OnItemLongClickListener longClicklistener) {
        this.longClicklistener = longClicklistener;
    }

    public VipAdapter(Context context)
    {
        mList = new ArrayList<>();
        this.mContext = context;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public VipAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemVipBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_vip, parent, false);
        return new VipAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(VipAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position,mContext,listener,longClicklistener);
    }

    public void removeData(int registerI) {
        mList.remove(registerI);
        notifyItemRemoved(registerI);
        if(registerI != mList.size()){
            notifyItemRangeChanged(registerI, mList.size() - registerI);
        }
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setList(int startHttp, List<VipInfo> list) {
        if( 0 == startHttp){
            mList.clear();
        }

        int positionStart = mList.size();
        int itemCount = list.size();
        mList.addAll(list);
        if (positionStart > 0 && itemCount > 0) {
            notifyItemRangeInserted(positionStart, itemCount);
        } else {
            notifyDataSetChanged();
        }

    }



    public static class MyViewHolder extends IViewHolder {

        private ItemVipBinding mBinding;

        public MyViewHolder(@NonNull ItemVipBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(VipInfo itemModle, final int position, Context mContext, final OnItemClickListener mListenner, final OnItemLongClickListener longClicklistener) {
            VipItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new VipItemViewModel(itemModle, mContext);
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
                        if(mListenner != null){
                            mListenner.onItemClick(root, position);
                        }
                    }
                });

                root.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        if (longClicklistener != null) {
                            longClicklistener.onItemLongClick(root, position);
                        }
                        return true;
                    }
                });
                mBinding.tvItemVipMoney.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(mListenner != null){
                            mListenner.onItemClick(root, position);
                        }
                    }
                });
                mBinding.tvItemVipMoney.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        if (longClicklistener != null) {
                            longClicklistener.onItemLongClick(root, position);
                        }
                        return true;
                    }
                });
            }

        }
    }
}
