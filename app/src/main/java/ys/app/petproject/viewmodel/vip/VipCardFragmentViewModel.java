package ys.app.petproject.viewmodel.vip;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.vip.VipDetailActivity;
import ys.app.petproject.adapter.VipAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.callback.OnItemLongClickListener;
import ys.app.petproject.databinding.FragmentVipCardBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.VipCardFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;
import ys.app.petproject.widget.wrapperRecylerView.OnLoadMoreListener;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * Created by Administrator on 2017/12/13/013.
 */

public class VipCardFragmentViewModel extends BaseFragmentViewModel {
    private VipCardFragment mFragment;
    private FragmentVipCardBinding mBinding;
    private ApiClient<BaseListResult<VipInfo>> mListClient;
    private LoadMoreFooterView mLoadMoreFooterView;
    private VipAdapter mAdapter;
    private RxManager mRxManager;
    private CustomDialog mDeleteDialog;
    private ApiClient mApiClient;
    private int flag;
    private int classification;
    private int cardNO;

    public VipCardFragmentViewModel(VipCardFragment mFragment, FragmentVipCardBinding binding,int flag, int classification) {
        this.mFragment = mFragment;
        this.mBinding = binding;
        this.mListClient = new ApiClient<BaseListResult<VipInfo>>();
        this.mApiClient = new ApiClient();
        this.classification =classification;
        this.flag=flag;
    }

    public void onClickNetWorkError(View view) {
        isNetWorkErrorVisible.set(false);
        reloadData(view);
    }

    public void setIntentCardNO(int cardNO) {
        this.cardNO=cardNO;
    }

    @Override
    public void reloadData(View view) {
        loadHttpData();
    }

    public void init() {
        registerBus();
        mLoadMoreFooterView = (LoadMoreFooterView) mBinding.recyclerView.getLoadMoreFooterView();

        mBinding.recyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                mLoadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);
                startHttp = 0;
                loadHttpData();
            }
        });

        mAdapter = new VipAdapter(mFragment.getActivity());
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mFragment.getContext()));
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

        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(mFragment.getActivity(),VipDetailActivity.class);
                intent.putExtra(Constants.intent_info,mAdapter.getList().get(position));
                intent.putExtra(Constants.intent_type,flag);
                mFragment.getActivity().startActivity(intent);
            }
        });

        mAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public void onItemLongClick(View view, int position) {
                if (!mFragment.getActivity().isFinishing()) {
                    showDeleteDialog(position);
                }
            }
        });

        loadHttpData();
    }

    private void registerBus() {
        if(mRxManager == null){
            mRxManager = new RxManager();
        }
        mRxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                if(Constants.type_updateVip_success == integer||Constants.type_charge_finish==integer||Constants.type_deleteVipCard_success==integer){
                    startHttp = 0;
                    loadHttpData();
                }
            }
        });
    }

    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mFragment.getActivity())) {//有网请求数据
            if (fristCome) {
                isLoadingVisible.set(true);
            }
            getDataList();
        } else {//无网显示断网连接
            mFragment.showToast(Constants.network_error_warn);
            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
        }
    }

    private void getDataList(){
        Map<String, String> params = new HashMap<>();
        params.put("headOfficeId", SpUtil.getHeadOfficeId()+"");
        params.put("petIS", "1");
        params.put("start",startHttp+"");
        if(cardNO!=-1) params.put("typeId", cardNO+"");
        if (flag ==1){//次卡
            params.put("branchId",SpUtil.getBranchId()+"");
            params.put("classification","1");
        }else{
            params.put("classification", classification +"");
        }
        mListClient.reqApi("queryVip", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<VipInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipInfo> result) {
                        if (result.isSuccess()) {
                            List<VipInfo> data = result.getData();
                            mAdapter.setList(startHttp, data);
                            afterRefreshAndLoadMoreSuccess(data, mBinding.recyclerView, mLoadMoreFooterView);
                        } else {
                            mFragment.showToast(result.getErrorMessage());
                            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        afterRefreshAndLoadMoreFailed(mBinding.recyclerView, mLoadMoreFooterView);
                    }
                });

    }

    private void showDeleteDialog(final int position) {
        if (mFragment.getActivity() == null) {
            return;
        }
        if (mDeleteDialog == null) {
            mDeleteDialog = new CustomDialog(mFragment.getActivity());
            mDeleteDialog.setContent("确定删除该会员?");
            mDeleteDialog.setCancelVisiable();
        }

        mDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VipInfo vipInfo=mAdapter.getList().get(position);
                if (vipInfo.getMoney()>0){
                    Toast.makeText(mFragment.getActivity(),"该会员账户还有余额,不能删除",Toast.LENGTH_SHORT).show();
                    mDeleteDialog.dismiss();
                    return;
                }
                mFragment.showRDialog();
                Map<String, String> params = new HashMap<>();
                params.put("id", mAdapter.getList().get(position).getId() + "");
                params.put("shopId", SpUtil.getShopId() );
                params.put("state", "4");
                params.put("headOfficeId", SpUtil.getHeadOfficeId()+"");
                params.put("branchId", SpUtil.getBranchId()+"");
                mApiClient.reqApi("updateVip", params, ApiRequest.RespDataType.RESPONSE_JSON)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult baseResult) {
                                mFragment.hideRDialog();
                                mDeleteDialog.dismiss();
                                if (baseResult.isSuccess()) {
                                    mAdapter.removeData(position);
                                } else {
                                    showToast(mFragment.getActivity(), baseResult.getErrorMessage());
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                mDeleteDialog.dismiss();
                                mFragment.hideRDialog();
                                showToast(mFragment.getActivity(), e.getMessage());
                            }
                        });

            }
        });

        mDeleteDialog.show();
    }
    public void clear() {

        if (mRxManager!=null){
            mRxManager.clear();
            mRxManager=null;
        }

    }
}
