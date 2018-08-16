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
import ys.app.petproject.databinding.ItemServiceBinding;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.viewmodel.ServiceItemViewModel;
import ys.app.petproject.widget.wrapperRecylerView.IViewHolder;

/**
 * Created by lyy on 2017/2/21 16:03.
 * email：2898049851@qq.com
 */

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {

    private final Context mContext;
    private boolean mPromotionSetting;

    public List<ServiceInfo> getList() {
        return mList;
    }

    private List<ServiceInfo> mList;


    private OnItemClickListener listener;

    private OnItemLongClickListener longClicklistener;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void setLongClicklistener(OnItemLongClickListener longClicklistener) {
        this.longClicklistener = longClicklistener;
    }

    public ServiceAdapter(Context context) {
        mList = new ArrayList<>();
        this.mContext = context;
    }

    @Override
    public ServiceAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemServiceBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_service, parent, false);
        return new ServiceAdapter.MyViewHolder(binding, mPromotionSetting, listener, longClicklistener);
    }

    @Override
    public void onBindViewHolder(ServiceAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position, mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void removeData(int registerI) {
        mList.remove(registerI);
        notifyItemRemoved(registerI);
        if (registerI != mList.size()) {
            notifyItemRangeChanged(registerI, mList.size() - registerI);
        }
    }

    public void setList(List<ServiceInfo> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public void setPromot(boolean promotionSetting) {
        mPromotionSetting = promotionSetting;
    }


    public static class MyViewHolder extends IViewHolder {

        private ItemServiceBinding mBinding;
        private boolean mPromotionSetting;
        private final OnItemClickListener mListenner;
        private final OnItemLongClickListener mLongListenner;

        public MyViewHolder(@NonNull ItemServiceBinding binding, boolean promotionSetting, OnItemClickListener listener, OnItemLongClickListener longClicklistener) {
            super(binding.rootView);
            this.mBinding = binding;
            this.mPromotionSetting = promotionSetting;
            this.mListenner = listener;
            this.mLongListenner = longClicklistener;
        }

        public void bind(ServiceInfo itemModle, final int position, Context mContext) {
            ServiceItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new ServiceItemViewModel(itemModle, mContext, mPromotionSetting);
                mBinding.setItemViewModel(itemViewModel);
            } else {
                itemViewModel = mBinding.getItemViewModel();
                itemViewModel.setModel(itemModle, mPromotionSetting);
            }

            if (mBinding != null) {
                final View root = mBinding.getRoot();
                root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mListenner != null) {
                            mListenner.onItemClick(root, position);
                        }
                    }
                });

                root.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        if (mLongListenner != null) {
                            mLongListenner.onItemLongClick(root, position);
                        }
                        return true;
                    }
                });
            }
        }
    }
}
