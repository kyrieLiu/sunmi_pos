package ys.app.petproject.widget.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.LoginInfo;
import ys.app.petproject.utils.Logger;

/**
 * Created by xyy on 17-7-16.
 */

public class DeleteDialog extends AppCompatDialog {

    private TextView mCancelTv;
    private TextView mOkTv;
    private EditText mPwdEt;
    private IDeleteDialogCallback mCallback;
    private ApiClient<BaseListResult<LoginInfo>> mApiClient;


    public DeleteDialog(@NonNull Context activity) {
        super(activity, R.style.ThemeCustomDialog);
        super.setContentView(R.layout.dialog_delete);
        init();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        if (mCallback != null) {
            mCallback.onDismiss();
        }
    }

    private void init() {
        mCancelTv = (TextView) findViewById(R.id.cancel_tv);
        mOkTv = (TextView) findViewById(R.id.ok_tv);
        mPwdEt = (EditText) findViewById(R.id.etPwd);
        setCancelVisiable();
        mApiClient = new ApiClient<BaseListResult<LoginInfo>>();
    }

    public void setCancelVisiable() {
        mCancelTv.setVisibility(View.VISIBLE);
        mCancelTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeleteDialog.this.dismiss();
                closeKeybord(mPwdEt,getContext());

            }
        });
    }

    public void setOkVisiable(final IDeleteDialogCallback callback) {
        mCallback = callback;
        mOkTv.setVisibility(View.VISIBLE);
        mOkTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (mApiClient == null) {
                        mApiClient = new ApiClient<BaseListResult<LoginInfo>>();
                    }
                    Map<String, String> params = new HashMap<>();
                    params.put("passWord", mPwdEt.getText().toString());
                    params.put("shopId", SpUtil.getShopId() + "");
                    params.put("equipmentId", SpUtil.getShopId() + "");
                    params.put("branchId",SpUtil.getBranchId()+"");
                    params.put("headOfficeId",SpUtil.getHeadOfficeId()+"");
                    showRDialog();
                    mApiClient.reqApi("userLoginBoss", params, ApiRequest.RespDataType.RESPONSE_JSON)
                            .updateUI(new Callback<BaseListResult<LoginInfo>>() {
                                @Override
                                public void onSuccess(BaseListResult<LoginInfo> baseResult) {
                                    closeKeybord(mPwdEt,getContext());
                                    hideRDialog();
                                    if (mCallback != null && baseResult != null && baseResult.isSuccess()) {
                                        mCallback.verificationPwd(true);
                                    } else if (callback != null) {
                                        callback.verificationPwd(false);
                                    }
                                }

                                @Override
                                public void onError(Throwable e) {
                                    super.onError(e);
                                    Logger.e("",e);
                                    hideRDialog();
                                    if (callback != null) {
                                        callback.verificationPwd(false);
                                    }
                                }
                            });
            }
        });
    }

    private RequestDialog mRDialog;
    public void showRDialog() {
        if (mRDialog == null) {
            mRDialog = new RequestDialog(getContext());
        }
        mRDialog.show();

    }

    public void hideRDialog() {
        if (mRDialog != null) {
            mRDialog.hide();
            mRDialog.dismiss();
        }
    }

    public interface IDeleteDialogCallback {
        /**
         * 验证结果
         * @param b
         */
        void verificationPwd(boolean b);

        /**
         *
         * 对话框消失
         */
        void onDismiss();
    }

    /**
     * 关闭软键盘
     */
    public static void closeKeybord(EditText mEditText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);

        imm.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
    }

}
