package ys.app.petproject.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputType;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.greendao.CommitOrderTempInfoDao;
import com.greendao.EmployeeInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.adapter.manage.EmployeeAdapter;
import ys.app.petproject.callback.KeyboardListener;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.itemmodel.CardNumberList2Bean;
import ys.app.petproject.model.BaseShoppingCarInfo;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widget.KeyboardLayout;
import ys.app.petproject.widget.wrapperRecylerView.DividerItemDecoration;


/**
 * Created by aaa on 2017/3/14.
 */

public class AddDialog extends Dialog implements KeyboardListener {

    private final EditText mPriceEt;
    private final TextView mNameTv;
    private final Activity mActivity;
    private final KeyboardLayout mKeyboardLayout;
    private final Button mCancelTv;
    private final ImageView mJianhaoIv;
    private final ImageView mJiahaoIv;
    private final EditText mNumEt;
    private final TextView mNameTitleTv;
    private final TextView mPriceTitleTv;
    private final TextView mNumTitleTv;
    private final TextView mTitleTv;
    private final TextView mSelectEmployeeTv;
    private TextView tv_gift;
    private final LinearLayout mSelectEmployeeLl;
    public boolean priceHasFocus;
    private boolean numHasFocus;
    private int mNum = 1;

    private OnClickConfirmListenner listenner;
    private OnClickNumConfirmListener numListener;
    private EmployeeInfo mEmployeeInfo;
    private List<EmployeeInfo> mEmployeeInfos;
    private PopupWindow mPop;
    private GoodInfo mGoodInfo;
    private ServiceInfo mServiceInfo;
    private CardNumberList2Bean numServiceInfo;
    private View mContentView;
    private String originalPrice;
    private int isGift=0;


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(Gravity.BOTTOM); //显示在底部

        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = d.getWidth(); //设置dialog的宽度为当前手机屏幕的宽度
        getWindow().setAttributes(p);
    }


    public AddDialog(Activity activity) {
        super(activity, R.style.ThemeCustomDialog);
        super.setContentView(R.layout.dialog_add_service);
        this.mActivity = activity;

        mTitleTv = (TextView) findViewById(R.id.title_tv);
        mNameTitleTv = (TextView) findViewById(R.id.name_title_tv);
        mPriceTitleTv = (TextView) findViewById(R.id.price_title_tv);
        mNumTitleTv = (TextView) findViewById(R.id.num_title_tv);
        mNameTv = (TextView) findViewById(R.id.name_tv);
        mSelectEmployeeTv = (TextView) findViewById(R.id.select_employee_tv);
        mSelectEmployeeLl = (LinearLayout) findViewById(R.id.select_employee_ll);


        mCancelTv = (Button) findViewById(R.id.cancel_tv);
        mPriceEt = (EditText) findViewById(R.id.price_et);

        mJianhaoIv = (ImageView) findViewById(R.id.jianhao_iv);
        mJiahaoIv = (ImageView) findViewById(R.id.jiahao_tv);
        mNumEt = (EditText) findViewById(R.id.num_et);
        tv_gift= (TextView) findViewById(R.id.tv_add_dialog_isGift);
        mKeyboardLayout = (KeyboardLayout) findViewById(R.id.keyboardLayout);

        init();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        mPriceEt.clearFocus();
        closeKeybord(mPriceEt, mActivity);
        mNumEt.clearFocus();
        closeKeybord(mNumEt,mActivity);
    }

    @Override
    public void show() {
        super.show();
    }

    private void init() {

        getEmployeeListFromDb();

        mPriceEt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                hideSoft();
                closeKeybord(mPriceEt, mActivity);
                return false;
            }
        });
        mNumEt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                hideSoft();
                closeKeybord(mNumEt,mActivity);
                return false;
            }
        });

        mKeyboardLayout.setListener(this);

        mPriceEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                AddDialog.this.priceHasFocus = hasFocus;
            }
        });
        mNumEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                AddDialog.this.numHasFocus=hasFocus;
            }
        });

        mCancelTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddDialog.this.dismiss();
                mNum=1;
            }
        });

        mJiahaoIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum++;
                mNumEt.setText(mNum + "");
            }
        });

        mJianhaoIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mNum <= 1) {
                    Toast.makeText(mActivity, "最低购买数量为1", Toast.LENGTH_SHORT).show();
                } else {
                    mNum--;
                    mNumEt.setText(mNum + "");
                }

            }
        });

        mSelectEmployeeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPop();
            }
        });

        tv_gift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingIsGift();
            }
        });

        closeKeybord(mPriceEt, mActivity);
        closeKeybord(mNumEt,mActivity);
    }

    public void hideEt() {
        closeKeybord(mPriceEt, mActivity);
        closeKeybord(mNumEt,mActivity);
    }

    private void showPop() {
        mPop = new PopupWindow(mContentView, mSelectEmployeeLl.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT, true);
        mPop.setTouchInterceptor(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
        Drawable drawable = mActivity.getResources().getDrawable(R.drawable.shape_pop_bg);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        mPop.setBackgroundDrawable(drawable);
        mPop.showAsDropDown(mSelectEmployeeLl);
    }


    private void getEmployeeListFromDb() {
        mEmployeeInfos = GreenDaoUtils.getSingleTon().getmDaoSession().getEmployeeInfoDao().loadAll();
        // 一个自定义的布局，作为显示的内容
        mContentView = LayoutInflater.from(mActivity).inflate(R.layout.pop_window, null);
        // 设置按钮的点击事件
        RecyclerView recyclerView = (RecyclerView) mContentView.findViewById(R.id.recyclerView);
        EmployeeAdapter adapter = new EmployeeAdapter(mActivity);
        recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        recyclerView.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration.VERTICAL_LIST, R.drawable.shape_recyclerview_division_line));
        recyclerView.setAdapter(adapter);
        adapter.setList(mEmployeeInfos);
        adapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                AddDialog.this.mEmployeeInfo = mEmployeeInfos.get(position);
                mSelectEmployeeTv.setText(mEmployeeInfo.getName());
                if (mPop != null) {
                    mPop.dismiss();
                }
            }
        });
    }



    @Override
    public void onNumberClick(String num) {
        if (priceHasFocus) {
            String content = mPriceEt.getText().append(num).toString();
            mPriceEt.setText(content);
            mPriceEt.setSelection(content.length());
        }else if (numHasFocus){
            String number= mNumEt.getText().append(num).toString();
            mNumEt.setText(number);
            mNumEt.setSelection(number.length());
            mNum = Integer.parseInt(number);
        }
    }

    @Override
    public void onPointClick() {
        if (priceHasFocus) {
            String content = mPriceEt.getText().toString();
            boolean isContains = content.contains(".");
            if (!isContains) {
                mPriceEt.setText(mPriceEt.getText().append("."));
                mPriceEt.setSelection(content.length() + 1);
            }
        }else if (numHasFocus){
            Toast.makeText(mActivity,"数量必须为整数",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDeleteClick() {
        if (priceHasFocus) {
            Editable text = mPriceEt.getText();
            if (text.length() > 0) {
                mPriceEt.setText(text.delete(text.length() - 1, text.length()));
                mPriceEt.setSelection(text.length());
            }
        }else if (numHasFocus){
            Editable text = mNumEt.getText();
            if (text.length() > 0) {
                Editable numberEdit=text.delete(text.length() - 1, text.length());
                String numberString=numberEdit.toString();
                mNumEt.setText(numberEdit);
                mNumEt.setSelection(text.length());
                if (numberString.equals("")){
                   mNum=0;
                }else {
                    mNum = Integer.parseInt(numberString);
                }
            }
        }
    }

    @Override
    public void onOkClick() {
        String content = mPriceEt.getText().toString();
        if (StringUtils.isEmptyOrWhitespace(content)) {
            Toast.makeText(mActivity, "请输入正确的数值", Toast.LENGTH_SHORT).show();
            return;
        }
        String number= mNumEt.getText().toString();
        if (StringUtils.isEmptyOrWhitespace(number)){
            Toast.makeText(mActivity, "请输入商品数量", Toast.LENGTH_SHORT).show();
            return;
        }
        mNum=Integer.parseInt(number);


        if (mEmployeeInfo == null) {
            EmployeeInfoDao employeeInfoDao = GreenDaoUtils.getmDaoSession().getEmployeeInfoDao();
            List<EmployeeInfo> list=employeeInfoDao.loadAll();
            if (list != null && list.size() > 0) {
                mEmployeeInfo = list.get(0);
            } else {
                Toast.makeText(mActivity, "请在员工管理里添加员工", Toast.LENGTH_LONG).show();
                dismiss();
                return;
            }
        }

        if (listenner != null) {
            boolean haveNumCard=judgeHaveNumCard();
            if (haveNumCard){
                Toast.makeText(getContext(),"购物车含有次卡服务,不能购买其他商品",Toast.LENGTH_LONG).show();
                return;
            }
            if (mGoodInfo != null) {
                if (mNum>mGoodInfo.getStockNum()){
                    Toast.makeText(mActivity,"库存仅剩余"+mGoodInfo.getStockNum()+"件商品",Toast.LENGTH_SHORT).show();
                    return;
                }
                content=content.replaceAll(",","");
                if (Constants.is_not_promotion == mGoodInfo.getIsPromotion()) {
                    mGoodInfo.setRealAmt(Double.parseDouble(content));
                }else if (Constants.is_promotion == mGoodInfo.getIsPromotion()){
                    mGoodInfo.setPromotionAmt(Double.parseDouble(content));
                }
                mGoodInfo.setVipPrice(Double.parseDouble(content));
                listenner.onClickGoodsConfirm(mGoodInfo, mEmployeeInfo, mNum,isGift);
            }
            if (mServiceInfo != null) {
                content=content.replaceAll(",","");
                if (Constants.is_not_promotion == mServiceInfo.getIsPromotion()) {
                    mServiceInfo.setRealAmt(Double.parseDouble(content));
                }else if (Constants.is_promotion == mServiceInfo.getIsPromotion()){
                    mServiceInfo.setPromotionAmt(Double.parseDouble(content));
                }
                mServiceInfo.setVipPrice(Double.parseDouble(content));
                listenner.onClickServiceConfirm(mServiceInfo, mEmployeeInfo, mNum,isGift);
            }

            dismiss();
            mNum=1;
        } else  if (numListener !=null){
            if (mNum>numServiceInfo.getNumber()){
                Toast.makeText(mActivity,"最多购买"+numServiceInfo.getNumber()+"次服务",Toast.LENGTH_SHORT).show();
                return;
            }
            boolean canBuy=judgeCanBuyNumService(numServiceInfo.getCardId());
            if (canBuy){
                numListener.onClickNumServiceConfirm(numServiceInfo, mEmployeeInfo, mNum,isGift);
                dismiss();
                mNum=1;
            }else{
                Toast.makeText(getContext(),"购物车含有其他类型的商品,不能购买该次卡服务",Toast.LENGTH_LONG).show();
            }
        }
    }


    public void setListenner(OnClickConfirmListenner listenner) {
        this.listenner = listenner;
    }
    public void setNumServiceListner(OnClickNumConfirmListener numListener){
        this.numListener = numListener;
    }

    public void setModel(BaseShoppingCarInfo info) {
        if (info instanceof GoodInfo) {
            this.mGoodInfo = (GoodInfo) info;
            mNameTv.setText(mGoodInfo.getName());
            if (Constants.is_promotion == mGoodInfo.getIsPromotion()) {//促销
                mPriceEt.setText(AppUtil.formatStandardMoney(mGoodInfo.getPromotionAmt()));
                mPriceTitleTv.setText("促销价格 :");
                mPriceEt.setEnabled(false);
            } else {
                mPriceEt.setText(AppUtil.formatStandardMoney(mGoodInfo.getRealAmt()));
                mPriceTitleTv.setText("商品价格 :");
                mPriceEt.setEnabled(true);
            }
        }
        if (info instanceof ServiceInfo) {
            this.mServiceInfo = (ServiceInfo) info;
            mNameTv.setText(mServiceInfo.getName());

            if (Constants.is_promotion == mServiceInfo.getIsPromotion()) {//促销
                mPriceEt.setText(AppUtil.formatStandardMoney(mServiceInfo.getPromotionAmt()));
                mPriceTitleTv.setText("促销价格 :");
                mPriceEt.setEnabled(false);
            } else {
                mPriceEt.setText(AppUtil.formatStandardMoney(mServiceInfo.getRealAmt()));
                mPriceTitleTv.setText("服务价格 :");
                mPriceEt.setEnabled(true);
            }

            mTitleTv.setText("添加服务");
            mNameTitleTv.setText("服务名称 :");
            mNumTitleTv.setText("服务数量 :");
        }else if (info instanceof  CardNumberList2Bean){
            this.numServiceInfo= (CardNumberList2Bean) info;
            mNameTv.setText(numServiceInfo.getProductName());
            mPriceEt.setText(AppUtil.formatStandardMoney(numServiceInfo.getRealAmt()));
            mPriceTitleTv.setText("服务价格 :");
            mTitleTv.setText("添加服务");
            mNameTitleTv.setText("服务名称 :");
            mNumTitleTv.setText("服务数量 :");
            tv_gift.setVisibility(View.GONE);
        }
        mNumEt.setText("1");
        tv_gift.setText("非赠送");
        isGift=0;
    }
    //是否可以修改价格
    public void setCanModifyPrice(boolean canModify){
        if (!canModify){
            mPriceEt.setFocusable(false);
            mPriceEt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mActivity,"次卡不可修改价格",Toast.LENGTH_SHORT).show();
                }
            });
        }else{
            mPriceEt.setEnabled(true);
        }
    }

    public interface OnClickConfirmListenner {

        void onClickGoodsConfirm(GoodInfo goodInfo, EmployeeInfo employeeInfo, int num,int isGift);

        void onClickServiceConfirm(ServiceInfo serviceTypeInfo, EmployeeInfo employeeInfo, int num,int isGift);
    }
    //次卡回调
    public interface OnClickNumConfirmListener{
        void onClickNumServiceConfirm(CardNumberList2Bean goodInfo, EmployeeInfo employeeInfo, int num,int isGift);
    }


    private void hideSoft() {
        mActivity.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        int currentVersion = android.os.Build.VERSION.SDK_INT;
        String methodName = null;
        if (currentVersion >= 16) {
            // 4.2
            methodName = "setShowSoftInputOnFocus";
        } else if (currentVersion >= 14) {
            // 4.0
            methodName = "setSoftInputShownOnFocus";
        }
        if (methodName == null) {
            mPriceEt.setInputType(InputType.TYPE_NULL);
            mNumEt.setInputType(InputType.TYPE_NULL);
        } else {
            Class<EditText> cls = EditText.class;
            Method setShowSoftInputOnFocus;
            try {
                setShowSoftInputOnFocus = cls.getMethod(methodName,
                        boolean.class);
                setShowSoftInputOnFocus.setAccessible(true);
                setShowSoftInputOnFocus.invoke(mPriceEt, false);
                setShowSoftInputOnFocus.invoke(mNumEt,false);
            } catch (NoSuchMethodException e) {
                mPriceEt.setInputType(InputType.TYPE_NULL);
                mNumEt.setInputType(InputType.TYPE_NULL);
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 设置是否赠送
     */
    private void settingIsGift(){
        String giftString=tv_gift.getText().toString();
        if (giftString.equals("非赠送")){
            //originalPrice=mPriceEt.getText().toString();
            tv_gift.setText("赠送");
            isGift=1;
           // mPriceEt.setText("0");
        }else{
            tv_gift.setText("非赠送");
            isGift=0;
            //mPriceEt.setText(originalPrice);
        }
    }
    //判断是否可以购买   限制条件,如果购物车内有次卡服务,则不能买其他产品,如果购物车内有其他产品,则不能购买该次卡服务
    public boolean judgeCanBuyNumService(int cardID){
        boolean result=false;
        CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
       List<CommitOrderTempInfo> list=commitOrderTempInfoDao.loadAll();
        if (list.size()==0){
            result=true;
        }else{
            QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
            qb.where(CommitOrderTempInfoDao.Properties.CardID.eq(cardID), CommitOrderTempInfoDao.Properties.Type.eq(3));
            list=qb.list();

            if (list.size()>0){
                result=true;
            }else{
                result=false;
            }
        }
        Log.i("info","判断次卡结果"+result);
        return result;
    }
    //判断是否可以购买   限制条件,如果购物车内有次卡服务,则不能买其他产品,如果购物车内有其他产品,则不能购买该次卡服务
    public boolean judgeHaveNumCard(){
        CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
        QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
        qb.where(CommitOrderTempInfoDao.Properties.Type.eq(3));
        if (qb.list().size()>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 关闭软键盘
     */
    public static void closeKeybord(EditText mEditText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);

        imm.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
    }

    /**
     * 打卡软键盘
     */
    public static void openKeybord(EditText mEditText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(mEditText, InputMethodManager.RESULT_SHOWN);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,
                InputMethodManager.HIDE_IMPLICIT_ONLY);
    }
}
