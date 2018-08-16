package ys.app.petproject.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.ViewPagerFragment;
import ys.app.petproject.databinding.NumCardFragmentBinding;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.viewmodel.manage.FragmentNumCardViewModel;

/**
 * Created by aaa on 2017/7/13.
 */

public class NumCardFragment extends ViewPagerFragment {


    private NumCardFragmentBinding binding;
    private FragmentNumCardViewModel mViewModel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_num_card_detail, container, false);
            rootView = binding.getRoot();
            Bundle arguments = getArguments();
            ServiceTypeInfo info = (ServiceTypeInfo) arguments.getSerializable(Constants.intent_info);
            mViewModel = new FragmentNumCardViewModel(this, binding, info);
            binding.setViewModel(mViewModel);
            mViewModel.init();
        }

        ViewGroup parent = (ViewGroup) rootView.getParent();// 缓存的view需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }


}
