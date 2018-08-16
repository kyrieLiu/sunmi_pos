package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddServiceBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv0, 5);
        sViewsWithIds.put(R.id.tv0, 6);
        sViewsWithIds.put(R.id.tv1, 7);
        sViewsWithIds.put(R.id.iv8, 8);
        sViewsWithIds.put(R.id.tv8, 9);
        sViewsWithIds.put(R.id.tv9, 10);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv8;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView4;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tv9;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.AddServiceViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener;
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
            ys.app.petproject.viewmodel.AddServiceViewModel viewModel = mViewModel;
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
            ys.app.petproject.viewmodel.AddServiceViewModel viewModel = mViewModel;
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
            ys.app.petproject.viewmodel.AddServiceViewModel viewModel = mViewModel;
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

    public FragmentAddServiceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.iv0 = (android.widget.ImageView) bindings[5];
        this.iv8 = (android.widget.ImageView) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (ys.app.petproject.widget.LastInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[2];
        this.selectIv0.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[6];
        this.tv1 = (android.widget.TextView) bindings[7];
        this.tv8 = (android.widget.TextView) bindings[9];
        this.tv9 = (android.widget.TextView) bindings[10];
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
            setViewModel((ys.app.petproject.viewmodel.AddServiceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.AddServiceViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.AddServiceViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetTypeHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelObServiceName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObServiceRealPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObServiceTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.petproject.viewmodel.AddServiceViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetTypeHttpSuccess(android.databinding.ObservableBoolean ViewModelGetTypeHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceName(android.databinding.ObservableField<java.lang.String> ViewModelObServiceName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceRealPrice(android.databinding.ObservableField<java.lang.String> ViewModelObServiceRealPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObServiceTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.AddServiceViewModel ViewModel, int fieldId) {
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
        java.lang.String viewModelObServiceNameGet = null;
        java.lang.String viewModelObServiceTypeNameGet = null;
        android.databinding.ObservableBoolean viewModelGetTypeHttpSuccess = null;
        int viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = null;
        boolean viewModelGetTypeHttpSuccessGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceName = null;
        android.text.TextWatcher viewModelChangedListener = null;
        java.lang.String viewModelObServiceRealPriceGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceRealPrice = null;
        android.databinding.ObservableField<java.lang.String> viewModelObServiceTypeName = null;
        ys.app.petproject.viewmodel.AddServiceViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getTypeHttpSuccess
                        viewModelGetTypeHttpSuccess = viewModel.getTypeHttpSuccess;
                    }
                    updateRegistration(0, viewModelGetTypeHttpSuccess);


                    if (viewModelGetTypeHttpSuccess != null) {
                        // read viewModel.getTypeHttpSuccess.get()
                        viewModelGetTypeHttpSuccessGet = viewModelGetTypeHttpSuccess.get();
                    }
                if((dirtyFlags & 0x31L) != 0) {
                    if(viewModelGetTypeHttpSuccessGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = ((viewModelGetTypeHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickSelectTypeButton
                        viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.changedListener
                        viewModelChangedListener = viewModel.changedListener;
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceName
                        viewModelObServiceName = viewModel.obServiceName;
                    }
                    updateRegistration(1, viewModelObServiceName);


                    if (viewModelObServiceName != null) {
                        // read viewModel.obServiceName.get()
                        viewModelObServiceNameGet = viewModelObServiceName.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceRealPrice
                        viewModelObServiceRealPrice = viewModel.obServiceRealPrice;
                    }
                    updateRegistration(2, viewModelObServiceRealPrice);


                    if (viewModelObServiceRealPrice != null) {
                        // read viewModel.obServiceRealPrice.get()
                        viewModelObServiceRealPriceGet = viewModelObServiceRealPrice.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obServiceTypeName
                        viewModelObServiceTypeName = viewModel.obServiceTypeName;
                    }
                    updateRegistration(3, viewModelObServiceTypeName);


                    if (viewModelObServiceTypeName != null) {
                        // read viewModel.obServiceTypeName.get()
                        viewModelObServiceTypeNameGet = viewModelObServiceTypeName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObServiceNameGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelClickSelectTypeButtonAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView4, viewModelChangedListener);
            this.selectIv0.setOnClickListener(viewModelClickSelectTypeButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObServiceTypeNameGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelObServiceRealPriceGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.selectIv0.setVisibility(viewModelGetTypeHttpSuccessViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddServiceViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.AddServiceViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectTypeButton(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentAddServiceBinding>inflate(inflater, ys.app.petproject.R.layout.fragment_add_service, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAddServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.fragment_add_service, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentAddServiceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAddServiceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_add_service_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentAddServiceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.getTypeHttpSuccess
        flag 1 (0x2L): viewModel.obServiceName
        flag 2 (0x3L): viewModel.obServiceRealPrice
        flag 3 (0x4L): viewModel.obServiceTypeName
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}