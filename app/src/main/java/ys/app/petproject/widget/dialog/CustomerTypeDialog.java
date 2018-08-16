package ys.app.petproject.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.DialogCustomerTypeBinding;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.viewmodel.CustomerTypeViewModel;

/**
 * Created by aaa on 2017/3/15.
 */

public class CustomerTypeDialog extends Dialog{

    private final Activity mActivity;
    private DialogCustomerTypeBinding binding;
    private OnClickListenner listenner;


    public CustomerTypeDialog(BaseActivity activity, boolean isGuadan, int flag, int numCardID) {
        super(activity, R.style.ThemeCustomDialog);
        View view = LayoutInflater.from(activity).inflate(R.layout.dialog_customer_type,null);
        super.setContentView(view);
        binding = DataBindingUtil.bind(view);
        CustomerTypeViewModel viewModel=new CustomerTypeViewModel(this,activity,binding,isGuadan,flag,numCardID);
        binding.setViewModel(viewModel);
        this.mActivity = activity;

        hideSoft();
    }


    private void hideSoft() {
        binding.nameEt.clearFocus();
        binding.phoneEt.clearFocus();
        binding.vipPhoneEt.clearFocus();
        closeKeybord(binding.nameEt,mActivity);
        closeKeybord(binding.phoneEt,mActivity);
        closeKeybord(binding.vipPhoneEt,mActivity);
    }


    public void onClickJump() {
        if(listenner!=null){
            listenner.onClickJump();
        }
        dismiss();
    }

    public void onClickButton(int mPosition, String name, String phone, String s) {
        if(listenner!=null){
            listenner.onClickButton(mPosition,name,phone,s);
        }
    }

    public interface  OnClickListenner{
        void onClickJump();
        void onClickButton(int mPosition, String name, String phone, String s);
        void onCardListener(VipCardInfo vipCardInfo);//纯折扣卡
    }

    public void setListenner(OnClickListenner listenner) {
        this.listenner = listenner;
    }


    public void selectDiscountCard(VipCardInfo vipCardInfo){
        if (listenner!=null){
            listenner.onCardListener(vipCardInfo);
        }
    }

    /**
     * 关闭软键盘
     */
    public static void closeKeybord(EditText mEditText, Context mContext)
    {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);

        imm.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
    }
}
