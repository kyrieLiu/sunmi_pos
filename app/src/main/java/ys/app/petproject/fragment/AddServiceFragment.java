package ys.app.petproject.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ys.app.petproject.R;
import ys.app.petproject.ViewPagerFragment;
import ys.app.petproject.databinding.FragmentAddServiceBinding;
import ys.app.petproject.viewmodel.AddServiceViewModel;
import ys.app.petproject.widget.imagepicker.ImagePicker;

/**
 * Created by aaa on 2017/3/8.
 */

public class AddServiceFragment extends ViewPagerFragment{


    private View view;
    private FragmentAddServiceBinding binding;
    private AddServiceViewModel viewModel;
    private ImagePicker mImagePicker = new ImagePicker();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_service, container, false);
            view = binding.getRoot();
            initData();
        }

        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }
        return view;
    }

    @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mImagePicker.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                                     @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mImagePicker.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }

    @Override
    public void onFragmentVisibleChange(boolean isVisible) {

    }

    public void initData() {
        viewModel = new AddServiceViewModel(this,binding,mImagePicker);
        binding.setViewModel(viewModel);
        viewModel.getTypeHttp();
        // 设置标题
        mImagePicker.setTitle("设置头像");
        // 设置是否裁剪图片
        mImagePicker.setCropImage(true);
    }
}
