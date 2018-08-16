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
import ys.app.petproject.databinding.FragmentGoodsListBinding;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.viewmodel.GoodsListViewModel;

/**
 * Created by lyy on 2017/2/9 16:12.
 * email：2898049851@qq.com
 */

public class GoodsListFragment extends ViewPagerFragment {


    private FragmentGoodsListBinding binding;
    private GoodsListViewModel mViewModel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_goods_list, container, false);
            rootView = binding.getRoot();
            GoodTypeInfo info = (GoodTypeInfo) getArguments().getSerializable(Constants.intent_info);

            int searchFromIntent = getArguments().getInt(Constants.intent_search_from, -1);
            mViewModel = new GoodsListViewModel(this, binding, info.getId(),searchFromIntent);
            binding.setViewModel(mViewModel);
            mViewModel.init();
        }

        ViewGroup parent = (ViewGroup) rootView.getParent();// 缓存的view需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }


//    @Override
//    public void onFragmentVisibleChange(boolean isVisible) {
//        super.onFragmentVisibleChange(isVisible);
//        if (isVisible){
//
//        }
//    }

    @Override
    public void onDestroy() {
        if (mViewModel != null){
            mViewModel.reset();
        }
        super.onDestroy();
    }
}
