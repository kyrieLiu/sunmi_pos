package ys.app.petproject.viewmodel.manage;

import android.content.Intent;
import android.databinding.ObservableField;

import ys.app.petproject.activity.manage.AboutUsActivity;
import ys.app.petproject.activity.manage.FunctionIntroductionListActivity;
import ys.app.petproject.utils.AppInfoUtils;

/**
 * Created by lyy on 2017/7/3.
 */

public class AboutUsViewModel {
    private final AboutUsActivity mActivity;
    public ObservableField<String> obVersionName = new ObservableField<>();
    public ObservableField<String> obVersionType=new ObservableField<>();

    public AboutUsViewModel(AboutUsActivity activity) {
        this.mActivity = activity;
    }

    public void getVersionName() {

        String versionName = AppInfoUtils.getVersionName(mActivity);
        obVersionName.set("当前版本"+versionName);
    }
    public void clickFunctionList(){
        Intent intent=new Intent(mActivity, FunctionIntroductionListActivity.class);
        mActivity.startActivity(intent);
    }
}
