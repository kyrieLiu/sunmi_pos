package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityShoppingPayResultBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 11);
        sViewsWithIds.put(R.id.up_ll, 12);
        sViewsWithIds.put(R.id.rl_shopping_pay_money, 13);
        sViewsWithIds.put(R.id.progressbar, 14);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout failLl;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    private final android.widget.Button mboundView8;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final android.widget.RelativeLayout rlShoppingPayMoney;
    @NonNull
    public final android.widget.LinearLayout upLl;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ShoppingPayResultViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickRightButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickLeftButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityShoppingPayResultBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.failLl = (android.widget.LinearLayout) bindings[6];
        this.failLl.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.Button) bindings[8];
        this.mboundView8.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[9];
        this.networkErrorIv.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[14];
        this.rlShoppingPayMoney = (android.widget.RelativeLayout) bindings[13];
        this.upLl = (android.widget.LinearLayout) bindings[12];
        this.view = (android.view.View) bindings[11];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewModel((ys.app.petproject.viewmodel.ShoppingPayResultViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ShoppingPayResultViewModel ViewModel) {
        updateRegistration(6, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ShoppingPayResultViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelObIsPaySuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelObSelectPayType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObSelectPayMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelObSelectOrderNo((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ShoppingPayResultViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsNetWorkErrorVisible(android.databinding.ObservableBoolean ViewModelIsNetWorkErrorVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsPaySuccess(android.databinding.ObservableBoolean ViewModelObIsPaySuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObSelectPayType(android.databinding.ObservableField<java.lang.String> ViewModelObSelectPayType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObSelectPayMoney(android.databinding.ObservableField<java.lang.String> ViewModelObSelectPayMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObSelectOrderNo(android.databinding.ObservableField<java.lang.String> ViewModelObSelectOrderNo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ShoppingPayResultViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        int viewModelObIsPaySuccessViewGONEViewVISIBLE = 0;
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickRightButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        android.databinding.ObservableBoolean viewModelObIsPaySuccess = null;
        boolean viewModelIsLoadingVisibleGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObSelectPayType = null;
        java.lang.String viewModelObSelectPayMoneyGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObSelectPayMoney = null;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObSelectOrderNo = null;
        java.lang.String viewModelObIsPaySuccessMboundView8AndroidStringQdMboundView8AndroidStringGd = null;
        java.lang.String viewModelObSelectPayMoneyMboundView3AndroidStringYuan = null;
        java.lang.String viewModelObIsPaySuccessMboundView7AndroidStringBdxpMboundView7AndroidStringQx = null;
        int viewModelObIsPaySuccessViewVISIBLEViewGONE = 0;
        java.lang.String viewModelObSelectOrderNoGet = null;
        boolean viewModelObIsPaySuccessGet = false;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        android.view.View.OnClickListener viewModelClickLeftButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObSelectPayTypeGet = null;
        ys.app.petproject.viewmodel.ShoppingPayResultViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickRightButton
                        viewModelClickRightButtonAndroidViewViewOnClickListener = (((mViewModelClickRightButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickRightButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickRightButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickLeftButton
                        viewModelClickLeftButtonAndroidViewViewOnClickListener = (((mViewModelClickLeftButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickLeftButtonAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickLeftButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(0, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsPaySuccess
                        viewModelObIsPaySuccess = viewModel.obIsPaySuccess;
                    }
                    updateRegistration(1, viewModelObIsPaySuccess);


                    if (viewModelObIsPaySuccess != null) {
                        // read viewModel.obIsPaySuccess.get()
                        viewModelObIsPaySuccessGet = viewModelObIsPaySuccess.get();
                    }
                if((dirtyFlags & 0xc2L) != 0) {
                    if(viewModelObIsPaySuccessGet) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.obIsPaySuccess.get() ? View.GONE : View.VISIBLE
                    viewModelObIsPaySuccessViewGONEViewVISIBLE = ((viewModelObIsPaySuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.obIsPaySuccess.get() ? @android:string/qd : @android:string/gd
                    viewModelObIsPaySuccessMboundView8AndroidStringQdMboundView8AndroidStringGd = ((viewModelObIsPaySuccessGet) ? (mboundView8.getResources().getString(R.string.qd)) : (mboundView8.getResources().getString(R.string.gd)));
                    // read viewModel.obIsPaySuccess.get() ? @android:string/bdxp : @android:string/qx
                    viewModelObIsPaySuccessMboundView7AndroidStringBdxpMboundView7AndroidStringQx = ((viewModelObIsPaySuccessGet) ? (mboundView7.getResources().getString(R.string.bdxp)) : (mboundView7.getResources().getString(R.string.qx)));
                    // read viewModel.obIsPaySuccess.get() ? View.VISIBLE : View.GONE
                    viewModelObIsPaySuccessViewVISIBLEViewGONE = ((viewModelObIsPaySuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obSelectPayType
                        viewModelObSelectPayType = viewModel.obSelectPayType;
                    }
                    updateRegistration(2, viewModelObSelectPayType);


                    if (viewModelObSelectPayType != null) {
                        // read viewModel.obSelectPayType.get()
                        viewModelObSelectPayTypeGet = viewModelObSelectPayType.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obSelectPayMoney
                        viewModelObSelectPayMoney = viewModel.obSelectPayMoney;
                    }
                    updateRegistration(3, viewModelObSelectPayMoney);


                    if (viewModelObSelectPayMoney != null) {
                        // read viewModel.obSelectPayMoney.get()
                        viewModelObSelectPayMoneyGet = viewModelObSelectPayMoney.get();
                    }


                    // read (viewModel.obSelectPayMoney.get()) + (@android:string/yuan)
                    viewModelObSelectPayMoneyMboundView3AndroidStringYuan = (viewModelObSelectPayMoneyGet) + (mboundView3.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obSelectOrderNo
                        viewModelObSelectOrderNo = viewModel.obSelectOrderNo;
                    }
                    updateRegistration(4, viewModelObSelectOrderNo);


                    if (viewModelObSelectOrderNo != null) {
                        // read viewModel.obSelectOrderNo.get()
                        viewModelObSelectOrderNoGet = viewModelObSelectOrderNo.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(5, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0xe0L) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.failLl.setVisibility(viewModelObIsPaySuccessViewGONEViewVISIBLE);
            this.mboundView1.setVisibility(viewModelObIsPaySuccessViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelObIsPaySuccessMboundView7AndroidStringBdxpMboundView7AndroidStringQx);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelObIsPaySuccessMboundView8AndroidStringQdMboundView8AndroidStringGd);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObSelectPayMoneyMboundView3AndroidStringYuan);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelObSelectPayTypeGet);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObSelectOrderNoGet);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(viewModelClickLeftButtonAndroidViewViewOnClickListener);
            this.mboundView8.setOnClickListener(viewModelClickRightButtonAndroidViewViewOnClickListener);
            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayResultViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.ShoppingPayResultViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickRightButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayResultViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.ShoppingPayResultViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ShoppingPayResultViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.ShoppingPayResultViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickLeftButton(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityShoppingPayResultBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShoppingPayResultBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityShoppingPayResultBinding>inflate(inflater, ys.app.petproject.R.layout.activity_shopping_pay_result, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityShoppingPayResultBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShoppingPayResultBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_shopping_pay_result, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityShoppingPayResultBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShoppingPayResultBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_shopping_pay_result_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityShoppingPayResultBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.obIsPaySuccess
        flag 2 (0x3L): viewModel.obSelectPayType
        flag 3 (0x4L): viewModel.obSelectPayMoney
        flag 4 (0x5L): viewModel.obSelectOrderNo
        flag 5 (0x6L): viewModel.isLoadingVisible
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.obIsPaySuccess.get() ? View.GONE : View.VISIBLE
        flag 9 (0xaL): viewModel.obIsPaySuccess.get() ? View.GONE : View.VISIBLE
        flag 10 (0xbL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.obIsPaySuccess.get() ? @android:string/qd : @android:string/gd
        flag 15 (0x10L): viewModel.obIsPaySuccess.get() ? @android:string/qd : @android:string/gd
        flag 16 (0x11L): viewModel.obIsPaySuccess.get() ? @android:string/bdxp : @android:string/qx
        flag 17 (0x12L): viewModel.obIsPaySuccess.get() ? @android:string/bdxp : @android:string/qx
        flag 18 (0x13L): viewModel.obIsPaySuccess.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.obIsPaySuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}