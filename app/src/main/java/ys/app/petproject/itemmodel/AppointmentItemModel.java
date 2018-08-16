package ys.app.petproject.itemmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;
import android.view.View;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;

import java.util.HashMap;
import java.util.Map;

import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.appointment.AppointmentAreadyFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.AppointmentBean;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.widget.dialog.CustomDialog;

/**
 * Created by liuyin on 2017/9/13.
 */

public class AppointmentItemModel extends BaseObservable {
    private AppointmentBean model;
    public ObservableBoolean isWaiting=new ObservableBoolean(false);
    public ObservableBoolean isFailer=new ObservableBoolean(false);
    public ObservableBoolean isAready=new ObservableBoolean(false);
    private AppointmentAreadyFragment fragment;

    private CustomDialog confirmDialog;
    private CustomDialog noTimeDialog;
    private CustomDialog repeatDialog;
    private ApiClient<BaseResult> mClient;
    private RxManager rxManager;

    public AppointmentItemModel(AppointmentBean model, AppointmentAreadyFragment fragment, boolean isAppointmentAready, boolean isAppointmentWait, boolean isAppointmentFailer) {
        this.model = model;
        this.fragment=fragment;
        isWaiting.set(isAppointmentWait);
        isFailer.set(isAppointmentFailer);
        isAready.set(isAppointmentAready);
        if (mClient==null){
            mClient=new ApiClient<>();
        }
    }

    @Bindable
    public AppointmentBean getModel() {
        return model;
    }

    public void setModel(AppointmentBean model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }

    /**
     * 确定预约
     */
    public void showConfirmDialog(){
        if(confirmDialog == null){
            confirmDialog = new CustomDialog(fragment.getActivity());
            confirmDialog.setContent("确定预约吗?");
            confirmDialog.setCancelVisiable();
            confirmDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    confirmDialog.dismiss();
                    switchAppointmentState(1);
                }
            });

        }
        confirmDialog.show();
    }

    /**
     * 暂无时间
     */
    public void noTimeDialog(){
        if(noTimeDialog == null){
            noTimeDialog = new CustomDialog(fragment.getActivity());
            noTimeDialog.setContent("是否提交?");
            noTimeDialog.setCancelVisiable();
            noTimeDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    noTimeDialog.dismiss();
                    switchAppointmentState(4);
                }
            });

        }
        noTimeDialog.show();
    }

    /**
     * 重新预约
     */
    public void repeatDialog(){
        if(repeatDialog == null){
            repeatDialog = new CustomDialog(fragment.getActivity());
            repeatDialog.setContent("是否重新预约?");
            repeatDialog.setCancelVisiable();
            repeatDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    repeatDialog.dismiss();
                }
            });

        }
        repeatDialog.show();
    }
    private void switchAppointmentState(final int state){
        final Map<String, String> params = new HashMap<>();
        params.put("branchId", SpUtil.getBranchId()+"");
        params.put("headOfficeId", SpUtil.getHeadOfficeId()+"");
        params.put("id", model.getId()+"");
        params.put("state", state+"");


        fragment.showRDialog();
        mClient.reqApi("updateBespeak", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        if (rxManager==null){
                            rxManager=new RxManager();
                        }
                        rxManager.post(Constants.bus_type_http_result,Constants.type_addAppointment_success);
                        fragment.hideRDialog();
                        String toast="";
                        if (state==1){
                            toast="预约成功";
                        }else{
                            toast="已驳回预约";
                        }
                        Toast.makeText(fragment.getActivity(),toast,Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onError(Throwable e) {
                        // updatePayResult(info);
                        super.onError(e);
                        fragment.hideRDialog();
                    }
                });
    }

}
