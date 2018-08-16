package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SandQRCodeBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_tool_bar, 3);
        sViewsWithIds.put(R.id.view, 4);
        sViewsWithIds.put(R.id.tv_scan_warn, 5);
        sViewsWithIds.put(R.id.tv_personal_pay, 6);
        sViewsWithIds.put(R.id.iv_QR_code_weixin, 7);
    }
    // views
    @NonNull
    public final android.widget.Button btPersonalPayCommit;
    @NonNull
    public final android.widget.ImageView ivQRCodeWeixin;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.TextView tvPersonalPay;
    @NonNull
    public final android.widget.TextView tvScanWarn;
    @NonNull
    public final android.view.View view;
    @Nullable
    public final android.view.View viewToolBar;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.SandQRCodeModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelConfirmPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public SandQRCodeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.btPersonalPayCommit = (android.widget.Button) bindings[1];
        this.btPersonalPayCommit.setTag(null);
        this.ivQRCodeWeixin = (android.widget.ImageView) bindings[7];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[2];
        this.networkErrorIv.setTag(null);
        this.tvPersonalPay = (android.widget.TextView) bindings[6];
        this.tvScanWarn = (android.widget.TextView) bindings[5];
        this.view = (android.view.View) bindings[4];
        this.viewToolBar = (android.view.View) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((ys.app.petproject.viewmodel.SandQRCodeModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.SandQRCodeModel ViewModel) {
        updateRegistration(2, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.SandQRCodeModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelClickEnable((android.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModel((ys.app.petproject.viewmodel.SandQRCodeModel) object, fieldId);
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
    private boolean onChangeViewModelClickEnable(android.databinding.ObservableField<java.lang.Boolean> ViewModelClickEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.SandQRCodeModel ViewModel, int fieldId) {
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
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        java.lang.Boolean viewModelClickEnableGet = null;
        android.databinding.ObservableField<java.lang.Boolean> viewModelClickEnable = null;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        boolean androidDatabindingDynamicUtilSafeUnboxViewModelClickEnableGet = false;
        android.view.View.OnClickListener viewModelConfirmPayAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.SandQRCodeModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(0, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clickEnable
                        viewModelClickEnable = viewModel.clickEnable;
                    }
                    updateRegistration(1, viewModelClickEnable);


                    if (viewModelClickEnable != null) {
                        // read viewModel.clickEnable.get()
                        viewModelClickEnableGet = viewModelClickEnable.get();
                    }


                    // read android.databinding.DynamicUtil.safeUnbox(viewModel.clickEnable.get())
                    androidDatabindingDynamicUtilSafeUnboxViewModelClickEnableGet = android.databinding.DynamicUtil.safeUnbox(viewModelClickEnableGet);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel::confirmPay
                        viewModelConfirmPayAndroidViewViewOnClickListener = (((mViewModelConfirmPayAndroidViewViewOnClickListener == null) ? (mViewModelConfirmPayAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelConfirmPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btPersonalPayCommit.setOnClickListener(viewModelConfirmPayAndroidViewViewOnClickListener);
            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.btPersonalPayCommit.setEnabled(androidDatabindingDynamicUtilSafeUnboxViewModelClickEnableGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SandQRCodeModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.SandQRCodeModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.confirmPay(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SandQRCodeModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.SandQRCodeModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static SandQRCodeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SandQRCodeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<SandQRCodeBinding>inflate(inflater, ys.app.petproject.R.layout.activity_sand_qrcode, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static SandQRCodeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SandQRCodeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_sand_qrcode, null, false), bindingComponent);
    }
    @NonNull
    public static SandQRCodeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SandQRCodeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_sand_qrcode_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new SandQRCodeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.clickEnable
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}