package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySaleBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 8);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.RelativeLayout mboundView7;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.SaleViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickSPCXAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickSPCXSZAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickFWCXSZAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickFWCXAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivitySaleBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.ll = (android.widget.LinearLayout) bindings[1];
        this.ll.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.view = (android.view.View) bindings[8];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((ys.app.petproject.viewmodel.SaleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.SaleViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.SaleViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.petproject.viewmodel.SaleViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.SaleViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        android.view.View.OnClickListener viewModelClickSPCXAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSPCXSZAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickFWCXSZAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickFWCXAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.SaleViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickSPCX
                    viewModelClickSPCXAndroidViewViewOnClickListener = (((mViewModelClickSPCXAndroidViewViewOnClickListener == null) ? (mViewModelClickSPCXAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickSPCXAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickSPCXSZ
                    viewModelClickSPCXSZAndroidViewViewOnClickListener = (((mViewModelClickSPCXSZAndroidViewViewOnClickListener == null) ? (mViewModelClickSPCXSZAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickSPCXSZAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickFWCXSZ
                    viewModelClickFWCXSZAndroidViewViewOnClickListener = (((mViewModelClickFWCXSZAndroidViewViewOnClickListener == null) ? (mViewModelClickFWCXSZAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickFWCXSZAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickFWCX
                    viewModelClickFWCXAndroidViewViewOnClickListener = (((mViewModelClickFWCXAndroidViewViewOnClickListener == null) ? (mViewModelClickFWCXAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickFWCXAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelClickSPCXAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(viewModelClickFWCXAndroidViewViewOnClickListener);
            this.mboundView6.setOnClickListener(viewModelClickSPCXSZAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(viewModelClickFWCXSZAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SaleViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.SaleViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPCX(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SaleViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.SaleViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPCXSZ(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SaleViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.SaleViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickFWCXSZ(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SaleViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.SaleViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickFWCX(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivitySaleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySaleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivitySaleBinding>inflate(inflater, ys.app.petproject.R.layout.activity_sale, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivitySaleBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySaleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_sale, null, false), bindingComponent);
    }
    @NonNull
    public static ActivitySaleBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySaleBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_sale_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivitySaleBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}