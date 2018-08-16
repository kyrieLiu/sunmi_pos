package ys.app.petproject.viewmodel.vip;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.AppApplication;
import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.adapter.VipRechargesAdapter;
import ys.app.petproject.databinding.VipRechargeRecordsBinding;
import ys.app.petproject.fragment.VipRechargeRecordsFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.VipRechargeInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;
import ys.app.petproject.widget.wrapperRecylerView.OnLoadMoreListener;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * Created by Administrator on 2017/6/8.
 */

public class VipRechargeRecordsViewModel extends BaseFragmentViewModel {
    private final VipRechargeRecordsFragment mFrgment;
    private final VipRechargeRecordsBinding mBinding;
    private Activity mActivity;
    private VipRechargesAdapter mAdapter;
    private ApiClient<BaseListResult<VipRechargeInfo>> mClient;
    private LoadMoreFooterView loadMoreFooterView;
    private int mShopId;
    private long mVipUserId;


    public VipRechargeRecordsViewModel(VipRechargeRecordsFragment fragment, VipRechargeRecordsBinding mBinding) {
        this.mActivity = fragment.getActivity();
        this.mFrgment = fragment;
        this.mBinding = mBinding;
        this.mClient = new ApiClient<>();
    }

    @Override
    public void reloadData(View view) {
        loadHttpData();
    }

    public void init(int shopId ,long userId) {
        mShopId = shopId;
        mVipUserId = userId;
        fristCome = true;
        startHttp = 0;
        mBinding.recyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);
                startHttp = 0;
                loadHttpData();
            }
        });
        loadMoreFooterView = (LoadMoreFooterView) mBinding.recyclerView.getLoadMoreFooterView();

        mAdapter = new VipRechargesAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.recyclerView.setIAdapter(mAdapter);

        mBinding.recyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (loadMoreFooterView.canLoadMore() && mAdapter.getItemCount() > 0) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Loading);
                    loadHttpData();
                }
            }
        });
        loadMoreFooterView.setOnRetryListener(new LoadMoreFooterView.OnRetryListener() {
            @Override
            public void onRetry(LoadMoreFooterView view) {
                if (loadMoreFooterView.canLoadMore() && mAdapter.getItemCount() > 0) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Loading);
                    loadHttpData();
                }
            }
        });

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
        parmas.put("branchId",SpUtil.getBranchId()+"");
        parmas.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        parmas.put("type", "1");
        parmas.put("start", startHttp + "");
        parmas.put("vipUserId", String.valueOf(mVipUserId));

        mClient.reqApi("queryVipRecharge", parmas, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<VipRechargeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipRechargeInfo> result) {
                        if (result.isSuccess()) {
                            List<VipRechargeInfo> data = result.getData();
                            mAdapter.setList(startHttp, data);
                            if (data == null) {
                                afterRefreshAndLoadMoreFailed(mBinding.recyclerView, loadMoreFooterView);
                            } else {
                                afterRefreshAndLoadMoreSuccess(data, mBinding.recyclerView, loadMoreFooterView);
                            }

                        } else {
                            showToast(AppApplication.getAppContext(), result.getErrorMessage());
                            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, loadMoreFooterView);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        afterRefreshAndLoadMoreFailed(mBinding.recyclerView, loadMoreFooterView);
                    }
                });
    }

}
