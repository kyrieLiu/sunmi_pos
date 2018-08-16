package ys.app.petproject.itemmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.Window;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;

import java.util.HashMap;
import java.util.Map;

import ys.app.petproject.R;
import ys.app.petproject.activity.manage.AllotRecordActivity;
import ys.app.petproject.adapter.AllotRecordAdapter;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.AllotRecordInfo;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.widget.dialog.VertifyDialog;

/**
 * Created by liuyin on 2017/9/16.
 */

public class AllotManageRecordItemModel extends BaseObservable {
    private AllotRecordInfo model;

    private VertifyDialog dialog;

    private AllotRecordActivity context;
    private  ApiClient<BaseResult> mClient;
    private int position;
    AllotRecordAdapter adapter;

    public AllotManageRecordItemModel(AllotRecordInfo model,AllotRecordActivity context,int position,AllotRecordAdapter adapter) {
        this.model = model;
        this.context=context;
        this.position=position;
        this.adapter=adapter;
        if (mClient==null){
            mClient=new ApiClient<>();
        }
    }
    @Bindable
    public AllotRecordInfo getModel() {
        return model;
    }

    public void setModel(AllotRecordInfo model) {
        this.model = model;
        notifyPropertyChanged(BR.model);
    }
    public void clickCheck(){
        if (dialog==null){
            dialog=new VertifyDialog(context);
            Window window = dialog.getWindow();
            window.setWindowAnimations(R.style.ThemeCustomDialog_Animation);
            dialog.setListener(new VertifyDialog.OnConfirmClickListener() {
                @Override
                public void clickCheckConfirm(AllotRecordInfo info,long userId,String userName) {
                    updateAllotRecord(info,userId,userName);

                }
            });
        }
        dialog.setModel(model);
        dialog.show();
    }
    private void updateAllotRecord(final AllotRecordInfo info,long userID,String userName) {
        final Map<String, String> params = new HashMap<>();
        params.put("toUserId", userID+"");
        params.put("toUserName", userName);
        params.put("id", info.getId()+"");
        params.put("toShopId", info.getShopId());
        params.put("toBranchId", info.getToBranchId()+"");
        params.put("toCommodityId", info.getToCommodityId()+"");
        params.put("num", info.getNum()+"");


        context.showRDialog();
        mClient.reqApi("updateAllocation", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        context.hideRDialog();
                        if (result.isSuccess()) {
                            dialog.dismiss();
                            adapter.updateSort(position);
                            Toast.makeText(context, "审核成功", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(context, result.getErrorCode(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        // updatePayResult(info);
                        super.onError(e);
                        context.hideRDialog();
                    }
                });
    }
}
