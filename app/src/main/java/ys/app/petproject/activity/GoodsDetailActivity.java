package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityGoodsDetailBinding;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.viewmodel.GoodsDetailViewModel;

/**
 * Created by aaa on 2017/3/7.
 */

public class GoodsDetailActivity extends BaseActivity {
    
    private ActivityGoodsDetailBinding binding;
    private GoodsDetailViewModel mViewModel;
    private GoodInfo result;
    private String mFlag;
    private TextView mModifyTv;
    private String mSale;
    private boolean mPromotion;
    private int mSearchFromIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_goods_detail);
        setBackVisiable();
        setTitle("商品详情");
        mModifyTv = (TextView)findViewById(R.id.modify_tv);

        getDataFromIntent();
        setBgWhiteStatusBar();

    }

    private void getDataFromIntent() {
        Bundle extras = getIntent().getExtras();
        result = (GoodInfo) extras.getSerializable(Constants.intent_info);
        mSearchFromIntent =  extras.getInt(Constants.intent_search_from);
        mSale =  extras.getString(Constants.intent_sale);
        mPromotion =  extras.getBoolean(Constants.intent_promotion);
        mViewModel = new GoodsDetailViewModel(this,binding,result,mPromotion,mModifyTv);
        binding.setViewModel(mViewModel);
        if (mPromotion){
            mModifyTv.setVisibility(View.GONE);
        }else {
            mModifyTv.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mViewModel.onAcitivytResult(requestCode,resultCode,data);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
