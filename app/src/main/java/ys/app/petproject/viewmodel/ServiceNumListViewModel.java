package ys.app.petproject.viewmodel;

import android.app.Activity;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.Window;

import com.greendao.CommitOrderTempInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.adapter.ServiceNumCardAdapter;
import ys.app.petproject.adapter.ServiceNumCardChildAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.FragmentServiceNumListBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.ServiceNumListFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.itemmodel.CardNumberList2Bean;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.NumCardListInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.dialog.AddDialog;

/**
 * Created by aaa on 2017/7/13.
 */

public class ServiceNumListViewModel extends BaseFragmentViewModel {

    private final FragmentServiceNumListBinding mBinding;
    private final int mSearchFromIntent;
    private Activity mActivity;
    private ServiceNumCardChildAdapter mAdapter;
    private ApiClient<BaseListResult<ServiceInfo>> mClient;
    private ApiClient<BaseListResult<NumCardListInfo>> cardClient;
    private RxManager rxManager;
    private AddDialog mDialog;
    private RxManager mRxManager;
    private ServiceNumCardAdapter cardAdapter;
    public ObservableBoolean showCard=new ObservableBoolean(true);
    public ObservableField<String> cardName=new ObservableField<String>();
    private List<NumCardListInfo> numCardListInfoList;
    private NumCardListInfo numCardInfo;



    public ServiceNumListViewModel(ServiceNumListFragment fragment, FragmentServiceNumListBinding mBinding, ServiceTypeInfo info, int searchFromIntent) {
        this.mActivity = fragment.getActivity();
        this.mBinding = mBinding;
        this.mSearchFromIntent = searchFromIntent;
        this.mClient = new ApiClient<>();
        cardClient=new ApiClient<>();

    }

    @Override
    public void reloadData(View view) {
        loadHttpData();
    }




    public void init() {

        mAdapter = new ServiceNumCardChildAdapter(mActivity);
        mBinding.rvNumServiceList.setLayoutManager(new GridLayoutManager(mActivity, 2));
        mBinding.rvNumServiceList.setAdapter(mAdapter);


        mAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (Constants.intent_form_fuwu_goumai == mSearchFromIntent) {//添加购物车
                    CardNumberList2Bean service=mAdapter.getList().get(position);

                    showDialog(service);
                }

            }
        });
        cardAdapter = new ServiceNumCardAdapter(mActivity);
        mBinding.rvNumCardList.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.rvNumCardList.setAdapter(cardAdapter);
        cardAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                showCard.set(false);
                numCardInfo = numCardListInfoList.get(position);
                List<CardNumberList2Bean> list= numCardInfo.getCardNumberList2();
                mAdapter.setList(list);
                cardName.set("卡片名称: "+numCardInfo.getName());
            }
        });
        loadHttpData();
    }



    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            if (fristCome) {
                isLoadingVisible.set(true);
            }
            loadCardList();
        } else {//无网显示断网连接
            showToast(mActivity, Constants.network_error_warn);
            afterRefreshFailed(mBinding.rvNumServiceList);
        }
    }
    public void loadCardList(){
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("limit","100");

        cardClient.reqApi("selectVipCardNumber", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<NumCardListInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<NumCardListInfo> result) {
                        if (result.isSuccess()) {
                            numCardListInfoList = result.getData();
                            cardAdapter.setList(numCardListInfoList);
                            afterRefreshSuccess(mBinding.rvNumCardList, numCardListInfoList);
                        } else {
                            showToast(mActivity, result.getErrorCode());
                            afterRefreshFailed(mBinding.rvNumCardList);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        afterRefreshFailed(mBinding.rvNumCardList);
                    }
                });
    }



    private void showDialog(CardNumberList2Bean info) {
        if (mDialog == null) {
            mDialog = new AddDialog(mActivity);
            Window window = mDialog.getWindow();
            window.setWindowAnimations(R.style.ThemeCustomDialog_Animation);
            mDialog.setNumServiceListner(new AddDialog.OnClickNumConfirmListener() {
                @Override
                public void onClickNumServiceConfirm(CardNumberList2Bean serviceInfo, EmployeeInfo employeeInfo, int num, int isGift) {
                    CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                    QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                    qb.where(CommitOrderTempInfoDao.Properties.Id.eq(serviceInfo.getProductId()), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift), CommitOrderTempInfoDao.Properties.Type.eq(3), CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
                    if (qb.unique() != null) {
                        CommitOrderTempInfo unique = (CommitOrderTempInfo) qb.unique();
                        unique.setNum(unique.getNum() + num);
                        unique.setUserId(employeeInfo.getId());
                        unique.setUserName(employeeInfo.getName());
                        commitOrderTempInfoDao.update(unique);
                    } else {
                        CommitOrderTempInfo entity = new CommitOrderTempInfo();
                        entity.setId(serviceInfo.getProductId());
                        entity.setUserId(employeeInfo.getId());
                        entity.setUserName(employeeInfo.getName());
                        entity.setType(3);
                        entity.setNum(num);entity.setTypeName(numCardInfo.getName());
                        entity.setName(serviceInfo.getProductName());
                        entity.setRealAmt(serviceInfo.getRealAmt());
                        entity.setPrice(serviceInfo.getRealAmt());
                        entity.setIsGift(isGift);
                        entity.setCardID(serviceInfo.getCardId());
                        commitOrderTempInfoDao.insert(entity);
                    }
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
        mDialog.setCanModifyPrice(false);//不能修改价格
        mDialog.show();
    }


    public void showCardList(){
        showCard.set(true);
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
    }
}
