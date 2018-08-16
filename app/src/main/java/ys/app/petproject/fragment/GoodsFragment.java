package ys.app.petproject.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.BaseFragment;
import ys.app.petproject.R;
import ys.app.petproject.databinding.FragmentGoodsBinding;
import ys.app.petproject.viewmodel.GoodsViewModel;

/**
 * 作者：lv
 * 时间：2017/2/20 20:43
 */

public class GoodsFragment extends BaseFragment {

    private View view;
    private FragmentGoodsBinding binding;
    private GoodsViewModel mViewModel;
//    private String[] tableTitles;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_goods, container, false);
            view = binding.getRoot();
            mViewModel = new GoodsViewModel(this, binding);
            binding.setViewModel(mViewModel);
            mViewModel.init(getArguments());
        }

        ViewGroup parent = (ViewGroup) view.getParent();// 缓存的view需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
        if (parent != null) {
            parent.removeView(view);
        }
        return view;
    }

    @Override
    public void initData() {

    }

    @Override
    public void onDestroy() {
        mViewModel.clear();
        super.onDestroy();
    }
}
