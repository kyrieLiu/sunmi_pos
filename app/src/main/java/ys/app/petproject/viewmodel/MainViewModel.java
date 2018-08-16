package ys.app.petproject.viewmodel;

import android.content.Context;

import com.greendao.AnimalTypeClassifyInfoDao;
import com.greendao.AnimalTypeInfoDao;
import com.greendao.BackGoodsReasonInfoDao;
import com.greendao.EmployeeInfoDao;
import com.greendao.GoodTypeInfoDao;
import com.greendao.ServiceTypeInfoDao;
import com.greendao.VipCardInfoDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.SpUtil;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.AnimalTypeClassifyInfo;
import ys.app.petproject.model.AnimalTypeInfo;
import ys.app.petproject.model.BackGoodsReasonInfo;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.model.VipCardInfo;


/**
 * Created by lyy on 2017/2/14 16:27.
 * email：2898049851@qq.com
 */

public class MainViewModel extends BaseActivityViewModel {

    private final ApiClient<BaseListResult<ServiceTypeInfo>> mServiceTypeClient;
    private final ApiClient<BaseListResult<EmployeeInfo>> mEmployeeListClient;
    private final ApiClient<BaseListResult<BackGoodsReasonInfo>> mBackReasonClient;
    private Context mContext;
    private ApiClient<BaseListResult> mClient;
    private ApiClient<BaseListResult<VipCardInfo>> mVipCardClient;
    private ApiClient<BaseListResult<AnimalTypeInfo>> mAnimalTypeClient;

    public MainViewModel(Context context) {

        this.mContext = context;
        this.mClient = new ApiClient<>();
        this.mServiceTypeClient = new ApiClient<>();
        this.mVipCardClient = new ApiClient();
        this.mAnimalTypeClient = new ApiClient();
        this.mEmployeeListClient = new ApiClient();
        this.mBackReasonClient = new ApiClient<BaseListResult<BackGoodsReasonInfo>>();
    }


    public void getGoodsTypeHttp() {

        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mClient.reqApi("goodsType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult>() {
                    @Override
                    public void onSuccess(BaseListResult result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            GoodTypeInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getGoodTypeInfoDao();
                            List<GoodTypeInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (GoodTypeInfo info : list) {
                                    info.setRequestTime(nowTime);
                                }
                            }
                            dao.deleteAll();
                            dao.insertInTx(list);
                        }
                    }
                })
                .updateUI(new Callback<BaseListResult>() {
                    @Override
                    public void onSuccess(BaseListResult result) {
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }

    public void getServiceTypeHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mServiceTypeClient.reqApi("serviceType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult<ServiceTypeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceTypeInfo> result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            ServiceTypeInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getServiceTypeInfoDao();
                            List<ServiceTypeInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (ServiceTypeInfo info : list) {
                                    info.setRequestTime(nowTime);
                                }
                            }
                            dao.deleteAll();
                            dao.insertInTx(list);
                        }
                    }
                })
                .updateUI(new Callback<BaseListResult<ServiceTypeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceTypeInfo> info) {
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }


    public void getVipCardHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("limit","100");
        params.put("isClassification","0");

        mVipCardClient.reqApi("queryVipList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult<VipCardInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipCardInfo> result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            VipCardInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getVipCardInfoDao();
                            List<VipCardInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (VipCardInfo info : list) {
                                    info.setRequestTime(nowTime);
                                }
                            }
                            dao.deleteAll();
                            dao.insertInTx(list);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                }).updateUI(new Callback<BaseListResult<VipCardInfo>>() {
            @Override
            public void onSuccess(BaseListResult<VipCardInfo> vipCardInfoBaseListResult) {

            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }
        });
    }


    public void getAnimalTypeHttp() {
        Map<String, String> params = new HashMap<>();

        mAnimalTypeClient.reqApi("queryAnimalType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult<AnimalTypeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<AnimalTypeInfo> result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            AnimalTypeInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getAnimalTypeInfoDao();
                            AnimalTypeClassifyInfoDao infoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getAnimalTypeClassifyInfoDao();
                            List<AnimalTypeInfo> list = result.getData();
                            dao.deleteAll();
                            infoDao.deleteAll();
                            if (list != null && !list.isEmpty()) {
                                for (AnimalTypeInfo info : list) {
                                    info.setRequestTime(nowTime);
                                    List<AnimalTypeClassifyInfo> varietiesList = info.getVarietiesList();
                                    if (varietiesList != null && !varietiesList.isEmpty()) {
                                        for (AnimalTypeClassifyInfo info1 : varietiesList){
                                            info1.setRequestTime(nowTime);
                                        }
                                        infoDao.insertInTx(varietiesList);
                                    }
                                }
                            }
                            dao.insertInTx(list);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }

                }).updateUI(new Callback<BaseListResult<AnimalTypeInfo>>() {
            @Override
            public void onSuccess(BaseListResult<AnimalTypeInfo> animalTypeInfoBaseListResult) {

            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }
        });
    }


    public void getEmployeeListHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mEmployeeListClient.reqApi("queryEmployeeList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult<EmployeeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<EmployeeInfo> result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            EmployeeInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getEmployeeInfoDao();
                            List<EmployeeInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (EmployeeInfo info : list) {
                                    info.setRequestTime(nowTime);
                                }
                            }
                            dao.deleteAll();
                            dao.insertInTx(list);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }

                })
                .updateUI(new Callback<BaseListResult<EmployeeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<EmployeeInfo> result) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }


    /**
     * 退货原因
     */
    public void getBackReasonHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mBackReasonClient.reqApi("backReasonList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .saveData(new Callback<BaseListResult<BackGoodsReasonInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<BackGoodsReasonInfo> result) {
                        if (result.isSuccess()) {
                            long nowTime = System.currentTimeMillis();
                            BackGoodsReasonInfoDao dao = GreenDaoUtils.getSingleTon().getmDaoSession().getBackGoodsReasonInfoDao();
                            List<BackGoodsReasonInfo> list = result.getData();
                            if (list != null && !list.isEmpty()) {
                                for (BackGoodsReasonInfo info : list) {
                                    info.setRequestTime(nowTime);
                                }
                            }
                            dao.deleteAll();
                            dao.insertInTx(list);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }

                })
                .updateUI(new Callback<BaseListResult<BackGoodsReasonInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<BackGoodsReasonInfo> result) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }


    public void destroy() {
        mClient.reset();
        mClient = null;
        mContext = null;
    }
}
