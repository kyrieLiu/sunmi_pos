package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ForgetPwdActivityBinding;
import ys.app.petproject.viewmodel.ForgetPwdViewModel;

/**
 * Created by admin on 2017/6/10.
 */

public class ForgetPwdActivity extends BaseActivity {

    private ForgetPwdActivityBinding binding;
    private ForgetPwdViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_forget_pwd);
        setBackVisiable();
        setTitle("忘记密码");

        mViewModel = new ForgetPwdViewModel(this,binding);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();
    }
}
