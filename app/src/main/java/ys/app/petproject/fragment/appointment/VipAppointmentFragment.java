package ys.app.petproject.fragment.appointment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.R;
import ys.app.petproject.ViewPagerFragment;
import ys.app.petproject.databinding.VipAppointmentBinding;
import ys.app.petproject.viewmodel.appointment.VipAppointmentModel;


public class VipAppointmentFragment extends ViewPagerFragment {
    private VipAppointmentBinding binding;
    private VipAppointmentModel mViewModel;
    private boolean isVisible;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisible=isVisibleToUser;
        if (mViewModel!=null){
            mViewModel.setVisibleToUser(isVisibleToUser);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (rootView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_vip_appointment, container, false);
            rootView = binding.getRoot();
            Bundle bundle=getArguments();
            String date=bundle.getString("date");
            mViewModel = new VipAppointmentModel(this,binding,date);
            mViewModel.setVisibleToUser(isVisible);
            binding.setViewModel(mViewModel);
            mViewModel.initView();
        }

        ViewGroup parent = (ViewGroup) rootView.getParent();// 缓存的view需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mViewModel.activityResult(requestCode, resultCode, data);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
