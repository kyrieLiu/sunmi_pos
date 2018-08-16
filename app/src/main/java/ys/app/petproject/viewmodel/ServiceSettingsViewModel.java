package ys.app.petproject.viewmodel;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.ServiceSettingsActivity;
import ys.app.petproject.adapter.ServiceSettingsAdapter;
import ys.app.petproject.databinding.ServiceSettingsBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;

/**
 * 作者：lv
 * 时间：2017/3/18 12:26
 */

public class ServiceSettingsViewModel extends BaseActivityViewModel {

    private final ApiClient<BaseListResult<ServiceTypeInfo>> mClient;
    private final ApiClient<BaseResult> mSummitClient;
    private  ServiceSettingsBinding mBinding;
    private  ServiceSettingsActivity mActivity;
    private ServiceSettingsAdapter mAdapter;
    private String mCardId;

    public ServiceSettingsViewModel(ServiceSettingsActivity activity , ServiceSettingsBinding binding){
        this.mActivity = activity;
        this.mBinding = binding;
        mClient = new ApiClient<BaseListResult<ServiceTypeInfo>>();
        mSummitClient = new ApiClient<BaseResult>();
    }

    public void init() {
        mAdapter = new ServiceSettingsAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.recyclerView.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division));
        mBinding.recyclerView.setAdapter(mAdapter);
    }

    public void getDataHttp(String cardId) {
        this.mCardId = cardId;
        mActivity.showRDialog();
        Map<String,String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("cardId",mCardId+"");

        mClient.reqApi("queryServiceType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ServiceTypeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceTypeInfo> result) {
                        mActivity.hideRDialog();
                        if(result.isSuccess()){
                            mAdapter.setList(result.getData());
                        }else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }



    public void clickButton(View view){
        mActivity.showRDialog();
        String ids = AppUtil.getIds(mAdapter.getList());
        Map<String,String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId()+"");
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("productList",ids);
        params.put("id",mCardId+"");

        mSummitClient.reqApi("updateVipCard", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        if(result.isSuccess()){
                            mActivity.finish();
                        }else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                    }
                });
    }
}
