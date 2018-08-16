package ys.app.petproject.adapter.appointment;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.databinding.ItemAppointmentBinding;
import ys.app.petproject.fragment.appointment.AppointmentAreadyFragment;
import ys.app.petproject.model.AppointmentBean;
import ys.app.petproject.itemmodel.AppointmentItemModel;

/**
 * Created by liuyin on 2017/9/11.
 */

public class AppointmentAdapter  extends RecyclerView.Adapter<AppointmentAdapter.MyViewHodler>{
    private List<AppointmentBean> mList;
    private AppointmentAreadyFragment fragment;
    private boolean appointmentWaiting;
    private boolean appointmentFailer;
    private boolean appointmentAready;

    public AppointmentAdapter(AppointmentAreadyFragment fragment){
        this.mList=new ArrayList<>();
        this.fragment=fragment;
    }

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemAppointmentBinding binding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_appointment,parent,false);
        return new MyViewHodler(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {
        holder.bind(mList.get(position),position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setAppointmentWaiting(boolean appointmentWaiting){
        this.appointmentWaiting=appointmentWaiting;
    }
    public void setAppointmentFailer(boolean appointmentFailer){
        this.appointmentFailer=appointmentFailer;
    }
    public void setAppointmentAready(boolean appointmentAready){
        this.appointmentAready=appointmentAready;
    }

    public void setList(int startHttp, List<AppointmentBean> list) {
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

     class MyViewHodler extends RecyclerView.ViewHolder{
         ItemAppointmentBinding binding;
        public MyViewHodler(ItemAppointmentBinding binding) {
            super(binding.rootView);
            this.binding=binding;
        }
        public void bind(AppointmentBean bean,int position){

            AppointmentItemModel model;
            if (binding.getItemViewModel()==null){
                model=new AppointmentItemModel(bean,fragment,appointmentAready,appointmentWaiting,appointmentFailer);
                model.setModel(bean);
                binding.setItemViewModel(model);
            }else{
                model=binding.getItemViewModel();
                model.setModel(bean);
            }
            if (bean.getVipUserId()>0){
                binding.tvItemAppointmentIsVip.setText("会员");
            }else{
                binding.tvItemAppointmentIsVip.setText("非会员");
            }
            int age=bean.getPetAge();
            binding.tvItemAppointmentAge.setText(age+"岁");
        }
    }
}
