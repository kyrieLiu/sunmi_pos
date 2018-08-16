package ys.app.petproject.nfc;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.vip.VipDetailActivity;
import ys.app.petproject.adapter.SelectSimpleAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.SelectInfo;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.widget.dialog.RequestDialog;
import ys.app.petproject.widget.dialog.SelectDialog;


/**
 * Created by liuyin on 2017/9/29.
 */

public class VipCardModel {
    private Fragment fragment;
    private String intentFlag;
    private  RxManager rxManager;
    private RequestDialog mRDialog;
    private int vipFlag;//0代表会员卡,1代表次卡

    public VipCardModel(Fragment fragment,String intentFlag,int vipFlag){
        this.fragment=fragment;
        this.intentFlag=intentFlag;
        this.vipFlag=vipFlag;
    }

    /**
     * 查找会员
     */
    private  ApiClient<BaseListResult<VipInfo>> mVipApiClient;
    public  void getVip(final String cardNo){

        if (mVipApiClient==null){
            mVipApiClient = new ApiClient<>();
        }
        Map<String, String> params = new HashMap<>();
        params.put("headOfficeId", SpUtil.getHeadOfficeId()+"");
        params.put("cardNo", cardNo);
        params.put("classification",vipFlag+"");
        if (vipFlag==1)params.put("branchId",SpUtil.getBranchId()+"");
        showRDialog();
        mVipApiClient.reqApi("selectVip", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<VipInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipInfo> vipInfoBaseListResult) {
                        hideRDialog();
                        List<VipInfo> data = vipInfoBaseListResult.getData();
                        if (data != null && !data.isEmpty()) {
                            for (VipInfo info : data) {
                                if (cardNo.equals(info.getCardNo())) {
                                    turnNext(info);
                                    break;
                                }
                            }
                        }else{
                            Toast.makeText(fragment.getActivity(),"暂无相关会员",Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        hideRDialog();
                        Toast.makeText(fragment.getActivity(),"网络异常,请检查网络",Toast.LENGTH_SHORT).show();
                    }
                });
    }
    private void turnNext(final VipInfo info){
        if ("huiyuan".equals(intentFlag)){
            Intent intent = new Intent(fragment.getActivity(),VipDetailActivity.class);
            intent.putExtra(Constants.intent_info,info);
            intent.putExtra(Constants.intent_type,vipFlag);
            fragment.getActivity().startActivity(intent);
            fragment.getActivity().finish();
        }else if ("shouyin".equals(intentFlag)){
            if (rxManager==null){
                rxManager = new RxManager();
            }
            final List<SelectInfo> infoList = new ArrayList<>();
            infoList.add(new SelectInfo("折扣价","0"));
            infoList.add(new SelectInfo("会员价","1"));
            SelectSimpleAdapter simpleAdapter = new SelectSimpleAdapter(fragment.getActivity(),infoList);
            final SelectDialog selectDialog = new SelectDialog(fragment.getActivity(),simpleAdapter);
            simpleAdapter.setListener(new OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    if (infoList.get(position).getType().equals("1")){
                        rxManager.post(Constants.confirm_vip_info,info);
                        fragment.getActivity().finish();
                    }else {
                        rxManager.post(Constants.confirm_type_info,info);
                        fragment.getActivity().finish();
                    }
                    selectDialog.dismiss();
                }
            });
            selectDialog.show();

        }

    }

    public void showRDialog() {
        if(mRDialog == null){
            mRDialog = new RequestDialog(fragment.getActivity());
        }
        mRDialog.show();
    }
    public void hideRDialog() {
        if(mRDialog != null){
            mRDialog.hide();
        }
    }
    public void clear(){
        if(mRDialog!=null){
            mRDialog.dismiss();
        }
    }
}
