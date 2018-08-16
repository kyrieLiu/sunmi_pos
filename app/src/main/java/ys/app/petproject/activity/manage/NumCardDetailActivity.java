package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import java.io.Serializable;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.NumCardDetailBinding;
import ys.app.petproject.model.NumCardListInfo;
import ys.app.petproject.viewmodel.manage.NumCardDetailViewModel;

/**
 * Created by admin on 2017/6/7.
 */

public class NumCardDetailActivity extends BaseActivity {
    private NumCardDetailBinding binding;
    private NumCardDetailViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_num_card_detail);
        setBackVisiable();
        mViewModel = new NumCardDetailViewModel(this, binding);
        binding.setViewModel(mViewModel);
        Serializable serializable= getIntent().getSerializableExtra(Constants.intent_info);

        if (serializable==null){
            setTitle("新增次卡");
        }else{
            NumCardListInfo info= (NumCardListInfo)serializable;
            setTitle("编辑次卡");
            mViewModel.setNumCardInformation(info);
        }
        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        mViewModel.clear();
        super.onDestroy();
    }
}
