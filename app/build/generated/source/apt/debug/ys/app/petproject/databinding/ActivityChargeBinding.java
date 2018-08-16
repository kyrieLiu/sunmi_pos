package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChargeBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 8);
        sViewsWithIds.put(R.id.select_employee_ll, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView5;
    @NonNull
    private final android.widget.EditText mboundView6;
    @NonNull
    public final ys.app.petproject.widget.LastInputEditText moneyEt;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.TextView phoneTv;
    @NonNull
    public final android.widget.LinearLayout selectEmployeeLl;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ChargeViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.presentMoney.get()
            //         is viewModel.presentMoney.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.presentMoney.get()
            java.lang.String viewModelPresentMoneyGet = null;
            // viewModel.presentMoney != null
            boolean viewModelPresentMoneyJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ChargeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.presentMoney
            android.databinding.ObservableField<java.lang.String> viewModelPresentMoney = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPresentMoney = viewModel.presentMoney;

                viewModelPresentMoneyJavaLangObjectNull = (viewModelPresentMoney) != (null);
                if (viewModelPresentMoneyJavaLangObjectNull) {




                    viewModelPresentMoney.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.selectEmployee.get()
            //         is viewModel.selectEmployee.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel.selectEmployee
            android.databinding.ObservableField<java.lang.String> viewModelSelectEmployee = null;
            // viewModel.selectEmployee.get()
            java.lang.String viewModelSelectEmployeeGet = null;
            // viewModel
            ys.app.petproject.viewmodel.ChargeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.selectEmployee != null
            boolean viewModelSelectEmployeeJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSelectEmployee = viewModel.selectEmployee;

                viewModelSelectEmployeeJavaLangObjectNull = (viewModelSelectEmployee) != (null);
                if (viewModelSelectEmployeeJavaLangObjectNull) {




                    viewModelSelectEmployee.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener moneyEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.money.get()
            //         is viewModel.money.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(moneyEt);
            // localize variables for thread safety
            // viewModel.money != null
            boolean viewModelMoneyJavaLangObjectNull = false;
            // viewModel.money
            android.databinding.ObservableField<java.lang.String> viewModelMoney = null;
            // viewModel
            ys.app.petproject.viewmodel.ChargeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.money.get()
            java.lang.String viewModelMoneyGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMoney = viewModel.money;

                viewModelMoneyJavaLangObjectNull = (viewModelMoney) != (null);
                if (viewModelMoneyJavaLangObjectNull) {




                    viewModelMoney.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityChargeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 8);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (ys.app.petproject.widget.LastInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.EditText) bindings[6];
        this.mboundView6.setTag(null);
        this.moneyEt = (ys.app.petproject.widget.LastInputEditText) bindings[3];
        this.moneyEt.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[1];
        this.nameTv.setTag(null);
        this.okBtn = (android.widget.Button) bindings[7];
        this.okBtn.setTag(null);
        this.phoneTv = (android.widget.TextView) bindings[2];
        this.phoneTv.setTag(null);
        this.selectEmployeeLl = (android.widget.LinearLayout) bindings[9];
        this.view = (android.view.View) bindings[8];
        setRootTag(root);
        // listeners
        mCallback49 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.ChargeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ChargeViewModel ViewModel) {
        updateRegistration(7, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ChargeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPresentMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelVipPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelVipName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelSelectEmployee((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelVipType((android.databinding.ObservableInt) object, fieldId);
            case 7 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ChargeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPresentMoney(android.databinding.ObservableField<java.lang.String> ViewModelPresentMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipPhone(android.databinding.ObservableField<java.lang.String> ViewModelVipPhone, int fieldId) {
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
    private boolean onChangeViewModelVipName(android.databinding.ObservableField<java.lang.String> ViewModelVipName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectEmployee(android.databinding.ObservableField<java.lang.String> ViewModelSelectEmployee, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMoney(android.databinding.ObservableField<java.lang.String> ViewModelMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipType(android.databinding.ObservableInt ViewModelVipType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ChargeViewModel ViewModel, int fieldId) {
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
        java.lang.String viewModelSelectEmployeeGet = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.text.TextWatcher viewModelTextChangeListener = null;
        java.lang.String viewModelVipNameGet = null;
        int viewModelVipTypeInt0ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPresentMoneyGet = null;
        boolean viewModelObButtonEnableGet = false;
        boolean viewModelVipTypeInt0 = false;
        android.databinding.ObservableField<java.lang.String> viewModelPresentMoney = null;
        java.lang.String viewModelMoneyGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelVipPhone = null;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        java.lang.String viewModelVipPhoneGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelVipName = null;
        android.databinding.ObservableField<java.lang.String> viewModelSelectEmployee = null;
        android.databinding.ObservableField<java.lang.String> viewModelMoney = null;
        android.databinding.ObservableInt viewModelVipType = null;
        int viewModelVipTypeGet = 0;
        ys.app.petproject.viewmodel.ChargeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x180L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.textChangeListener
                        viewModelTextChangeListener = viewModel.textChangeListener;
                    }
            }
            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presentMoney
                        viewModelPresentMoney = viewModel.presentMoney;
                    }
                    updateRegistration(0, viewModelPresentMoney);


                    if (viewModelPresentMoney != null) {
                        // read viewModel.presentMoney.get()
                        viewModelPresentMoneyGet = viewModelPresentMoney.get();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipPhone
                        viewModelVipPhone = viewModel.vipPhone;
                    }
                    updateRegistration(1, viewModelVipPhone);


                    if (viewModelVipPhone != null) {
                        // read viewModel.vipPhone.get()
                        viewModelVipPhoneGet = viewModelVipPhone.get();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

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
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipName
                        viewModelVipName = viewModel.vipName;
                    }
                    updateRegistration(3, viewModelVipName);


                    if (viewModelVipName != null) {
                        // read viewModel.vipName.get()
                        viewModelVipNameGet = viewModelVipName.get();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectEmployee
                        viewModelSelectEmployee = viewModel.selectEmployee;
                    }
                    updateRegistration(4, viewModelSelectEmployee);


                    if (viewModelSelectEmployee != null) {
                        // read viewModel.selectEmployee.get()
                        viewModelSelectEmployeeGet = viewModelSelectEmployee.get();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.money
                        viewModelMoney = viewModel.money;
                    }
                    updateRegistration(5, viewModelMoney);


                    if (viewModelMoney != null) {
                        // read viewModel.money.get()
                        viewModelMoneyGet = viewModelMoney.get();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipType
                        viewModelVipType = viewModel.vipType;
                    }
                    updateRegistration(6, viewModelVipType);


                    if (viewModelVipType != null) {
                        // read viewModel.vipType.get()
                        viewModelVipTypeGet = viewModelVipType.get();
                    }


                    // read viewModel.vipType.get() == 0
                    viewModelVipTypeInt0 = (viewModelVipTypeGet) == (0);
                if((dirtyFlags & 0x1c0L) != 0) {
                    if(viewModelVipTypeInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.vipType.get() == 0 ? View.VISIBLE : View.GONE
                    viewModelVipTypeInt0ViewVISIBLEViewGONE = ((viewModelVipTypeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelVipTypeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelPresentMoneyGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback49);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.moneyEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, moneyEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelSelectEmployeeGet);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView6, viewModelTextChangeListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.moneyEt, viewModelTextChangeListener);
            this.okBtn.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.moneyEt, viewModelMoneyGet);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, viewModelVipNameGet);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.okBtn.setEnabled(viewModelObButtonEnableGet);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.phoneTv, viewModelVipPhoneGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ChargeViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.ChargeViewModel value) {
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
        ys.app.petproject.viewmodel.ChargeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.selectEmployeeClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityChargeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityChargeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityChargeBinding>inflate(inflater, ys.app.petproject.R.layout.activity_charge, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityChargeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityChargeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_charge, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityChargeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityChargeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_charge_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityChargeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.presentMoney
        flag 1 (0x2L): viewModel.vipPhone
        flag 2 (0x3L): viewModel.obButtonEnable
        flag 3 (0x4L): viewModel.vipName
        flag 4 (0x5L): viewModel.selectEmployee
        flag 5 (0x6L): viewModel.money
        flag 6 (0x7L): viewModel.vipType
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.vipType.get() == 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.vipType.get() == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}