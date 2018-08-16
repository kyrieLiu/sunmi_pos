package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityModifyBossPswBinding;
import ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel;

/**
 * Created by lvgeda on 2017/6/10.
 */

public class ModifyBossPswActivity extends BaseActivity {

    private ActivityModifyBossPswBinding binding;
    private ModifyBossPswViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_modify_boss_psw);
        setBackVisiable();
        setTitle("修改店长密码");
        mViewModel = new ModifyBossPswViewModel(this,binding);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();

    }
}
