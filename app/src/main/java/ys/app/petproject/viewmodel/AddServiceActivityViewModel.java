package ys.app.petproject.viewmodel;

import android.content.DialogInterface;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.AddServiceActivity;
import ys.app.petproject.adapter.SelectServiceTypeAdapter;
import ys.app.petproject.databinding.ActivityAddServiceBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.GoodsListResult;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.utils.FileUtils;
import ys.app.petproject.utils.Logger;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widget.dialog.SelectDialog;
import ys.app.petproject.widget.imagepicker.ImagePicker;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by admin on 2017/6/7.
 */

public class AddServiceActivityViewModel extends BaseActivityViewModel{

    private  AddServiceActivity mActivity;
    private  ActivityAddServiceBinding mBinding;

    private ImagePicker mImagePicker;
    private ApiClient<BaseListResult<ServiceTypeInfo>> mClient;
    private ApiClient<BaseResult> mSummitClient;
    public GoodsListResult mResult;
    public ObservableField<String> obServiceTypeName = new ObservableField<>();
    public ObservableLong obServiceType = new ObservableLong();
    public ObservableField<String> obServiceRealPrice = new ObservableField<>();
    public ObservableField<String> obServiceVipPrice = new ObservableField<>();
    public ObservableField<String> obServiceName = new ObservableField<>();
    public ObservableBoolean getTypeHttpSuccess = new ObservableBoolean();
    private RxManager mRxManager;
    private SelectServiceTypeAdapter mSelectTypeAdapter;
    private List<ServiceTypeInfo> mTypeData = new ArrayList<>();
    private SelectDialog mTypeSelectDialog;
    private ServiceTypeInfo mTypeInfo;
    public ObservableField<Uri> imgUri = new ObservableField<>();
    private String imgUrlHttp = "img";
    public ObservableField<byte[]> imgData = new ObservableField<>();


    public AddServiceActivityViewModel(AddServiceActivity activity, ActivityAddServiceBinding binding,ImagePicker picker) {
        this.mActivity = activity;
        this.mBinding = binding;
        this.mClient = new ApiClient<>();
        this.mSummitClient = new ApiClient<>();
        this.mImagePicker = picker;
//        registBus();
    }

    private void registBus() {
        mRxManager = new RxManager();
        mRxManager.on(Constants.bus_type_click_btn, new Action1<Integer>() {
            @Override
            public void call(Integer registerI) {
                if (Constants.type_add_service == registerI) {
                    upload();
                }
            }
        });
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


        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        final okhttp3.OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder();
        OkHttpClient okHttpClient = httpBuilder
                //设置超时
                .connectTimeout(80, TimeUnit.SECONDS)
                .writeTimeout(80, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {

                mActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Logger.e("uploadMultiFile() e=" + e);
//                        showToast(mActivity, e.getMessage());
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {


                mActivity.runOnUiThread(new Runnable() {
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

    public TextWatcher changedListener = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (editable == null) return;
            String s = editable.toString();
            if (!StringUtils.isEmptyOrWhitespace(s)) {
                if (s.length() > 8) {
                    Toast.makeText(mActivity, "不能超过八位数", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (s.contains(".")) {
                    String[] split = s.split("\\.");
                    if (split.length > 1 && !StringUtils.isEmptyOrWhitespace(split[1])) {
                        if (split[1].length() > 2) {
                            Toast.makeText(mActivity, "最多输入两位小数", Toast.LENGTH_SHORT).show();
                            obServiceRealPrice.set(split[0] + "." + split[1].substring(0, 2));
                            return;
                        }
                    }
                }
            }
        }
    };

    public TextWatcher vipAmtChangedListener = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (editable == null) return;
            String s = editable.toString();
            if (!StringUtils.isEmptyOrWhitespace(s)) {
                if (s.length() > 8) {
                    Toast.makeText(mActivity, "不能超过八位数", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (s.contains(".")) {
                    String[] split = s.split("\\.");
                    if (split.length > 1 && !StringUtils.isEmptyOrWhitespace(split[1])) {
                        if (split[1].length() > 2) {
                            Toast.makeText(mActivity, "最多输入两位小数", Toast.LENGTH_SHORT).show();
                            obServiceVipPrice.set(split[0] + "." + split[1].substring(0, 2));
                            return;
                        }
                    }
                }
            }
        }
    };

    /**
     * 提交服务
     */
    private void summitHttp() {
        if (StringUtils.isEmptyOrWhitespace(obServiceName.get())) {
            showToast(mActivity, "服务名称不能为空");
            return;
        }
        if (StringUtils.isEmptyOrWhitespace(obServiceTypeName.get())) {
            showToast(mActivity, "类型不能为空");
            return;
        }
        if (StringUtils.isEmptyOrWhitespace(obServiceRealPrice.get())) {
            showToast(mActivity, "销售价不能为空");
            return;
        }
        if (StringUtils.isEmptyOrWhitespace(imgUrlHttp)) {
            showToast(mActivity, "请上传图片");
            return;
        }
        mActivity.showRDialog();
        Map<String, String> params = new HashMap<>();
        params.put("shopId", SpUtil.getShopId() + "");
        params.put("name", obServiceName.get());
        params.put("typeName", obServiceTypeName.get());
        params.put("type", obServiceType.get() + "");
        params.put("realAmt", obServiceRealPrice.get());
        if (TextUtil.isEmpty(obServiceVipPrice.get())){
            params.put("vipAmt",obServiceRealPrice.get());
        }else {
            params.put("vipAmt", obServiceVipPrice.get());
        }
        params.put("imgpath", imgUrlHttp);

        mSummitClient.reqApi("addService", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseResult>() {
                    @Override
                    public void onSuccess(BaseResult info) {
                        mActivity.hideRDialog();
                        if (info.isSuccess()) {
//                            if (mRxManager == null) {
//                                mRxManager = new RxManager();
//                            }
//                            mRxManager.post(Constants.bus_type_http_result, Constants.type_addService_success);
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


    public void clickSelectTypeButton(View v) {
        selectTypeDialog();
    }

    /**
     * 选择类型
     */
    private void selectTypeDialog() {
        if (mTypeSelectDialog == null) {
            mSelectTypeAdapter = new SelectServiceTypeAdapter(mActivity, mTypeData);
            mTypeSelectDialog = new SelectDialog(mActivity, mSelectTypeAdapter);
            mTypeSelectDialog.setListenner(new SelectDialog.SelectListenner() {
                @Override
                public void onSelect(int position) {
                    mTypeInfo = mTypeData.get(position);
                    obServiceType.set(mTypeInfo.getId());
                    obServiceTypeName.set(mTypeInfo.getName());
                }
            });
        }

        mTypeSelectDialog.show();
    }

    public void getTypeHttp() {
        Map<String, String> params = new HashMap<>();
        params.put("branchId",SpUtil.getBranchId()+"");
        params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");

        mClient.reqApi("serviceType", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<ServiceTypeInfo>>() {
                    @Override
                    public void onSuccess(BaseListResult<ServiceTypeInfo> info) {
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

    public void uploadClick() {
    }


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
        if (mSummitClient != null){
            mSummitClient.reset();
            mSummitClient = null;
        }
        if (mRxManager != null){
            mRxManager.clear();
            mRxManager = null;
        }
        mSelectTypeAdapter = null;
        mTypeData = null;
        mTypeSelectDialog = null;
        mTypeInfo = null;
        mResult = null;
    }
}
