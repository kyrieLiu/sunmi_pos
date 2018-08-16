package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityShoppingPayBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 12);
        sViewsWithIds.put(R.id.ll, 13);
    }
    // views
    @NonNull
    public final android.widget.Button button;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ShoppingPayViewModel mViewModel;
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

    public ActivityShoppingPayBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.button = (android.widget.Button) bindings[11];
        this.button.setTag(null);
        this.ll = (android.widget.LinearLayout) bindings[13];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.view = (android.view.View) bindings[12];
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
            setViewModel((ys.app.petproject.viewmodel.ShoppingPayViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ShoppingPayViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ShoppingPayViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObPayMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelOrderType((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeViewModelPayType((android.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ShoppingPayViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObPayMoney(android.databinding.ObservableField<java.lang.String> ViewModelObPayMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObButtonEnable(android.databinding.ObservableBoolean ViewModelObButtonEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderType(android.databinding.ObservableInt ViewModelOrderType, int fieldId) {
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
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ShoppingPayViewModel ViewModel, int fieldId) {
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
        android.view.View.OnClickListener viewModelClickZhifubaoPayAndroidViewViewOnClickListener = null;
        boolean viewModelPayTypeInt1 = false;
        int viewModelPayTypeGet = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObPayMoney = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        boolean viewModelPayTypeInt7 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt8MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = null;
        boolean viewModelOrderTypeInt1 = false;
        android.view.View.OnClickListener viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt5MboundView4AndroidDrawableXuanzhongMboundView4AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickXianjinPayAndroidViewViewOnClickListener = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView3AndroidDrawableShapeInputEnableViewModelPayTypeInt1MboundView3AndroidDrawableXuanzhongMboundView3AndroidDrawableShapeLoginInput = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObPayMoneyMboundView1AndroidStringYuan = null;
        boolean viewModelPayTypeInt6 = false;
        boolean viewModelObButtonEnableGet = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView4AndroidDrawableShapeInputEnableViewModelPayTypeInt5MboundView4AndroidDrawableXuanzhongMboundView4AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt3MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView2AndroidDrawableShapeInputEnableViewModelPayTypeInt0MboundView2AndroidDrawableXuanzhongMboundView2AndroidDrawableShapeLoginInput = null;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        android.view.View.OnClickListener viewModelClickWeixinPayAndroidViewViewOnClickListener = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt7MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = null;
        java.lang.String viewModelObPayMoneyGet = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView9AndroidDrawableShapeInputEnableViewModelPayTypeInt7MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = null;
        boolean viewModelPayTypeInt8 = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView8AndroidDrawableShapeInputEnableViewModelPayTypeInt3MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView10AndroidDrawableShapeInputEnableViewModelPayTypeInt8MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt0MboundView2AndroidDrawableXuanzhongMboundView2AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt6MboundView5AndroidDrawableXuanzhongMboundView5AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickWeixinScannerPayAndroidViewViewOnClickListener = null;
        int viewModelOrderTypeGet = 0;
        boolean ViewModelOrderTypeInt11 = false;
        android.databinding.ObservableInt viewModelOrderType = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView7AndroidDrawableShapeInputEnableMboundView7AndroidDrawableXuanzhong = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt1MboundView3AndroidDrawableXuanzhongMboundView3AndroidDrawableShapeLoginInput = null;
        boolean ViewModelOrderTypeInt12 = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView5AndroidDrawableShapeInputEnableViewModelPayTypeInt6MboundView5AndroidDrawableXuanzhongMboundView5AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickBossWeixinAndroidViewViewOnClickListener = null;
        boolean viewModelOrderTypeInt0 = false;
        boolean viewModelPayTypeInt3 = false;
        java.lang.String appUtilFormatStandardMoneyViewModelObPayMoney = null;
        boolean viewModelPayTypeInt5 = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt0MboundView6AndroidDrawableShapeInputEnableMboundView6AndroidDrawableXuanzhong = null;
        android.databinding.ObservableInt viewModelPayType = null;
        boolean viewModelPayTypeInt0 = false;
        ys.app.petproject.viewmodel.ShoppingPayViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickBossZhifubao
                        viewModelClickBossZhifubaoAndroidViewViewOnClickListener = (((mViewModelClickBossZhifubaoAndroidViewViewOnClickListener == null) ? (mViewModelClickBossZhifubaoAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickBossZhifubaoAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickZhifubaoPay
                        viewModelClickZhifubaoPayAndroidViewViewOnClickListener = (((mViewModelClickZhifubaoPayAndroidViewViewOnClickListener == null) ? (mViewModelClickZhifubaoPayAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickZhifubaoPayAndroidViewViewOnClickListener).setValue(viewModel));
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
                        // read viewModel.obPayMoney
                        viewModelObPayMoney = viewModel.obPayMoney;
                    }
                    updateRegistration(0, viewModelObPayMoney);


                    if (viewModelObPayMoney != null) {
                        // read viewModel.obPayMoney.get()
                        viewModelObPayMoneyGet = viewModelObPayMoney.get();
                    }


                    // read AppUtil.formatStandardMoney(viewModel.obPayMoney.get())
                    appUtilFormatStandardMoneyViewModelObPayMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObPayMoneyGet);


                    // read (AppUtil.formatStandardMoney(viewModel.obPayMoney.get())) + (@android:string/yuan)
                    appUtilFormatStandardMoneyViewModelObPayMoneyMboundView1AndroidStringYuan = (appUtilFormatStandardMoneyViewModelObPayMoney) + (mboundView1.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obButtonEnable
                        viewModelObButtonEnable = viewModel.obButtonEnable;
                    }
                    updateRegistration(1, viewModelObButtonEnable);


                    if (viewModelObButtonEnable != null) {
                        // read viewModel.obButtonEnable.get()
                        viewModelObButtonEnableGet = viewModelObButtonEnable.get();
                    }
            }
            if ((dirtyFlags & 0x3cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderType
                        viewModelOrderType = viewModel.orderType;
                    }
                    updateRegistration(2, viewModelOrderType);


                    if (viewModelOrderType != null) {
                        // read viewModel.orderType.get()
                        viewModelOrderTypeGet = viewModelOrderType.get();
                    }

                if ((dirtyFlags & 0x34L) != 0) {

                        // read viewModel.orderType.get() != 1
                        viewModelOrderTypeInt1 = (viewModelOrderTypeGet) != (1);
                        // read viewModel.orderType.get() == -1
                        ViewModelOrderTypeInt12 = (viewModelOrderTypeGet) == (-1);
                        // read viewModel.orderType.get() != 0
                        viewModelOrderTypeInt0 = (viewModelOrderTypeGet) != (0);
                    if((dirtyFlags & 0x34L) != 0) {
                        if(viewModelOrderTypeInt1) {
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000L;
                        }
                    }
                    if((dirtyFlags & 0x34L) != 0) {
                        if(viewModelOrderTypeInt0) {
                                dirtyFlags |= 0x2000000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000000L;
                        }
                    }


                        // read viewModel.orderType.get() != 1 ? @android:drawable/shape_input_enable : @android:drawable/xuanzhong
                        viewModelOrderTypeInt1MboundView7AndroidDrawableShapeInputEnableMboundView7AndroidDrawableXuanzhong = ((viewModelOrderTypeInt1) ? (getDrawableFromResource(mboundView7, R.drawable.shape_input_enable)) : (getDrawableFromResource(mboundView7, R.drawable.xuanzhong)));
                        // read viewModel.orderType.get() != 0 ? @android:drawable/shape_input_enable : @android:drawable/xuanzhong
                        viewModelOrderTypeInt0MboundView6AndroidDrawableShapeInputEnableMboundView6AndroidDrawableXuanzhong = ((viewModelOrderTypeInt0) ? (getDrawableFromResource(mboundView6, R.drawable.shape_input_enable)) : (getDrawableFromResource(mboundView6, R.drawable.xuanzhong)));
                }

                    // read viewModel.orderType.get() != -1
                    ViewModelOrderTypeInt11 = (viewModelOrderTypeGet) != (-1);
                if((dirtyFlags & 0x3cL) != 0) {
                    if(ViewModelOrderTypeInt11) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x400000000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x401511400L) != 0) {

                if (viewModel != null) {
                    // read viewModel.payType
                    viewModelPayType = viewModel.payType;
                }
                updateRegistration(3, viewModelPayType);


                if (viewModelPayType != null) {
                    // read viewModel.payType.get()
                    viewModelPayTypeGet = viewModelPayType.get();
                }

            if ((dirtyFlags & 0x400L) != 0) {

                    // read viewModel.payType.get() == 1
                    viewModelPayTypeInt1 = (viewModelPayTypeGet) == (1);
                if((dirtyFlags & 0x400L) != 0) {
                    if(viewModelPayTypeInt1) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt1MboundView3AndroidDrawableXuanzhongMboundView3AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt1) ? (getDrawableFromResource(mboundView3, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView3, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x100000L) != 0) {

                    // read viewModel.payType.get() == 7
                    viewModelPayTypeInt7 = (viewModelPayTypeGet) == (7);
                if((dirtyFlags & 0x100000L) != 0) {
                    if(viewModelPayTypeInt7) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt7MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt7) ? (getDrawableFromResource(mboundView9, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView9, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x400000000L) != 0) {

                    // read viewModel.payType.get() == 6
                    viewModelPayTypeInt6 = (viewModelPayTypeGet) == (6);
                if((dirtyFlags & 0x400000000L) != 0) {
                    if(viewModelPayTypeInt6) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt6MboundView5AndroidDrawableXuanzhongMboundView5AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt6) ? (getDrawableFromResource(mboundView5, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView5, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x1000000L) != 0) {

                    // read viewModel.payType.get() == 8
                    viewModelPayTypeInt8 = (viewModelPayTypeGet) == (8);
                if((dirtyFlags & 0x1000000L) != 0) {
                    if(viewModelPayTypeInt8) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt8MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt8) ? (getDrawableFromResource(mboundView10, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView10, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x400000L) != 0) {

                    // read viewModel.payType.get() == 3
                    viewModelPayTypeInt3 = (viewModelPayTypeGet) == (3);
                if((dirtyFlags & 0x400000L) != 0) {
                    if(viewModelPayTypeInt3) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt3MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt3) ? (getDrawableFromResource(mboundView8, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView8, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x1000L) != 0) {

                    // read viewModel.payType.get() == 5
                    viewModelPayTypeInt5 = (viewModelPayTypeGet) == (5);
                if((dirtyFlags & 0x1000L) != 0) {
                    if(viewModelPayTypeInt5) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt5MboundView4AndroidDrawableXuanzhongMboundView4AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt5) ? (getDrawableFromResource(mboundView4, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView4, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x10000L) != 0) {

                    // read viewModel.payType.get() == 0
                    viewModelPayTypeInt0 = (viewModelPayTypeGet) == (0);
                if((dirtyFlags & 0x10000L) != 0) {
                    if(viewModelPayTypeInt0) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt0MboundView2AndroidDrawableXuanzhongMboundView2AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt0) ? (getDrawableFromResource(mboundView2, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView2, R.drawable.shape_login_input)));
            }
        }

        if ((dirtyFlags & 0x3cL) != 0) {

                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView3AndroidDrawableShapeInputEnableViewModelPayTypeInt1MboundView3AndroidDrawableXuanzhongMboundView3AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView3, R.drawable.shape_input_enable)) : (viewModelPayTypeInt1MboundView3AndroidDrawableXuanzhongMboundView3AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView4AndroidDrawableShapeInputEnableViewModelPayTypeInt5MboundView4AndroidDrawableXuanzhongMboundView4AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView4, R.drawable.shape_input_enable)) : (viewModelPayTypeInt5MboundView4AndroidDrawableXuanzhongMboundView4AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView2AndroidDrawableShapeInputEnableViewModelPayTypeInt0MboundView2AndroidDrawableXuanzhongMboundView2AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView2, R.drawable.shape_input_enable)) : (viewModelPayTypeInt0MboundView2AndroidDrawableXuanzhongMboundView2AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView9AndroidDrawableShapeInputEnableViewModelPayTypeInt7MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView9, R.drawable.shape_input_enable)) : (viewModelPayTypeInt7MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView8AndroidDrawableShapeInputEnableViewModelPayTypeInt3MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView8, R.drawable.shape_input_enable)) : (viewModelPayTypeInt3MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView10AndroidDrawableShapeInputEnableViewModelPayTypeInt8MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView10, R.drawable.shape_input_enable)) : (viewModelPayTypeInt8MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView5AndroidDrawableShapeInputEnableViewModelPayTypeInt6MboundView5AndroidDrawableXuanzhongMboundView5AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView5, R.drawable.shape_input_enable)) : (viewModelPayTypeInt6MboundView5AndroidDrawableXuanzhongMboundView5AndroidDrawableShapeLoginInput));
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.button.setEnabled(viewModelObButtonEnableGet);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.button.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, appUtilFormatStandardMoneyViewModelObPayMoneyMboundView1AndroidStringYuan);
        }
        if ((dirtyFlags & 0x3cL) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView10, viewModelOrderTypeInt1MboundView10AndroidDrawableShapeInputEnableViewModelPayTypeInt8MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView2, viewModelOrderTypeInt1MboundView2AndroidDrawableShapeInputEnableViewModelPayTypeInt0MboundView2AndroidDrawableXuanzhongMboundView2AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView3, viewModelOrderTypeInt1MboundView3AndroidDrawableShapeInputEnableViewModelPayTypeInt1MboundView3AndroidDrawableXuanzhongMboundView3AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, viewModelOrderTypeInt1MboundView4AndroidDrawableShapeInputEnableViewModelPayTypeInt5MboundView4AndroidDrawableXuanzhongMboundView4AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView5, viewModelOrderTypeInt1MboundView5AndroidDrawableShapeInputEnableViewModelPayTypeInt6MboundView5AndroidDrawableXuanzhongMboundView5AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView8, viewModelOrderTypeInt1MboundView8AndroidDrawableShapeInputEnableViewModelPayTypeInt3MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView9, viewModelOrderTypeInt1MboundView9AndroidDrawableShapeInputEnableViewModelPayTypeInt7MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView10, (android.view.View.OnClickListener)viewModelClickBossZhifubaoAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView2, (android.view.View.OnClickListener)viewModelClickWeixinPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView3, (android.view.View.OnClickListener)viewModelClickZhifubaoPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView4, (android.view.View.OnClickListener)viewModelClickWeixinScannerPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView5, (android.view.View.OnClickListener)viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView6, viewModelOrderTypeInt0MboundView6AndroidDrawableShapeInputEnableMboundView6AndroidDrawableXuanzhong);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView7, viewModelOrderTypeInt1MboundView7AndroidDrawableShapeInputEnableMboundView7AndroidDrawableXuanzhong);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView8, (android.view.View.OnClickListener)viewModelClickXianjinPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView9, (android.view.View.OnClickListener)viewModelClickBossWeixinAndroidViewViewOnClickListener, ViewModelOrderTypeInt12);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBossZhifubao(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickZhifubaoPay(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickZhifubaoScannerPay(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXianjinPay(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickWeixinPay(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl6 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickWeixinScannerPay(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayViewModel value;
        public OnClickListenerImpl7 setValue(ys.app.petproject.viewmodel.ShoppingPayViewModel value) {
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
    public static ActivityShoppingPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShoppingPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityShoppingPayBinding>inflate(inflater, ys.app.petproject.R.layout.activity_shopping_pay, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityShoppingPayBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShoppingPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_shopping_pay, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityShoppingPayBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShoppingPayBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_shopping_pay_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityShoppingPayBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obPayMoney
        flag 1 (0x2L): viewModel.obButtonEnable
        flag 2 (0x3L): viewModel.orderType
        flag 3 (0x4L): viewModel.payType
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 7 (0x8L): viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 8 (0x9L): viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 9 (0xaL): viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 10 (0xbL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 11 (0xcL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 12 (0xdL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 13 (0xeL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 14 (0xfL): viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 15 (0x10L): viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 16 (0x11L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 17 (0x12L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 18 (0x13L): viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 19 (0x14L): viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 20 (0x15L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 21 (0x16L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 22 (0x17L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 23 (0x18L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 24 (0x19L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 25 (0x1aL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 26 (0x1bL): viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 27 (0x1cL): viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 28 (0x1dL): viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 29 (0x1eL): viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 30 (0x1fL): viewModel.orderType.get() != 1 ? @android:drawable/shape_input_enable : @android:drawable/xuanzhong
        flag 31 (0x20L): viewModel.orderType.get() != 1 ? @android:drawable/shape_input_enable : @android:drawable/xuanzhong
        flag 32 (0x21L): viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 33 (0x22L): viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 34 (0x23L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 35 (0x24L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 36 (0x25L): viewModel.orderType.get() != 0 ? @android:drawable/shape_input_enable : @android:drawable/xuanzhong
        flag 37 (0x26L): viewModel.orderType.get() != 0 ? @android:drawable/shape_input_enable : @android:drawable/xuanzhong
    flag mapping end*/
    //end
}