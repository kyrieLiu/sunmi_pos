package ys.app.petproject.activity.manage;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.databinding.ActivityEmployeePerformanceBinding;
import ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel;
import ys.app.petproject.R;

/**
 * Created by aaa on 2017/5/2.
 */

public class EmployeePerformanceActivity extends BaseActivity {

    private ActivityEmployeePerformanceBinding binding;
    private EmployeePerformanceViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_employee_performance);
        mViewModel = new EmployeePerformanceViewModel(this, binding);
        binding.setViewModel(mViewModel);
        Intent intent = getIntent();
        long employeeId = intent.getLongExtra(Constants.intent_id, -1);
        String name = intent.getStringExtra(Constants.intent_name);
        mViewModel.setEmployeeIdFormIntent(employeeId);

        setBackVisiable();
        setTitle(name);
        setBgWhiteStatusBar();

    }
}
