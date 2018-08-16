package ys.app.petproject.itemmodel;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;

import java.util.HashMap;
import java.util.Map;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.ServiceSettingsActivity;
import ys.app.petproject.activity.manage.NumCardDetailActivity;
import ys.app.petproject.activity.vip.VipActivity;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.NumCardListInfo;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.dialog.DeleteDialog;

/**
 * Created by aaa on 2017/3/17.
 */

public class NumCardItemViewModel extends BaseObservable {

    private final ApiClient<BaseResult> mClient;
    private final int mPosition;
    private NumCardListInfo model;
    private BaseActivity mActivity;
    private CustomDialog mDialog;
    private RxManager mRxManager;

    public int viewCount=1;
    private DeleteDialog mConfirmDeleteDialog;
    public ObservableField<String> cardMoney=new ObservableField<>();


    public NumCardItemViewModel(int position, NumCardListInfo model, BaseActivity activity)
    {
        this.model = model;
        this.mActivity = activity;
        this.mPosition = position;
        this.mClient = new ApiClient<BaseResult>();
        cardMoney.set("卡片金额: "+model.getRealAmt()+"元");
    }



    @Bindable
    public NumCardListInfo getModel() {
        return model;
    }

    public void setModel(NumCardListInfo model) {
        this.model = model;
        cardMoney.set("卡片金额: "+model.getRealAmt()+"元");
        notifyPropertyChanged(BR.model);
    }

    public void delete(View view){
        if(mDialog == null){
            mDialog = new CustomDialog(mActivity);
            mDialog.setCancelVisiable();
        }
        mDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                if (mConfirmDeleteDialog == null){
                    mConfirmDeleteDialog = new DeleteDialog(mActivity);
                }
                mConfirmDeleteDialog.setOkVisiable(new DeleteDialog.IDeleteDialogCallback() {
                    @Override
                    public void verificationPwd(boolean b) {
                        if (b){
                            if (mConfirmDeleteDialog != null){
                                mConfirmDeleteDialog.dismiss();
                                deleteHttp();
                            }
                        }else {
                            Toast.makeText(mActivity,"密码输入错误请重新输入",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onDismiss() {
                        mConfirmDeleteDialog = null;
                    }
                });
                mConfirmDeleteDialog.show();
            }
        });
        mDialog.setContent("确认删除吗?");
        mDialog.show();
    }

    public void obsolete(View view){
        if (model.getState()==3){
            Toast.makeText(mActivity,"该会员卡已作废",Toast.LENGTH_SHORT).show();
        }else{
            showDeleteDialog();
        }
    }

    private void showDeleteDialog() {
        if(mDialog == null){
            mDialog = new CustomDialog(mActivity);
            mDialog.setCancelVisiable();
        }
        mDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                cancellationVipCard();
            }
        });
        mDialog.setContent("确认作废吗?");
        mDialog.show();
    }

    private void deleteHttp() {
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId()+"");
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("id", model.getId()+"");

        mClient.reqApi("deleteVipCard", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {
                        mActivity.hideRDialog();
                        if (info.isSuccess()) {
                            if (mRxManager == null) {
                                mRxManager = new RxManager();
                            }
                            mRxManager.post(Constants.bus_type_http_result, Constants.type_updateVipCard_success);
                        } else {
                            mActivity.showToast(info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                    }
                });
    }

    /**
     * 会员卡作废
     */
    private void cancellationVipCard(){
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId());
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("id", model.getId()+"");
        params.put("state","3");

        mClient.reqApi("updateVipCardState", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {
                        mActivity.hideRDialog();
                        if (info.isSuccess()) {
                            if (mRxManager == null) {
                                mRxManager = new RxManager();
                            }
                            mRxManager.post(Constants.bus_type_delete_position, mPosition);
                        } else {
                            mActivity.showToast(info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                    }
                });
    }


    public void edit(View view){
        Intent intent = new Intent(mActivity, NumCardDetailActivity.class);
        intent.putExtra(Constants.intent_info,model);
        mActivity.startActivity(intent);
    }
    public void cardMembers(View view){
        Intent intent = new Intent(mActivity,VipActivity.class);
        intent.putExtra(Constants.intent_vip_card_no,(int) model.getId());
        intent.putExtra(Constants.intent_type,1);
        mActivity.startActivity(intent);
    }

    public void set(View view){
        Intent intent = new Intent(mActivity,ServiceSettingsActivity.class);
        intent.putExtra(Constants.intent_id,model.getId()+"");
        mActivity.startActivity(intent);
    }

    public void clickOpenOrClose(View v) {
        model.setExpand(!model.getExpand());
        if (model.getIsClick() == -1) {
            model.setIsClick(0);
        } else if (model.getIsClick() == 0) {
            model.setIsClick(1);
        } else if (model.getIsClick() == 1) {
            model.setIsClick(0);
        }

    }
}
