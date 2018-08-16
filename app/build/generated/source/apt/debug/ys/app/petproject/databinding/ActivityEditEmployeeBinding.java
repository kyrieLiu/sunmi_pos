package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditEmployeeBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 9);
        sViewsWithIds.put(R.id.tv0, 10);
        sViewsWithIds.put(R.id.tv1, 11);
    }
    // views
    @NonNull
    public final android.widget.EditText editText3;
    @NonNull
    public final android.widget.EditText editText4;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.ImageView selectIv1;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.EditEmployeeViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback90;
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickOkBtnAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickGenderButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editText3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obPhone.get()
            //         is viewModel.obPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText3);
            // localize variables for thread safety
            // viewModel.obPhone
            android.databinding.ObservableField<java.lang.String> viewModelObPhone = null;
            // viewModel.obPhone.get()
            java.lang.String viewModelObPhoneGet = null;
            // viewModel
            ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
            // viewModel.obPhone != null
            boolean viewModelObPhoneJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObPhone = viewModel.obPhone;

                viewModelObPhoneJavaLangObjectNull = (viewModelObPhone) != (null);
                if (viewModelObPhoneJavaLangObjectNull) {




                    viewModelObPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener editText4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obNum.get()
            //         is viewModel.obNum.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText4);
            // localize variables for thread safety
            // viewModel
            ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
            // viewModel.obNum.get()
            java.lang.String viewModelObNumGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obNum
            android.databinding.ObservableField<java.lang.String> viewModelObNum = null;
            // viewModel.obNum != null
            boolean viewModelObNumJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObNum = viewModel.obNum;

                viewModelObNumJavaLangObjectNull = (viewModelObNum) != (null);
                if (viewModelObNumJavaLangObjectNull) {




                    viewModelObNum.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
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
            ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
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
            // Inverse of viewModel.obGender.get()
            //         is viewModel.obGender.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obGender.get()
            java.lang.String viewModelObGenderGet = null;
            // viewModel.obGender != null
            boolean viewModelObGenderJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGender
            android.databinding.ObservableField<java.lang.String> viewModelObGender = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGender = viewModel.obGender;

                viewModelObGenderJavaLangObjectNull = (viewModelObGender) != (null);
                if (viewModelObGenderJavaLangObjectNull) {




                    viewModelObGender.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obWorkType.get()
            //         is viewModel.obWorkType.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel.obWorkType.get()
            java.lang.String viewModelObWorkTypeGet = null;
            // viewModel.obWorkType != null
            boolean viewModelObWorkTypeJavaLangObjectNull = false;
            // viewModel.obWorkType
            android.databinding.ObservableField<java.lang.String> viewModelObWorkType = null;
            // viewModel
            ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObWorkType = viewModel.obWorkType;

                viewModelObWorkTypeJavaLangObjectNull = (viewModelObWorkType) != (null);
                if (viewModelObWorkTypeJavaLangObjectNull) {




                    viewModelObWorkType.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityEditEmployeeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.editText3 = (android.widget.EditText) bindings[4];
        this.editText3.setTag(null);
        this.editText4 = (android.widget.EditText) bindings[5];
        this.editText4.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.okBtn = (android.widget.Button) bindings[8];
        this.okBtn.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[7];
        this.selectIv0.setTag(null);
        this.selectIv1 = (android.widget.ImageView) bindings[2];
        this.selectIv1.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[10];
        this.tv1 = (android.widget.TextView) bindings[11];
        this.view = (android.view.View) bindings[9];
        setRootTag(root);
        // listeners
        mCallback90 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback91 = new android.databinding.generated.callback.OnClickListener(this, 2);
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
            setViewModel((ys.app.petproject.viewmodel.manage.EditEmployeeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.EditEmployeeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.EditEmployeeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObNum((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObWorkType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObGender((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelObName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObNum(android.databinding.ObservableField<java.lang.String> ViewModelObNum, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObWorkType(android.databinding.ObservableField<java.lang.String> ViewModelObWorkType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGender(android.databinding.ObservableField<java.lang.String> ViewModelObGender, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObPhone(android.databinding.ObservableField<java.lang.String> ViewModelObPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObName(android.databinding.ObservableField<java.lang.String> ViewModelObName, int fieldId) {
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
        android.view.View.OnClickListener viewModelClickOkBtnAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObNum = null;
        java.lang.String viewModelObWorkTypeGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObWorkType = null;
        java.lang.String viewModelObPhoneGet = null;
        java.lang.String viewModelObNumGet = null;
        java.lang.String viewModelObGenderGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGender = null;
        java.lang.String viewModelObNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObPhone = null;
        android.databinding.ObservableField<java.lang.String> viewModelObName = null;
        android.view.View.OnClickListener viewModelClickGenderButtonAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x60L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickOkBtn
                        viewModelClickOkBtnAndroidViewViewOnClickListener = (((mViewModelClickOkBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickOkBtnAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickOkBtnAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickGenderButton
                        viewModelClickGenderButtonAndroidViewViewOnClickListener = (((mViewModelClickGenderButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickGenderButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickGenderButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obNum
                        viewModelObNum = viewModel.obNum;
                    }
                    updateRegistration(0, viewModelObNum);


                    if (viewModelObNum != null) {
                        // read viewModel.obNum.get()
                        viewModelObNumGet = viewModelObNum.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obWorkType
                        viewModelObWorkType = viewModel.obWorkType;
                    }
                    updateRegistration(1, viewModelObWorkType);


                    if (viewModelObWorkType != null) {
                        // read viewModel.obWorkType.get()
                        viewModelObWorkTypeGet = viewModelObWorkType.get();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGender
                        viewModelObGender = viewModel.obGender;
                    }
                    updateRegistration(2, viewModelObGender);


                    if (viewModelObGender != null) {
                        // read viewModel.obGender.get()
                        viewModelObGenderGet = viewModelObGender.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obPhone
                        viewModelObPhone = viewModel.obPhone;
                    }
                    updateRegistration(3, viewModelObPhone);


                    if (viewModelObPhone != null) {
                        // read viewModel.obPhone.get()
                        viewModelObPhoneGet = viewModelObPhone.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obName
                        viewModelObName = viewModel.obName;
                    }
                    updateRegistration(4, viewModelObName);


                    if (viewModelObName != null) {
                        // read viewModel.obName.get()
                        viewModelObNameGet = viewModelObName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText3, viewModelObPhoneGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText4androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback90);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            this.selectIv0.setOnClickListener(mCallback91);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText4, viewModelObNumGet);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObNameGet);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelClickGenderButtonAndroidViewViewOnClickListener);
            this.okBtn.setOnClickListener(viewModelClickOkBtnAndroidViewViewOnClickListener);
            this.selectIv1.setOnClickListener(viewModelClickGenderButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObGenderGet);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelObWorkTypeGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.EditEmployeeViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.EditEmployeeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOkBtn(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.EditEmployeeViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.manage.EditEmployeeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickGenderButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectTypeWork();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.manage.EditEmployeeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectTypeWork();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityEditEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEditEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityEditEmployeeBinding>inflate(inflater, ys.app.petproject.R.layout.activity_edit_employee, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityEditEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEditEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_edit_employee, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityEditEmployeeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEditEmployeeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_edit_employee_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityEditEmployeeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obNum
        flag 1 (0x2L): viewModel.obWorkType
        flag 2 (0x3L): viewModel.obGender
        flag 3 (0x4L): viewModel.obPhone
        flag 4 (0x5L): viewModel.obName
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}