package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddServiceBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 8);
        sViewsWithIds.put(R.id.iv0, 9);
        sViewsWithIds.put(R.id.tv0, 10);
        sViewsWithIds.put(R.id.tv1, 11);
        sViewsWithIds.put(R.id.iv8, 12);
        sViewsWithIds.put(R.id.tv8, 13);
        sViewsWithIds.put(R.id.tv9, 14);
        sViewsWithIds.put(R.id.iv9, 15);
        sViewsWithIds.put(R.id.tv11, 16);
        sViewsWithIds.put(R.id.tv10, 17);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv8;
    @NonNull
    public final android.widget.ImageView iv9;
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
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.widget.TextView tv10;
    @NonNull
    public final android.widget.TextView tv11;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tv9;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.AddServiceActivityViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obServiceName.get()
            //         is viewModel.obServiceName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.obServiceName != null
            boolean viewModelObServiceNameJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.AddServiceActivityViewModel viewModel = mViewModel;
            // viewModel.obServiceName
            android.databinding.ObservableField<java.lang.String> viewModelObServiceName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obServiceName.get()
            java.lang.String viewModelObServiceNameGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObServiceName = viewModel.obServiceName;

                viewModelObServiceNameJavaLangObjectNull = (viewModelObServiceName) != (null);
                if (viewModelObServiceNameJavaLangObjectNull) {




                    viewModelObServiceName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obServiceTypeName.get()
            //         is viewModel.obServiceTypeName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obServiceTypeName
            android.databinding.ObservableField<java.lang.String> viewModelObServiceTypeName = null;
            // viewModel.obServiceTypeName.get()
            java.lang.String viewModelObServiceTypeNameGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddServiceActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obServiceTypeName != null
            boolean viewModelObServiceTypeNameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObServiceTypeName = viewModel.obServiceTypeName;

                viewModelObServiceTypeNameJavaLangObjectNull = (viewModelObServiceTypeName) != (null);
                if (viewModelObServiceTypeNameJavaLangObjectNull) {




                    viewModelObServiceTypeName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obServiceRealPrice.get()
            //         is viewModel.obServiceRealPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.obServiceRealPrice != null
            boolean viewModelObServiceRealPriceJavaLangObjectNull = false;
            // viewModel.obServiceRealPrice.get()
            java.lang.String viewModelObServiceRealPriceGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddServiceActivityViewModel viewModel = mViewModel;
            // viewModel.obServiceRealPrice
            android.databinding.ObservableField<java.lang.String> viewModelObServiceRealPrice = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObServiceRealPrice = viewModel.obServiceRealPrice;

                viewModelObServiceRealPriceJavaLangObjectNull = (viewModelObServiceRealPrice) != (null);
                if (viewModelObServiceRealPriceJavaLangObjectNull) {




                    viewModelObServiceRealPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obServiceVipPrice.get()
            //         is viewModel.obServiceVipPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.obServiceVipPrice != null
            boolean viewModelObServiceVipPriceJavaLangObjectNull = false;
            // viewModel.obServiceVipPrice
            android.databinding.ObservableField<java.lang.String> viewModelObServiceVipPrice = null;
            // viewModel.obServiceVipPrice.get()
            java.lang.String viewModelObServiceVipPriceGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddServiceActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObServiceVipPrice = viewModel.obServiceVipPrice;

                viewModelObServiceVipPriceJavaLangObjectNull = (viewModelObServiceVipPrice) != (null);
                if (viewModelObServiceVipPriceJavaLangObjectNull) {




                    viewModelObServiceVipPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddServiceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds);
        this.iv0 = (android.widget.ImageView) bindings[9];
        this.iv8 = (android.widget.ImageView) bindings[12];
        this.iv9 = (android.widget.ImageView) bindings[15];
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
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[2];
        this.selectIv0.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[10];
        this.tv1 = (android.widget.TextView) bindings[11];
        this.tv10 = (android.widget.TextView) bindings[17];
        this.tv11 = (android.widget.TextView) bindings[16];
        this.tv8 = (android.widget.TextView) bindings[13];
        this.tv9 = (android.widget.TextView) bindings[14];
        this.view = (android.view.View) bindings[8];
        setRootTag(root);
        // listeners
        mCallback52 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.AddServiceActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.AddServiceActivityViewModel ViewModel) {
        updateRegistration(6, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.AddServiceActivityViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImgData((android.databinding.ObservableField<byte[]>) object, fieldId);
            case 1 :
                return onChangeViewModelGetTypeHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelObServiceVipPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObServiceName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelObServiceRealPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelObServiceTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModel((ys.app.petproject.viewmodel.AddServiceActivityViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImgData(android.databinding.ObservableField<byte[]> ViewModelImgData, int fieldId) {
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
    private boolean onChangeViewModelObServiceVipPrice(android.databinding.ObservableField<java.lang.String> ViewModelObServiceVipPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceName(android.databinding.ObservableField<java.lang.String> ViewModelObServiceName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceRealPrice(android.databinding.ObservableField<java.lang.String> ViewModelObServiceRealPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObServiceTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.AddServiceActivityViewModel ViewModel, int fieldId) {
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
        android.databinding.ObservableField<byte[]> viewModelImgData = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObServiceVipPriceGet = null;
        java.lang.String viewModelObServiceNameGet = null;
        java.lang.String viewModelObServiceTypeNameGet = null;
        android.databinding.ObservableBoolean viewModelGetTypeHttpSuccess = null;
        int viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceVipPrice = null;
        boolean viewModelGetTypeHttpSuccessGet = false;
        android.text.TextWatcher viewModelVipAmtChangedListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceName = null;
        android.text.TextWatcher viewModelChangedListener = null;
        byte[] viewModelImgDataGet = null;
        java.lang.String viewModelObServiceRealPriceGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceRealPrice = null;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceTypeName = null;
        ys.app.petproject.viewmodel.AddServiceActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imgData
                        viewModelImgData = viewModel.imgData;
                    }
                    updateRegistration(0, viewModelImgData);


                    if (viewModelImgData != null) {
                        // read viewModel.imgData.get()
                        viewModelImgDataGet = viewModelImgData.get();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickSelectTypeButton
                        viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.vipAmtChangedListener
                        viewModelVipAmtChangedListener = viewModel.vipAmtChangedListener;
                        // read viewModel.changedListener
                        viewModelChangedListener = viewModel.changedListener;
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getTypeHttpSuccess
                        viewModelGetTypeHttpSuccess = viewModel.getTypeHttpSuccess;
                    }
                    updateRegistration(1, viewModelGetTypeHttpSuccess);


                    if (viewModelGetTypeHttpSuccess != null) {
                        // read viewModel.getTypeHttpSuccess.get()
                        viewModelGetTypeHttpSuccessGet = viewModelGetTypeHttpSuccess.get();
                    }
                if((dirtyFlags & 0xc2L) != 0) {
                    if(viewModelGetTypeHttpSuccessGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = ((viewModelGetTypeHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceVipPrice
                        viewModelObServiceVipPrice = viewModel.obServiceVipPrice;
                    }
                    updateRegistration(2, viewModelObServiceVipPrice);


                    if (viewModelObServiceVipPrice != null) {
                        // read viewModel.obServiceVipPrice.get()
                        viewModelObServiceVipPriceGet = viewModelObServiceVipPrice.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceName
                        viewModelObServiceName = viewModel.obServiceName;
                    }
                    updateRegistration(3, viewModelObServiceName);


                    if (viewModelObServiceName != null) {
                        // read viewModel.obServiceName.get()
                        viewModelObServiceNameGet = viewModelObServiceName.get();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceRealPrice
                        viewModelObServiceRealPrice = viewModel.obServiceRealPrice;
                    }
                    updateRegistration(4, viewModelObServiceRealPrice);


                    if (viewModelObServiceRealPrice != null) {
                        // read viewModel.obServiceRealPrice.get()
                        viewModelObServiceRealPriceGet = viewModelObServiceRealPrice.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceTypeName
                        viewModelObServiceTypeName = viewModel.obServiceTypeName;
                    }
                    updateRegistration(5, viewModelObServiceTypeName);


                    if (viewModelObServiceTypeName != null) {
                        // read viewModel.obServiceTypeName.get()
                        viewModelObServiceTypeNameGet = viewModelObServiceTypeName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObServiceNameGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback52);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelClickSelectTypeButtonAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView4, viewModelChangedListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView5, viewModelVipAmtChangedListener);
            this.mboundView7.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            this.selectIv0.setOnClickListener(viewModelClickSelectTypeButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObServiceTypeNameGet);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelObServiceRealPriceGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObServiceVipPriceGet);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setImgData(this.mboundView6, viewModelImgDataGet);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.selectIv0.setVisibility(viewModelGetTypeHttpSuccessViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddServiceActivityViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.AddServiceActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddServiceActivityViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.AddServiceActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectTypeButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.AddServiceActivityViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.uploadClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddServiceBinding>inflate(inflater, ys.app.petproject.R.layout.activity_add_service, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_add_service, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddServiceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddServiceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_service_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddServiceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.imgData
        flag 1 (0x2L): viewModel.getTypeHttpSuccess
        flag 2 (0x3L): viewModel.obServiceVipPrice
        flag 3 (0x4L): viewModel.obServiceName
        flag 4 (0x5L): viewModel.obServiceRealPrice
        flag 5 (0x6L): viewModel.obServiceTypeName
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}