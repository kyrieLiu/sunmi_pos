package ys.app.petproject.viewmodel;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.TicketMangeActivity;
import ys.app.petproject.databinding.TicketManageBinding;

/**
 * Created by Administrator on 2018/6/19.
 */

public class TicketManageViewModel extends BaseActivityViewModel {
    private TicketMangeActivity mActivity;
    private TicketManageBinding mBinding;
    private Switch aSwitch;

    public TicketManageViewModel(TicketMangeActivity mActivity, TicketManageBinding mBinding) {
        this.mActivity = mActivity;
        this.mBinding = mBinding;
        this.aSwitch = mBinding.switchTicket;
        init();
    }

    private void init() {
        aSwitch.setChecked(SpUtil.getVipShowState());
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SpUtil.setVipShowState(isChecked);
            }
        });
    }
    public void clickSeeTemplate(){
        mBinding.llTicketSetting.setVisibility(View.VISIBLE);
    }
}
