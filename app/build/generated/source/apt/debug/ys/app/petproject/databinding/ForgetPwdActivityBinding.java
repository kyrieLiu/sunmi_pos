package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ForgetPwdActivityBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 4);
        sViewsWithIds.put(R.id.ll, 5);
        sViewsWithIds.put(R.id.tv_forget_phone, 6);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.TextView tvForgetPhone;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ForgetPwdViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickOkBtnAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.smsCode.get()
            //         is viewModel.smsCode.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.smsCode
            android.databinding.ObservableField<java.lang.String> viewModelSmsCode = null;
            // viewModel.smsCode != null
            boolean viewModelSmsCodeJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ForgetPwdViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.smsCode.get()
            java.lang.String viewModelSmsCodeGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSmsCode = viewModel.smsCode;

                viewModelSmsCodeJavaLangObjectNull = (viewModelSmsCode) != (null);
                if (viewModelSmsCodeJavaLangObjectNull) {




                    viewModelSmsCode.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ForgetPwdActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.ll = (android.widget.LinearLayout) bindings[5];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.okBtn = (android.widget.Button) bindings[3];
        this.okBtn.setTag(null);
        this.tvForgetPhone = (android.widget.TextView) bindings[6];
        this.view = (android.view.View) bindings[4];
        setRootTag(root);
        // listeners
        mCallback89 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.ForgetPwdViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ForgetPwdViewModel ViewModel) {
        updateRegistration(3, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ForgetPwdViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSmsCode((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelCanSend((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ForgetPwdViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSmsCode(android.databinding.ObservableField<java.lang.String> ViewModelSmsCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCanSend(android.databinding.ObservableBoolean ViewModelCanSend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTime(android.databinding.ObservableField<java.lang.String> ViewModelTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ForgetPwdViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        android.databinding.ObservableField<java.lang.String> viewModelSmsCode = null;
        android.databinding.ObservableBoolean viewModelCanSend = null;
        java.lang.String viewModelTimeGet = null;
        boolean viewModelCanSendGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelTime = null;
        java.lang.String viewModelSmsCodeGet = null;
        ys.app.petproject.viewmodel.ForgetPwdViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickOkBtn
                        viewModelClickOkBtnAndroidViewViewOnClickListener = (((mViewModelClickOkBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickOkBtnAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickOkBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.smsCode
                        viewModelSmsCode = viewModel.smsCode;
                    }
                    updateRegistration(0, viewModelSmsCode);


                    if (viewModelSmsCode != null) {
                        // read viewModel.smsCode.get()
                        viewModelSmsCodeGet = viewModelSmsCode.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.canSend
                        viewModelCanSend = viewModel.canSend;
                    }
                    updateRegistration(1, viewModelCanSend);


                    if (viewModelCanSend != null) {
                        // read viewModel.canSend.get()
                        viewModelCanSendGet = viewModelCanSend.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.time
                        viewModelTime = viewModel.time;
                    }
                    updateRegistration(2, viewModelTime);


                    if (viewModelTime != null) {
                        // read viewModel.time.get()
                        viewModelTimeGet = viewModelTime.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelSmsCodeGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback89);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelTimeGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView2.setEnabled(viewModelCanSendGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.okBtn.setOnClickListener(viewModelClickOkBtnAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ForgetPwdViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.ForgetPwdViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOkBtn(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.ForgetPwdViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.sendSms();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ForgetPwdActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ForgetPwdActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ForgetPwdActivityBinding>inflate(inflater, ys.app.petproject.R.layout.activity_forget_pwd, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ForgetPwdActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ForgetPwdActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_forget_pwd, null, false), bindingComponent);
    }
    @NonNull
    public static ForgetPwdActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ForgetPwdActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_forget_pwd_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ForgetPwdActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.smsCode
        flag 1 (0x2L): viewModel.canSend
        flag 2 (0x3L): viewModel.time
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}