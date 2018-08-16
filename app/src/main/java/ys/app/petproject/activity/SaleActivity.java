package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.BaseWidgetActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivitySaleBinding;
import ys.app.petproject.viewmodel.SaleViewModel;

/**
 * Created by aaa on 2017/6/9.
 */

public class SaleActivity extends BaseActivity {

    private ActivitySaleBinding binding;
    private SaleViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sale);
        setBackVisiable();
        setTitle("促销");

        mViewModel = new SaleViewModel(this, binding);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();

    }

}
