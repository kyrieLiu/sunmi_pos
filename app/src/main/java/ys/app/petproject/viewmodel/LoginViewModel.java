package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.os.SystemProperties;
import android.util.Log;
import android.view.View;

import com.greendao.LoginInfoDao;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.MainActivity;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.ForgetPwdActivity;
import ys.app.petproject.activity.LoginActivity;
import ys.app.petproject.databinding.ActivityLoginBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.LoginInfo;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widgetprovider.MyWidgetProvider;

/**
 * Created by lyy on 2017/2/20 10:26.
 * email：2898049851@qq.com
 */
public class LoginViewModel extends BaseActivityViewModel {

    private final ApiClient<BaseResult> mUploadDeviceClient;
    private ActivityLoginBinding mBinding;
    private LoginActivity mActivity;
    private ApiClient<BaseListResult<LoginInfo>> mClient;
    private String psw;
    private String user;
    private String mHost;

    public LoginViewModel(LoginActivity activity, ActivityLoginBinding binding) {
        this.mActivity = activity;
        this.mClient = new ApiClient<>();
        this.mUploadDeviceClient = new ApiClient<>();
        this.mBinding = binding;
    }

    public void setSchemaData(String host) {
        this.mHost = host;
    }



    /**
     * 在xml布局中绑定了clickButton  格式必须是  public   方法名字(View V)
     *
     * @param v
     */
    public void clickButton(View v) {
//        uploadDeviceInfo();
        login();
        //存储设备型号
        String model = SystemProperties.get("ro.product.model");
        SpUtil.setDeviceMode(model);
        Log.i("Device name===========:",model);
    }


    public void login() {
        Map<String, String> params = new HashMap<>();
        try {
            Class c = Class.forName("android.os.SystemProperties");
            Method get = c.getMethod("get", String.class);
            params.put("equipmentId", (String) get.invoke(c, "ro.serialno"));//设备序列号
            //params.put("equipmentId", "75479513");//设备序列号
        } catch (Exception e) {
            e.printStackTrace();
        }
        params.put("passWord", psw);
        mActivity.showRDialog();

        mClient.reqApi("userLogin", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<LoginInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<LoginInfo> result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {

                            List<LoginInfo> data = result.getData();
                            if (data == null || data.size() == 0) {
                                mActivity.showToast("登录失败，请稍后重试");
                            } else {
                                LoginInfo loginInfo = data.get(0);
                                LoginInfoDao loginInfoDao = GreenDaoUtils.getmDaoSession().getLoginInfoDao();
                                loginInfoDao.deleteAll();
                                loginInfoDao.insert(loginInfo);
                                SpUtil.setIsLogin(true);
                                SpUtil.setShopName(loginInfo.getShopName());
                                SpUtil.setShopId(loginInfo.getEquipmentId());
                                SpUtil.setBranchId(loginInfo.getBranchId());
                                SpUtil.setHeadOfficeId(loginInfo.getHeadOfficeId());
                                SpUtil.setSandMchNo(loginInfo.getMchNo());
                                SpUtil.setSandKey(loginInfo.getMd5Key());
                                SpUtil.setModular(loginInfo.getIsModular());
                                toNextActivity();
                            }

                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        mActivity.showToast("网络异常,请检查网络重试");
                        super.onError(e);
                    }
                });

    }

    private void toNextActivity() {
        Intent updateIntent = new Intent(MyWidgetProvider.ACTION_UPDATE_ALL);
        mActivity.getApplicationContext().sendBroadcast(updateIntent);
        if (StringUtils.isEmptyOrWhitespace(mHost)) {
            //Intent updateIntent = new Intent(MyAppWidget.pkgName);
            mActivity.startActivity(new Intent(mActivity, MainActivity.class));
        } else {
            try {
                mActivity.startActivity(new Intent(mActivity, Class.forName(mActivity.getPackageName() + ".activity." + mHost)));
            } catch (ClassNotFoundException e) {
                mActivity.showToast("找不到" + mHost);
            }
        }
        mActivity.finish();

    }


    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void destroy() {
        mClient.reset();
        mClient = null;
        mActivity = null;
    }

    public void forgetPwdClick() {
        turnToActivity(mActivity, ForgetPwdActivity.class);
    }


}
