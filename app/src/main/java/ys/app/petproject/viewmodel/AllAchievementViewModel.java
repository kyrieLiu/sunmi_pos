package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.view.View;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.AllAchievementActivity;
import ys.app.petproject.activity.TransactionDetailActivity;
import ys.app.petproject.adapter.TransactionAllAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ActivityAllAchievementBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.utils.DateUtil;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.FullyLinearLayoutManager;
import ys.app.petproject.widget.timeselector.TimeSelector;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;

/**
 * Created by aaa on 2017/7/11.
 */

public class AllAchievementViewModel extends BaseActivityViewModel {
    private final AllAchievementActivity mActivity;
    private final ActivityAllAchievementBinding mBinding;
    public ObservableField<String> obCostBeginDate = new ObservableField<>(DateUtil.longFormatDate(new Date().getTime()));
    public ObservableField<String> obCostEndDate = new ObservableField<>(DateUtil.longFormatDate(new Date().getTime()));
    private final ApiClient<BaseListResult<OrderInfo>> mListClient;
    private TransactionAllAdapter mTransactionAdapter;
    private String mStartTime;
    private String mEndTime;
    private List<OrderInfo> orderList;
    private RxManager rxManager;

    public AllAchievementViewModel(AllAchievementActivity activity, ActivityAllAchievementBinding binding) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.mListClient = new ApiClient<BaseListResult<OrderInfo>>();
        init();
    }

    private void init() {

        mTransactionAdapter = new TransactionAllAdapter(mActivity);
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
            getTransactionList();
        } else {//无网显示断网连接
            mActivity.showToast(Constants.network_error_warn);
            isNetWorkErrorVisible.set(true);
        }
    }

    @Override
    public void reloadData(View view) {
        super.reloadData(view);
        loadHttpData();
    }

    private void getTransactionList() {
        isLoadingVisible.set(true);
        isNoneDataVisible.set(false);
        isNetWorkErrorVisible.set(false);
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("type", "1");
        params.put("beginTime", obCostBeginDate.get());
        params.put("endTime", obCostEndDate.get());
        params.put("limit", "1000");
        mListClient.reqLongTimeApi("queryOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<OrderInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<OrderInfo> result) {
                        isLoadingVisible.set(false);
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
                    }
                });
    }


    public void costBeginDateTimeClick() {
        mStartTime = DateUtil.getPreviousSixMonth();
        mEndTime = DateUtil.longFormatDate2(System.currentTimeMillis());
        TimeSelector timeSelector = new TimeSelector(mActivity, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                obCostBeginDate.set(time);
                getTransactionList();
            }
        }, "2017-01-01 00:00:00", mEndTime);
        timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
        timeSelector.show();
    }

    public void costEndDateTimeClick() {
        mStartTime = DateUtil.getPreviousSixMonth();
        mEndTime = DateUtil.longFormatDate2(System.currentTimeMillis());
        TimeSelector timeSelector = new TimeSelector(mActivity, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                obCostEndDate.set(time);
                getTransactionList();
            }
        }, "2017-01-01 00:00:00", mEndTime);
        timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
        timeSelector.show();
    }

    private void setOrderData(List<OrderInfo> data) {
        if (data.size()<=0){
            isNoneDataVisible.set(true);
            return;
        }
        orderList=data;
        mTransactionAdapter.setList(data);

    }
    public void clear(){
        if (rxManager!=null){
            rxManager.clear();
            rxManager=null;
        }
    }
}
