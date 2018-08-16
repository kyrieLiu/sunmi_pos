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
import ys.app.petproject.databinding.ItemEmployeeNameBinding;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.viewmodel.manage.EmployeeNameItemViewModel;

/**
 * Created by aaa on 2017/5/2.
 */

public class EmployeeNameAdapter extends RecyclerView.Adapter<EmployeeNameAdapter.MyViewHolder> {

    private final Context mContext;
    private List<EmployeeInfo> mList;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    private static OnItemClickListener listener;

    public EmployeeNameAdapter(Context context) {
        mList = new ArrayList<>();
        this.mContext = context;
    }

    @Override
    public EmployeeNameAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemEmployeeNameBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_employee_name, parent, false);
        return new EmployeeNameAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(EmployeeNameAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position, mContext);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setList(List<EmployeeInfo> list) {
        if (mList == null) return;
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ItemEmployeeNameBinding mBinding;

        public MyViewHolder(@NonNull ItemEmployeeNameBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(EmployeeInfo itemModle, final int position, Context mContext) {
            EmployeeNameItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new EmployeeNameItemViewModel(itemModle, mContext);
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
