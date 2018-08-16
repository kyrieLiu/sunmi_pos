package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.manage.AllotListActivity;
import ys.app.petproject.adapter.AllotSelectAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.AllotListActivityBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.AllotSelectModel;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;
import ys.app.petproject.widget.wrapperRecylerView.OnLoadMoreListener;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * Created by aaa on 2017/6/5.
 */

public class AllotShopListModel extends BaseActivityViewModel {
    private AllotListActivity mActivity;
    private AllotListActivityBinding mBinding;
    private LoadMoreFooterView mLoadMoreFooterView;
    private AllotSelectAdapter mAdapter;
    private  ApiClient<BaseListResult<AllotSelectModel>> mListClient;
    private AllotSelectModel model;


    public AllotShopListModel(AllotListActivity mActivity,AllotListActivityBinding mBinding){
        this.mActivity=mActivity;
        this.mBinding=mBinding;
        this.mListClient = new ApiClient<BaseListResult<AllotSelectModel>>();
    }



    public void initView(){

        mLoadMoreFooterView = (LoadMoreFooterView) mBinding.recyclerView.getLoadMoreFooterView();

        mBinding.recyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                mLoadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);
                startHttp = 0;
                loadHttpData();
            }
        });
        mAdapter = new AllotSelectAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity,2));
        mBinding.recyclerView.setIAdapter(mAdapter);
        mBinding.recyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (mLoadMoreFooterView.canLoadMore() && mAdapter.getItemCount() > 0) {
                    mLoadMoreFooterView.setStatus(LoadMoreFooterView.Status.Loading);
                    loadHttpData();
                }
            }
        });
        mLoadMoreFooterView.setOnRetryListener(new LoadMoreFooterView.OnRetryListener() {
            @Override
            public void onRetry(LoadMoreFooterView view) {
                if (mLoadMoreFooterView.canLoadMore() && mAdapter.getItemCount() > 0) {
                    mLoadMoreFooterView.setStatus(LoadMoreFooterView.Status.Loading);
                    loadHttpData();
                }
            }
        });

        mAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                model=mAdapter.getObject();
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
            mActivity.showToast(Constants.network_error_warn);
            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
        }
    }

    private void getDataList(){
        Map<String, String> params = new HashMap<>();
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("start",startHttp+"");
        isLoadingVisible.set(true);
        mListClient.reqApi("selectBranchShop", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<AllotSelectModel>>() {
                    @Override
                    public void onSuccess(BaseListResult<AllotSelectModel> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            List<AllotSelectModel> data = result.getData();
                            mAdapter.setList(startHttp, data);
                            if (data == null) {
                                afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
                            } else {
                                afterRefreshAndLoadMoreSuccess(data, mBinding.recyclerView, mLoadMoreFooterView);
                            }
                        } else {

                            mActivity.showToast(result.getErrorMessage());
                            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        isLoadingVisible.set(false);
                        afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
                    }
                });

    }

    /**
     * 点击确定
     */
    public void clickConfirm(){
        if (model==null){
            showToast(mActivity,"请选择调出店铺");
            return;
        }
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        bundle.putSerializable("model",model);
        intent.putExtras(bundle);
        mActivity.setResult(10,intent);
        mActivity.finish();
    }
    public void reset(){
        if (mListClient!=null){
            mListClient.reset();
            mListClient=null;
        }
        mActivity = null;
    }
}

