package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityPayListBinding;
import ys.app.petproject.viewmodel.PayListViewModel;

/**
 * Created by aaa on 2017/4/25.
 */

public class PayListActivity extends BaseActivity {

    private ActivityPayListBinding binding;
    private PayListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pay_list);
        setBackVisiable();
        setTitle("取单");
        viewModel = new PayListViewModel(this, binding);
        binding.setViewModel(viewModel);
        setBgWhiteStatusBar();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.clear();
    }
}
