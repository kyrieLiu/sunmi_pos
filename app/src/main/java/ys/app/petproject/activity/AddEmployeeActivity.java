package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityAddEmployeeBinding;
import ys.app.petproject.viewmodel.manage.AddEmployeeViewModel;

/**
 * Created by aaa on 2017/6/5.
 */

public class AddEmployeeActivity extends BaseActivity {

    private ActivityAddEmployeeBinding binding;
    private AddEmployeeViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_employee);
        setBackVisiable();
        setTitle("新增员工");

        mViewModel = new AddEmployeeViewModel(this, binding);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mViewModel != null){
            mViewModel.reset();
        }
    }
}
