package ys.app.petproject.viewmodel.inventory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.AppApplication;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.inventory.InventoryRecordsActivity;
import ys.app.petproject.activity.inventory.InventoryRecordsDetailActivity;
import ys.app.petproject.adapter.inventory.InventoryRecordsAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.InventoryRecordsBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.InventoryRecordsInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;
import ys.app.petproject.widget.wrapperRecylerView.OnLoadMoreListener;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * Created by admin on 2017/7/12.
 */

public class InventoryRecordsViewModel extends BaseActivityViewModel {

    private InventoryRecordsActivity mActivity;
    private InventoryRecordsBinding mBinding;
    private ApiClient<BaseListResult<InventoryRecordsInfo>> mClient;
    private InventoryRecordsAdapter mAdapter;
    private LoadMoreFooterView loadMoreFooterView;

    public InventoryRecordsViewModel(InventoryRecordsActivity activity, InventoryRecordsBinding binding){
        this.mBinding = binding;
        this.mActivity = activity;
        this.mClient = new ApiClient<BaseListResult<InventoryRecordsInfo>>();
    }

    public void init() {
        firstCome = true;
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

        mAdapter = new InventoryRecordsAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.recyclerView.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division));
        mBinding.recyclerView.setAdapter(mAdapter);
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

        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                List<InventoryRecordsInfo> list = mAdapter.getList();
                InventoryRecordsInfo inventoryRecordsInfo = list.get(position);
                Intent intent = new Intent(mActivity,InventoryRecordsDetailActivity.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("InventoryRecords",inventoryRecordsInfo);
                intent.putExtras(bundle);
                mActivity.startActivity(intent);
            }
        });

        loadHttpData();
    }

    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            if (firstCome) {
                isLoadingVisible.set(true);
            }
            getDataList();
        } else {//无网显示断网连接
            showToast(mActivity, Constants.network_error_warn);
            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, loadMoreFooterView);
        }
    }

    private void getDataList() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("start", startHttp + "");

        mClient.reqApi("selectCommodityInventory", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<InventoryRecordsInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<InventoryRecordsInfo> info) {
                        if (info.isSuccess()) {
                            List<InventoryRecordsInfo> data = info.getData();
                            mAdapter.setList(startHttp, data);
                            if (data == null) {
                                afterRefreshAndLoadMoreFailed(mBinding.recyclerView, loadMoreFooterView);
                            } else {
                                afterRefreshAndLoadMoreSuccess(data, mBinding.recyclerView, loadMoreFooterView);
                            }

                        } else {
                            showToast(AppApplication.getAppContext(), info.getErrorMessage());
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

    public void reset(){
        if (mClient != null){
            mClient.reset();
            mClient = null;
        }
        mActivity = null;
    }
}
