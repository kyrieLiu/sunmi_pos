package ys.app.petproject.viewmodel.manage;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.LoginActivity;
import ys.app.petproject.activity.SystemManagerActivity;
import ys.app.petproject.activity.manage.AboutUsActivity;
import ys.app.petproject.activity.manage.AllotRecordActivity;
import ys.app.petproject.activity.manage.EmployeeListActivity;
import ys.app.petproject.activity.manage.ManagerActivity;
import ys.app.petproject.activity.manage.ModifyBossPswActivity;
import ys.app.petproject.activity.manage.ModifyPswActivity;
import ys.app.petproject.activity.manage.NumCardActivity;
import ys.app.petproject.activity.manage.VipCardActivity;
import ys.app.petproject.adapter.SelectSimpleAdapter;
import ys.app.petproject.databinding.ActivityManagerBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.SelectInfo;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.dialog.SelectDialog;

/**
 * Created by lyy on 2017/2/28 14:46.
 * email：2898049851@qq.com
 */

public class ManagerViewModel extends BaseActivityViewModel {
    private ActivityManagerBinding mBinding;
    private ApiClient<BaseResult> mClient;
    private ManagerActivity mActivity;
    private CustomDialog mDialog;


    public ManagerViewModel(ManagerActivity activity, ActivityManagerBinding binding) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.mClient = new ApiClient<>();
    }

    public void clickOkBtn(View v) {
        showDialog();
    }

    public void clickModifyBtn(View v) {
        Intent intent = new Intent(mActivity, ModifyPswActivity.class);
        intent.putExtra(Constants.intent_flag,0);
        mActivity.startActivity(intent);
    }

    public void clickManagerEmployeeBtn(View v) {
        Intent intent = new Intent(mActivity, EmployeeListActivity.class);
        mActivity.startActivity(intent);
    }
    private SelectDialog cardDialog;
    public void clickVipCardBtn(View v) {
        if (cardDialog==null){
            final List<SelectInfo> cardList=new ArrayList<>();
            SelectInfo vipInfo=new SelectInfo("会员卡管理","1");
            SelectInfo numInfo=new SelectInfo("次卡管理","2");
            SelectInfo onlyDiscount=new SelectInfo("折扣卡管理","3");
            SelectInfo birthdayDiscount=new SelectInfo("生日折扣管理","4");
            cardList.add(vipInfo);
            cardList.add(numInfo);
            cardList.add(onlyDiscount);
            cardList.add(birthdayDiscount);
            SelectSimpleAdapter adapter = new SelectSimpleAdapter(mActivity, cardList);
            cardDialog = new SelectDialog(mActivity, adapter);
            cardDialog.setListenner(new SelectDialog.SelectListenner() {
                @Override
                public void onSelect(int position) {
                    cardDialog.dismiss();
                    SelectInfo genderInfo = cardList.get(position);
                    if ("会员卡管理".equals(genderInfo.getName())) {
                        Intent intent = new Intent(mActivity, VipCardActivity.class);
                        intent.putExtra(Constants.intent_flag,0);
                        mActivity.startActivity(intent);
                    }else if ("折扣卡管理".equals(genderInfo.getName())){
                        Intent intent = new Intent(mActivity, VipCardActivity.class);
                        intent.putExtra(Constants.intent_flag,2);
                        mActivity.startActivity(intent);
                    }else if ("生日折扣管理".equals(genderInfo.getName())){
                        Intent intent = new Intent(mActivity, VipCardActivity.class);
                        intent.putExtra(Constants.intent_flag,3);
                        mActivity.startActivity(intent);
                    }
                    else {
                        Intent intent = new Intent(mActivity, NumCardActivity.class);
                        mActivity.startActivity(intent);
                    }
                }
            });
        }

        cardDialog.show();

    }

    /**
     * 调拨管理
     */
    public void clickAllotMange(){
        Intent intent=new Intent(mActivity, AllotRecordActivity.class);
        mActivity.startActivity(intent);
    }

    /**
     * 系统管理
     */
    public void clickSystemMange(){
        Intent intent=new Intent(mActivity, SystemManagerActivity.class);
        mActivity.startActivity(intent);
    }

    /**
     * 修改店长密码
     * @param v
     */
    public void clickModifyBossPswBtn(View v) {
        Intent intent = new Intent(mActivity, ModifyBossPswActivity.class);
        mActivity.startActivity(intent);
    }


    public void clickAboutBtn(View v) {
        Intent intent = new Intent(mActivity, AboutUsActivity.class);
        mActivity.startActivity(intent);
    }


    private void showDialog() {
        if (mDialog == null) {
            mDialog = new CustomDialog(mActivity);
            mDialog.setContent("确认退出吗?");
            mDialog.setCancelVisiable();
            mDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SpUtil.clearLoginInfo();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getLoginInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getGoodTypeInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getServiceTypeInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getVipCardInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getAnimalTypeInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getAnimalTypeClassifyInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getEmployeeInfoDao().deleteAll();;
                    GreenDaoUtils.getSingleTon().getmDaoSession().getBackGoodsReasonInfoDao().deleteAll();
                    GreenDaoUtils.getSingleTon().getmDaoSession().getNumCardListInfoDao().deleteAll();
                    mDialog.dismiss();
                    mActivity.turnToActivityByFinish(LoginActivity.class);
//                    exitHttp();
                }
            });

        }
        mDialog.show();
    }

    public void destroy() {
        mClient.reset();
        mClient = null;
        mActivity = null;
        cardDialog=null;
    }
}
