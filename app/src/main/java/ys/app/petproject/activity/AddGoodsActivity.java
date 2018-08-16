package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAddGoodsBinding;
import ys.app.petproject.viewmodel.AddGoodsActivityViewModel;
import ys.app.petproject.widget.imagepicker.ImagePicker;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by admin on 2017/6/7.
 */

public class AddGoodsActivity extends BaseActivity {
    private ActivityAddGoodsBinding binding;
    private AddGoodsActivityViewModel mViewModel;
    private ImagePicker mImagePicker = new ImagePicker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_goods);
        setBackVisiable();
        setTitle("新增商品");
        mViewModel = new AddGoodsActivityViewModel(this, binding, mImagePicker);
        binding.setViewModel(mViewModel);
        mViewModel.getTypeHttp();
        mViewModel.getUnitHttp();
        setBgWhiteStatusBar();
        // 设置标题
        mImagePicker.setTitle("设置头像");
        // 设置是否裁剪图片
        mImagePicker.setCropImage(true);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.scan_result_code && null != data){
            String info = data.getStringExtra(Constants.scan_result);
            if (!TextUtil.isEmpty(info) && mViewModel != null) {
                mViewModel.getSearchGoodsHttp(info,true);
                mViewModel.obGoodsCode.set(info);
            }
        }else {
            mImagePicker.onActivityResult(this, requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mImagePicker.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mViewModel != null) {
            mViewModel.reset();
        }
    }
}
