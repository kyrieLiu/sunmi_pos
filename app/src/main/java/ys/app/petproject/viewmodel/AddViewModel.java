package ys.app.petproject.viewmodel;

import android.view.View;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.activity.manage.AddActivity;
import ys.app.petproject.databinding.ActivityAddBinding;
import ys.app.petproject.event.RxManager;

/**
 * Created by aaa on 2017/3/8.
 */

public class AddViewModel extends BaseActivityViewModel {

    private final AddActivity mActivity;
    private  ActivityAddBinding mBinding;
    private RxManager mRxManager;

    public AddViewModel(AddActivity activity, ActivityAddBinding binding) {
        this.mActivity = activity;
        this.mBinding = binding;
        registerBus();
    }

    private void registerBus() {
        if (mRxManager == null){
            mRxManager = new RxManager();
        }
        mRxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
            @Override
            public void call(Integer registerI) {
                if(Constants.type_addGood_success == registerI||Constants.type_addService_success== registerI){
                    mActivity.finish();
                }
            }
        });
    }

    public void clickButton(View v){
        if (mRxManager == null){
            mRxManager = new RxManager();
        }
        if(1 == mBinding.viewPager.getCurrentItem()){
            mRxManager.post(Constants.bus_type_click_btn,Constants.type_add_service);
        }else {
            mRxManager.post(Constants.bus_type_click_btn,Constants.type_add_good);
        }

    }
}
