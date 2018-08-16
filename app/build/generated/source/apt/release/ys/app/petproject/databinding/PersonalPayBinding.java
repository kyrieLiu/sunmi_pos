package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PersonalPayBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_tool_bar, 4);
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.tv_personal_pay_warn, 6);
        sViewsWithIds.put(R.id.tv_personal_pay, 7);
    }
    // views
    @NonNull
    public final android.widget.Button btPersonalPayCommit;
    @NonNull
    public final android.widget.ImageView ivQRCode;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.TextView tvPersonalPay;
    @NonNull
    public final android.widget.TextView tvPersonalPayWarn;
    @NonNull
    public final android.widget.TextView tvPersonalXianjinPay;
    @NonNull
    public final android.view.View view;
    @Nullable
    public final android.view.View viewToolBar;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.PersonalPayModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelConfirmPayAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public PersonalPayBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.btPersonalPayCommit = (android.widget.Button) bindings[3];
        this.btPersonalPayCommit.setTag(null);
        this.ivQRCode = (android.widget.ImageView) bindings[1];
        this.ivQRCode.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPersonalPay = (android.widget.TextView) bindings[7];
        this.tvPersonalPayWarn = (android.widget.TextView) bindings[6];
        this.tvPersonalXianjinPay = (android.widget.TextView) bindings[2];
        this.tvPersonalXianjinPay.setTag(null);
        this.view = (android.view.View) bindings[5];
        this.viewToolBar = (android.view.View) bindings[4];
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
            setViewModel((ys.app.petproject.viewmodel.PersonalPayModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.PersonalPayModel ViewModel) {
        updateRegistration(2, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.PersonalPayModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelClickEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelIsXianJin((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModel((ys.app.petproject.viewmodel.PersonalPayModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelClickEnable(android.databinding.ObservableBoolean ViewModelClickEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsXianJin(android.databinding.ObservableBoolean ViewModelIsXianJin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.PersonalPayModel ViewModel, int fieldId) {
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
        boolean viewModelClickEnableGet = false;
        int viewModelIsXianJinViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelClickEnable = null;
        boolean viewModelIsXianJinGet = false;
        int viewModelIsXianJinViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener viewModelConfirmPayAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsXianJin = null;
        ys.app.petproject.viewmodel.PersonalPayModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clickEnable
                        viewModelClickEnable = viewModel.clickEnable;
                    }
                    updateRegistration(0, viewModelClickEnable);


                    if (viewModelClickEnable != null) {
                        // read viewModel.clickEnable.get()
                        viewModelClickEnableGet = viewModelClickEnable.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel::confirmPay
                        viewModelConfirmPayAndroidViewViewOnClickListener = (((mViewModelConfirmPayAndroidViewViewOnClickListener == null) ? (mViewModelConfirmPayAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelConfirmPayAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isXianJin
                        viewModelIsXianJin = viewModel.isXianJin;
                    }
                    updateRegistration(1, viewModelIsXianJin);


                    if (viewModelIsXianJin != null) {
                        // read viewModel.isXianJin.get()
                        viewModelIsXianJinGet = viewModelIsXianJin.get();
                    }
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelIsXianJinGet) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.isXianJin.get() ? View.VISIBLE : View.GONE
                    viewModelIsXianJinViewVISIBLEViewGONE = ((viewModelIsXianJinGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.isXianJin.get() ? View.GONE : View.VISIBLE
                    viewModelIsXianJinViewGONEViewVISIBLE = ((viewModelIsXianJinGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.btPersonalPayCommit.setEnabled(viewModelClickEnableGet);
            this.tvPersonalXianjinPay.setEnabled(viewModelClickEnableGet);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btPersonalPayCommit.setOnClickListener(viewModelConfirmPayAndroidViewViewOnClickListener);
            this.tvPersonalXianjinPay.setOnClickListener(viewModelConfirmPayAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.btPersonalPayCommit.setVisibility(viewModelIsXianJinViewGONEViewVISIBLE);
            this.ivQRCode.setVisibility(viewModelIsXianJinViewGONEViewVISIBLE);
            this.tvPersonalXianjinPay.setVisibility(viewModelIsXianJinViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.PersonalPayModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.PersonalPayModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.confirmPay(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static PersonalPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PersonalPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PersonalPayBinding>inflate(inflater, ys.app.petproject.R.layout.activity_personal_pay, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static PersonalPayBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PersonalPayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_personal_pay, null, false), bindingComponent);
    }
    @NonNull
    public static PersonalPayBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PersonalPayBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_personal_pay_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PersonalPayBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.clickEnable
        flag 1 (0x2L): viewModel.isXianJin
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.isXianJin.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.isXianJin.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.isXianJin.get() ? View.GONE : View.VISIBLE
        flag 7 (0x8L): viewModel.isXianJin.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}