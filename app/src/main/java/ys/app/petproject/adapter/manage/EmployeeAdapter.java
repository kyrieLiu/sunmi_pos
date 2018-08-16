package ys.app.petproject.adapter.manage;

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
import ys.app.petproject.databinding.ItemEmployeeBinding;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.viewmodel.manage.EmployeeItemViewModel;

/**
 * 作者：lv
 * 时间：2017/3/29 19:52
 */
public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.MyViewHolder> {

    private final Context mContext;
    private List<EmployeeInfo> mList;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    private  OnItemClickListener listener;

    public EmployeeAdapter(Context context)
    {
        mList = new ArrayList<>();
        this.mContext = context;
    }

    @Override
    public EmployeeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemEmployeeBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_employee, parent, false);
        return new EmployeeAdapter.MyViewHolder(binding,listener);
    }

    @Override
    public void onBindViewHolder(EmployeeAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position,mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setList(List<EmployeeInfo> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }



    public static class MyViewHolder  extends RecyclerView.ViewHolder {

        private final OnItemClickListener mListenner;
        private ItemEmployeeBinding mBinding;

        public MyViewHolder(@NonNull ItemEmployeeBinding binding,OnItemClickListener listener) {
            super(binding.rootView);
            this.mBinding = binding;
            this.mListenner = listener;
        }

        public void bind(EmployeeInfo itemModle, final int position, Context mContext) {
            EmployeeItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new EmployeeItemViewModel(itemModle, mContext);
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
            }
        }
    }
}
