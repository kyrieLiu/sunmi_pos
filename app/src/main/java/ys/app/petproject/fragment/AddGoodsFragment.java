package ys.app.petproject.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.BaseFragment;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.FragmentAddGoodsBinding;
import ys.app.petproject.viewmodel.AddGoodsViewModel;
import ys.app.petproject.widget.imagepicker.ImagePicker;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by aaa on 2017/3/8.
 */

public class AddGoodsFragment extends BaseFragment {


    private View view;
    private FragmentAddGoodsBinding binding;
    private AddGoodsViewModel viewModel;
    private ImagePicker mImagePicker = new ImagePicker();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_goods, container, false);
            view = binding.getRoot();
        }

        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }
        return view;
    }

    @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.scan_result_code && null != data){
            String info = data.getStringExtra(Constants.scan_result);
            if (!TextUtil.isEmpty(info) && viewModel != null) {
                viewModel.obGoodsCode.set(info);
            }
        }else {
            mImagePicker.onActivityResult(this, requestCode, resultCode, data);
        }
    }

    @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                                     @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mImagePicker.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }


    @Override
    public void initData() {
        viewModel = new AddGoodsViewModel(this,binding,mImagePicker);
        binding.setViewModel(viewModel);
        viewModel.getTypeHttp();
        viewModel.getUnitHttp();
        // 设置标题
        mImagePicker.setTitle("设置头像");
        // 设置是否裁剪图片
        mImagePicker.setCropImage(true);

    }
}
