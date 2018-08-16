package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddInventoryBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 6);
        sViewsWithIds.put(R.id.ll0, 7);
        sViewsWithIds.put(R.id.ll1, 8);
        sViewsWithIds.put(R.id.ll5, 9);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll0;
    @NonNull
    public final android.widget.LinearLayout ll1;
    @NonNull
    public final android.widget.LinearLayout ll5;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.AddInventoryViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAddInventory.get()
            //         is viewModel.obAddInventory.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obAddInventory != null
            boolean viewModelObAddInventoryJavaLangObjectNull = false;
            // viewModel.obAddInventory.get()
            java.lang.String viewModelObAddInventoryGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddInventoryViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAddInventory
            android.databinding.ObservableField<java.lang.String> viewModelObAddInventory = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAddInventory = viewModel.obAddInventory;

                viewModelObAddInventoryJavaLangObjectNull = (viewModelObAddInventory) != (null);
                if (viewModelObAddInventoryJavaLangObjectNull) {




                    viewModelObAddInventory.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsProductDate.get()
            //         is viewModel.obGoodsProductDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.obGoodsProductDate
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsProductDate = null;
            // viewModel.obGoodsProductDate.get()
            java.lang.String viewModelObGoodsProductDateGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddInventoryViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGoodsProductDate != null
            boolean viewModelObGoodsProductDateJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsProductDate = viewModel.obGoodsProductDate;

                viewModelObGoodsProductDateJavaLangObjectNull = (viewModelObGoodsProductDate) != (null);
                if (viewModelObGoodsProductDateJavaLangObjectNull) {




                    viewModelObGoodsProductDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddInventoryBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.ll0 = (android.widget.LinearLayout) bindings[7];
        this.ll1 = (android.widget.LinearLayout) bindings[8];
        this.ll5 = (android.widget.LinearLayout) bindings[9];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.view = (android.view.View) bindings[6];
        setRootTag(root);
        // listeners
        mCallback40 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.AddInventoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.AddInventoryViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.AddInventoryViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelMResult((ys.app.petproject.model.GoodInfo) object, fieldId);
            case 2 :
                return onChangeViewModelObAddInventory((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObGoodsProductDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.petproject.viewmodel.AddInventoryViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObButtonEnable(android.databinding.ObservableBoolean ViewModelObButtonEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMResult(ys.app.petproject.model.GoodInfo ViewModelMResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.barCode) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAddInventory(android.databinding.ObservableField<java.lang.String> ViewModelObAddInventory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsProductDate(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsProductDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.AddInventoryViewModel ViewModel, int fieldId) {
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
        java.lang.String viewModelMResultName = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.text.TextWatcher viewModelTextChangeListener = null;
        java.lang.String viewModelObAddInventoryGet = null;
        boolean viewModelObButtonEnableGet = false;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        ys.app.petproject.model.GoodInfo viewModelMResult = null;
        java.lang.String viewModelMResultBarCode = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAddInventory = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsProductDate = null;
        java.lang.String viewModelObGoodsProductDateGet = null;
        ys.app.petproject.viewmodel.AddInventoryViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x90L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.textChangeListener
                        viewModelTextChangeListener = viewModel.textChangeListener;
                    }
            }
            if ((dirtyFlags & 0x91L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obButtonEnable
                        viewModelObButtonEnable = viewModel.obButtonEnable;
                    }
                    updateRegistration(0, viewModelObButtonEnable);


                    if (viewModelObButtonEnable != null) {
                        // read viewModel.obButtonEnable.get()
                        viewModelObButtonEnableGet = viewModelObButtonEnable.get();
                    }
            }
            if ((dirtyFlags & 0xf2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mResult
                        viewModelMResult = viewModel.mResult;
                    }
                    updateRegistration(1, viewModelMResult);

                if ((dirtyFlags & 0xb2L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.name
                            viewModelMResultName = viewModelMResult.getName();
                        }
                }
                if ((dirtyFlags & 0xd2L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.barCode
                            viewModelMResultBarCode = viewModelMResult.getBarCode();
                        }
                }
            }
            if ((dirtyFlags & 0x94L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAddInventory
                        viewModelObAddInventory = viewModel.obAddInventory;
                    }
                    updateRegistration(2, viewModelObAddInventory);


                    if (viewModelObAddInventory != null) {
                        // read viewModel.obAddInventory.get()
                        viewModelObAddInventoryGet = viewModelObAddInventory.get();
                    }
            }
            if ((dirtyFlags & 0x98L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsProductDate
                        viewModelObGoodsProductDate = viewModel.obGoodsProductDate;
                    }
                    updateRegistration(3, viewModelObGoodsProductDate);


                    if (viewModelObGoodsProductDate != null) {
                        // read viewModel.obGoodsProductDate.get()
                        viewModelObGoodsProductDateGet = viewModelObGoodsProductDate.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xb2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelMResultName);
        }
        if ((dirtyFlags & 0xd2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMResultBarCode);
        }
        if ((dirtyFlags & 0x94L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObAddInventoryGet);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView3, viewModelTextChangeListener);
            this.mboundView5.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback40);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x98L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelObGoodsProductDateGet);
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            this.mboundView5.setEnabled(viewModelObButtonEnableGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddInventoryViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.AddInventoryViewModel value) {
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
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.AddInventoryViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.manufactureTimeClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddInventoryBinding>inflate(inflater, ys.app.petproject.R.layout.activity_add_inventory, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_add_inventory, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddInventoryBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddInventoryBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_inventory_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddInventoryBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obButtonEnable
        flag 1 (0x2L): viewModel.mResult
        flag 2 (0x3L): viewModel.obAddInventory
        flag 3 (0x4L): viewModel.obGoodsProductDate
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): viewModel.mResult.name
        flag 6 (0x7L): viewModel.mResult.barCode
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}