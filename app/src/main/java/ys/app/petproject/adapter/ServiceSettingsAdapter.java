package ys.app.petproject.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ItemServiceSettingsBinding;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.viewmodel.ServiceSettingsItemViewModel;

/**
 * Created by aaa on 2017/3/23.
 */

public class ServiceSettingsAdapter extends RecyclerView.Adapter<ServiceSettingsAdapter.MyViewHolder> {

    private final BaseActivity mBaseActivity;


    public List<ServiceTypeInfo> getList() {
        return mList;
    }

    private List<ServiceTypeInfo> mList;

    public static void setListener(OnItemClickListener listener) {
        ServiceSettingsAdapter.listener = listener;
    }

    private static OnItemClickListener listener;

    public ServiceSettingsAdapter(BaseActivity activity)
    {
        mList = new ArrayList<>();
        this.mBaseActivity = activity;
    }

    @Override
    public ServiceSettingsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemServiceSettingsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mBaseActivity), R.layout.item_service_settings, parent, false);
        return new ServiceSettingsAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ServiceSettingsAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position), position,mBaseActivity);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setList(List<ServiceTypeInfo> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }



    public static class MyViewHolder  extends RecyclerView.ViewHolder {

        private ItemServiceSettingsBinding mBinding;

        public MyViewHolder(@NonNull ItemServiceSettingsBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(ServiceTypeInfo itemModle, final int position, BaseActivity mBaseActivity) {
            ServiceSettingsItemViewModel itemViewModel;
            if (mBinding.getItemViewModel() == null) {
                itemViewModel = new ServiceSettingsItemViewModel(position,itemModle, mBaseActivity);
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
                        if(listener != null){
                            listener.onItemClick(root, position);
                        }
                    }
                });
            }
        }
    }
}
