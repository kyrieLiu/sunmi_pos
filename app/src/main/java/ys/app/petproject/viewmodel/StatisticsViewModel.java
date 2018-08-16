package ys.app.petproject.viewmodel;

import android.databinding.ObservableField;
import android.os.Build;
import android.support.v7.widget.GridLayoutManager;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.StatisticsActivity;
import ys.app.petproject.adapter.GoodsOrServiceStatisticsAdapter;
import ys.app.petproject.adapter.PayMethodStatisticsAdapter;
import ys.app.petproject.databinding.ActivityStatisticsBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.itemmodel.DailySettlementBean;
import ys.app.petproject.model.BaseDataResult;
import ys.app.petproject.model.StatisticsDataInfo;
import ys.app.petproject.shangmi.printer.AidlUtil;
import ys.app.petproject.shangmi.printer.BlueToothPrintUtil;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.DateUtil;
import ys.app.petproject.utils.NetWorkUtil;

/**
 * Created by aaa on 2017/6/7.
 */
public class StatisticsViewModel extends BaseActivityViewModel {
    private StatisticsActivity mActivity;
    private ActivityStatisticsBinding mBinding;
    private ApiClient<BaseDataResult<StatisticsDataInfo>> mClient;
    private ApiClient<BaseDataResult<DailySettlementBean>> orderClient;
    private GoodsOrServiceStatisticsAdapter adapter1;
    private PayMethodStatisticsAdapter adapter2;
    public ObservableField<String> obTotalAmt = new ObservableField<>();
    public ObservableField<String> obChargeAmt = new ObservableField<>();
    public ObservableField<String> obVipAmt = new ObservableField<>();


    public StatisticsViewModel(StatisticsActivity activity, ActivityStatisticsBinding mBinding) {
        this.mActivity = activity;
        this.mBinding = mBinding;
        this.mClient = new ApiClient<>();
        orderClient=new ApiClient<>();
        loadHttpData();
    }

    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            if (firstCome) {
                isLoadingVisible.set(true);
            }
            getDataHttp();
        } else {//无网显示断网连接
            mActivity.showToast(Constants.network_error_warn);
        }
    }

    private void getDataHttp() {
        Map<String, String> parmas = new HashMap<>();
        parmas.put("branchId",SpUtil.getBranchId()+"");
        parmas.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        parmas.put("beginTime", DateUtil.longFormatDate(new Date().getTime()));
        mActivity.showRDialog();
        mClient.reqApi("queryStatistics", parmas, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseDataResult<StatisticsDataInfo>>() {
                    @Override
                    public void onSuccess(BaseDataResult<StatisticsDataInfo> result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            StatisticsDataInfo data = result.getData();
                            StatisticsDataInfo.ProductTypeListBean bean = new StatisticsDataInfo.ProductTypeListBean();
                            bean.setTotalAmt(data.getRealAmt());
                            bean.setName("商品");
                            data.getProductTypeList().add(0, bean);

                            StatisticsDataInfo.PayMethodListBean methodBean=new StatisticsDataInfo.PayMethodListBean();
                            methodBean.setName("充值流水");
                            methodBean.setTotalAmt(data.getRechargeAmt());
                            data.getPayMethodList().add(methodBean);
                            setData(data);
                        } else {
                            mActivity.showToast(result.getErrorCode());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                        Toast.makeText(mActivity,"网络异常,请检查网络",Toast.LENGTH_SHORT).show();
                    }
                });
    }


    private void setData(StatisticsDataInfo data) {
        List<StatisticsDataInfo.ProductTypeListBean> productTypeList = data.getProductTypeList();
        adapter1 = new GoodsOrServiceStatisticsAdapter(mActivity, productTypeList);
        mBinding.recyclerView1.setLayoutManager(new GridLayoutManager(mActivity, 2));
        mBinding.recyclerView1.setAdapter(adapter1);

        List<StatisticsDataInfo.PayMethodListBean> payMethodListBeanList=data.getPayMethodList();
        adapter2 = new PayMethodStatisticsAdapter(mActivity, payMethodListBeanList);
        mBinding.recyclerView2.setLayoutManager(new GridLayoutManager(mActivity, 2));
        mBinding.recyclerView2.setAdapter(adapter2);

        BigDecimal totalMoney=new BigDecimal(0);
        if (productTypeList != null && !productTypeList.isEmpty()) {
            for (StatisticsDataInfo.ProductTypeListBean bean : productTypeList) {
                totalMoney=add(totalMoney,bean.getTotalAmt());
            }
        }
        obTotalAmt.set(AppUtil.formatStandardMoney(totalMoney.doubleValue()) + " 元");

        BigDecimal rechargeTotalMoney=new BigDecimal(0);
        if (payMethodListBeanList != null && !payMethodListBeanList.isEmpty()) {
            for (int i=0;i<payMethodListBeanList.size();i++) {
                StatisticsDataInfo.PayMethodListBean bean=payMethodListBeanList.get(i);
                if (i==payMethodListBeanList.size()-1){//最后一项为充值金额
                    obVipAmt.set("充值金额 "+ AppUtil.formatStandardMoney(bean.getTotalAmt()) + " 元");
                }else{
                    rechargeTotalMoney=add(rechargeTotalMoney,bean.getTotalAmt());
                }
            }
        }
        obChargeAmt.set("今日流水 "+AppUtil.formatStandardMoney(rechargeTotalMoney.doubleValue()) + " 元");


    }
    public BigDecimal add(BigDecimal b1, double v2) {
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }
    public void printOrder(){
        Map<String, String> parmas = new HashMap<>();
        parmas.put("branchId",SpUtil.getBranchId()+"");
        parmas.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        mActivity.showRDialog();
        orderClient.reqApi("selectSettlementByDay", parmas, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseDataResult<DailySettlementBean>>() {
                    @Override
                    public void onSuccess(BaseDataResult<DailySettlementBean> result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            if ("M1".equals(Build.MODEL)){
                                BlueToothPrintUtil.getInstance().printDailySettlement(result.getData());
                            }else{
                                AidlUtil.getInstance().printDailySettlement(result.getData());
                            }
                        } else {
                            mActivity.showToast(result.getErrorCode());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                        Toast.makeText(mActivity,"网络异常,请检查网络",Toast.LENGTH_SHORT).show();
                    }
                });
    }
    public void clear(){
        mClient.reset();
        mClient=null;
        orderClient.reset();
        orderClient=null;
    }
}
