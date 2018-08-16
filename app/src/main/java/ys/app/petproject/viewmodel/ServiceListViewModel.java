package ys.app.petproject.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.view.Window;

import com.greendao.CommitOrderTempInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.ServiceDetailActivity;
import ys.app.petproject.adapter.ServiceAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.callback.OnItemLongClickListener;
import ys.app.petproject.databinding.FragmentServiceListBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.ServiceListFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.AddDialog;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * Created by aaa on 2017/7/13.
 */

public class ServiceListViewModel extends BaseFragmentViewModel {

    private final ServiceListFragment mFrgment;
    private final FragmentServiceListBinding mBinding;
    private final ServiceTypeInfo mInfo;
    private final int mSearchFromIntent;
    private Activity mActivity;
    private ServiceAdapter mAdapter;
    private ApiClient<BaseListResult<ServiceInfo>> mClient;
    private List<ServiceTypeInfo> mList = new ArrayList<>();
    private RxManager rxManager;
    private AddDialog mDialog;
    private LoadMoreFooterView loadMoreFooterView;
    //    private boolean mIsAddOrder = false;
    private CustomDialog mDeleteDialog;
    private ApiClient<BaseResult> mDeleteApiClient;
    private RxManager mRxManager;
    private double originalServiceRealAmt;


    public ServiceListViewModel(ServiceListFragment fragment, FragmentServiceListBinding mBinding, ServiceTypeInfo info, int searchFromIntent) {
        this.mActivity = fragment.getActivity();
        this.mFrgment = fragment;
        this.mBinding = mBinding;
        this.mInfo = info;
        this.mSearchFromIntent = searchFromIntent;
        this.mDeleteApiClient = new ApiClient<>();
        this.mClient = new ApiClient<>();
        registerBus();
    }

    private void registerBus() {
        if (mRxManager==null)
        mRxManager = new RxManager();

//        mRxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
//            @Override
//            public void call(Integer integer) {
//                if (integer==Constants.type_order_pay_finish) {
//                    loadHttpData();
//                }
//            }
//        });

        mRxManager.on(Constants.type_update_service, new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                loadHttpData();
            }
        });
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

        mAdapter = new ServiceAdapter(mActivity);
        if (Constants.intent_form_fuwu_cuxiaoshezhi==mSearchFromIntent){
            mAdapter.setPromot(true);
        }
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity, 2));
        mBinding.recyclerView.setIAdapter(mAdapter);


        mAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (Constants.intent_form_fuwu_goumai == mSearchFromIntent) {//添加购物车
                    showDialog(mAdapter.getList().get(position));
                } else {
                    List<ServiceInfo> list = mAdapter.getList();
                    Intent intent = new Intent(mActivity, ServiceDetailActivity.class);
                    intent.putExtra(Constants.intent_service_info, list.get(position));
                    intent.putExtra(Constants.intent_service_position, position);
                    mActivity.startActivity(intent);
                }

            }
        });


        if (Constants.intent_form_fuwu_kucunliebiao == mSearchFromIntent) {
            mAdapter.setLongClicklistener(new OnItemLongClickListener() {
                @Override
                public void onItemLongClick(View view, int position) {
                    if (!mActivity.isFinishing()) {
                        showDeleteDialog(position);
                    }
                }
            });
        }


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

        if (Constants.intent_form_fuwu_cuxiaoliebiao == mSearchFromIntent) {//从服务促销列表进来
            parmas.put("isPromotion", "1");
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


    private void showDialog(ServiceInfo info) {
        originalServiceRealAmt = info.getRealAmt();
        if (mDialog == null) {
            mDialog = new AddDialog(mActivity);
            Window window = mDialog.getWindow();
            window.setWindowAnimations(R.style.ThemeCustomDialog_Animation);
            mDialog.setListenner(new AddDialog.OnClickConfirmListenner() {
                @Override
                public void onClickGoodsConfirm(GoodInfo goodInfo, EmployeeInfo employeeInfo, int num,int isGift) {

                }

                @Override
                public void onClickServiceConfirm(ServiceInfo serviceInfo, EmployeeInfo employeeInfo, int num,int isGift) {
                    CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                    QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                    if (Constants.is_promotion == serviceInfo.getIsPromotion()) {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(serviceInfo.getId()), CommitOrderTempInfoDao.Properties.PromotionAmt.eq(serviceInfo.getPromotionAmt()), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift), CommitOrderTempInfoDao.Properties.Type.eq(2),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
                    } else {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(serviceInfo.getId()), CommitOrderTempInfoDao.Properties.RealAmt.eq(serviceInfo.getRealAmt()),CommitOrderTempInfoDao.Properties.IsGift.eq(isGift), CommitOrderTempInfoDao.Properties.Type.eq(2),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
                    }
                    if (qb.unique() != null) {
                        CommitOrderTempInfo unique = (CommitOrderTempInfo) qb.unique();
                        unique.setNum(unique.getNum() + num);
                        unique.setUserId(employeeInfo.getId());
                        unique.setUserName(employeeInfo.getName());
                        unique.setVipPrice(serviceInfo.getVipPrice());
                        commitOrderTempInfoDao.update(unique);
                    } else {
                        CommitOrderTempInfo entity = new CommitOrderTempInfo();
                        entity.setId(serviceInfo.getId());
                        entity.setUserId(employeeInfo.getId());
                        entity.setUserName(employeeInfo.getName());
                        entity.setType(2);
                        entity.setNum(num);
                        entity.setName(serviceInfo.getName());
                        entity.setIcon(serviceInfo.getImgpath());

                        entity.setIsPromotion(serviceInfo.getIsPromotion());
                        if (Constants.is_promotion == serviceInfo.getIsPromotion()) {
                            entity.setPromotionAmt(serviceInfo.getPromotionAmt());
                        }
                        entity.setRealAmt(serviceInfo.getRealAmt());
                        entity.setPrice(serviceInfo.getRealAmt());
                        entity.setIsGift(isGift);
                        entity.setVipPrice(serviceInfo.getVipPrice());
                        commitOrderTempInfoDao.insert(entity);
                    }
                    serviceInfo.setRealAmt(originalServiceRealAmt);
                    if (rxManager == null) {
                        rxManager = new RxManager();
                    }
                    rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                    showToast(mActivity, "加入购物车成功");
                }
            });
        }
        mDialog.setModel(info);
        mDialog.hideEt();
        mDialog.show();
    }


    private void showDeleteDialog(final int position) {
        if (mActivity == null) {
            return;
        }
        if (mDeleteDialog == null) {
            mDeleteDialog = new CustomDialog(mActivity);
            mDeleteDialog.setContent("确定删除该服务?");
            mDeleteDialog.setCancelVisiable();
        }

        mDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFrgment.showRDialog();
                Map<String, String> params = new HashMap<>();
                params.put("id", mAdapter.getList().get(position).getId() + "");
                params.put("shopId", SpUtil.getShopId() + "");
                params.put("status", "4");
                mDeleteApiClient.reqApi("updateService", params, ApiRequest.RespDataType.RESPONSE_JSON)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult baseResult) {
                                mFrgment.hideRDialog();
                                mDeleteDialog.dismiss();
                                if (baseResult.isSuccess()) {
                                    mAdapter.removeData(position);
                                } else {
                                    showToast(mActivity, baseResult.getErrorMessage());
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                mDeleteDialog.dismiss();
                                mFrgment.hideRDialog();
                                showToast(mActivity, e.getMessage());
                            }
                        });

            }
        });

        mDeleteDialog.show();
    }

    public void reset() {
        if (mClient != null) {
            mClient.reset();
            mClient = null;
        }
        if (mRxManager != null) {
            mRxManager.clear();
            mRxManager = null;
        }
        mActivity = null;
        mDialog = null;
        mAdapter = null;
        mDeleteDialog = null;
    }
}
