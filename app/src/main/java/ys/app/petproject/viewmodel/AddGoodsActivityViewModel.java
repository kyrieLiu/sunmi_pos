package ys.app.petproject.viewmodel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.greendao.GoodTypeInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.AddGoodsActivity;
import ys.app.petproject.activity.ScannerActivity;
import ys.app.petproject.adapter.SelectTypeAdapter;
import ys.app.petproject.adapter.SelectUnitAdapter;
import ys.app.petproject.adapter.inventory.AddGoodsSearchAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ActivityAddGoodsBinding;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.ApiService;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.model.GoodUnitInfo;
import ys.app.petproject.utils.FileUtils;
import ys.app.petproject.utils.Logger;
import ys.app.petproject.widget.dialog.SelectDialog;
import ys.app.petproject.widget.imagepicker.ImagePicker;
import ys.app.petproject.widget.timeselector.TimeSelector;

/**
 * Created by admin on 2017/6/7.
 */

public class AddGoodsActivityViewModel extends BaseActivityViewModel{
    private  AddGoodsActivity mActivity;
    private final ActivityAddGoodsBinding mBinding;

    private  ApiClient<BaseListResult<GoodTypeInfo>> mClient;
    private  ApiClient<BaseResult> mAddGoodClient;
    private  ApiClient<BaseResult> mUpLoadClient;
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

    public ObservableField<String> obGoodsName = new ObservableField<>();//商品名称
    public ObservableField<String> obGoodsCode = new ObservableField<>();//条形码
    public ObservableField<String> obGoodsTypeName = new ObservableField<>();//商品类型名称
    public ObservableLong obGoodsType = new ObservableLong();//商品类型
    public ObservableField<String> obGoodsUnitName = new ObservableField<>();//商品单位名称
    public ObservableField<String> obGoodsCostPrice = new ObservableField<>();//商品成本价格
    public ObservableField<String> obGoodsVipPrice = new ObservableField<>();//商品会员价格
    public ObservableField<String> obGoodsRealPrice = new ObservableField<>();//商品销售价格
    public ObservableField<String> obGoodsProductDate = new ObservableField<>();//商品生产日期
    public ObservableField<String> obGoodsOutOfDate = new ObservableField<>();//商品有效期截至
    public ObservableBoolean showSearch=new ObservableBoolean(false);//显示搜索内容
    private String imgUrlHttp = "img";
    private Handler mUiHandler;
    private final ApiClient<BaseListResult<GoodInfo>> mGoodsListClient;
    private boolean isItemSelect=false;//区别名称是编辑还是点击的
    private AddGoodsSearchAdapter goodsAdapter;

    public AddGoodsActivityViewModel(AddGoodsActivity activity, ActivityAddGoodsBinding binding, ImagePicker picker){
        this.mActivity = activity;
        this.mBinding = binding;
        this.mClient = new ApiClient<>();
        this.mAddGoodClient = new ApiClient<>();
        this.mUnitClient = new ApiClient<>();
        this.mUpLoadClient = new ApiClient<>();
        this.mGoodsListClient = new ApiClient<>();
        mResult = new GoodInfo();
        mUiHandler = new Handler();
        initCommiditySearchView();
    }

    private void initCommiditySearchView(){
        //mBinding.llAddGoodsSearch.getBackground().setAlpha(175);
        goodsAdapter = new AddGoodsSearchAdapter(mActivity);
        mBinding.rvAddGoodSearchName.setLayoutManager(new LinearLayoutManager(mActivity));
        mBinding.rvAddGoodSearchName.setAdapter(goodsAdapter);
        goodsAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                GoodInfo info=  goodsAdapter.getItem(position);
                obGoodsTypeName.set(info.getTypeName());
                long type=getGoodsType(info.getTypeName());
                if (type==-1){
                    showToast(mActivity,"店铺内没有"+info.getTypeName()+"类型");
                }else{
                    obGoodsName.set(info.getName());
                    obGoodsCode.set(info.getBarCode());
                    obGoodsType.set(type);
                    obGoodsUnitName.set(info.getUnit());
                    isItemSelect=true;
                    showSearch.set(false);
                }
            }
        });

    }

    private long getGoodsType(String name){
        GoodTypeInfoDao goodTypeInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getGoodTypeInfoDao();
        QueryBuilder qb = goodTypeInfoDao.queryBuilder();
        qb.where(GoodTypeInfoDao.Properties.Name.eq(name));
        if (qb.unique()!=null){
            GoodTypeInfo  goodTypeInfo = (GoodTypeInfo) qb.unique();
            long type=goodTypeInfo.getId();
            return type;
        }else{
            return -1;
        }
    }


    public void getSearchGoodsHttp(String s,boolean isCode) {
        Map<String, String> params = new HashMap<>();
        if (isCode){
            params.put("barCode",s);
        }else{
            params.put("name", s);
        }

        mGoodsListClient.reqApi("selectPublicLibrary", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<GoodInfo>>() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onSuccess(BaseListResult<GoodInfo> result) {
                        if (result.isSuccess()) {
                            List<GoodInfo> mList = result.getData();
                            if (mList.size()>0){
                                goodsAdapter.setList(mList);
                                showSearch.set(true);

                            }else{
                                showSearch.set(false);
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        if(mActivity!=null)mActivity.showToast("网络异常");
                    }
                });

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

    public TextWatcher mVipAmtChangedListener = new TextWatcher() {

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
                            obGoodsVipPrice.set(split[0]+"."+split[1].substring(0,2));
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
    public TextWatcher goodNameListener=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (!isItemSelect){
                String s=editable.toString();
                if (!TextUtils.isEmpty(s)){
                    getSearchGoodsHttp(s,false);
                }else{
                    showSearch.set(false);
                }
            }
            isItemSelect=false;

        }
    };


    //监听条形码输入信息
    public TextWatcher barCodeWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String s = editable.toString();
//            if (!TextUtils.isEmpty(s)){
//                if(delayRun!=null){
//                    //每次editText有变化的时候，则移除上次发出的延迟线程
//                    handler.removeCallbacks(delayRun);
//                }
//                editString = s.toString();
//                //延迟800ms，如果不再输入字符，则执行该线程的run方法
//                handler.postDelayed(delayRun, 1000);
//            }
        }
    };
    private Handler handler = new Handler();
    private String editString;

    /**
     * 延迟线程，看是否还有下一个字符输入
     */
    private Runnable delayRun = new Runnable() {

        @Override
        public void run() {
            //在这里调用服务器的接口，获取数据
            getSearchGoodsHttp(editString, true);
        }
    };
    //关闭搜索数据
    public void hideSearch(){
        showSearch.set(false);
    }



    private void upload() {
        final String url = Constants.base_url + "commitPic";
//        File file = new File(imgUri.get().getPath());
        final String fileName = "petproject.jpg";
        final File file = FileUtils.getFile(imgData.get(), mActivity.getFilesDir().getAbsolutePath(), fileName);
        RequestBody fileBody = RequestBody.create(MediaType.parse("application/octet-stream"), file);
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("picLoad", "petproject.jpg", fileBody)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();


        final okhttp3.OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder();
        OkHttpClient okHttpClient = httpBuilder
                //设置超时
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(80, TimeUnit.SECONDS)
                .build();
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {

                mUiHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Logger.e("uploadMultiFile() e=" + e);
                        showToast(mActivity, e.getMessage());
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                mUiHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
//                            Logger.e("uploadMultiFile() response=" + response.body().string());
                            String result = response.body().string();
                            BaseResult baseResult = new Gson().fromJson(result, BaseResult.class);
                            if (baseResult.isSuccess()) {
                                imgUrlHttp = baseResult.getData();
                                summitHttp();
                            } else {
                                showToast(mActivity, baseResult.getErrorMessage());
                            }
                        } catch (Exception e) {
                            showToast(mActivity, e.getMessage());
                        }
                    }
                });

            }
        });

    }


    private ApiService mService;

    /**
     * 先上传图片
     */
    private void uploadImg() {

        mActivity.showRDialog();
        final String fileName = "petproject.png";
        final File file = FileUtils.getFile(imgData.get(), mActivity.getFilesDir().getAbsolutePath(), fileName);
        Logger.w("存储地址-->" + mActivity.getCacheDir().getAbsolutePath() + "/" + fileName);
//        MultipartBody.Part part= MultipartBody.Part.create(RequestBody.create(MediaType.parse(fileName), file));


        RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), file);
        Headers headers = Headers.of("Content-Disposition", "form-data; name=\"picLoad\"");
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
//        MultipartBody.Part part=  MultipartBody.Part.create(headers,requestBody);
        MultipartBody.Part p=MultipartBody.Part.createFormData("file_name", file.getName() );


        mUpLoadClient.reqUploadApi("uploadImg", part, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult result) {
                        mActivity.hideRDialog();
                        Logger.w(result.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mActivity.hideRDialog();
                    }
                });

    }


    //    String shopId,String name,String barCode,String typeName,String type,String unit,BigDecimal costAmt,BigDecimal realAmt,Date manufactureTime,String expiryDate,String imgpath
    private void summitHttp() {
        if(TextUtils.isEmpty(obGoodsName.get())){
            showToast(mActivity,"商品名称不能为空");
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

        if(TextUtils.isEmpty(obGoodsRealPrice.get())){
            showToast(mActivity,"销售价不能为空");
            return;
        }
        if(TextUtils.isEmpty(imgUrlHttp)){
            showToast(mActivity,"请上传图片");
            return;
        }
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId());
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
        params.put("name", obGoodsName.get());
        if(TextUtils.isEmpty(obGoodsCode.get())){
            params.put("barCode",Constants.barCodeTemp_int);
        }else {
            params.put("barCode", obGoodsCode.get());
        }

        params.put("typeName", obGoodsTypeName.get());
        params.put("type", obGoodsType.get() + "");
        params.put("unit", obGoodsUnitName.get());
        if(TextUtils.isEmpty(obGoodsCostPrice.get())){
            params.put("costAmt", "");
        }else {
            params.put("costAmt", obGoodsCostPrice.get());
        }
        if(TextUtils.isEmpty(obGoodsVipPrice.get())){
            params.put("vipAmt", obGoodsRealPrice.get());
        }else {
            params.put("vipAmt", obGoodsVipPrice.get());
        }
        params.put("realAmt", obGoodsRealPrice.get());
        if(TextUtils.isEmpty(obGoodsProductDate.get())){
            params.put("manufactureTime", "1970-01-01");
        }else {
            String date = obGoodsProductDate.get();
            if (date != null) {
                date.replace("-", "");
                params.put("manufactureTime",date);
            }
        }

        if(TextUtils.isEmpty(obGoodsOutOfDate.get())){
            params.put("expiryDate", "100");
        }else {
            params.put("expiryDate", obGoodsOutOfDate.get());
        }

        params.put("imgpath", imgUrlHttp);
        mAddGoodClient.reqApi("addGood", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {
                        mActivity.hideRDialog();
                        if (info.isSuccess()) {
                            mActivity.showToast("添加成功");
                            mActivity.finish();
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
        TimeSelector timeSelector = new TimeSelector(mActivity, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                obGoodsProductDate.set(time);
            }
        }, "2015-1-1 00:00", "2050-12-31 24:00");
        timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
        timeSelector.show();
    }

//    public void expiryDateClick(){
//        TimeSelector timeSelector = new TimeSelector(mActivity.getContext(), new TimeSelector.ResultHandler() {
//            @Override
//            public void handle(String time) {
//                obGoodsOutOfDate.set(time);
//            }
//        }, "2010-1-1 00:00", "2050-12-31 24:00");
//        timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
//        timeSelector.show();
//    }

    /**
     * 获取商品
     */
    public void getTypeHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

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



    public ObservableField<byte[]> imgData = new ObservableField<>();


    public void clickButton(View v){
//        upload();
        summitHttp();
    }

    public void reset() {
        mActivity = null;
        if (mClient != null){
            mClient.reset();
            mClient = null;
        }
        if (mAddGoodClient != null){
            mAddGoodClient.reset();
            mAddGoodClient = null;
        }
        if (mUpLoadClient != null){
            mUpLoadClient.reset();
            mUpLoadClient = null;
        }
        if (mUnitClient != null){
            mUnitClient.reset();
            mUnitClient = null;
        }
        if (mRxManager != null){
            mRxManager.clear();
            mRxManager = null;
        }
        if (mUiHandler != null){
            mUiHandler.removeCallbacksAndMessages(null);
            mUiHandler = null;
        }
        mTypeData = null;
        mSelectTypeAdapter = null;
        mTypeSelectDialog = null;
        mUnitSelectDialog = null;
        mSelectUnitAdapter = null;

    }
}