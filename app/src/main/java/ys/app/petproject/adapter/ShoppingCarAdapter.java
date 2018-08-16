package ys.app.petproject.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.databinding.EmployeeServiceBinding;
import ys.app.petproject.model.SummitOrderInfo;
import ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel;

/**
 * 作者：lv
 * 时间：2017/4/3 18:30
 */

public class ShoppingCarAdapter extends RecyclerView.Adapter<ShoppingCarAdapter.MyViewHolder> {


    private Context mContext;
    private List<SummitOrderInfo> mList;
    private double vipMoney;
    public ShoppingCarAdapter(Context context,double vipMoney){
        this.mContext = context;
        this.mList = new ArrayList<>();
        this.vipMoney=vipMoney;
    }

    @Override
    public ShoppingCarAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        EmployeeServiceBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_employee_shop_car_goods, parent, false);
        return new ShoppingCarAdapter.MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ShoppingCarAdapter.MyViewHolder holder, int position) {
        holder.bind(mList.get(position),position,mContext);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setList(List<SummitOrderInfo> list) {
        if (list != null && !list.isEmpty()){
            mList.clear();
            mList.addAll(list);
            notifyDataSetChanged();
        }
    }

     class MyViewHolder extends RecyclerView.ViewHolder{
        public EmployeeServiceBinding mBinding;

        public MyViewHolder(EmployeeServiceBinding binding) {
            super(binding.rootView);
            this.mBinding = binding;
        }

        public void bind(SummitOrderInfo result,int position,Context context){
            ShoppingCarAdapterViewModel viewModel;
            if (mBinding.getItemViewModel() == null){
                viewModel = new ShoppingCarAdapterViewModel(context,result,vipMoney);
                mBinding.setItemViewModel(viewModel);
            }else {
                viewModel = mBinding.getItemViewModel();
                viewModel.setModel(result,vipMoney);
            }

        }
    }
}