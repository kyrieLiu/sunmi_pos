package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityInventoryBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.RelativeLayout mboundView11;
    @NonNull
    private final android.widget.RelativeLayout mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.RelativeLayout mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.inventory.InventoryViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickSPRKAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickXZFWAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickSPPDAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickPDJLAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mViewModelClickXZSPAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mViewModelClickSPKCAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mViewModelClickSPCKAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mViewModelClickChuRuKuAndroidViewViewOnClickListener;
    private OnClickListenerImpl8 mViewModelClickFWKCAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityInventoryBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.RelativeLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.view = (android.view.View) bindings[12];
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
            setViewModel((ys.app.petproject.viewmodel.inventory.InventoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.inventory.InventoryViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.inventory.InventoryViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.petproject.viewmodel.inventory.InventoryViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.inventory.InventoryViewModel ViewModel, int fieldId) {
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
        android.view.View.OnClickListener viewModelClickSPRKAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickXZFWAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSPPDAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickPDJLAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickXZSPAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSPKCAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSPCKAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickChuRuKuAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickFWKCAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.inventory.InventoryViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickSPRK
                    viewModelClickSPRKAndroidViewViewOnClickListener = (((mViewModelClickSPRKAndroidViewViewOnClickListener == null) ? (mViewModelClickSPRKAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickSPRKAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickXZFW
                    viewModelClickXZFWAndroidViewViewOnClickListener = (((mViewModelClickXZFWAndroidViewViewOnClickListener == null) ? (mViewModelClickXZFWAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickXZFWAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickSPPD
                    viewModelClickSPPDAndroidViewViewOnClickListener = (((mViewModelClickSPPDAndroidViewViewOnClickListener == null) ? (mViewModelClickSPPDAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickSPPDAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickPDJL
                    viewModelClickPDJLAndroidViewViewOnClickListener = (((mViewModelClickPDJLAndroidViewViewOnClickListener == null) ? (mViewModelClickPDJLAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickPDJLAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickXZSP
                    viewModelClickXZSPAndroidViewViewOnClickListener = (((mViewModelClickXZSPAndroidViewViewOnClickListener == null) ? (mViewModelClickXZSPAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mViewModelClickXZSPAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickSPKC
                    viewModelClickSPKCAndroidViewViewOnClickListener = (((mViewModelClickSPKCAndroidViewViewOnClickListener == null) ? (mViewModelClickSPKCAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mViewModelClickSPKCAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickSPCK
                    viewModelClickSPCKAndroidViewViewOnClickListener = (((mViewModelClickSPCKAndroidViewViewOnClickListener == null) ? (mViewModelClickSPCKAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mViewModelClickSPCKAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickChuRuKu
                    viewModelClickChuRuKuAndroidViewViewOnClickListener = (((mViewModelClickChuRuKuAndroidViewViewOnClickListener == null) ? (mViewModelClickChuRuKuAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mViewModelClickChuRuKuAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickFWKC
                    viewModelClickFWKCAndroidViewViewOnClickListener = (((mViewModelClickFWKCAndroidViewViewOnClickListener == null) ? (mViewModelClickFWKCAndroidViewViewOnClickListener = new OnClickListenerImpl8()) : mViewModelClickFWKCAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(viewModelClickFWKCAndroidViewViewOnClickListener);
            this.mboundView11.setOnClickListener(viewModelClickXZFWAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(viewModelClickSPKCAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(viewModelClickXZSPAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(viewModelClickSPRKAndroidViewViewOnClickListener);
            this.mboundView5.setOnClickListener(viewModelClickSPCKAndroidViewViewOnClickListener);
            this.mboundView6.setOnClickListener(viewModelClickSPPDAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(viewModelClickPDJLAndroidViewViewOnClickListener);
            this.mboundView8.setOnClickListener(viewModelClickChuRuKuAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPRK(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXZFW(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPPD(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickPDJL(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXZSP(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPKC(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl6 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPCK(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl7 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickChuRuKu(arg0);
        }
    }
    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.InventoryViewModel value;
        public OnClickListenerImpl8 setValue(ys.app.petproject.viewmodel.inventory.InventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickFWKC(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityInventoryBinding>inflate(inflater, ys.app.petproject.R.layout.activity_inventory, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_inventory, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityInventoryBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityInventoryBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_inventory_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityInventoryBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}