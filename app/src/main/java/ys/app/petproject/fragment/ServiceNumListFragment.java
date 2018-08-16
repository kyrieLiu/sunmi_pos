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
import ys.app.petproject.databinding.FragmentServiceNumListBinding;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.viewmodel.ServiceNumListViewModel;

/**
 * Created by aaa on 2017/7/13.
 */

public class ServiceNumListFragment extends ViewPagerFragment {


    private FragmentServiceNumListBinding binding;
    private ServiceNumListViewModel mViewModel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_service_num_list, container, false);
            rootView = binding.getRoot();
            Bundle arguments = getArguments();
//            boolean isAddOrder = arguments.getBoolean(Constants.intent_boolean, false);
            ServiceTypeInfo info = (ServiceTypeInfo) arguments.getSerializable(Constants.intent_info);
            int searchFromIntent = arguments.getInt(Constants.intent_search_from, -1);
            mViewModel = new ServiceNumListViewModel(this, binding, info, searchFromIntent);
            binding.setViewModel(mViewModel);
            mViewModel.init();
        }

        ViewGroup parent = (ViewGroup) rootView.getParent();// 缓存的view需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewModel.reset();
    }
}
