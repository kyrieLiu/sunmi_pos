package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityEditEmployeeBinding;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.viewmodel.manage.EditEmployeeViewModel;

/**
 * Created by lyy on 2017/6/27.
 */

public class EditEmployeeActivity extends BaseActivity {
    private ActivityEditEmployeeBinding binding;
    private EditEmployeeViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_employee);
        setBackVisiable();
        setTitle("员工详情");
        final EmployeeInfo info = (EmployeeInfo) getIntent().getSerializableExtra(Constants.intent_info);
        mViewModel = new EditEmployeeViewModel(this,binding);
        binding.setViewModel(mViewModel);
        mViewModel.setInfoFormIntent(info);
        setBgWhiteStatusBar();
    }
}
