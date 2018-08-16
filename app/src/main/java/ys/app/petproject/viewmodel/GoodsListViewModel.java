package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.greendao.CommitOrderTempInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.AppApplication;
import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.GoodsDetailActivity;
import ys.app.petproject.adapter.GoodsAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.callback.OnItemLongClickListener;
import ys.app.petproject.databinding.FragmentGoodsListBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.GoodsListFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.AddDialog;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.dialog.DeleteDialog;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;
import ys.app.petproject.widget.wrapperRecylerView.OnLoadMoreListener;
import ys.app.petproject.widget.wrapperRecylerView.OnRefreshListener;

/**
 * 作者：lv
 * 时间：2017/3/21 21:30
 */

public class GoodsListViewModel extends BaseFragmentViewModel {


    private final ApiClient<BaseResult> mApiClient;
    private ApiClient<BaseListResult<GoodInfo>> mListClient;
    private FragmentActivity mActivity;
    private int mSearchFromIntent;
    private GoodsListFragment mFragment;
    private FragmentGoodsListBinding mBinding;
    private long mId;
    private LoadMoreFooterView loadMoreFooterView;
    private GoodsAdapter mAdapter;
    private AddDialog mDialog;
    private RxManager mRxManager;
    private CustomDialog mDeleteDialog;
    private DeleteDialog mConfirmDeleteDialog;
    private double originalGoodsRealAmt;


    public GoodsListViewModel(GoodsListFragment fragment, FragmentGoodsListBinding binding, long id, int searchFromIntent) {
        this.mFragment = fragment;
        this.mBinding = binding;
        this.mActivity = fragment.getActivity();
        this.mId = id;
        this.mSearchFromIntent = searchFromIntent;
        this.mListClient = new ApiClient<>();
        this.mApiClient = new ApiClient<BaseResult>();
        registerBus();
    }



    private void registerBus() {
        if (mRxManager == null) {
            mRxManager = new RxManager();
        }
        mRxManager.on(Constants.bus_type_goodInfo, new Action1<GoodInfo>() {
            @Override
            public void call(GoodInfo goodInfo) {
                showDialog(goodInfo);
            }
        });
        mRxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                if (integer == Constants.type_updateGoods_success || integer == Constants.type_addGood_success||integer==Constants.type_order_pay_finish) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);
                    startHttp = 0;
                    loadHttpData();
                }
            }
        });
    }

    @Override
    public void reloadData(View view) {
        loadHttpData();
    }

    public void init() {
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

        mAdapter = new GoodsAdapter(mActivity);
        mAdapter.setPromotionSetting(Constants.intent_form_shangpin_cuxiaoshezhi == mSearchFromIntent);
        mAdapter.setShangpinRuku(Constants.intent_form_shangpin_ruku == mSearchFromIntent);
        mAdapter.setShangpinChuKu(Constants.intent_form_shangpin_chuku == mSearchFromIntent);
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity, 2));
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

        if (Constants.intent_form_shangpin_kucunliebiao == mSearchFromIntent) {
            mAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
                @Override
                public void onItemLongClick(View view, int position) {
                    showDeleteDialog(position);
                }
            });
        }

        mAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                List<GoodInfo> list = mAdapter.getList();
                if (Constants.intent_form_shangpin_goumai != mSearchFromIntent) {//不是从购物车进入
                    Intent intent = new Intent(mActivity, GoodsDetailActivity.class);
                    Bundle bundle = new Bundle();
                    if (list != null && !list.isEmpty() && list.size() > position) {
                        bundle.putSerializable(Constants.intent_info, list.get(position));
                    }
                    intent.putExtra(Constants.intent_search_from,mSearchFromIntent);
                    intent.putExtras(bundle);
                    mActivity.startActivity(intent);
                } else {
                    if (list != null && !list.isEmpty() && list.size() > position) {
                        GoodInfo goodInfo = list.get(position);
                        if (goodInfo.getStockNum() <= 0) {
                            showToast(mActivity, "库存为0,不能加入购物车");
                            return;
                        }
                        showDialog(list.get(position));
                    }
                }
            }
        });
    }


    private void showDeleteDialog(final int position) {
        if (mActivity == null) {
            return;
        }
        if (mDeleteDialog == null) {
            mDeleteDialog = new CustomDialog(mActivity);
            mDeleteDialog.setContent("确定删除该商品?");
            mDeleteDialog.setCancelVisiable();
        }

        mDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDeleteDialog.dismiss();
                if (mConfirmDeleteDialog == null){
                    mConfirmDeleteDialog = new DeleteDialog(mActivity);
                }
                mConfirmDeleteDialog.setOkVisiable(new DeleteDialog.IDeleteDialogCallback() {
                    @Override
                    public void verificationPwd(boolean b) {
                        if (b){
                            if (mConfirmDeleteDialog != null){
                                mConfirmDeleteDialog.dismiss();

                            }
                            verSuc();
                        }else {
                            Toast.makeText(mActivity,"密码输入错误请重新输入",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onDismiss() {
                        mConfirmDeleteDialog = null;
                    }
                });
                mConfirmDeleteDialog.show();
            }

            private void verSuc() {
                mFragment.showRDialog();
                Map<String, String> params = new HashMap<>();
                params.put("id", mAdapter.getList().get(position).getId() + "");
                params.put("shopId", SpUtil.getShopId());
                params.put("branchId",SpUtil.getBranchId()+"");
                params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
                params.put("status", "4");
                mApiClient.reqApi("updateGoods", params, ApiRequest.RespDataType.RESPONSE_JSON)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult baseResult) {
                                if (baseResult.isSuccess()) {
                                    mFragment.hideRDialog();
                                    mAdapter.removeData(position);
                                } else {
                                    showToast(mActivity, baseResult.getErrorMessage());
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                if (mConfirmDeleteDialog != null){
                                    mConfirmDeleteDialog.dismiss();
                                }
                                mDeleteDialog.dismiss();
                                mFragment.hideRDialog();
                                showToast(mActivity, e.getMessage());
                            }
                        });
            }
        });

        mDeleteDialog.show();
    }

    private void showDialog(GoodInfo goodInfo) {
        originalGoodsRealAmt = goodInfo.getRealAmt();
        if (mDialog == null) {
            mDialog = new AddDialog(mActivity);
            Window window = mDialog.getWindow();
            window.setGravity(Gravity.BOTTOM);  //此处可以设置dialog显示的位置
            window.setWindowAnimations(R.style.ThemeCustomDialog_Animation);
            mDialog.setListenner(new AddDialog.OnClickConfirmListenner() {

                @Override
                public void onClickGoodsConfirm(GoodInfo goodInfo, EmployeeInfo employeeInfo, int num,int isGift) {

                    CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                    QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                    if (Constants.is_promotion == goodInfo.getIsPromotion()) {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(goodInfo.getId()),CommitOrderTempInfoDao.Properties.PromotionAmt.eq(goodInfo.getPromotionAmt()),CommitOrderTempInfoDao.Properties.Type.eq(1), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
                    } else {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(goodInfo.getId()), CommitOrderTempInfoDao.Properties.RealAmt.eq(goodInfo.getRealAmt()), CommitOrderTempInfoDao.Properties.Type.eq(1), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
                    }
                    if (qb.unique() != null) {
                        CommitOrderTempInfo unique = (CommitOrderTempInfo) qb.unique();
                        unique.setNum(unique.getNum() + num);
                        unique.setUserId(employeeInfo.getId());
                        unique.setUserName(employeeInfo.getName());
                        unique.setVipPrice(goodInfo.getVipPrice());
                        commitOrderTempInfoDao.update(unique);
                    } else {
                        CommitOrderTempInfo entity = new CommitOrderTempInfo();
                        entity.setId(goodInfo.getId());
                        entity.setUserId(employeeInfo.getId());
                        entity.setUserName(employeeInfo.getName());
                        entity.setType(1);
                        entity.setNum(num);
                        entity.setName(goodInfo.getName());
                        entity.setIcon(goodInfo.getImgpath());
                        entity.setUnit(goodInfo.getUnit());
                        entity.setIsPromotion(goodInfo.getIsPromotion());
                        if (Constants.is_promotion == goodInfo.getIsPromotion()) {
                            entity.setPromotionAmt(goodInfo.getPromotionAmt());
                        }
                        entity.setRealAmt(goodInfo.getRealAmt());
                        entity.setPrice(goodInfo.getRealAmt());
                        entity.setIsGift(isGift);
                        entity.setVipPrice(goodInfo.getVipPrice());
                        commitOrderTempInfoDao.insert(entity);
                    }
                    goodInfo.setRealAmt(originalGoodsRealAmt);
                    if (mRxManager == null) {
                        mRxManager = new RxManager();
                    }
                    mRxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                    showToast(mActivity, "加入购物车成功");
                }

                @Override
                public void onClickServiceConfirm(ServiceInfo serviceInfo, EmployeeInfo employeeInfo, int num,int isGift) {

                }
            });
        }
        mDialog.setModel(goodInfo);
        mDialog.hideEt();
        mDialog.show();
    }


    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            if (fristCome) {
                isLoadingVisible.set(true);
            }
            getDataList();
        } else {//无网显示断网连接
            showToast(mActivity, Constants.network_error_warn);
            afterRefreshAndLoadMoreFailed(mBinding.recyclerView, loadMoreFooterView);
        }
    }

    public void getDataList() {
        Map<String, String> params = new HashMap<>();
        if (Constants.intent_form_shangpin_cuxiaoliebiao == mSearchFromIntent) {//从商品促销列表进来
            params.put("typeId", mId + "");
            params.put("start", startHttp + "");
            params.put("isPromotion", "1");
        } else if (Constants.intent_form_shangpin_cuxiaoshezhi == mSearchFromIntent) {//从商品促销设置进来
            params.put("typeId", mId + "");
            params.put("start", startHttp + "");
        } else if (Constants.intent_form_shangpin_kucunliebiao == mSearchFromIntent) {//从商品库存列表进来
            params.put("typeId", mId + "");
            params.put("start", startHttp + "");
        } else if (Constants.intent_form_shangpin_rukuliebiao == mSearchFromIntent) {//从商品入库列表进来
            params.put("typeId", mId + "");
            params.put("start", startHttp + "");
        } else if (Constants.intent_form_shangpin_chukuliebiao == mSearchFromIntent) {//从商品出库列表进来
            params.put("typeId", mId + "");
            params.put("start", startHttp + "");
        } else {
            params.put("typeId", mId + "");
            params.put("start", startHttp + "");
        }
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mListClient.reqApi("getGoods", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<GoodInfo> result) {
                        if (result.isSuccess()) {
                            Log.i("info","加载商品数据");
                            List<GoodInfo> data = result.getData();
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

    public void reset() {
        if (mListClient != null) {
            mListClient.reset();
            mListClient = null;
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
