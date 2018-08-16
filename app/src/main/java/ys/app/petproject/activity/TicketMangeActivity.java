package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.TicketManageBinding;
import ys.app.petproject.viewmodel.TicketManageViewModel;

public class TicketMangeActivity extends BaseActivity {

    private TicketManageBinding mBinding;
    private TicketManageViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_ticket_mange);
        setBackVisiable();
        setTitle("小票管理");
        mViewModel = new TicketManageViewModel(this,mBinding);
        mBinding.setViewModel(mViewModel);
        setBgWhiteStatusBar();
    }
}
