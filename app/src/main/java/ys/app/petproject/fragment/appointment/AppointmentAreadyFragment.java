package ys.app.petproject.fragment.appointment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.ViewPagerFragment;
import ys.app.petproject.databinding.AppointmentListBinding;
import ys.app.petproject.viewmodel.appointment.AppointmentListModel;
import ys.app.petproject.widget.dialog.RequestDialog;


public class AppointmentAreadyFragment extends ViewPagerFragment {

    private AppointmentListBinding binding;
    private AppointmentListModel mViewModel;
    private RequestDialog mRDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_appointment_list, container, false);
            rootView = binding.getRoot();
            Bundle bundle=getArguments();
            int searchFromIntent = bundle.getInt(Constants.intent_search_from, -1);
            String date=bundle.getString(Constants.intent_flag);
            mViewModel = new AppointmentListModel(this,searchFromIntent,date,binding.recyclerView);
            binding.setViewModel(mViewModel);
        }

        ViewGroup parent = (ViewGroup) rootView.getParent();// 缓存的view需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }

    @Override
    public void initData() {
        mViewModel.initAppointment();
    }

    public void showRDialog() {
        if (mRDialog == null) {
            mRDialog = new RequestDialog(getActivity());
        }
        mRDialog.show();
    }

    public void hideRDialog() {
        if (mRDialog != null) {
            mRDialog.hide();
        }
    }

    @Override
    public void onDestroy() {
        if (mRDialog!=null){
            mRDialog.dismiss();
            mRDialog=null;
        }
        if (mViewModel != null){
            mViewModel.clear();
        }
        super.onDestroy();
    }

}
