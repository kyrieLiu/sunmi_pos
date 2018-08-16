package ys.app.petproject.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.android.databinding.library.baseAdapters.BR;
import com.greendao.CommitOrderTempInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.widget.dialog.CustomDialog;

/**
 * Created by aaa on 2017/4/26.
 */

public class Order2ItemViewModel extends BaseObservable {
    private  int mPosition;
    private OrderInfo model;
    private BaseActivity mActivity;
    public ObservableField<String> price = new ObservableField<>();
    public ObservableField<String> vipPrice = new ObservableField<>();
    private CustomDialog mDialog;
    private ApiClient<BaseResult> mClient;
    private RxManager mRxManager;
    private CommitOrderTempInfoDao commitOrderTempInfoDao;
    private CustomDialog customDialog;

    public Order2ItemViewModel(int position, OrderInfo model, BaseActivity activity) {
        this.mPosition = position;
        this.model = model;
        this.mActivity = activity;
        this.mClient = new ApiClient<>();
    }


    @Bindable
    public OrderInfo getModel() {
        return model;
    }

    public void setModel(OrderInfo model,int mPosition) {
        this.mPosition=mPosition;
        this.model = model;

        notifyPropertyChanged(BR.model);
    }

    public void clickOpenOrClose(View v) {
        model.setExpand(!model.isExpand());
        if (model.getIsClick() == -1) {
            model.setClick(0);
        } else if (model.getIsClick() == 0) {
            model.setClick(1);
        } else if (model.getIsClick() == 1) {
            model.setClick(0);
        }
    }

    public void clickPay(View v) {

        Map<String, String> params = new HashMap<>();
        params.put("branchId", SpUtil.getBranchId()+"");
        params.put("orderId", model.getOrderNo());
        params.put("type", "4");
        mActivity.showRDialog();
        mClient.reqApi("updateOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {

                        if (info.isSuccess()) {
                            CollectMoneyViewModel.orderNums.add(model.getOrderNo());
                            getOrder();

                        } else {
                            mActivity.showToast(info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                    }
                });


    }

    /**
     * 删除订单
     *
     * @param v
     */
    public void clickDeleteButton(View v) {
        showDeleteDialog();
    }

    private void showDeleteDialog() {
        if (mDialog == null) {
            mDialog = new CustomDialog(mActivity);
            mDialog.setContent("确认删除吗?");
            mDialog.setCancelVisiable();
            mDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mDialog.dismiss();
                    deleteHttp();
                }
            });

        }
        mDialog.show();
    }


    private void deleteHttp() {
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("branchId", SpUtil.getBranchId()+"");
        params.put("orderId", model.getOrderNo());
        params.put("type", "4");

        mClient.reqApi("updateOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {
                        mActivity.hideRDialog();
                        if (info.isSuccess()) {
                            if (mRxManager == null) {
                                mRxManager = new RxManager();
                            }
                            mRxManager.post(Constants.bus_type_delete_position, mPosition);
                        } else {
                            mActivity.showToast(info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                    }
                });
    }

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mActivity.hideRDialog();
            if (mRxManager == null) {
                mRxManager = new RxManager();
            }
            mRxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
            mActivity.finish();
        }
    };
    /**
     * 取单
     */
    private void getOrder(){
        commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
        if (model.getVipUserId()>0){
            QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
            qb.where(CommitOrderTempInfoDao.Properties.VipUserId.eq(model.getVipUserId()));
            if (qb.list().size()==0){
                insertNormalCar();
            }else{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        insertVipOrderShopCar();
                        handler.sendEmptyMessage(0);
                    }
                }).start();
            }
        }else{
            insertNormalCar();
        }

    }
    //订单为会员有多个订单时候需要合并
    private void insertVipOrderShopCar(){
        List<OrderInfo.OrderDetailedListBean> orderDetailedList=model.getOrderDetailedList();

        for (OrderInfo.OrderDetailedListBean bean:orderDetailedList){
            QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
            int type=bean.getType(),isPromotion=bean.getIsPromotion(),id=bean.getId(),userId=bean.getUserId();
            if (bean.getIsClassification() ==0) {
                if (Constants.is_promotion == isPromotion) {
                    qb.where(CommitOrderTempInfoDao.Properties.Id.eq(bean.getProductId()), CommitOrderTempInfoDao.Properties.PromotionAmt.eq(bean.getPromotionPrice()), CommitOrderTempInfoDao.Properties.Type.eq(type), CommitOrderTempInfoDao.Properties.IsGift.eq(bean.getIsGift()));
                } else {
                    qb.where(CommitOrderTempInfoDao.Properties.Id.eq(bean.getProductId()), CommitOrderTempInfoDao.Properties.RealAmt.eq(bean.getPrice()), CommitOrderTempInfoDao.Properties.Type.eq(type), CommitOrderTempInfoDao.Properties.IsGift.eq(bean.getIsGift()));
                }
            } else {
                qb.where(CommitOrderTempInfoDao.Properties.Id.eq(bean.getProductId()), CommitOrderTempInfoDao.Properties.Type.eq(3));
            }
            CommitOrderTempInfo entity;
            if (qb.unique() != null) {
                entity = (CommitOrderTempInfo) qb.unique();
                entity.setNum(entity.getNum() +bean.getCount());
                commitOrderTempInfoDao.update(entity);
            } else {
                entity=creatEntity(bean);
                commitOrderTempInfoDao.insert(entity);
            }
        }
    }
    //订单为普通订单或者该会员的第一个订单
    private void insertNormalCar(){
        List<CommitOrderTempInfo> list=commitOrderTempInfoDao.loadAll();
        if (list.size()>0){
            if (customDialog==null){
                customDialog = new CustomDialog(mActivity);
                customDialog.setContent("购物车内已有商品,确定清空购物车取单?");
            }
            TextView mCancelTv = (TextView)customDialog.findViewById(R.id.cancel_tv);
            mCancelTv.setVisibility(View.VISIBLE);
            mCancelTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    customDialog.dismiss();
                    mActivity.hideRDialog();
                }
            });
            customDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    customDialog.dismiss();
                    commitOrderTempInfoDao.deleteAll();
                    insertDataToShopCar();
                }
            });
            customDialog.show();
        }else{
            insertDataToShopCar();
        }
    }
    private void insertDataToShopCar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<OrderInfo.OrderDetailedListBean> orderDetailedList=model.getOrderDetailedList();
                for (OrderInfo.OrderDetailedListBean bean:orderDetailedList){
                    CommitOrderTempInfo entity=creatEntity(bean);
                    commitOrderTempInfoDao.insert(entity);
                }
                handler.sendEmptyMessage(0);
            }
        }).start();
    }

    /**
     * 创建需要存储的对象
     */
    private CommitOrderTempInfo creatEntity(OrderInfo.OrderDetailedListBean bean){
        CommitOrderTempInfo entity = new CommitOrderTempInfo();
        entity.setId(bean.getProductId());
        entity.setUserId(bean.getUserId());
        entity.setUserName(bean.getUserName());
        entity.setNum(bean.getCount());
        //0:折扣卡 1:次卡 2:纯折扣卡 3:生日折扣卡
        if (bean.getIsClassification()!=1){
            entity.setType(bean.getType());
        }else{
            entity.setType(3);
            entity.setTypeName("次卡");
        }
        entity.setName(bean.getName());
        entity.setIcon(bean.getImg());
        entity.setVipUserId(model.getVipUserId());
        entity.setIsPromotion(bean.getIsPromotion());
        if (Constants.is_promotion == bean.getIsPromotion()) {
            entity.setPromotionAmt(bean.getPromotionPrice());
            entity.setRealAmt(bean.getPromotionPrice());
        }else{
            entity.setCardID(model.getCardId());
            entity.setRealAmt(bean.getPrice());
        }
        entity.setPrice(bean.getPrice());
        entity.setIsGift(bean.getIsGift());
        entity.setOrderType(1);//取单
        return entity;
    }
}
