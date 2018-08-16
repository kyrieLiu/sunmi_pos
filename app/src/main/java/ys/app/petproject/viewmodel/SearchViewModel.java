package ys.app.petproject.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.GoodsDetailActivity;
import ys.app.petproject.activity.SearchActivity;
import ys.app.petproject.activity.ServiceDetailActivity;
import ys.app.petproject.activity.vip.VipDetailActivity;
import ys.app.petproject.adapter.GoodsSearchAdapter;
import ys.app.petproject.adapter.ServiceSearchAdapter;
import ys.app.petproject.adapter.VipSearchAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.callback.OnItemLongClickListener;
import ys.app.petproject.databinding.ActivitySearchBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.dialog.DeleteDialog;

/**
 * Created by admin on 2017/6/8.
 */

public class SearchViewModel extends BaseActivityViewModel{

    private final SearchActivity mActivity;
    private final ActivitySearchBinding mBinding;
    private final LinearLayout mSearchLl;
    private final TextView mSearchTv;
    private final TextView mTypeTv;
    private final EditText mInputEt;
    private final ImageView mDeleteTextIv;
    private final int mSearchTypeExtra;
    private final int mSearchFromExtra;
    private final ApiClient<BaseListResult<GoodInfo>> mGoodsListClient;
    private final ApiClient<BaseListResult<ServiceInfo>> mServiceListClient;
    private final ApiClient<BaseListResult<VipInfo>> mVipListClient;
    private  ApiClient<BaseResult> mApiClient;
    private GoodsSearchAdapter mGoodsAdapter;
    private ServiceSearchAdapter mServiceAdapter;
    private VipSearchAdapter mVipAdapter;
    private RxManager rxManager;
    private Map<String, String> params = new HashMap<>();
    private int vipFlag;


    public SearchViewModel(SearchActivity activity, ActivitySearchBinding binding, LinearLayout searchLl, TextView searchTv, TextView typeTv,
                           EditText inputEt, ImageView deleteTextIv, int searchTypeExtra, int searchFromExtra,int vipFlag) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.mSearchLl = searchLl;
        this.mSearchTv = searchTv;
        this.mTypeTv = typeTv;
        this.mInputEt = inputEt;
        this.mDeleteTextIv = deleteTextIv;
        this.mSearchTypeExtra = searchTypeExtra;
        this.mSearchFromExtra = searchFromExtra;
        this.mGoodsListClient = new ApiClient<>();
        this.mServiceListClient = new ApiClient<>();
        this.mVipListClient = new ApiClient<>();
        this.mApiClient = new ApiClient<BaseResult>();
        this.vipFlag=vipFlag;
        init();
    }

    private void init() {
        mSearchLl.setVisibility(View.VISIBLE);
        mSearchTv.setVisibility(View.VISIBLE);
        if (Constants.intent_search_type_goods == mSearchTypeExtra) {
            mTypeTv.setText("商品");
            SpannableString spannableString = new SpannableString("请输入商品名称");//这里输入自己想要的提示文字
            mInputEt.setHint(spannableString);
            mGoodsAdapter = new GoodsSearchAdapter(mActivity);
            mGoodsAdapter.setPromotionSetting(Constants.intent_form_shangpin_cuxiaoshezhi == mSearchFromExtra);
            mGoodsAdapter.setShangpinRuku(Constants.intent_form_shangpin_ruku == mSearchFromExtra);
            mGoodsAdapter.setShangpinChuKu(Constants.intent_form_shangpin_chuku == mSearchFromExtra);
            mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity, 2));
            mBinding.recyclerView.setAdapter(mGoodsAdapter);

            mGoodsAdapter.setListener(new OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    List<GoodInfo> list = mGoodsAdapter.getList();
                    Intent intent = new Intent(mActivity, GoodsDetailActivity.class);
                    Bundle bundle = new Bundle();
                    if (list != null && !list.isEmpty() && list.size() > position) {
                        bundle.putSerializable(Constants.intent_info, list.get(position));
                    }
                    bundle.putString(Constants.intent_flag, "1");
                    intent.putExtras(bundle);
                    mActivity.startActivity(intent);
                    mActivity.finish();
                }
            });
            mGoodsAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
                @Override
                public void onItemLongClick(View view, int position) {
                    deleteGoods(position);
                }
            });

        } else if (Constants.intent_search_type_service == mSearchTypeExtra) {
            mTypeTv.setText("服务");
            SpannableString spannableString = new SpannableString("请输入服务名称");//这里输入自己想要的提示文字
            mInputEt.setHint(spannableString);
            mServiceAdapter = new ServiceSearchAdapter(mActivity);
            mServiceAdapter.setPromot(Constants.intent_form_fuwu_cuxiaoshezhi == mSearchFromExtra);
            mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity, 2));
            mBinding.recyclerView.setAdapter(mServiceAdapter);
            mServiceAdapter.setListener(new OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    List<ServiceInfo> list = mServiceAdapter.getList();
                    Intent intent = new Intent(mActivity, ServiceDetailActivity.class);
                    intent.putExtra(Constants.intent_service_info, list.get(position));
                    intent.putExtra(Constants.intent_service_position, position);
                    mActivity.startActivity(intent);
                    mActivity.finish();
                }
            });
            mServiceAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
                @Override
                public void onItemLongClick(View view, int position) {
                    deleteService(position);
                }
            });

        } else if (Constants.intent_search_type_vip == mSearchTypeExtra||Constants.type_addAppointment_vip==mSearchTypeExtra) {
            if (vipFlag==0){
                mTypeTv.setText("会员");
            }else{
                mTypeTv.setText("次卡");
            }
            SpannableString spannableString = new SpannableString("请输入会员姓名/手机号码");//这里输入自己想要的提示文字
            mInputEt.setHint(spannableString);
            mVipAdapter = new VipSearchAdapter(mActivity);
            mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
            mBinding.recyclerView.setAdapter(mVipAdapter);
            mVipAdapter.setListener(new OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    VipInfo vipInfo=mVipAdapter.getList().get(position);
                    if (Constants.type_addAppointment_vip==mSearchTypeExtra){
                        if (rxManager == null) {
                            rxManager=new RxManager();
                        }
                        rxManager.post(Constants.type_vip_info,vipInfo);
                    }else{
                        Intent intent = new Intent(mActivity,VipDetailActivity.class);
                        intent.putExtra(Constants.intent_info,vipInfo);
                        mActivity.startActivity(intent);
                    }
                    mActivity.finish();
                }
            });
            mVipAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
                @Override
                public void onItemLongClick(View view, int position) {
                    showDeleteDialog(position);
                }
            });

        }


        mInputEt.addTextChangedListener(new TextWatcher() {
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
                    isLoadingVisible.set(true);
                    isNoneDataVisible.set(false);
                    isNetWorkErrorVisible.set(false);
                    if (Constants.intent_search_type_goods == mSearchTypeExtra) {
                        getSearchGoodsHttp(s);
                    } else if (Constants.intent_search_type_service == mSearchTypeExtra) {
                        getSearchServiceHttp(s);
                    } else if (Constants.intent_search_type_vip == mSearchTypeExtra||Constants.type_addAppointment_vip==mSearchTypeExtra) {
                        getSearchVipHttp(s);
                    }

                    mDeleteTextIv.setVisibility(View.VISIBLE);
                } else {
                    if (mGoodsAdapter != null) {
                        mGoodsAdapter.clearData();
                    }
                    if (mServiceAdapter != null) {
                        mServiceAdapter.clearData();
                    }
                    if (mVipAdapter != null) {
                        mVipAdapter.clearData();
                    }

                    mDeleteTextIv.setVisibility(View.GONE);

                }
            }
        });

        mDeleteTextIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInputEt.setText("");
                if (mGoodsAdapter != null) {
                    mGoodsAdapter.clearData();
                }
                if (mServiceAdapter != null) {
                    mServiceAdapter.clearData();
                }
                if (mVipAdapter != null) {
                    mVipAdapter.clearData();
                }
            }
        });
    }


    /**
     * 服务搜索
     *
     * @param s
     */
    private void getSearchServiceHttp(String s) {

        params.clear();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", s);
        if (mSearchFromExtra == Constants.intent_form_fuwu_cuxiaoliebiao ) {
            params.put("isPromotion", "1");
        }
        params.put("limit","1000");
        mServiceListClient.reqApi("queryServiceList", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ServiceInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceInfo> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            List<ServiceInfo> data = result.getData();
                            if (mServiceAdapter != null && data != null && !data.isEmpty()) {
                                mServiceAdapter.setList(data);
                            }else {
                                isNoneDataVisible.set(true);
//                                mActivity.showToast("没有搜到该服务");
                            }
                        } else {
                            mActivity.showToast(result.getErrorCode());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                    }
                });

    }

    /**
     * 商品搜索
     *
     * @param s
     */
    private void getSearchGoodsHttp(String s) {
        params.clear();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", s);
        if (mSearchFromExtra == Constants.intent_form_shangpin_cuxiaoliebiao ) {//
            params.put("isPromotion", "1");
        }
        params.put("limit","1000");

        mGoodsListClient.reqApi("getGoods", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<GoodInfo> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            List<GoodInfo> mList = result.getData();
                            if (mGoodsAdapter != null && mList != null && !mList.isEmpty()) {
                                mGoodsAdapter.setList(mList);
                            }else {
                                isNoneDataVisible.set(true);
//                                mActivity.showToast("没有搜到该商品");
                            }
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.showToast("网络异常");
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                    }
                });
    }

    /**
     * 会员搜索
     *
     * @param s
     */
    private void getSearchVipHttp(String s) {
        params.clear();
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", s);
        params.put("limit","1000");
        params.put("classification",vipFlag+"");
        if (vipFlag==1){
            params.put("branchId",SpUtil.getBranchId()+"");
        }
        mVipListClient.reqApi("queryVip", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<VipInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<VipInfo> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            List<VipInfo> mList = result.getData();
                            if (mVipAdapter != null && mList != null && !mList.isEmpty()) {
                                mVipAdapter.setList(mList);
                            }else {
                                isNoneDataVisible.set(true);
//                                mActivity.showToast("没有搜到该会员");
                            }
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.showToast("网络异常");
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                    }
                });

    }
    //删除商品
    private CustomDialog goodsDeleteDialog;
    private DeleteDialog goodsConfirmDeleteDialog;
    private void deleteGoods(final int position){
        if (goodsDeleteDialog == null) {
            goodsDeleteDialog = new CustomDialog(mActivity);
            goodsDeleteDialog.setContent("确定删除该商品?");
            goodsDeleteDialog.setCancelVisiable();
        }

        goodsDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goodsDeleteDialog.dismiss();
                if (goodsConfirmDeleteDialog == null){
                    goodsConfirmDeleteDialog = new DeleteDialog(mActivity);
                }
                goodsConfirmDeleteDialog.setOkVisiable(new DeleteDialog.IDeleteDialogCallback() {
                    @Override
                    public void verificationPwd(boolean b) {
                        if (b){
                            if (goodsConfirmDeleteDialog != null){
                                goodsConfirmDeleteDialog.dismiss();
                            }
                            verSuc();
                        }else {
                            Toast.makeText(mActivity,"密码输入错误请重新输入",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onDismiss() {
                        goodsConfirmDeleteDialog = null;
                    }
                });
                goodsConfirmDeleteDialog.show();
            }

            private void verSuc() {
                Map<String, String> params = new HashMap<>();
                params.put("id", mGoodsAdapter.getList().get(position).getId() + "");
                params.put("shopId", SpUtil.getShopId());
                params.put("branchId",SpUtil.getBranchId()+"");
                params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
                params.put("status", "4");
                isLoadingVisible.set(true);
                mApiClient.reqApi("updateGoods", params, ApiRequest.RespDataType.RESPONSE_JSON)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult baseResult) {
                                isLoadingVisible.set(false);
                                if (baseResult.isSuccess()) {
                                    mGoodsAdapter.removeData(position);
                                } else {
                                    showToast(mActivity, baseResult.getErrorMessage());
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                if (goodsConfirmDeleteDialog != null){
                                    goodsConfirmDeleteDialog.dismiss();
                                }
                                goodsDeleteDialog.dismiss();
                                showToast(mActivity, e.getMessage());
                            }
                        });
            }
        });
        goodsDeleteDialog.show();
    }
    //删除服务
    private CustomDialog serviceDeleteDialog;
    private DeleteDialog serviceConfirmDeleteDialog;
    private void deleteService(final int position){
        if (serviceDeleteDialog == null) {
            serviceDeleteDialog = new CustomDialog(mActivity);
            serviceDeleteDialog.setContent("确定删除该服务?");
            serviceDeleteDialog.setCancelVisiable();
        }

        serviceDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serviceDeleteDialog.dismiss();
                if (serviceConfirmDeleteDialog == null){
                    serviceConfirmDeleteDialog = new DeleteDialog(mActivity);
                }
                serviceConfirmDeleteDialog.setOkVisiable(new DeleteDialog.IDeleteDialogCallback() {
                    @Override
                    public void verificationPwd(boolean b) {
                        if (b){
                            if (serviceConfirmDeleteDialog != null){
                                serviceConfirmDeleteDialog.dismiss();
                            }
                            verSuc();
                        }else {
                            Toast.makeText(mActivity,"密码输入错误请重新输入",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onDismiss() {
                        serviceConfirmDeleteDialog = null;
                    }
                });
                serviceConfirmDeleteDialog.show();
            }

            private void verSuc() {
                Map<String, String> params = new HashMap<>();
                params.put("id", mServiceAdapter.getList().get(position).getId() + "");
                params.put("shopId", SpUtil.getShopId());
                params.put("branchId",SpUtil.getBranchId()+"");
                params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
                params.put("status", "4");
                isLoadingVisible.set(true);
                mApiClient.reqApi("updateService", params, ApiRequest.RespDataType.RESPONSE_JSON)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult baseResult) {
                                isLoadingVisible.set(false);
                                if (baseResult.isSuccess()) {
                                    mServiceAdapter.removeData(position);
                                } else {
                                    showToast(mActivity, baseResult.getErrorMessage());
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                if (goodsConfirmDeleteDialog != null){
                                    goodsConfirmDeleteDialog.dismiss();
                                }
                                goodsDeleteDialog.dismiss();
                                showToast(mActivity, e.getMessage());
                            }
                        });
            }
        });

        serviceDeleteDialog.show();
    }
    private CustomDialog vipDeleteDialog;
    private void showDeleteDialog(final int position) {
        if (vipDeleteDialog == null) {
            vipDeleteDialog = new CustomDialog(mActivity);
            vipDeleteDialog.setContent("确定删除该会员?");
            vipDeleteDialog.setCancelVisiable();
        }

        vipDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VipInfo vipInfo=mVipAdapter.getList().get(position);
                if (vipInfo.getMoney()>0){
                    Toast.makeText(mActivity,"该会员账户还有余额,不能删除",Toast.LENGTH_SHORT).show();
                    vipDeleteDialog.dismiss();
                    return;
                }

                Map<String, String> params = new HashMap<>();
                params.put("id", mVipAdapter.getList().get(position).getId() + "");
                params.put("shopId", SpUtil.getShopId() + "");
                params.put("state", "4");
                mApiClient.reqApi("updateVip", params, ApiRequest.RespDataType.RESPONSE_JSON)
                        .updateUI(new Callback<BaseResult>() {
                            @Override
                            public void onSuccess(BaseResult baseResult) {
                                vipDeleteDialog.dismiss();
                                if (baseResult.isSuccess()) {
                                    mVipAdapter.removeData(position);
                                } else {
                                    showToast(mActivity, baseResult.getErrorMessage());
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                                vipDeleteDialog.dismiss();
                                showToast(mActivity, e.getMessage());
                            }
                        });

            }
        });

        vipDeleteDialog.show();
    }
    public void clear(){
        if (rxManager!=null){
            rxManager.clear();
            rxManager=null;
        }
        goodsDeleteDialog=null;
        goodsConfirmDeleteDialog=null;
        serviceDeleteDialog=null;
        serviceConfirmDeleteDialog=null;
        vipDeleteDialog=null;
    }

}
