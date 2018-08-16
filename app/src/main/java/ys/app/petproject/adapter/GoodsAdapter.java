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
import ys.app.petproject.databinding.ItemGoodsBinding;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.viewmodel.GoodsItemViewModel;
import ys.app.petproject.widget.wrapperRecylerView.IViewHolder;

/**
 * Created by lyy on 2017/2/14 11:21.
 * email：2898049851@qq.com
 */

public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.MyViewHolder>{

    private final Context mContext;
    public boolean mPromotionSetting;
    private boolean mShangpinRuku;
    private boolean mShangpinChuKu;

    public List<GoodInfo> getList() {
        return mList;
    }

    private  List<GoodInfo> mList = new ArrayList<>();
    private  OnItemLongClickListener longClicklistener;

    private  OnItemClickListener listener;

    public GoodsAdapter(Context context)
    {
        this.mContext = context;
    }
    public  void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener longClicklistener) {
        this.longClicklistener = longClicklistener;
    }

    @Override
    public GoodsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemGoodsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_goods, parent, false);
        return new GoodsAdapter.MyViewHolder(binding,mPromotionSetting,mShangpinRuku,mShangpinChuKu,listener,longClicklistener);
    }

    @Override
    public void onBindViewHolder(GoodsAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position,mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setList(int startHttp, List<GoodInfo> list) {
        if( 0 == startHttp){
            if (list != null && !list.isEmpty()){
                this.mList.clear();
                this.mList.addAll(list);
                notifyDataSetChanged();
            }
        }else if (startHttp > 0){
            if (list != null && !list.isEmpty() ){
                this.mList.addAll(list);
                notifyItemRangeInserted(this.mList.size() - list.size() , list.size());
            }
        }

//        int positionStart = mList.size();
//        int itemCount = list.size();

//        if (positionStart > 0 && itemCount > 0) {
//            notifyItemRangeInserted(positionStart, itemCount);
//        } else {
//        }


    }

    public void setPromotionSetting(boolean promotionSetting) {
        this.mPromotionSetting = promotionSetting;
    }

    public void setShangpinRuku(boolean b) {
        mShangpinRuku = b;
    }

    public void setShangpinChuKu(boolean b) {
        mShangpinChuKu = b;
    }

    public void removeData(int registerI) {
        mList.remove(registerI);
        notifyItemRemoved(registerI);
        if(registerI != mList.size()){
            notifyItemRangeChanged(registerI, mList.size() - registerI);
        }
    }


    public static class MyViewHolder extends IViewHolder {

        private final OnItemClickListener mListenner;
        private final OnItemLongClickListener mLongListenner;
        private ItemGoodsBinding mBinding;
        private boolean mPromotionSetting;
        private boolean mRuku;
        private boolean mChuku;

        public MyViewHolder(@NonNull ItemGoodsBinding binding,boolean promotionSetting,boolean ruku,boolean chuku,OnItemClickListener listener, OnItemLongClickListener longClicklistener) {
            super(binding.rootView);
            this.mBinding = binding;
            this.mPromotionSetting = promotionSetting;
            this.mRuku = ruku;
            this.mChuku = chuku;
            this.mListenner = listener;
            this.mLongListenner = longClicklistener;
        }


        public void bind(GoodInfo itemModle, final int position, Context mContext) {
            GoodsItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new GoodsItemViewModel(itemModle, mContext,mPromotionSetting,mRuku,mChuku);
                mBinding.setItemViewModel(itemViewModel);
            } else {
                itemViewModel = mBinding.getItemViewModel();
                itemViewModel.setModel(itemModle,mPromotionSetting,mRuku,mChuku);
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
