package ys.app.petproject.activity.manage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.AllotRecordAcitivtyBinding;
import ys.app.petproject.viewmodel.manage.AllotRecordModel;

/**
 * Created by liuyin on 2017/9/16.
 */

public class AllotRecordActivity extends BaseActivity {

    private AllotRecordModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AllotRecordAcitivtyBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_allot_record_list);
        setBackVisiable();
        setTitle("调拨管理");
        mViewModel = new AllotRecordModel(binding,this);
        binding.setViewModel(mViewModel);
        mViewModel.initView();
        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.reset();
    }
}
