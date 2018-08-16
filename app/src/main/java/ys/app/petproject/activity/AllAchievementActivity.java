package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.databinding.ActivityAllAchievementBinding;
import ys.app.petproject.viewmodel.AllAchievementViewModel;
import ys.app.petproject.R;

/**
 * Created by aaa on 2017/7/11.
 */

public class AllAchievementActivity extends BaseActivity {
    
    private ActivityAllAchievementBinding binding;
    private AllAchievementViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_all_achievement);
        setBackVisiable();
        setTitle("业绩");
        mViewModel = new AllAchievementViewModel(this, binding);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
