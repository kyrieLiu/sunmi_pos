package ys.app.petproject.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.BaseFragment;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.FragmentVipCardBinding;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.viewmodel.vip.VipCardFragmentViewModel;


public class VipCardFragment extends BaseFragment {

    private View view;
    FragmentVipCardBinding binding;
    VipCardFragmentViewModel mViewModel;
    private VipCardInfo vipCardInfo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_vip_card, container, false);
            view = binding.getRoot();
            Bundle bundle = getArguments();
            int  classification = bundle.getInt(Constants.intent_type);
            int cardNO=bundle.getInt(Constants.intent_vip_card_no);
            int flag=bundle.getInt(Constants.intent_flag);
            mViewModel = new VipCardFragmentViewModel(this,binding,flag,classification);
            mViewModel.setIntentCardNO(cardNO);
            binding.setViewModel(mViewModel);
        }

        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }
        return view;
    }

    @Override
    public void initData() {
        mViewModel.init();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
