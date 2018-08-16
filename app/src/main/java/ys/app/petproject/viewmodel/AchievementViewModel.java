package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableDouble;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.AchievementActivity;
import ys.app.petproject.activity.AllAchievementActivity;
import ys.app.petproject.activity.TransactionDetailActivity;
import ys.app.petproject.adapter.TransactionAdapter;
import ys.app.petproject.adapter.manage.EmployeeNameNewAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ActivityAchievementBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.utils.DateUtil;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.FullyLinearLayoutManager;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;

/**
 * Created by aaa on 2017/6/7.
 */

public class AchievementViewModel extends BaseActivityViewModel {

    private final AchievementActivity mActivity;
    private final ActivityAchievementBinding mBinding;
    private final ApiClient<BaseListResult<OrderInfo>> mListClient;
    private final ApiClient<BaseListResult<EmployeeInfo>> mClient;
    private EmployeeNameNewAdapter mAdapter;
    private TransactionAdapter mTransactionAdapter;
    public ObservableDouble orderMoney=new ObservableDouble(0);
    private RxManager rxManager;
    private List<OrderInfo> orderList;


    public AchievementViewModel(AchievementActivity activity, ActivityAchievementBinding mBinding) {
        this.mActivity = activity;
        this.mBinding = mBinding;
        this.mListClient = new ApiClient<BaseListResult<OrderInfo>>();
        this.mClient = new ApiClient<BaseListResult<EmployeeInfo>>();
    }

    public void init() {

        mBinding.scrollView.setNestedScrollingEnabled(false);

        mAdapter = new EmployeeNameNewAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity, 4));
        mBinding.recyclerView.setAdapter(mAdapter);


        mTransactionAdapter = new TransactionAdapter(mActivity);
        mBinding.recyclerView2.setLayoutManager(new FullyLinearLayoutManager(mActivity));
        mBinding.recyclerView2.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division_line));
        mBinding.recyclerView2.setAdapter(mTransactionAdapter);
        mTransactionAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                OrderInfo model=orderList.get(position);
                Intent intent = new Intent(mActivity,TransactionDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(Constants.intent_transaction,model);
                intent.putExtras(bundle);
                mActivity.startActivity(intent);
            }
        });

        if (rxManager==null){
            rxManager=new RxManager();
        }
        rxManager.on(Constants.type_today_achivement, new Action1<Integer>() {
            @Override
            public void call(Integer action) {
                if (action==0){
                    orderList.clear();
                    mTransactionAdapter.setList(orderList);
                    getTransactionList();
                }
            }
        });
        loadHttpData();
    }

    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            getDataList();
            getTransactionList();
        } else {//无网显示断网连接
            mActivity.showToast(Constants.network_error_warn);
            isNetWorkErrorVisible.set(true);
        }
    }

    private void getTransactionList() {
        isLoadingVisible.set(true);
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("type", "1");
        params.put("limit","1000");
        params.put("beginTime", DateUtil.longFormatDate(new Date().getTime()));
        mActivity.showRDialog();
        mListClient.reqApi("queryOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<OrderInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<OrderInfo> result) {
                        isLoadingVisible.set(false);
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            setOrderData(result.getData());
                        } else {
                            isNetWorkErrorVisible.set(true);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                        super.onError(e);
                        mActivity.hideRDialog();
                    }
                });
    }

    private void getDataList() {
        isLoadingVisible.set(true);
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("limit","1000");
        mClient.reqApi("queryEmployeeList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<EmployeeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<EmployeeInfo> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            setData(result.getData());
                        } else {
                            isNetWorkErrorVisible.set(true);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                        super.onError(e);
                    }
                });
    }



    private void setData(List<EmployeeInfo> data) {
        mAdapter.setList(data);
    }

    private void setOrderData(List<OrderInfo> data) {
        mTransactionAdapter.setList(data);
        orderList=data;
        BigDecimal totalMoney=new BigDecimal(0);
        for (OrderInfo info:data){
            totalMoney=add(totalMoney,info.getRealAmt());
        }
        orderMoney.set(totalMoney.doubleValue());
    }

    public BigDecimal add(BigDecimal b1, double v2) {
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }


    public void  onClickSeeMore(View view){
        mActivity.turnToActivity(AllAchievementActivity.class);
    }

    public void clear(){
        if (rxManager!=null){
            rxManager.clear();
            rxManager=null;
        }
    }
}
