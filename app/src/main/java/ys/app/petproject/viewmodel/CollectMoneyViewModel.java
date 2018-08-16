package ys.app.petproject.viewmodel;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.greendao.CommitOrderTempInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.AddGoodsActivity;
import ys.app.petproject.activity.CollectMoneyActivity;
import ys.app.petproject.activity.CommitOrderActivity;
import ys.app.petproject.activity.PayListActivity;
import ys.app.petproject.adapter.ProductAdapter;
import ys.app.petproject.adapter.SearchGoodsAdapter;
import ys.app.petproject.adapter.SearchServiceAdapter;
import ys.app.petproject.adapter.SelectSimpleAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ActivityCollectMoneyBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.SelectInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widget.MyListView;
import ys.app.petproject.widget.dialog.AddDialog;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.dialog.CustomerTypeDialog;
import ys.app.petproject.widget.dialog.SearchDialog;
import ys.app.petproject.widget.dialog.SelectDialog;

/**
 * Created by aaa on 2017/3/15.
 */

public class CollectMoneyViewModel extends BaseActivityViewModel {
    private ApiClient<BaseListResult<GoodInfo>> mGoodsClient;
    private CollectMoneyActivity mActivity;
    private ActivityCollectMoneyBinding mBinding;
    private ApiClient<BaseResult> mClient;
    private CustomerTypeDialog mDialog;
    private RxManager rxManager;
    private List<CommitOrderTempInfo> commitOrderTempInfos = new ArrayList<>();
    private List<CommitOrderTempInfo> mGoodsLits = new ArrayList<>();
    private List<CommitOrderTempInfo> mProductLits = new ArrayList<>();
    private int serviceNum,goodNum;
    private double totalAmt;
    private CommitOrderTempInfoDao commitOrderTempInfoDao;
    private ProductAdapter mProductAdapter;
    private View mBottomSheet;
    private ProductAdapter mGoodsAdapter;
    private CustomDialog mBackDialog;
    private ApiClient mVipClient;
    private AddDialog mAddDialog;
    private AddDialog mServiceDialog;
    private ApiClient<BaseResult> mInsertOrderClient;
    private SearchDialog mSearchDialog;
    private RecyclerView mSearchRecyclerView;
    private int mSearchType;
    private SearchGoodsAdapter goodsAdapter;
    private SearchServiceAdapter serviceAdapter;
    private ApiClient<BaseListResult<GoodInfo>> mGoodsListClient;
    private ApiClient<BaseListResult<ServiceInfo>> mServiceListClient;
    private CustomDialog mCustomDialog;
    private boolean mIsGuadan ;
    private double vipMoney;//会员余额
    private String search_key;//搜索商品或服务的关键字
    private ImageView iv_noData;//暂无数据
    private RelativeLayout rl_progress;//网络加载等待
    private String nonMemberName ="",nonMemberPhone ="";//非会员名称,非会员电话
    private Map<String, String> params = new HashMap<>();
    private boolean haveNumService;
    private int numCardID;//次卡ID
    private VipInfo vipInfo;
    public static List<String> orderNums = new ArrayList<>();
    private VipCardInfo onlyCardInfo;

    int classification=-1;//-1是非会员,0是会员,1是次卡,2是纯折扣,4是会员使用会员价
    String url = "getOrderId";
    private int isVipPrice = 0;//在会员列表选择原价支付：0  ；会员价支付：1；


    public CollectMoneyViewModel(CollectMoneyActivity activity, ActivityCollectMoneyBinding binding, ImageView blueSearchIv) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.mClient = new ApiClient<>();
        this.mVipClient = new ApiClient();
        this.mInsertOrderClient = new ApiClient<>();
        this.mGoodsClient = new ApiClient<BaseListResult<GoodInfo>>();
        this.mGoodsListClient = new ApiClient<>();
        this.mServiceListClient = new ApiClient<>();
        registerBus();
        blueSearchIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSearchDialog();
            }
        });
    }

    private void showSearchDialog() {
        if (mSearchDialog == null) {
            mSearchDialog = new SearchDialog(mActivity);
            final EditText searchEt = (EditText) mSearchDialog.findViewById(R.id.search_et);
            final ImageView deleteTextIv = (ImageView) mSearchDialog.findViewById(R.id.delete_text_iv);
            final TextView typeTv = (TextView) mSearchDialog.findViewById(R.id.type_tv);
            TextView tv_search= (TextView) mSearchDialog.findViewById(R.id.search_tv);
            iv_noData= (ImageView) mSearchDialog.findViewById(R.id.noneDataIv);
            rl_progress= (RelativeLayout) mSearchDialog.findViewById(R.id.dialog_collect_search_progress);
            mSearchRecyclerView = (RecyclerView) mSearchDialog.findViewById(R.id.recyclerView);

            searchEt.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (editable == null) return;
                    String s = editable.toString();
                    if (!StringUtils.isEmptyOrWhitespace(s)) {

                        if (Constants.intent_type_goods == mSearchType) {
                            getSearchGoodsHttp(s);
                        } else {
                            getSearchServiceHttp(s);
                        }
                        search_key=s;
                        deleteTextIv.setVisibility(View.VISIBLE);
                    } else {
                        deleteTextIv.setVisibility(View.GONE);
                    }
                }
            });

            deleteTextIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    searchEt.setText("");
                    if (goodsAdapter != null) {
                        goodsAdapter.clearData();
                    }
                    if (serviceAdapter != null) {
                        serviceAdapter.clearData();
                    }
                }
            });

            typeTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Constants.intent_type_goods == mSearchType) {
                        typeTv.setText("服务");
                        searchEt.setHint("请输入服务名称");
                        mSearchType = Constants.intent_type_service;
                        serviceAdapter = new SearchServiceAdapter(mActivity);
                        mSearchRecyclerView.setAdapter(serviceAdapter);
                    } else {
                        typeTv.setText("商品");
                        searchEt.setHint("请输入商品名称");
                        mSearchType = Constants.intent_type_goods;
                        goodsAdapter = new SearchGoodsAdapter(mActivity);
                        mSearchRecyclerView.setAdapter(goodsAdapter);
                    }
                }
            });

            mSearchRecyclerView.setLayoutManager(new LinearLayoutManager(mActivity));

            if (mBinding.viewPager.getCurrentItem() == 0) {
                typeTv.setText("商品");
                searchEt.setHint("请输入商品名称");
                mSearchType = Constants.intent_type_goods;
                goodsAdapter = new SearchGoodsAdapter(mActivity);
                mSearchRecyclerView.setAdapter(goodsAdapter);
            } else {
                typeTv.setText("服务");
                searchEt.setHint("请输入服务名称");
                mSearchType = Constants.intent_type_service;
                serviceAdapter = new SearchServiceAdapter(mActivity);
                mSearchRecyclerView.setAdapter(serviceAdapter);
            }
            tv_search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Constants.intent_type_goods == mSearchType) {
                        if (search_key!=null&&!search_key.isEmpty()) {
                            getSearchGoodsHttp(search_key);
                        }else{
                            showToast(mActivity,"请输入商品名称");
                        }
                    } else {
                        if (search_key!=null&&!search_key.isEmpty()){
                            getSearchServiceHttp(search_key);
                        }else{
                            showToast(mActivity,"请输入服务名称");
                        }
                    }
                }
            });

            mSearchDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    searchEt.setText("");
                    if (goodsAdapter != null) {
                        goodsAdapter.clearData();
                    }
                    if (serviceAdapter != null) {
                        serviceAdapter.clearData();
                    }
                }
            });

        }

        mSearchDialog.show();


    }

    /**
     * 服务搜索
     *
     * @param s
     */
    private void getSearchServiceHttp(String s) {
        rl_progress.setVisibility(View.VISIBLE);
        params.clear();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", s);
        params.put("limit","1000");
        mServiceListClient.reqApi("queryServiceList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ServiceInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceInfo> result) {
                        rl_progress.setVisibility(View.GONE);
                        if (result.isSuccess()) {
                            List<ServiceInfo> data = result.getData();
                            if (serviceAdapter != null) {
                                serviceAdapter.setList(data);
                            }
                            if (data.size()>0){
                                iv_noData.setVisibility(View.GONE);
                            }else{
                                iv_noData.setVisibility(View.VISIBLE);
                            }
                        } else {
                            mActivity.showToast(result.getErrorCode());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        rl_progress.setVisibility(View.GONE);
                        mActivity.showToast("网络异常");
                    }
                });

    }

    /**
     * 商品搜索
     *
     * @param s
     */
    private void getSearchGoodsHttp(String s) {
        rl_progress.setVisibility(View.VISIBLE);
        params.clear();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", s);
        params.put("limit","1000");

        mGoodsListClient.reqApi("getGoods", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<GoodInfo> result) {
                        rl_progress.setVisibility(View.GONE);
                        if (result.isSuccess()) {
                            List<GoodInfo> mList = result.getData();
                            if (goodsAdapter != null) {
                                goodsAdapter.setList(mList);
                            }
                            if (mList.size()>0){
                                iv_noData.setVisibility(View.GONE);
                            }else{
                                iv_noData.setVisibility(View.VISIBLE);
                            }
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        rl_progress.setVisibility(View.GONE);
                        mActivity.showToast("网络异常");
                    }
                });

    }

    private void registerBus() {
        if (rxManager == null) {
            rxManager = new RxManager();
        }
        rxManager.on(Constants.ConfirmCheckout_PendingOrder_suc, new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                //清空数据库
                clearTempDb();
                rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
            }
        });
        rxManager.on(Constants.bus_type_info, new Action1<Object>() {
            @Override
            public void call(Object o) {
                if (o instanceof GoodInfo) {
                    showAddDialog((GoodInfo) o);
                    if (mSearchDialog != null) {
                        mSearchDialog.dismiss();
                    }
                }
                if (o instanceof ServiceInfo) {
                    showAddDialog((ServiceInfo) o);
                    if (mSearchDialog != null) {
                        mSearchDialog.dismiss();
                    }
                }
            }
        });

        rxManager.on(Constants.bus_db, new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                if (Constants.type_update_commitOrder_db == integer) {
                    if (commitOrderTempInfoDao == null) {
                        commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                    }
                    commitOrderTempInfos = commitOrderTempInfoDao.loadAll();

                    serviceNum = 0;
                    goodNum = 0;
                    totalAmt = 0.00;
                    for (CommitOrderTempInfo info : commitOrderTempInfos) {

                        if (!(1 == info.getIsGift())) {//不是赠品
                            if (info.getType() == 2) {
                                serviceNum++;
                            } else {
                                goodNum++;
                            }
                            if (Constants.is_promotion == info.getIsPromotion()) {
                                totalAmt += info.getNum() * info.getPromotionAmt();
                            } else {
                                totalAmt += info.getNum() * info.getRealAmt();
                            }
                        }
                    }

                    mBinding.moneyTv.setText(AppUtil.formatStandardMoney(totalAmt) + " 元");
                    int numTotal = serviceNum + goodNum;
                    if (numTotal < 1) {
                        mBinding.bvUnm.setVisibility(View.GONE);
                        if (0 == commitOrderTempInfos.size()) {
                            onShopCarClick();
                        }
                    } else {
                        mBinding.bvUnm.setText(serviceNum + goodNum + "");
                        mBinding.bvUnm.setVisibility(View.VISIBLE);
                    }
                } else if (Constants.type_delete_commitOrder_db == integer) {
                    if (serviceNum != 0 || goodNum != 0) {
                        mBackDialog = new CustomDialog(mActivity);
                        mBackDialog.setContent("返回后所购物品将不会保留,确定返回?");
                        mBackDialog.setCancelVisiable();
                        mBackDialog.setOkVisiable(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                resetOrder();
                            }
                        });
                        if (!mActivity.isFinishing()) {
                            mBackDialog.show();
                        }
                    } else {
                        mActivity.finish();
                    }
                }
            }
        });
        //vip使用折扣价价格逻辑
        rxManager.on(Constants.confirm_type_info, new Action1<VipInfo>() {
            @Override
            public void call(VipInfo vipInfo) {
                if (vipInfo != null){
                    isVipPrice = 0;
                    onlyCardInfo =null;
                    CollectMoneyViewModel.this.vipInfo=vipInfo;
                    vipMoney=vipInfo.getMoney();
                    commitBuyHttp();
                }
            }
        });
        //vip使用会员价逻辑
        rxManager.on(Constants.confirm_vip_info, new Action1<VipInfo>() {
            @Override
            public void call(VipInfo vipInfo) {
                if (vipInfo != null){
                    isVipPrice = 1;
                    onlyCardInfo =null;
                    CollectMoneyViewModel.this.vipInfo=vipInfo;
                    vipMoney=vipInfo.getMoney();
                    commitBuyHttp();
                }
            }
        });
    }

    //更新将取单数据恢复
    private void resetOrder() {
        if (commitOrderTempInfoDao == null) {
            commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
        }
        commitOrderTempInfoDao.deleteAll();
        mBackDialog.dismiss();
        if (orderNums.size() > 0) {
            StringBuilder orders = new StringBuilder();
            for (int i = 0; i < orderNums.size(); i++) {
                if (i < orderNums.size() - 1) {
                    orders.append(orderNums.get(i) + ",");
                } else {
                    orders.append(orderNums.get(i));
                }
            }
            params.clear();
            params.put("branchId", SpUtil.getBranchId()+"");
            params.put("orderId", orders.toString());
            params.put("type", "0");
            mClient.reqApi("updateOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                    .updateUI(new Callback<BaseResult>() {
                        @Override
                        public void onSuccess(BaseResult info) {
                            if (info.isSuccess()) {
                                //mActivity.finish();
                            } else {
                                if (mActivity!=null) mActivity.showToast(info.getErrorMessage());
                            }

                        }

                        @Override
                        public void onError(Throwable e) {
                            super.onError(e);
                        }
                    });
        }else{

        }
        mActivity.finish();


    }

    public void clickButton(View v) {

        mIsGuadan=false;
        if (commitOrderTempInfos.size() != 0) {
            if (mBinding.bottomSheetLayout.isSheetShowing()) {
                mBinding.bottomSheetLayout.dismissSheet();
            }
            checkOrderType();
        } else {
            mActivity.showToast("请添加商品或服务");
        }

    }

    public void clicGuadanButton(View v) {
        mIsGuadan=true;
        if (commitOrderTempInfoDao != null && commitOrderTempInfos.size() != 0) {
            if (mBinding.bottomSheetLayout.isSheetShowing()) {
                mBinding.bottomSheetLayout.dismissSheet();
            }
            checkOrderType();
        } else {
            mActivity.showToast("请添加商品或服务");
        }

    }


    /**
     * 点击挂单页面
     *
     * @param v
     */
    public void clickOrder(View v) {
        mActivity.turnToActivity(PayListActivity.class);
    }

    private void checkOrderType() {
        haveNumService = judgeHaveNumCard();
        if (commitOrderTempInfos.get(0).getOrderType()==1&&commitOrderTempInfos.get(0).getVipUserId()>0){//会员取单
            commitBuyHttp();
        }else{
            mDialog = new CustomerTypeDialog(mActivity,mIsGuadan,haveNumService?1:0,numCardID);
            mDialog.setListenner(new CustomerTypeDialog.OnClickListenner() {
                @Override
                public void onClickJump() {
                    onlyCardInfo =null;
                    vipInfo=null;
                    commitBuyHttp();
                }

                @Override
                public void onClickButton(int mPosition, String name, String phone, String s) {
                    if (TextUtils.isEmpty(phone)) {
                        showToast(mActivity, "请输入手机号");
                    }else{
                        onlyCardInfo =null;
                        vipInfo=null;
                        nonMemberName =name;
                        nonMemberPhone =phone;
                        commitBuyHttp();
                    }
                }

                @Override
                public void onCardListener(VipCardInfo vipCardInfo) {
                    vipInfo=null;
                    CollectMoneyViewModel.this.onlyCardInfo =vipCardInfo;
                    commitBuyHttp();
                }
            });
            mDialog.show();
        }

    }

    private void commitBuyHttp() {

//        String url = "getOrderId";
        url = "getOrderId";
        params.clear();
//        int classification=-1;//-1是非会员,0是会员,1是次卡,2是纯折扣,4是会员使用会员价
        classification = -1;
        if (haveNumService) {
            if (commitOrderTempInfos.get(0).getOrderType()!=1){//如果非取单
                if (vipInfo == null || StringUtils.isEmpty(vipInfo.getProductList())) {
                    showToast(mActivity, "请选择次卡会员");
                    return;
                }
                boolean isOver = getIsOverNum();
                if (isOver) return;
                params.put("vipUserId", vipInfo.getId() + "");
            }else{//如果是取单
                params.put("vipUserId", commitOrderTempInfos.get(0).getVipUserId()+"");
            }
            url = "insertOrderDetailedCardNumber";
            classification=1;


            getData(url, classification);
        } else {
            if (vipInfo != null) {
                if (!StringUtils.isEmpty(vipInfo.getProductList())) {//如果是次卡
                    showToast(mActivity, "请选择会员");
                    return;
                }
                if (isVipPrice == 0) {
                    classification = 0;
                }else {
                    classification = 4;
                }
                params.put("vipUserId", vipInfo.getId()+"");


                getData(url, classification);

            }else{
                if (onlyCardInfo !=null){//如果是纯折扣卡
                    params.put("cardId", onlyCardInfo.getId()+"");
                    classification=2;


                    getData(url, classification);
                } else if (commitOrderTempInfos.get(0).getVipUserId()!=0){
                   //这是一个从挂单取回进行结算的操作
                    final List<SelectInfo> infoList = new ArrayList<>();
                    infoList.add(new SelectInfo("折扣价结账","0"));
                    infoList.add(new SelectInfo("会员价结账","1"));
                    SelectSimpleAdapter simpleAdapter = new SelectSimpleAdapter(mActivity,infoList);
                    final SelectDialog selectDialog = new SelectDialog(mActivity,simpleAdapter);
                    simpleAdapter.setListener(new OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            params.put("vipUserId", commitOrderTempInfos.get(0).getVipUserId()+"");
                            if (infoList.get(position).getType().equals("1")){
                                classification =4;
                            }else {
                                classification =0;
                            }

                            getData(url, classification);
                            selectDialog.dismiss();
                        }
                    });
                    selectDialog.show();
                }else {
                    getData(url, classification);
                }
            }
        }
    }

    private void getData(String url, int classification) {
        params.put("isClassification", classification+"");
        params.put("allList", new Gson().toJson(commitOrderTempInfos));
        params.put("shopId", SpUtil.getShopId());
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("userName", nonMemberName==null?"":nonMemberName);//非会员名字
        params.put("userPhone", nonMemberPhone==null?"":nonMemberPhone);//非会员电话
        nonMemberName="";//清空非会员名字
        nonMemberPhone="";//清空非会员电话
        mActivity.showRDialog();
        mClient.reqApi(url, params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            if (mIsGuadan) {
                                insertOrderHttp(result.getData());
                            } else {
                                //清空数据库
                                clearTempDb();
                                vipInfo = null;
                                onlyCardInfo =null;
                                rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                                Intent intent = new Intent(mActivity, CommitOrderActivity.class);
                                intent.putExtra(Constants.intent_id, result.getData());
                                intent.putExtra(Constants.intent_money,vipMoney);
                                intent.putExtra("userName", nonMemberName);
                                intent.putExtra("userPhone", nonMemberPhone);
                                mActivity.startActivity(intent);
                            }
                            if (mDialog!=null)mDialog.dismiss();
                            orderNums.clear();
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                        mActivity.showToast("网络异常");
                    }
                });
    }
    //处理取单,次卡和会员的相关逻辑
//    private String getURL(){
//
//    }

    private void insertOrderHttp(String orderNo) {

        mActivity.showRDialog();
        params.clear();
        params.put("orderId", orderNo);
        params.put("shopId", SpUtil.getShopId());
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mInsertOrderClient.reqApi("insertOrder", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        if (result.isSuccess()) {
                            mActivity.showToast("挂单成功");
                            //清空数据库
                            clearTempDb();
                            vipInfo = null;
                            onlyCardInfo =null;
                            rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                    }
                });

    }

    private void clearTempDb() {
        if (commitOrderTempInfoDao != null) {
            commitOrderTempInfoDao.deleteAll();
            serviceNum = 0;
            goodNum = 0;
            totalAmt = 0.00;
            mBinding.moneyTv.setText(AppUtil.formatStandardMoney(totalAmt) + " 元");
            mBinding.bvUnm.setText(serviceNum + goodNum + "");
            mBinding.bvUnm.setVisibility(View.GONE);
        }

    }

    /**
     * 点击购物车弹出的
     */
    public void onShopCarClick() {
        mBottomSheet = createBottomSheetView();
        if (mBinding.bottomSheetLayout.isSheetShowing()) {
            mBinding.bottomSheetLayout.dismissSheet();
        } else {
            if (commitOrderTempInfos.size() != 0) {
                mBinding.bottomSheetLayout.showWithSheetView(mBottomSheet);
            }
        }
    }

    private View createBottomSheetView() {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.layout_bottom_sheet, (ViewGroup) mActivity.getWindow().getDecorView(), false);
        MyListView serviceListView = (MyListView) view.findViewById(R.id.service_listView);
        MyListView goodsListView = (MyListView) view.findViewById(R.id.goods_listView);
        LinearLayout goodsLl = (LinearLayout) view.findViewById(R.id.goods_ll);
        LinearLayout serviceLl = (LinearLayout) view.findViewById(R.id.service_ll);
        TextView clear = (TextView) view.findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mBackDialog = new CustomDialog(mActivity);
                mBackDialog.setContent("是否确认清空？");
                mBackDialog.setCancelVisiable();
                mBackDialog.setOkVisiable(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //清空数据库
                        clearTempDb();
                        rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                        mBackDialog.dismiss();
                    }
                });
                if (!mActivity.isFinishing()) {
                    mBackDialog.show();
                }
            }
        });
        mProductLits.clear();
        mGoodsLits.clear();
        for (CommitOrderTempInfo info : commitOrderTempInfos) {
            if (info.getType() == 2||info.getType()==3) {//服务
                mProductLits.add(info);
            } else {
                mGoodsLits.add(info);
            }
        }
        if (mGoodsLits.size() == 0) {
            goodsLl.setVisibility(View.GONE);
        } else {
            mGoodsAdapter = new ProductAdapter(mActivity, mGoodsLits);
            goodsListView.setAdapter(mGoodsAdapter);
        }
        if (mProductLits.size() == 0) {
            serviceLl.setVisibility(View.GONE);
        } else {
            mProductAdapter = new ProductAdapter(mActivity, mProductLits);
            serviceListView.setAdapter(mProductAdapter);
        }

        return view;
    }


    public void setScanResult(String barCode) {
        queryGoodsHttp(barCode);
    }

    /**
     * 根据扫描结果查询商品
     *
     * @param barCode
     */
    private void queryGoodsHttp(String barCode) {
        mActivity.showRDialog();
        params.clear();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("barCode", barCode);
        mGoodsClient.reqApi("getGoods", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<GoodInfo> result) {
                        mActivity.hideRDialog();
                        List<GoodInfo> data = result.getData();
                        if (result.isSuccess()) {
                            if (data.size() > 0) {
                                GoodInfo goodInfo = data.get(0);
                                showAddDialog(goodInfo);
                            } else {
                                showTurnToAddActivityDialog();
                            }
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mActivity.hideRDialog();
                        super.onError(e);
                        mActivity.showToast("网络异常");
                    }
                });

    }

    /**
     * 跳转到添加商品的页面
     */
    private void showTurnToAddActivityDialog() {
        if(mCustomDialog == null){
            mCustomDialog = new CustomDialog(mActivity);
            mCustomDialog.setContent("找不到该商品,是否添加?");
            mCustomDialog.setCancelVisiable();
            mCustomDialog.setOkVisiable(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mActivity.turnToActivity(AddGoodsActivity.class);
                    mCustomDialog.dismiss();
                }
            });
        }
        mCustomDialog.show();
    }


    private void showAddDialog(GoodInfo goodInfo) {
        if (mAddDialog == null) {
            mAddDialog = new AddDialog(mActivity);
            mAddDialog.setListenner(new AddDialog.OnClickConfirmListenner() {

                @Override
                public void onClickGoodsConfirm(GoodInfo goodInfo, EmployeeInfo employeeInfo, int num,int isGift) {

                    CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                    QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                    if (Constants.is_promotion == goodInfo.getIsPromotion()) {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(goodInfo.getId()), CommitOrderTempInfoDao.Properties.PromotionAmt.eq(goodInfo.getPromotionAmt()), CommitOrderTempInfoDao.Properties.Type.eq(1), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
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
                        entity.setIsGift(isGift);
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

                    if (rxManager == null) {
                        rxManager = new RxManager();
                    }
                    rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                }

                @Override
                public void onClickServiceConfirm(ServiceInfo serviceInfo, EmployeeInfo employeeInfo, int num,int isGift) {

                }
            });
        }
        mAddDialog.setModel(goodInfo);
        mAddDialog.hideEt();
        mAddDialog.show();
    }

    private void showAddDialog(ServiceInfo info) {
        if (mServiceDialog == null) {
            mServiceDialog = new AddDialog(mActivity);
            Window window = mServiceDialog.getWindow();
            window.setWindowAnimations(R.style.ThemeCustomDialog_Animation);
            mServiceDialog.setListenner(new AddDialog.OnClickConfirmListenner() {
                @Override
                public void onClickGoodsConfirm(GoodInfo goodInfo, EmployeeInfo employeeInfo, int num,int isGift) {

                }

                @Override
                public void onClickServiceConfirm(ServiceInfo serviceInfo, EmployeeInfo employeeInfo, int num,int isGift) {
                    CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                    QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                    if (Constants.is_promotion == serviceInfo.getIsPromotion()) {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(serviceInfo.getId()), CommitOrderTempInfoDao.Properties.PromotionAmt.eq(serviceInfo.getPromotionAmt()), CommitOrderTempInfoDao.Properties.Type.eq(2), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
                    } else {
                        qb.where(CommitOrderTempInfoDao.Properties.Id.eq(serviceInfo.getId()), CommitOrderTempInfoDao.Properties.RealAmt.eq(serviceInfo.getRealAmt()), CommitOrderTempInfoDao.Properties.Type.eq(2), CommitOrderTempInfoDao.Properties.IsGift.eq(isGift),CommitOrderTempInfoDao.Properties.UserId.eq(employeeInfo.getId()));
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
                        entity.setUnit(serviceInfo.getUnit());
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
                    if (rxManager == null) {
                        rxManager = new RxManager();
                    }
                    rxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
                    showToast(mActivity, "加入购物车成功");
                }
            });
        }
        mServiceDialog.setModel(info);
        mServiceDialog.hideEt();
        mServiceDialog.show();
    }
    //判断是否有次卡商品
    public boolean judgeHaveNumCard(){
        QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
        qb.where(CommitOrderTempInfoDao.Properties.Type.eq(3));
        if (qb.list().size()>0){
            List<CommitOrderTempInfo> list=qb.list();
            numCardID=list.get(0).getCardID();
            return true;
        }else{
            return false;
        }
    }
    private boolean getIsOverNum() {
        try {
            String[] productNum = vipInfo.getProductNum().split(",");
            String[] productList = vipInfo.getProductList().split(",");
            StringBuilder builder = new StringBuilder();
            builder.append("该次卡会员只能购买\n");
            boolean isOver = false;
            for (int i = 1; i < productNum.length; i++) {
                int productItemNum = Integer.parseInt(productNum[i]);
                int productItemId = Integer.parseInt(productList[i]);
                QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                qb.where(CommitOrderTempInfoDao.Properties.Id.eq(productItemId));
                if (qb.list().size() > 0) {
                    List<CommitOrderTempInfo> list = qb.list();
                    int commitItemNum = 0;
                    for (CommitOrderTempInfo info : list) {
                        commitItemNum += info.getNum();
                    }
                    if (commitItemNum > productItemNum) {
                        builder.append(productItemNum + "次" + list.get(0).getName() + "服务\n");
                        isOver = true;
                    }
                }
            }
            if (isOver) {
                showLongToast(mActivity, builder.toString());
            }
            return isOver;
        } catch (Exception e) {

        }
        return true;
    }

    public void reset() {
        mAddDialog = null;
        mServiceDialog=null;
        mActivity = null;
        if (rxManager != null) {
            rxManager.clear();
            rxManager = null;
        }
        if (mGoodsClient != null) {
            mGoodsClient.reset();
            mGoodsClient = null;
        }
        if (mClient != null) {
            mClient.reset();
            mClient = null;
        }
        if (mInsertOrderClient != null) {
            mInsertOrderClient.reset();
            mInsertOrderClient = null;
        }
        if (mGoodsListClient != null) {
            mGoodsListClient.reset();
            mGoodsListClient = null;
        }
        if (mServiceListClient != null) {
            mServiceListClient.reset();
            mServiceListClient = null;
        }
        if (mVipClient != null) {
            mVipClient.reset();
            mVipClient = null;
        }
        commitOrderTempInfos = null;
        mGoodsLits = null;
        mProductLits = null;
        mBackDialog = null;
        mSearchDialog = null;
        goodsAdapter = null;
        serviceAdapter = null;
        mDialog = null;
    }
}
