package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.BaseWidgetActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityManagerBinding;
import ys.app.petproject.viewmodel.manage.ManagerViewModel;

/**
 * Created by lyy on 2017/2/28 14:21.
 * email：2898049851@qq.com
 */
public class ManagerActivity extends BaseActivity {

    private ActivityManagerBinding binding;
    private ManagerViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_manager);
        setBackVisiable();
        setTitle("管理");
        mViewModel = new ManagerViewModel(this,binding);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.destroy();
    }
}
