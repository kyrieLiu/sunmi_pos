package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRefundVipBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 11);
        sViewsWithIds.put(R.id.tv0, 12);
        sViewsWithIds.put(R.id.select_iv0, 13);
        sViewsWithIds.put(R.id.tv_refund_zero, 14);
    }
    // views
    @NonNull
    public final android.widget.Button btRefundConfirm;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.view.View mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tvRefundZero;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.vip.RefundVipViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.refundMoney.get()
            //         is viewModel.refundMoney.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.refundMoney.get()
            java.lang.String viewModelRefundMoneyGet = null;
            // viewModel.refundMoney
            android.databinding.ObservableField<java.lang.String> viewModelRefundMoney = null;
            // viewModel
            ys.app.petproject.viewmodel.vip.RefundVipViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.refundMoney != null
            boolean viewModelRefundMoneyJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRefundMoney = viewModel.refundMoney;

                viewModelRefundMoneyJavaLangObjectNull = (viewModelRefundMoney) != (null);
                if (viewModelRefundMoneyJavaLangObjectNull) {




                    viewModelRefundMoney.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityRefundVipBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 8);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.btRefundConfirm = (android.widget.Button) bindings[1];
        this.btRefundConfirm.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.view.View) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[13];
        this.tv0 = (android.widget.TextView) bindings[12];
        this.tvRefundZero = (android.widget.TextView) bindings[14];
        this.view = (android.view.View) bindings[11];
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewModel((ys.app.petproject.viewmodel.vip.RefundVipViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.vip.RefundVipViewModel ViewModel) {
        updateRegistration(7, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.vip.RefundVipViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelResultMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsNoneDataVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelNowMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelRefundMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelEmployeeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelPresentAndRealMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelRealMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModel((ys.app.petproject.viewmodel.vip.RefundVipViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelResultMoney(android.databinding.ObservableField<java.lang.String> ViewModelResultMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNoneDataVisible(android.databinding.ObservableBoolean ViewModelIsNoneDataVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNowMoney(android.databinding.ObservableField<java.lang.String> ViewModelNowMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRefundMoney(android.databinding.ObservableField<java.lang.String> ViewModelRefundMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmployeeName(android.databinding.ObservableField<java.lang.String> ViewModelEmployeeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPresentAndRealMoney(android.databinding.ObservableField<java.lang.String> ViewModelPresentAndRealMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRealMoney(android.databinding.ObservableField<java.lang.String> ViewModelRealMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.vip.RefundVipViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        android.databinding.ObservableField<java.lang.String> viewModelResultMoney = null;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        android.databinding.ObservableField<java.lang.String> viewModelNowMoney = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        java.lang.String viewModelNowMoneyGet = null;
        java.lang.String viewModelRealMoneyGet = null;
        java.lang.String viewModelResultMoneyGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelRefundMoney = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmployeeName = null;
        int viewModelIsNoneDataVisibleViewGONEViewVISIBLE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelPresentAndRealMoney = null;
        java.lang.String viewModelRefundMoneyGet = null;
        java.lang.String viewModelPresentAndRealMoneyGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelRealMoney = null;
        java.lang.String viewModelEmployeeNameGet = null;
        ys.app.petproject.viewmodel.vip.RefundVipViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.resultMoney
                        viewModelResultMoney = viewModel.resultMoney;
                    }
                    updateRegistration(0, viewModelResultMoney);


                    if (viewModelResultMoney != null) {
                        // read viewModel.resultMoney.get()
                        viewModelResultMoneyGet = viewModelResultMoney.get();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNoneDataVisible
                        viewModelIsNoneDataVisible = viewModel.isNoneDataVisible;
                    }
                    updateRegistration(1, viewModelIsNoneDataVisible);


                    if (viewModelIsNoneDataVisible != null) {
                        // read viewModel.isNoneDataVisible.get()
                        viewModelIsNoneDataVisibleGet = viewModelIsNoneDataVisible.get();
                    }
                if((dirtyFlags & 0x182L) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isNoneDataVisible.get() ? View.GONE : View.VISIBLE
                    viewModelIsNoneDataVisibleViewGONEViewVISIBLE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nowMoney
                        viewModelNowMoney = viewModel.nowMoney;
                    }
                    updateRegistration(2, viewModelNowMoney);


                    if (viewModelNowMoney != null) {
                        // read viewModel.nowMoney.get()
                        viewModelNowMoneyGet = viewModelNowMoney.get();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.refundMoney
                        viewModelRefundMoney = viewModel.refundMoney;
                    }
                    updateRegistration(3, viewModelRefundMoney);


                    if (viewModelRefundMoney != null) {
                        // read viewModel.refundMoney.get()
                        viewModelRefundMoneyGet = viewModelRefundMoney.get();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.employeeName
                        viewModelEmployeeName = viewModel.employeeName;
                    }
                    updateRegistration(4, viewModelEmployeeName);


                    if (viewModelEmployeeName != null) {
                        // read viewModel.employeeName.get()
                        viewModelEmployeeNameGet = viewModelEmployeeName.get();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presentAndRealMoney
                        viewModelPresentAndRealMoney = viewModel.presentAndRealMoney;
                    }
                    updateRegistration(5, viewModelPresentAndRealMoney);


                    if (viewModelPresentAndRealMoney != null) {
                        // read viewModel.presentAndRealMoney.get()
                        viewModelPresentAndRealMoneyGet = viewModelPresentAndRealMoney.get();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.realMoney
                        viewModelRealMoney = viewModel.realMoney;
                    }
                    updateRegistration(6, viewModelRealMoney);


                    if (viewModelRealMoney != null) {
                        // read viewModel.realMoney.get()
                        viewModelRealMoneyGet = viewModelRealMoney.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btRefundConfirm.setOnClickListener(mCallback1);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelResultMoneyGet);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelRefundMoneyGet);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelEmployeeNameGet);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelIsNoneDataVisibleViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(viewModelIsNoneDataVisibleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelRealMoneyGet);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelPresentAndRealMoneyGet);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelNowMoneyGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.vip.RefundVipViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectEmployee();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.vip.RefundVipViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickRefund();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityRefundVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRefundVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityRefundVipBinding>inflate(inflater, ys.app.petproject.R.layout.activity_refund_vip, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityRefundVipBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRefundVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_refund_vip, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityRefundVipBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRefundVipBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_refund_vip_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityRefundVipBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.resultMoney
        flag 1 (0x2L): viewModel.isNoneDataVisible
        flag 2 (0x3L): viewModel.nowMoney
        flag 3 (0x4L): viewModel.refundMoney
        flag 4 (0x5L): viewModel.employeeName
        flag 5 (0x6L): viewModel.presentAndRealMoney
        flag 6 (0x7L): viewModel.realMoney
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.isNoneDataVisible.get() ? View.GONE : View.VISIBLE
        flag 10 (0xbL): viewModel.isNoneDataVisible.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}