package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityLoginBinding;
import ys.app.petproject.viewmodel.LoginViewModel;

/**
 * Created by lyy on 2017/2/20 10:06.
 * email：2898049851@qq.com
 */

public class LoginActivity extends BaseActivity {

    private ActivityLoginBinding binding;
    private LoginViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        setTitle("打卡");
        mViewModel = new LoginViewModel(this, binding);
        binding.setViewModel(mViewModel);
        init();
        setBgWhiteStatusBar();
    }

    private void init() {
        bindView();
    }


    private void bindView() {


        binding.pswEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() == 6) {
                    binding.okBtn.setEnabled(true);
                } else {
                    binding.okBtn.setEnabled(false);
                }
            }
        });
    }

    private boolean isUserValid(String user) {
        return user.replace(" ", "").length() > 2;
    }

    private boolean isPasswordValid(String password) {
        return password.length() == 6;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.destroy();
    }
}
