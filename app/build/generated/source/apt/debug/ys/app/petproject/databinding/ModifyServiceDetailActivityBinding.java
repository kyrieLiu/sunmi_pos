package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ModifyServiceDetailActivityBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 7);
        sViewsWithIds.put(R.id.iv0, 8);
        sViewsWithIds.put(R.id.tv0, 9);
        sViewsWithIds.put(R.id.tv1, 10);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView4;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView5;
    @NonNull
    private final android.widget.Button mboundView6;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ModifyServiceDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obName.get()
            //         is viewModel.obName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.obName != null
            boolean viewModelObNameJavaLangObjectNull = false;
            // viewModel.obName.get()
            java.lang.String viewModelObNameGet = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;
            // viewModel.obName
            android.databinding.ObservableField<java.lang.String> viewModelObName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObName = viewModel.obName;

                viewModelObNameJavaLangObjectNull = (viewModelObName) != (null);
                if (viewModelObNameJavaLangObjectNull) {




                    viewModelObName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obTypeName.get()
            //         is viewModel.obTypeName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obTypeName.get()
            java.lang.String viewModelObTypeNameGet = null;
            // viewModel.obTypeName
            android.databinding.ObservableField<java.lang.String> viewModelObTypeName = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obTypeName != null
            boolean viewModelObTypeNameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObTypeName = viewModel.obTypeName;

                viewModelObTypeNameJavaLangObjectNull = (viewModelObTypeName) != (null);
                if (viewModelObTypeNameJavaLangObjectNull) {




                    viewModelObTypeName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obRealAmt.get()
            //         is viewModel.obRealAmt.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.obRealAmt
            android.databinding.ObservableField<java.lang.String> viewModelObRealAmt = null;
            // viewModel.obRealAmt != null
            boolean viewModelObRealAmtJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obRealAmt.get()
            java.lang.String viewModelObRealAmtGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObRealAmt = viewModel.obRealAmt;

                viewModelObRealAmtJavaLangObjectNull = (viewModelObRealAmt) != (null);
                if (viewModelObRealAmtJavaLangObjectNull) {




                    viewModelObRealAmt.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obVipAmt.get()
            //         is viewModel.obVipAmt.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.obVipAmt != null
            boolean viewModelObVipAmtJavaLangObjectNull = false;
            // viewModel.obVipAmt
            android.databinding.ObservableField<java.lang.String> viewModelObVipAmt = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;
            // viewModel.obVipAmt.get()
            java.lang.String viewModelObVipAmtGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObVipAmt = viewModel.obVipAmt;

                viewModelObVipAmtJavaLangObjectNull = (viewModelObVipAmt) != (null);
                if (viewModelObVipAmtJavaLangObjectNull) {




                    viewModelObVipAmt.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ModifyServiceDetailActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 6);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.iv0 = (android.widget.ImageView) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (ys.app.petproject.widget.LastInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (ys.app.petproject.widget.LastInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[2];
        this.selectIv0.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[9];
        this.tv1 = (android.widget.TextView) bindings[10];
        this.view = (android.view.View) bindings[7];
        setRootTag(root);
        // listeners
        mCallback70 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback71 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((ys.app.petproject.viewmodel.ModifyServiceDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ModifyServiceDetailViewModel ViewModel) {
        updateRegistration(5, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ModifyServiceDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObRealAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelGetTypeHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelObTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelObVipAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ModifyServiceDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObRealAmt(android.databinding.ObservableField<java.lang.String> ViewModelObRealAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetTypeHttpSuccess(android.databinding.ObservableBoolean ViewModelGetTypeHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObName(android.databinding.ObservableField<java.lang.String> ViewModelObName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipAmt(android.databinding.ObservableField<java.lang.String> ViewModelObVipAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ModifyServiceDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObRealAmt = null;
        android.databinding.ObservableBoolean viewModelGetTypeHttpSuccess = null;
        java.lang.String viewModelObVipAmtGet = null;
        int viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObTypeName = null;
        java.lang.String viewModelObRealAmtGet = null;
        java.lang.String viewModelObNameGet = null;
        boolean viewModelGetTypeHttpSuccessGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObName = null;
        android.text.TextWatcher viewModelMTCredTSChangedListener = null;
        java.lang.String viewModelObTypeNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipAmt = null;
        ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x60L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.mTCredTSChangedListener
                        viewModelMTCredTSChangedListener = viewModel.mTCredTSChangedListener;
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obRealAmt
                        viewModelObRealAmt = viewModel.obRealAmt;
                    }
                    updateRegistration(0, viewModelObRealAmt);


                    if (viewModelObRealAmt != null) {
                        // read viewModel.obRealAmt.get()
                        viewModelObRealAmtGet = viewModelObRealAmt.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getTypeHttpSuccess
                        viewModelGetTypeHttpSuccess = viewModel.getTypeHttpSuccess;
                    }
                    updateRegistration(1, viewModelGetTypeHttpSuccess);


                    if (viewModelGetTypeHttpSuccess != null) {
                        // read viewModel.getTypeHttpSuccess.get()
                        viewModelGetTypeHttpSuccessGet = viewModelGetTypeHttpSuccess.get();
                    }
                if((dirtyFlags & 0x62L) != 0) {
                    if(viewModelGetTypeHttpSuccessGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = ((viewModelGetTypeHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obTypeName
                        viewModelObTypeName = viewModel.obTypeName;
                    }
                    updateRegistration(2, viewModelObTypeName);


                    if (viewModelObTypeName != null) {
                        // read viewModel.obTypeName.get()
                        viewModelObTypeNameGet = viewModelObTypeName.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obName
                        viewModelObName = viewModel.obName;
                    }
                    updateRegistration(3, viewModelObName);


                    if (viewModelObName != null) {
                        // read viewModel.obName.get()
                        viewModelObNameGet = viewModelObName.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipAmt
                        viewModelObVipAmt = viewModel.obVipAmt;
                    }
                    updateRegistration(4, viewModelObVipAmt);


                    if (viewModelObVipAmt != null) {
                        // read viewModel.obVipAmt.get()
                        viewModelObVipAmtGet = viewModelObVipAmt.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObNameGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback71);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.selectIv0.setOnClickListener(mCallback70);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObTypeNameGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelObRealAmtGet);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView4, viewModelMTCredTSChangedListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView5, viewModelMTCredTSChangedListener);
            this.mboundView6.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObVipAmtGet);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.selectIv0.setVisibility(viewModelGetTypeHttpSuccessViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ModifyServiceDetailViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.ModifyServiceDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickSelectTypeButton();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ModifyServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickSelectTypeButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ModifyServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ModifyServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ModifyServiceDetailActivityBinding>inflate(inflater, ys.app.petproject.R.layout.activity_modify_service, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ModifyServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ModifyServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_modify_service, null, false), bindingComponent);
    }
    @NonNull
    public static ModifyServiceDetailActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ModifyServiceDetailActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_modify_service_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ModifyServiceDetailActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obRealAmt
        flag 1 (0x2L): viewModel.getTypeHttpSuccess
        flag 2 (0x3L): viewModel.obTypeName
        flag 3 (0x4L): viewModel.obName
        flag 4 (0x5L): viewModel.obVipAmt
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}