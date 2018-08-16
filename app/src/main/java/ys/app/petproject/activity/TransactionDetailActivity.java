package ys.app.petproject.activity;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.TransactionDetailBinding;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.ChargeResultInfo;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.viewmodel.TransactionDetailViewModel;
import ys.app.petproject.widget.dialog.CustomDialog;
import ys.app.petproject.widget.dialog.DeleteDialog;

/**
 * Created by admin on 2017/6/11.
 */

public class TransactionDetailActivity extends BaseActivity {
    private TransactionDetailViewModel mViewModel;
    private TransactionDetailBinding binding;
    private OrderInfo orderInfo;
    private  ApiClient<BaseListResult<ChargeResultInfo>> mClient;
    private TextView tv_print;
    private PopupWindow popupWindow;
    private RelativeLayout toolBar;
    private CustomDialog mDeleteDialog;
    private DeleteDialog mConfirmDeleteDialog;
    public boolean canRefund=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_transaction_detail);
        setBackVisiable();
        setTitle("订单详情");
        setBgWhiteStatusBar();
        Bundle extras = getIntent().getExtras();
        Serializable serializable = extras.getSerializable(Constants.intent_transaction);
        if (serializable instanceof OrderInfo) {
            orderInfo=(OrderInfo) serializable;
            mViewModel = new TransactionDetailViewModel(this, binding,orderInfo );
        }
        binding.setViewModel(mViewModel);
        mViewModel.init();
        toolBar = (RelativeLayout) findViewById(R.id.tool_bar);
        initPopupWindow();

        tv_print = (TextView) findViewById(R.id.modify_tv);
        tv_print.setVisibility(View.VISIBLE);
        tv_print.setText("更多");
        if (orderInfo!=null) tv_print.setVisibility(View.VISIBLE);
        tv_print.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                popupWindow.showAsDropDown(toolBar,120,0, Gravity.RIGHT);

            }
        });

        settingTextView();

    }

    private void settingTextView(){
        ViewTreeObserver observer=tv_print.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                //要显示的drawable
                Drawable d = getResources().getDrawable(R.mipmap.xialaxuan);
                //设置显示大小
                d.setBounds(0, 0, 22, 17);
                //为TextView添加drawableLeft（函数对应的参数是：drawableLeft，drawableTop，drawableRight，drawableBottom）
                tv_print.setCompoundDrawables(null, null, d, null);
                //取消监听
                tv_print.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    private void initPopupWindow(){

        LayoutInflater layoutInflater = (LayoutInflater) this.getSystemService(this.LAYOUT_INFLATER_SERVICE);
        final View popupView = layoutInflater.inflate(R.layout.popup_transaction_detail, null);
        popupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setBackgroundDrawable(this.getResources().getDrawable(R.color.white));
        Button bt_print=(Button) popupView.findViewById(R.id.bt_popup_item1);
        Button bt_returnMoney=(Button) popupView.findViewById(R.id.bt_popup_item2);
        Button bt_cancel=(Button) popupView.findViewById(R.id.bt_popup_item3);
        bt_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
                mViewModel.printOrder(tv_print);
            }
        });
        bt_returnMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();

                showReturnDialog();

            }
        });
        bt_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
    }
    private void showReturnDialog() {

        if (orderInfo.getIsRefund()==1||!canRefund){
            showToast("该订单已产生过退款");
            return;
        }
        if (orderInfo.getRechargeList()!=null&&orderInfo.getRechargeList().size()>0){
            showToast("充值订单不支持退款");
            return;
        }
        if (orderInfo.getIsClassification()==1){
            showToast("次卡支付不支持退款");
            return;
        }


        if (mDeleteDialog == null) {
            mDeleteDialog = new CustomDialog(this);
            if ("0112".equals(orderInfo.getPayedMethod())){
                mDeleteDialog.setContent("个人微信收款需打开微信客户端手动退款,请确认是否已退款?");
            }else if ("0113".equals(orderInfo.getPayedMethod())){
                mDeleteDialog.setContent("个人支付宝收款需打开支付宝客户端手动退款,请确认是否已退款?");
            }else{
                mDeleteDialog.setContent("确定全额退款?");
            }

            mDeleteDialog.setCancelVisiable();
        }

        mDeleteDialog.setOkVisiable(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDeleteDialog.dismiss();
                if (mConfirmDeleteDialog == null) {
                    mConfirmDeleteDialog = new DeleteDialog(TransactionDetailActivity.this);
                }
                mConfirmDeleteDialog.setOkVisiable(new DeleteDialog.IDeleteDialogCallback() {
                    @Override
                    public void verificationPwd(boolean b) {
                        if (b) {
                            if (mConfirmDeleteDialog != null) {
                                mConfirmDeleteDialog.dismiss();
                            }
                            String payMethod=orderInfo.getPayedMethod();
                            if ("0112".equals(payMethod)||"0113".equals(payMethod)||"8888".equals(payMethod)||"1001".equals(payMethod)){
                                mViewModel.updateOrder("");
                            }else{
                                mViewModel.turnBackMoney();
                            }

                        } else {
                            Toast.makeText(TransactionDetailActivity.this, "密码输入错误请重新输入", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onDismiss() {
                        mConfirmDeleteDialog = null;
                    }
                });
                mConfirmDeleteDialog.show();

            }

        });
        mDeleteDialog.show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mViewModel != null) {
            mViewModel.reset();
        }
        mDeleteDialog=null;
        mConfirmDeleteDialog=null;

    }
}
