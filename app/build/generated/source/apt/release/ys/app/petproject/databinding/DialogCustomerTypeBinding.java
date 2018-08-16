package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogCustomerTypeBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tabLayout, 16);
        sViewsWithIds.put(R.id.down_ll, 17);
        sViewsWithIds.put(R.id.rl_dialog_collect_vip, 18);
        sViewsWithIds.put(R.id.progressbar, 19);
        sViewsWithIds.put(R.id.rl_dialog_collect_onlyDiscount, 20);
    }
    // views
    @NonNull
    public final android.widget.TextView cancelTv;
    @NonNull
    public final android.widget.LinearLayout downLl;
    @NonNull
    public final android.widget.ImageView ivDialogSearchCard;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView11;
    @NonNull
    private final android.widget.RelativeLayout mboundView12;
    @NonNull
    private final android.widget.ImageView mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView14;
    @NonNull
    private final android.widget.RelativeLayout mboundView15;
    @NonNull
    public final android.widget.EditText nameEt;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ImageView noneDataIv;
    @NonNull
    public final android.widget.LinearLayout notVipLl;
    @NonNull
    public final android.widget.TextView okTv;
    @NonNull
    public final android.widget.EditText phoneEt;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final android.support.v7.widget.RecyclerView rlDialogCollectOnlyDiscount;
    @NonNull
    public final android.support.v7.widget.RecyclerView rlDialogCollectVip;
    @NonNull
    public final android.support.design.widget.TabLayout tabLayout;
    @NonNull
    public final android.widget.LinearLayout vipLl;
    @NonNull
    public final android.widget.EditText vipPhoneEt;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.CustomerTypeViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickJumpAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener nameEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mName.get()
            //         is viewModel.mName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(nameEt);
            // localize variables for thread safety
            // viewModel.mName != null
            boolean viewModelMNameJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel.mName.get()
            java.lang.String viewModelMNameGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mName
            android.databinding.ObservableField<java.lang.String> viewModelMName = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMName = viewModel.mName;

                viewModelMNameJavaLangObjectNull = (viewModelMName) != (null);
                if (viewModelMNameJavaLangObjectNull) {




                    viewModelMName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener phoneEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mPhone.get()
            //         is viewModel.mPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(phoneEt);
            // localize variables for thread safety
            // viewModel.mPhone != null
            boolean viewModelMPhoneJavaLangObjectNull = false;
            // viewModel.mPhone
            android.databinding.ObservableField<java.lang.String> viewModelMPhone = null;
            // viewModel
            ys.app.petproject.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel.mPhone.get()
            java.lang.String viewModelMPhoneGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMPhone = viewModel.mPhone;

                viewModelMPhoneJavaLangObjectNull = (viewModelMPhone) != (null);
                if (viewModelMPhoneJavaLangObjectNull) {




                    viewModelMPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener vipPhoneEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mVipPhone.get()
            //         is viewModel.mVipPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(vipPhoneEt);
            // localize variables for thread safety
            // viewModel.mVipPhone
            android.databinding.ObservableField<java.lang.String> viewModelMVipPhone = null;
            // viewModel.mVipPhone != null
            boolean viewModelMVipPhoneJavaLangObjectNull = false;
            // viewModel.mVipPhone.get()
            java.lang.String viewModelMVipPhoneGet = null;
            // viewModel
            ys.app.petproject.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMVipPhone = viewModel.mVipPhone;

                viewModelMVipPhoneJavaLangObjectNull = (viewModelMVipPhone) != (null);
                if (viewModelMVipPhoneJavaLangObjectNull) {




                    viewModelMVipPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogCustomerTypeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 8);
        final Object[] bindings = mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds);
        this.cancelTv = (android.widget.TextView) bindings[4];
        this.cancelTv.setTag(null);
        this.downLl = (android.widget.LinearLayout) bindings[17];
        this.ivDialogSearchCard = (android.widget.ImageView) bindings[8];
        this.ivDialogSearchCard.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView11 = (android.widget.RelativeLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.RelativeLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.ImageView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.ImageView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.RelativeLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.nameEt = (android.widget.EditText) bindings[2];
        this.nameEt.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[10];
        this.networkErrorIv.setTag(null);
        this.noneDataIv = (android.widget.ImageView) bindings[9];
        this.noneDataIv.setTag(null);
        this.notVipLl = (android.widget.LinearLayout) bindings[1];
        this.notVipLl.setTag(null);
        this.okTv = (android.widget.TextView) bindings[5];
        this.okTv.setTag(null);
        this.phoneEt = (android.widget.EditText) bindings[3];
        this.phoneEt.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[19];
        this.rlDialogCollectOnlyDiscount = (android.support.v7.widget.RecyclerView) bindings[20];
        this.rlDialogCollectVip = (android.support.v7.widget.RecyclerView) bindings[18];
        this.tabLayout = (android.support.design.widget.TabLayout) bindings[16];
        this.vipLl = (android.widget.LinearLayout) bindings[6];
        this.vipLl.setTag(null);
        this.vipPhoneEt = (android.widget.EditText) bindings[7];
        this.vipPhoneEt.setTag(null);
        setRootTag(root);
        // listeners
        mCallback42 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.CustomerTypeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.CustomerTypeViewModel ViewModel) {
        updateRegistration(7, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.CustomerTypeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelMVipPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsNoneDataVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelObPosition((android.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeViewModelMName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelMPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 7 :
                return onChangeViewModel((ys.app.petproject.viewmodel.CustomerTypeViewModel) object, fieldId);
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
    private boolean onChangeViewModelMVipPhone(android.databinding.ObservableField<java.lang.String> ViewModelMVipPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNoneDataVisible(android.databinding.ObservableBoolean ViewModelIsNoneDataVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObPosition(android.databinding.ObservableInt ViewModelObPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMName(android.databinding.ObservableField<java.lang.String> ViewModelMName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMPhone(android.databinding.ObservableField<java.lang.String> ViewModelMPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.CustomerTypeViewModel ViewModel, int fieldId) {
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
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelObPositionInt2 = false;
        android.view.View.OnClickListener viewModelClickJumpAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        boolean viewModelIsLoadingVisibleGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelMVipPhone = null;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        android.databinding.ObservableInt viewModelObPosition = null;
        java.lang.String viewModelMNameGet = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        int viewModelObPositionInt1ViewVISIBLEViewGONE = 0;
        int viewModelIsNoneDataVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelObPositionInt0 = false;
        int spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1nViewVISIBLEViewGONE = 0;
        java.lang.String spUtilDeviceModel = null;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelMName = null;
        boolean spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n = false;
        java.lang.String viewModelMPhoneGet = null;
        boolean viewModelObPositionInt1 = false;
        android.databinding.ObservableField<java.lang.String> viewModelMPhone = null;
        int viewModelObPositionInt2ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelMVipPhoneGet = null;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        int viewModelObPositionInt0ViewVISIBLEViewGONE = 0;
        ys.app.petproject.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
        int viewModelObPositionGet = 0;

        if ((dirtyFlags & 0x100L) != 0) {

                // read SpUtil.deviceModel
                spUtilDeviceModel = ys.app.petproject.SpUtil.getDeviceModel();


                if (spUtilDeviceModel != null) {
                    // read SpUtil.deviceModel.equals(@android:string/device_p1n)
                    spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n = spUtilDeviceModel.equals(ivDialogSearchCard.getResources().getString(R.string.device_p1n));
                }
            if((dirtyFlags & 0x100L) != 0) {
                if(spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read SpUtil.deviceModel.equals(@android:string/device_p1n) ? View.VISIBLE : View.GONE
                spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1nViewVISIBLEViewGONE = ((spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x180L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickJump
                        viewModelClickJumpAndroidViewViewOnClickListener = (((mViewModelClickJumpAndroidViewViewOnClickListener == null) ? (mViewModelClickJumpAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickJumpAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(0, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x181L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mVipPhone
                        viewModelMVipPhone = viewModel.mVipPhone;
                    }
                    updateRegistration(1, viewModelMVipPhone);


                    if (viewModelMVipPhone != null) {
                        // read viewModel.mVipPhone.get()
                        viewModelMVipPhoneGet = viewModelMVipPhone.get();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNoneDataVisible
                        viewModelIsNoneDataVisible = viewModel.isNoneDataVisible;
                    }
                    updateRegistration(2, viewModelIsNoneDataVisible);


                    if (viewModelIsNoneDataVisible != null) {
                        // read viewModel.isNoneDataVisible.get()
                        viewModelIsNoneDataVisibleGet = viewModelIsNoneDataVisible.get();
                    }
                if((dirtyFlags & 0x184L) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNoneDataVisibleViewVISIBLEViewGONE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obPosition
                        viewModelObPosition = viewModel.obPosition;
                    }
                    updateRegistration(3, viewModelObPosition);


                    if (viewModelObPosition != null) {
                        // read viewModel.obPosition.get()
                        viewModelObPositionGet = viewModelObPosition.get();
                    }


                    // read viewModel.obPosition.get() == 2
                    viewModelObPositionInt2 = (viewModelObPositionGet) == (2);
                    // read viewModel.obPosition.get() == 0
                    viewModelObPositionInt0 = (viewModelObPositionGet) == (0);
                    // read viewModel.obPosition.get() == 1
                    viewModelObPositionInt1 = (viewModelObPositionGet) == (1);
                if((dirtyFlags & 0x188L) != 0) {
                    if(viewModelObPositionInt2) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x188L) != 0) {
                    if(viewModelObPositionInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x188L) != 0) {
                    if(viewModelObPositionInt1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.obPosition.get() == 2 ? View.VISIBLE : View.GONE
                    viewModelObPositionInt2ViewVISIBLEViewGONE = ((viewModelObPositionInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.obPosition.get() == 0 ? View.VISIBLE : View.GONE
                    viewModelObPositionInt0ViewVISIBLEViewGONE = ((viewModelObPositionInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.obPosition.get() == 1 ? View.VISIBLE : View.GONE
                    viewModelObPositionInt1ViewVISIBLEViewGONE = ((viewModelObPositionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mName
                        viewModelMName = viewModel.mName;
                    }
                    updateRegistration(4, viewModelMName);


                    if (viewModelMName != null) {
                        // read viewModel.mName.get()
                        viewModelMNameGet = viewModelMName.get();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mPhone
                        viewModelMPhone = viewModel.mPhone;
                    }
                    updateRegistration(5, viewModelMPhone);


                    if (viewModelMPhone != null) {
                        // read viewModel.mPhone.get()
                        viewModelMPhoneGet = viewModelMPhone.get();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(6, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0x1c0L) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.cancelTv.setOnClickListener(viewModelClickJumpAndroidViewViewOnClickListener);
            this.mboundView14.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
            this.okTv.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.ivDialogSearchCard.setOnClickListener(mCallback42);
            this.ivDialogSearchCard.setVisibility(spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1nViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.phoneEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, phoneEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.vipPhoneEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, vipPhoneEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
            this.mboundView15.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(viewModelObPositionInt2ViewVISIBLEViewGONE);
            this.notVipLl.setVisibility(viewModelObPositionInt1ViewVISIBLEViewGONE);
            this.vipLl.setVisibility(viewModelObPositionInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(viewModelIsNoneDataVisibleViewVISIBLEViewGONE);
            this.noneDataIv.setVisibility(viewModelIsNoneDataVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            this.mboundView14.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameEt, viewModelMNameGet);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.phoneEt, viewModelMPhoneGet);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.vipPhoneEt, viewModelMVipPhoneGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CustomerTypeViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.CustomerTypeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickJump(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CustomerTypeViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.CustomerTypeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CustomerTypeViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.CustomerTypeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.searchCardNo();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DialogCustomerTypeBinding>inflate(inflater, ys.app.petproject.R.layout.dialog_customer_type, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.dialog_customer_type, null, false), bindingComponent);
    }
    @NonNull
    public static DialogCustomerTypeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogCustomerTypeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/dialog_customer_type_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DialogCustomerTypeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.mVipPhone
        flag 2 (0x3L): viewModel.isNoneDataVisible
        flag 3 (0x4L): viewModel.obPosition
        flag 4 (0x5L): viewModel.mName
        flag 5 (0x6L): viewModel.mPhone
        flag 6 (0x7L): viewModel.isLoadingVisible
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.obPosition.get() == 1 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.obPosition.get() == 1 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): SpUtil.deviceModel.equals(@android:string/device_p1n) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): SpUtil.deviceModel.equals(@android:string/device_p1n) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.obPosition.get() == 2 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.obPosition.get() == 2 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.obPosition.get() == 0 ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.obPosition.get() == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}