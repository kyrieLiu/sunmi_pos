package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityModifyBossPswBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.ll, 6);
    }
    // views
    @NonNull
    public final android.widget.EditText editText2;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickOkBtnAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editText2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obOldPsw.get()
            //         is viewModel.obOldPsw.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText2);
            // localize variables for thread safety
            // viewModel.obOldPsw.get()
            java.lang.String viewModelObOldPswGet = null;
            // viewModel
            ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obOldPsw
            android.databinding.ObservableField<java.lang.String> viewModelObOldPsw = null;
            // viewModel.obOldPsw != null
            boolean viewModelObOldPswJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObOldPsw = viewModel.obOldPsw;

                viewModelObOldPswJavaLangObjectNull = (viewModelObOldPsw) != (null);
                if (viewModelObOldPswJavaLangObjectNull) {




                    viewModelObOldPsw.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obNewPsw.get()
            //         is viewModel.obNewPsw.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.obNewPsw.get()
            java.lang.String viewModelObNewPswGet = null;
            // viewModel.obNewPsw
            android.databinding.ObservableField<java.lang.String> viewModelObNewPsw = null;
            // viewModel
            ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obNewPsw != null
            boolean viewModelObNewPswJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObNewPsw = viewModel.obNewPsw;

                viewModelObNewPswJavaLangObjectNull = (viewModelObNewPsw) != (null);
                if (viewModelObNewPswJavaLangObjectNull) {




                    viewModelObNewPsw.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obConfirmPsw.get()
            //         is viewModel.obConfirmPsw.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obConfirmPsw != null
            boolean viewModelObConfirmPswJavaLangObjectNull = false;
            // viewModel.obConfirmPsw
            android.databinding.ObservableField<java.lang.String> viewModelObConfirmPsw = null;
            // viewModel.obConfirmPsw.get()
            java.lang.String viewModelObConfirmPswGet = null;
            // viewModel
            ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObConfirmPsw = viewModel.obConfirmPsw;

                viewModelObConfirmPswJavaLangObjectNull = (viewModelObConfirmPsw) != (null);
                if (viewModelObConfirmPswJavaLangObjectNull) {




                    viewModelObConfirmPsw.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityModifyBossPswBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.editText2 = (android.widget.EditText) bindings[1];
        this.editText2.setTag(null);
        this.ll = (android.widget.LinearLayout) bindings[6];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.okBtn = (android.widget.Button) bindings[4];
        this.okBtn.setTag(null);
        this.view = (android.view.View) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObNewPsw((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObOldPsw((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObConfirmPsw((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObNewPsw(android.databinding.ObservableField<java.lang.String> ViewModelObNewPsw, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObOldPsw(android.databinding.ObservableField<java.lang.String> ViewModelObOldPsw, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObConfirmPsw(android.databinding.ObservableField<java.lang.String> ViewModelObConfirmPsw, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewModelObOldPswGet = null;
        java.lang.String viewModelObConfirmPswGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObNewPsw = null;
        java.lang.String viewModelObNewPswGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObOldPsw = null;
        android.databinding.ObservableField<java.lang.String> viewModelObConfirmPsw = null;
        ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickOkBtn
                        viewModelClickOkBtnAndroidViewViewOnClickListener = (((mViewModelClickOkBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickOkBtnAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickOkBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obNewPsw
                        viewModelObNewPsw = viewModel.obNewPsw;
                    }
                    updateRegistration(0, viewModelObNewPsw);


                    if (viewModelObNewPsw != null) {
                        // read viewModel.obNewPsw.get()
                        viewModelObNewPswGet = viewModelObNewPsw.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obOldPsw
                        viewModelObOldPsw = viewModel.obOldPsw;
                    }
                    updateRegistration(1, viewModelObOldPsw);


                    if (viewModelObOldPsw != null) {
                        // read viewModel.obOldPsw.get()
                        viewModelObOldPswGet = viewModelObOldPsw.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obConfirmPsw
                        viewModelObConfirmPsw = viewModel.obConfirmPsw;
                    }
                    updateRegistration(2, viewModelObConfirmPsw);


                    if (viewModelObConfirmPsw != null) {
                        // read viewModel.obConfirmPsw.get()
                        viewModelObConfirmPswGet = viewModelObConfirmPsw.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText2, viewModelObOldPswGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelObNewPswGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObConfirmPswGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.okBtn.setOnClickListener(viewModelClickOkBtnAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.ModifyBossPswViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOkBtn(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityModifyBossPswBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityModifyBossPswBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityModifyBossPswBinding>inflate(inflater, ys.app.petproject.R.layout.activity_modify_boss_psw, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityModifyBossPswBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityModifyBossPswBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_modify_boss_psw, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityModifyBossPswBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityModifyBossPswBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_modify_boss_psw_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityModifyBossPswBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obNewPsw
        flag 1 (0x2L): viewModel.obOldPsw
        flag 2 (0x3L): viewModel.obConfirmPsw
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}