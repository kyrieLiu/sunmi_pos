package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAboutUsBinding;
import ys.app.petproject.viewmodel.manage.AboutUsViewModel;

/**
 * Created by lyy on 2017/7/3.
 */

public class AboutUsActivity extends BaseActivity {

    private ActivityAboutUsBinding binding;
    private AboutUsViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_us);
        setBackVisiable();
        setTitle("关于我们");
        mViewModel = new AboutUsViewModel(this);
        binding.setViewModel(mViewModel);
        mViewModel.getVersionName();
        setBgWhiteStatusBar();
    }
}
