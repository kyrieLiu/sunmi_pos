package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPayBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 17);
        sViewsWithIds.put(R.id.iv2, 18);
        sViewsWithIds.put(R.id.iv0, 19);
        sViewsWithIds.put(R.id.textView3, 20);
        sViewsWithIds.put(R.id.iv1, 21);
        sViewsWithIds.put(R.id.iv3, 22);
        sViewsWithIds.put(R.id.iv_presenter_amt, 23);
        sViewsWithIds.put(R.id.iv4, 24);
        sViewsWithIds.put(R.id.textView12, 25);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv1;
    @NonNull
    public final android.widget.ImageView iv2;
    @NonNull
    public final android.widget.ImageView iv3;
    @NonNull
    public final android.widget.ImageView iv4;
    @NonNull
    public final android.widget.ImageView ivPresenterAmt;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView14;
    @NonNull
    private final android.widget.LinearLayout mboundView15;
    @NonNull
    private final android.widget.Button mboundView16;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.widget.TextView textView12;
    @NonNull
    public final android.widget.TextView textView2;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.PayViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickBossZhifubaoAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickZhifubaoPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mViewModelClickXianjinPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mViewModelClickWeixinPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mViewModelClickBossWeixinAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityPayBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds);
        this.iv0 = (android.widget.ImageView) bindings[19];
        this.iv1 = (android.widget.ImageView) bindings[21];
        this.iv2 = (android.widget.ImageView) bindings[18];
        this.iv3 = (android.widget.ImageView) bindings[22];
        this.iv4 = (android.widget.ImageView) bindings[24];
        this.ivPresenterAmt = (android.widget.ImageView) bindings[23];
        this.ll = (android.widget.LinearLayout) bindings[1];
        this.ll.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.LinearLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.LinearLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.Button) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.textView12 = (android.widget.TextView) bindings[25];
        this.textView2 = (android.widget.TextView) bindings[3];
        this.textView2.setTag(null);
        this.textView3 = (android.widget.TextView) bindings[20];
        this.view = (android.view.View) bindings[17];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ys.app.petproject.viewmodel.PayViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.PayViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.PayViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMChargeInfo((ys.app.petproject.model.ChargeInfo) object, fieldId);
            case 1 :
                return onChangeViewModelSeePresenter((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelPayType((android.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.petproject.viewmodel.PayViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMChargeInfo(ys.app.petproject.model.ChargeInfo ViewModelMChargeInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSeePresenter(android.databinding.ObservableBoolean ViewModelSeePresenter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObButtonEnable(android.databinding.ObservableBoolean ViewModelObButtonEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPayType(android.databinding.ObservableInt ViewModelPayType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.PayViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener viewModelClickBossZhifubaoAndroidViewViewOnClickListener = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMChargeInfoPresentAmtMboundView7AndroidStringYuan = null;
        android.view.View.OnClickListener viewModelClickZhifubaoPayAndroidViewViewOnClickListener = null;
        boolean viewModelPayTypeInt1 = false;
        int viewModelPayTypeGet = 0;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelMChargeInfoName = null;
        boolean viewModelPayTypeInt7 = false;
        int viewModelSeePresenterViewVISIBLEViewGONE = 0;
        java.lang.String appUtilFormatStandardMoneyViewModelMChargeInfoChargeMoney = null;
        android.view.View.OnClickListener viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = null;
        java.lang.String viewModelMChargeInfoCardNo = null;
        ys.app.petproject.model.ChargeInfo viewModelMChargeInfo = null;
        android.view.View.OnClickListener viewModelClickXianjinPayAndroidViewViewOnClickListener = null;
        boolean viewModelSeePresenterGet = false;
        boolean viewModelPayTypeInt6 = false;
        android.databinding.ObservableBoolean viewModelSeePresenter = null;
        boolean viewModelObButtonEnableGet = false;
        java.lang.String viewModelMChargeInfoChargeMoney = null;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        java.lang.String viewModelMChargeInfoPhone = null;
        double viewModelMChargeInfoMoney = 0.0;
        java.lang.String appUtilFormatStandardMoneyViewModelMChargeInfoChargeMoneyMboundView5AndroidStringYuan = null;
        android.view.View.OnClickListener viewModelClickWeixinPayAndroidViewViewOnClickListener = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMChargeInfoPresentAmt = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt0MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMChargeInfoMoneyMboundView8AndroidStringYuan = null;
        boolean viewModelPayTypeInt8 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt7MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt8MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput = null;
        java.lang.String viewModelMChargeInfoPresentAmt = null;
        android.view.View.OnClickListener viewModelClickWeixinScannerPayAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickBossWeixinAndroidViewViewOnClickListener = null;
        boolean viewModelPayTypeInt3 = false;
        java.lang.String appUtilFormatStandardMoneyViewModelMChargeInfoMoney = null;
        boolean viewModelPayTypeInt5 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt3MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput = null;
        android.databinding.ObservableInt viewModelPayType = null;
        boolean viewModelPayTypeInt0 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput = null;
        ys.app.petproject.viewmodel.PayViewModel viewModel = mViewModel;
        android.graphics.drawable.Drawable viewModelPayTypeInt1MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickBossZhifubao
                        viewModelClickBossZhifubaoAndroidViewViewOnClickListener = (((mViewModelClickBossZhifubaoAndroidViewViewOnClickListener == null) ? (mViewModelClickBossZhifubaoAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickBossZhifubaoAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickZhifubaoPay
                        viewModelClickZhifubaoPayAndroidViewViewOnClickListener = (((mViewModelClickZhifubaoPayAndroidViewViewOnClickListener == null) ? (mViewModelClickZhifubaoPayAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickZhifubaoPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickZhifubaoScannerPay
                        viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = (((mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener == null) ? (mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickXianjinPay
                        viewModelClickXianjinPayAndroidViewViewOnClickListener = (((mViewModelClickXianjinPayAndroidViewViewOnClickListener == null) ? (mViewModelClickXianjinPayAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mViewModelClickXianjinPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickWeixinPay
                        viewModelClickWeixinPayAndroidViewViewOnClickListener = (((mViewModelClickWeixinPayAndroidViewViewOnClickListener == null) ? (mViewModelClickWeixinPayAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mViewModelClickWeixinPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickWeixinScannerPay
                        viewModelClickWeixinScannerPayAndroidViewViewOnClickListener = (((mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener == null) ? (mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickBossWeixin
                        viewModelClickBossWeixinAndroidViewViewOnClickListener = (((mViewModelClickBossWeixinAndroidViewViewOnClickListener == null) ? (mViewModelClickBossWeixinAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mViewModelClickBossWeixinAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mChargeInfo
                        viewModelMChargeInfo = viewModel.mChargeInfo;
                    }
                    updateRegistration(0, viewModelMChargeInfo);


                    if (viewModelMChargeInfo != null) {
                        // read viewModel.mChargeInfo.name
                        viewModelMChargeInfoName = viewModelMChargeInfo.getName();
                        // read viewModel.mChargeInfo.cardNo
                        viewModelMChargeInfoCardNo = viewModelMChargeInfo.getCardNo();
                        // read viewModel.mChargeInfo.chargeMoney
                        viewModelMChargeInfoChargeMoney = viewModelMChargeInfo.getChargeMoney();
                        // read viewModel.mChargeInfo.phone
                        viewModelMChargeInfoPhone = viewModelMChargeInfo.getPhone();
                        // read viewModel.mChargeInfo.money
                        viewModelMChargeInfoMoney = viewModelMChargeInfo.getMoney();
                        // read viewModel.mChargeInfo.presentAmt
                        viewModelMChargeInfoPresentAmt = viewModelMChargeInfo.getPresentAmt();
                    }


                    // read AppUtil.formatStandardMoney(viewModel.mChargeInfo.chargeMoney)
                    appUtilFormatStandardMoneyViewModelMChargeInfoChargeMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMChargeInfoChargeMoney);
                    // read AppUtil.formatStandardMoney(viewModel.mChargeInfo.money)
                    appUtilFormatStandardMoneyViewModelMChargeInfoMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMChargeInfoMoney);
                    // read AppUtil.formatStandardMoney(viewModel.mChargeInfo.presentAmt)
                    appUtilFormatStandardMoneyViewModelMChargeInfoPresentAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMChargeInfoPresentAmt);


                    // read (AppUtil.formatStandardMoney(viewModel.mChargeInfo.chargeMoney)) + (@android:string/yuan)
                    appUtilFormatStandardMoneyViewModelMChargeInfoChargeMoneyMboundView5AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMChargeInfoChargeMoney) + (mboundView5.getResources().getString(R.string.yuan));
                    // read (AppUtil.formatStandardMoney(viewModel.mChargeInfo.money)) + (@android:string/yuan)
                    appUtilFormatStandardMoneyViewModelMChargeInfoMoneyMboundView8AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMChargeInfoMoney) + (mboundView8.getResources().getString(R.string.yuan));
                    // read (AppUtil.formatStandardMoney(viewModel.mChargeInfo.presentAmt)) + (@android:string/yuan)
                    appUtilFormatStandardMoneyViewModelMChargeInfoPresentAmtMboundView7AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMChargeInfoPresentAmt) + (mboundView7.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.seePresenter
                        viewModelSeePresenter = viewModel.seePresenter;
                    }
                    updateRegistration(1, viewModelSeePresenter);


                    if (viewModelSeePresenter != null) {
                        // read viewModel.seePresenter.get()
                        viewModelSeePresenterGet = viewModelSeePresenter.get();
                    }
                if((dirtyFlags & 0x32L) != 0) {
                    if(viewModelSeePresenterGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.seePresenter.get() ? View.VISIBLE : View.GONE
                    viewModelSeePresenterViewVISIBLEViewGONE = ((viewModelSeePresenterGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obButtonEnable
                        viewModelObButtonEnable = viewModel.obButtonEnable;
                    }
                    updateRegistration(2, viewModelObButtonEnable);


                    if (viewModelObButtonEnable != null) {
                        // read viewModel.obButtonEnable.get()
                        viewModelObButtonEnableGet = viewModelObButtonEnable.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.payType
                        viewModelPayType = viewModel.payType;
                    }
                    updateRegistration(3, viewModelPayType);


                    if (viewModelPayType != null) {
                        // read viewModel.payType.get()
                        viewModelPayTypeGet = viewModelPayType.get();
                    }


                    // read viewModel.payType.get() == 1
                    viewModelPayTypeInt1 = (viewModelPayTypeGet) == (1);
                    // read viewModel.payType.get() == 7
                    viewModelPayTypeInt7 = (viewModelPayTypeGet) == (7);
                    // read viewModel.payType.get() == 6
                    viewModelPayTypeInt6 = (viewModelPayTypeGet) == (6);
                    // read viewModel.payType.get() == 8
                    viewModelPayTypeInt8 = (viewModelPayTypeGet) == (8);
                    // read viewModel.payType.get() == 3
                    viewModelPayTypeInt3 = (viewModelPayTypeGet) == (3);
                    // read viewModel.payType.get() == 5
                    viewModelPayTypeInt5 = (viewModelPayTypeGet) == (5);
                    // read viewModel.payType.get() == 0
                    viewModelPayTypeInt0 = (viewModelPayTypeGet) == (0);
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt1) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt7) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt6) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt8) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt3) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt5) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPayTypeInt0) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt1MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt1) ? (getDrawableFromResource(mboundView10, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView10, R.drawable.shape_login_input)));
                    // read viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt7MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt7) ? (getDrawableFromResource(mboundView14, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView14, R.drawable.shape_login_input)));
                    // read viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt6) ? (getDrawableFromResource(mboundView12, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView12, R.drawable.shape_login_input)));
                    // read viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt8MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt8) ? (getDrawableFromResource(mboundView15, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView15, R.drawable.shape_login_input)));
                    // read viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt3MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt3) ? (getDrawableFromResource(mboundView13, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView13, R.drawable.shape_login_input)));
                    // read viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt5) ? (getDrawableFromResource(mboundView11, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView11, R.drawable.shape_login_input)));
                    // read viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt0MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt0) ? (getDrawableFromResource(mboundView9, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView9, R.drawable.shape_login_input)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView10, viewModelPayTypeInt1MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView11, viewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView12, viewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView13, viewModelPayTypeInt3MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView14, viewModelPayTypeInt7MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView15, viewModelPayTypeInt8MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView9, viewModelPayTypeInt0MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(viewModelClickZhifubaoPayAndroidViewViewOnClickListener);
            this.mboundView11.setOnClickListener(viewModelClickWeixinScannerPayAndroidViewViewOnClickListener);
            this.mboundView12.setOnClickListener(viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener);
            this.mboundView13.setOnClickListener(viewModelClickXianjinPayAndroidViewViewOnClickListener);
            this.mboundView14.setOnClickListener(viewModelClickBossWeixinAndroidViewViewOnClickListener);
            this.mboundView15.setOnClickListener(viewModelClickBossZhifubaoAndroidViewViewOnClickListener);
            this.mboundView16.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            this.mboundView9.setOnClickListener(viewModelClickWeixinPayAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView16.setEnabled(viewModelObButtonEnableGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMChargeInfoCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelMChargeInfoPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, appUtilFormatStandardMoneyViewModelMChargeInfoChargeMoneyMboundView5AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, appUtilFormatStandardMoneyViewModelMChargeInfoPresentAmtMboundView7AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, appUtilFormatStandardMoneyViewModelMChargeInfoMoneyMboundView8AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, viewModelMChargeInfoName);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(viewModelSeePresenterViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBossZhifubao(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickZhifubaoPay(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickZhifubaoScannerPay(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXianjinPay(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickWeixinPay(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl6 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickWeixinScannerPay(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PayViewModel value;
        public OnClickListenerImpl7 setValue(ys.app.petproject.viewmodel.PayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBossWeixin(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityPayBinding>inflate(inflater, ys.app.petproject.R.layout.activity_pay, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityPayBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_pay, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityPayBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPayBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_pay_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityPayBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.mChargeInfo
        flag 1 (0x2L): viewModel.seePresenter
        flag 2 (0x3L): viewModel.obButtonEnable
        flag 3 (0x4L): viewModel.payType
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.seePresenter.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.seePresenter.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 9 (0xaL): viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 10 (0xbL): viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 11 (0xcL): viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 12 (0xdL): viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 13 (0xeL): viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 14 (0xfL): viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 15 (0x10L): viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 16 (0x11L): viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 17 (0x12L): viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 18 (0x13L): viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 19 (0x14L): viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 20 (0x15L): viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 21 (0x16L): viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
    flag mapping end*/
    //end
}