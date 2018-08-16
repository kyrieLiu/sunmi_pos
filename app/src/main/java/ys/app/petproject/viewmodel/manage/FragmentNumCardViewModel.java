package ys.app.petproject.viewmodel.manage;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.adapter.manage.NumCardAdapter;
import ys.app.petproject.databinding.NumCardFragmentBinding;
import ys.app.petproject.fragment.NumCardFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * Created by aaa on 2017/7/13.
 */

public class FragmentNumCardViewModel extends BaseFragmentViewModel {

    private final NumCardFragmentBinding mBinding;
    private final ServiceTypeInfo mInfo;
    private Activity mActivity;
    private NumCardAdapter mAdapter;
    private ApiClient<BaseListResult<ServiceInfo>> mClient;
    //    private boolean mIsAddOrder = false;


    public FragmentNumCardViewModel(NumCardFragment fragment, NumCardFragmentBinding mBinding, ServiceTypeInfo info) {
        this.mActivity = fragment.getActivity();
        this.mBinding = mBinding;
        this.mInfo = info;
        this.mClient = new ApiClient<>();
    }

    @Override
    public void reloadData(View view) {
        loadHttpData();
    }

    public void init() {

        mBinding.recyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadHttpData();
            }
        });

        mAdapter = new NumCardAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity, 2));
        mBinding.recyclerView.setIAdapter(mAdapter);

        loadHttpData();
    }

    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            if (fristCome) {
                isLoadingVisible.set(true);
            }
            getDataList();
        } else {//无网显示断网连接
            showToast(mActivity, Constants.network_error_warn);
            afterRefreshFailed(mBinding.recyclerView);
        }
    }


    public void getDataList() {
        Map<String, String> parmas = new HashMap<>();
        parmas.put("start", "0");
        parmas.put("limit", "1000");
        if (mInfo != null) {
            parmas.put("typeId", mInfo.getId() + "");
        }
        parmas.put("branchId",SpUtil.getBranchId()+"");
        parmas.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mClient.reqApi("queryServiceList", parmas, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ServiceInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceInfo> result) {
                        if (result.isSuccess()) {
                            List<ServiceInfo> data = result.getData();
                            mAdapter.setList(data);
                            afterRefreshSuccess(mBinding.recyclerView, data);
                        } else {
                            showToast(mActivity, result.getErrorCode());
                            afterRefreshFailed(mBinding.recyclerView);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        afterRefreshFailed(mBinding.recyclerView);
                    }
                });
    }
}
