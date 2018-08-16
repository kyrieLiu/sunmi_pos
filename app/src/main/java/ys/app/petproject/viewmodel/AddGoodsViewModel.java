package ys.app.petproject.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;
import android.net.Uri;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ys.app.petproject.BaseFragmentViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.ScannerActivity;
import ys.app.petproject.adapter.SelectTypeAdapter;
import ys.app.petproject.adapter.SelectUnitAdapter;
import ys.app.petproject.databinding.FragmentAddGoodsBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.fragment.AddGoodsFragment;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.ApiService;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.model.GoodUnitInfo;
import ys.app.petproject.widget.dialog.SelectDialog;
import ys.app.petproject.widget.imagepicker.ImagePicker;
import ys.app.petproject.widget.timeselector.TimeSelector;

/**
 * Created by aaa on 2017/3/8.
 */


public class AddGoodsViewModel extends BaseFragmentViewModel {


    private final Activity mActivity;
    private final FragmentAddGoodsBinding mBinding;
    private final ApiClient<BaseListResult<GoodTypeInfo>> mClient;
    private final ApiClient<BaseResult> mAddGoodClient;
    private final AddGoodsFragment mFragment;
    private final ApiClient<BaseResult> mUpLoadClient;
    private ImagePicker mImagePicker;
    public GoodInfo mResult;
    public ObservableBoolean getTypeHttpSuccess = new ObservableBoolean();
    public ObservableBoolean getUnitHttpSuccess = new ObservableBoolean();

    private RxManager mRxManager;
    private List<GoodTypeInfo> mTypeData;
    private SelectTypeAdapter mSelectTypeAdapter;
    private GoodTypeInfo mGoodTypeInfo;
    private SelectDialog mTypeSelectDialog;
    private SelectDialog mUnitSelectDialog;
    private List<GoodUnitInfo> mUnitData = new ArrayList<>();
    private SelectUnitAdapter mSelectUnitAdapter;
    private ApiClient<BaseListResult<GoodUnitInfo>> mUnitClient;
    public GoodUnitInfo mGoodUnitInfo = new GoodUnitInfo();


    public ObservableField<String> obGoodsName = new ObservableField<>();//商品名称
    public ObservableField<String> obGoodsCode = new ObservableField<>();//条形码
    public ObservableField<String> obGoodsTypeName = new ObservableField<>();//商品类型名称
    public ObservableLong obGoodsType = new ObservableLong();//商品类型
    public ObservableField<String> obGoodsUnitName = new ObservableField<>();//商品单位名称
    public ObservableField<String> obGoodsCostPrice = new ObservableField<>();//商品成本价格
    public ObservableField<String> obGoodsRealPrice = new ObservableField<>();//商品销售价格
    public ObservableField<String> obGoodsProductDate = new ObservableField<>();//商品生产日期
    public ObservableField<String> obGoodsOutOfDate = new ObservableField<>();//商品有效期截至
    public ObservableField<Uri> imgUri = new ObservableField<>();
    private String imgUrlHttp;
    private Handler mUiHandler;


    public AddGoodsViewModel(AddGoodsFragment fragment, FragmentAddGoodsBinding binding, ImagePicker picker) {
        this.mFragment = fragment;
        this.mActivity = fragment.getActivity();
        this.mBinding = binding;
        this.mClient = new ApiClient<>();
        this.mAddGoodClient = new ApiClient<>();
        this.mUnitClient = new ApiClient<>();
        this.mUpLoadClient = new ApiClient<>();
        this.mImagePicker = picker;
        mResult = new GoodInfo();
        mUiHandler = new Handler();
    }


    public TextWatcher mChangedListener = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String s = editable.toString();
            if (!TextUtils.isEmpty(s)){
                if (s.length() > 8){
                    Toast.makeText(mActivity,"不能超过八位数",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (s.contains(".")){
                    String[] split = s.split("\\.");
                    if (split.length > 1 && !TextUtils.isEmpty(split[1])){
                        if (split[1].length()>2){
                            Toast.makeText(mActivity,"最多输入两位小数",Toast.LENGTH_SHORT).show();
                            obGoodsCostPrice.set(split[0]+"."+split[1].substring(0,2));
                            return;
                        }
                    }
                }
            }

        }
    };
    public TextWatcher mTCredTSChangedListener = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String s = editable.toString();
            if (!TextUtils.isEmpty(s)){
                if (s.length() > 8){
                    Toast.makeText(mActivity,"不能超过八位数",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (s.contains(".")){
                    String[] split = s.split("\\.");
                    if (split.length > 1 && !TextUtils.isEmpty(split[1])){
                        if (split[1].length()>2){
                            Toast.makeText(mActivity,"最多输入两位小数",Toast.LENGTH_SHORT).show();
                            obGoodsRealPrice.set(split[0]+"."+split[1].substring(0,2));
                            return;
                        }
                    }
                }
            }

        }
    };


    private ApiService mService;



    //    String shopId,String name,String barCode,String typeName,String type,String unit,BigDecimal costAmt,BigDecimal realAmt,Date manufactureTime,String expiryDate,String imgpath
    private void summitHttp() {
        if(TextUtils.isEmpty(obGoodsName.get())){
            showToast(mActivity,"商品名称不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsCode.get())){
            showToast(mActivity,"条形码不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsTypeName.get())){
            showToast(mActivity,"类型不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsUnitName.get())){
            showToast(mActivity,"单位不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsCostPrice.get())){
            showToast(mActivity,"成本价不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsRealPrice.get())){
            showToast(mActivity,"销售价不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsProductDate.get())){
            showToast(mActivity,"生产日期不能为空");
            return;
        }
        if(TextUtils.isEmpty(obGoodsOutOfDate.get())){
            showToast(mActivity,"有效日期不能为空");
            return;
        }
        if(TextUtils.isEmpty(imgUrlHttp)){
            showToast(mActivity,"请上传图片");
            return;
        }
        mFragment.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId()+"");
        params.put("name", obGoodsName.get());
        params.put("barCode", obGoodsCode.get());
        params.put("typeName", obGoodsTypeName.get());
        params.put("type", obGoodsType.get() + "");
        params.put("unit", obGoodsUnitName.get());
        params.put("costAmt", obGoodsCostPrice.get());
        params.put("realAmt", obGoodsRealPrice.get());
        String date = obGoodsProductDate.get();
        if (date != null) {
            date.replace("-", "");
//            params.put("manufactureTime",date);
        }

        params.put("expiryDate", obGoodsOutOfDate.get());
        params.put("imgpath", imgUrlHttp);
        mAddGoodClient.reqApi("addGood", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {
                        mFragment.hideRDialog();
                        if (info.isSuccess()) {
                            if (mRxManager == null) {
                                mRxManager = new RxManager();
                            }
                            mRxManager.post(Constants.bus_type_http_result, Constants.type_addGood_success);

                        } else {
                            mFragment.showToast(info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        mFragment.hideRDialog();
                        super.onError(e);
                    }
                });

    }

    /**
     * 扫一扫
     *
     * @param v
     */
    public void clickScan(View v) {
        scan();
    }

    /**
     * 扫描
     */
    private void scan() {
        Intent intent = new Intent(mActivity,ScannerActivity.class);
        mActivity.startActivityForResult(intent, Constants.scan_result_code);
    }

    public void clickSelectUnitButton(View v) {
        selectUnitDialog();
    }

    /**
     * 选择单位
     */
    private void selectUnitDialog() {

        if (mUnitSelectDialog == null) {
            mSelectUnitAdapter = new SelectUnitAdapter(mActivity, mUnitData);
            mUnitSelectDialog = new SelectDialog(mActivity, mSelectUnitAdapter);
            mUnitSelectDialog.setListenner(new SelectDialog.SelectListenner() {
                @Override
                public void onSelect(int position) {
                    GoodUnitInfo goodUnitInfo = mUnitData.get(position);
                    obGoodsUnitName.set(goodUnitInfo.getName());
                }
            });
        }
        mUnitSelectDialog.show();
    }


    public void clickSelectTypeButton(View v) {
        selectTypeDialog();
    }

    /**
     * 选择类型
     */
    private void selectTypeDialog() {
        if (mTypeSelectDialog == null) {
            mSelectTypeAdapter = new SelectTypeAdapter(mActivity, mTypeData);
            mTypeSelectDialog = new SelectDialog(mActivity, mSelectTypeAdapter);
            mTypeSelectDialog.setListenner(new SelectDialog.SelectListenner() {
                @Override
                public void onSelect(int position) {
                    mGoodTypeInfo = mTypeData.get(position);
                    obGoodsType.set(mGoodTypeInfo.getId());
                    obGoodsTypeName.set(mGoodTypeInfo.getName());
                }
            });
        }

        mTypeSelectDialog.show();
    }

    public void manufactureTimeClick() {
        TimeSelector timeSelector = new TimeSelector(mFragment.getContext(), new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                obGoodsProductDate.set(time);
            }
        }, "2015-1-1 00:00", "2050-12-31 24:00");
        timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
        timeSelector.show();
    }

//    public void expiryDateClick(){
//        TimeSelector timeSelector = new TimeSelector(mFragment.getContext(), new TimeSelector.ResultHandler() {
//            @Override
//            public void handle(String time) {
//                obGoodsOutOfDate.set(time);
//            }
//        }, "2010-1-1 00:00", "2050-12-31 24:00");
//        timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
//        timeSelector.show();
//    }

    /**
     * 获取服务类型
     */
    public void getTypeHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId()+"");

        mClient.reqApi("goodsType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodTypeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<GoodTypeInfo> info) {
                        if (info.isSuccess()) {
                            getTypeHttpSuccess.set(true);
                            mTypeData = info.getData();
                        } else {
                            showToast(mActivity, info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }

    /**
     * 获取单位
     */
    public void getUnitHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("type", "1");

        mUnitClient.reqApi("goodsUnit", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodUnitInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<GoodUnitInfo> info) {
                        if (info.isSuccess()) {
                            getUnitHttpSuccess.set(true);
                            mUnitData = info.getData();
                        } else {
                            showToast(mActivity, info.getErrorMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }

    /**
     * 上传照片
     */
    public void uploadClick() {
    }



}
