package ys.app.petproject.activity.manage;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityEmployeeDetailBinding;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel;

/**
 * Created by lyy on 2017/6/26.
 */

public class EmployeeDetailActivity extends BaseActivity {

    private ActivityEmployeeDetailBinding binding;
    private EmployeeDetailViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_employee_detail);
        setBackVisiable();
        setTitle("员工详情");
        final EmployeeInfo info = (EmployeeInfo) getIntent().getSerializableExtra(Constants.intent_info);
        TextView editTv = (TextView)findViewById(R.id.edit_tv);
        editTv.setVisibility(View.VISIBLE);
        editTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeDetailActivity.this,EditEmployeeActivity.class);
                intent.putExtra(Constants.intent_info,info);
                startActivity(intent);
                finish();
            }
        });
        mViewModel = new EmployeeDetailViewModel(this,binding);
        binding.setViewModel(mViewModel);
        mViewModel.setModel(info);
        setBgWhiteStatusBar();
    }
}
