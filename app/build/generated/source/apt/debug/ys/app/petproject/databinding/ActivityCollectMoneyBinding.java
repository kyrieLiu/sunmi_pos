package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCollectMoneyBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 6);
        sViewsWithIds.put(R.id.bottomSheetLayout, 7);
        sViewsWithIds.put(R.id.viewPager, 8);
        sViewsWithIds.put(R.id.rl_bottom, 9);
        sViewsWithIds.put(R.id.money_tv, 10);
        sViewsWithIds.put(R.id.tv_car, 11);
        sViewsWithIds.put(R.id.bv_unm, 12);
    }
    // views
    @NonNull
    public final com.flipboard.bottomsheet.BottomSheetLayout bottomSheetLayout;
    @NonNull
    public final android.widget.TextView bvUnm;
    @NonNull
    public final android.widget.Button guadanBtn;
    @NonNull
    public final android.widget.RelativeLayout llShopcar;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    public final android.widget.TextView moneyTv;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.RelativeLayout rlBottom;
    @NonNull
    public final android.widget.ImageView tvCar;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.support.v4.view.ViewPager viewPager;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.CollectMoneyViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClicGuadanButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickOrderAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityCollectMoneyBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.bottomSheetLayout = (com.flipboard.bottomsheet.BottomSheetLayout) bindings[7];
        this.bvUnm = (android.widget.TextView) bindings[12];
        this.guadanBtn = (android.widget.Button) bindings[3];
        this.guadanBtn.setTag(null);
        this.llShopcar = (android.widget.RelativeLayout) bindings[5];
        this.llShopcar.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.moneyTv = (android.widget.TextView) bindings[10];
        this.okBtn = (android.widget.Button) bindings[4];
        this.okBtn.setTag(null);
        this.rlBottom = (android.widget.RelativeLayout) bindings[9];
        this.tvCar = (android.widget.ImageView) bindings[11];
        this.view = (android.view.View) bindings[6];
        this.viewPager = (android.support.v4.view.ViewPager) bindings[8];
        setRootTag(root);
        // listeners
        mCallback88 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.CollectMoneyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.CollectMoneyViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.CollectMoneyViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.petproject.viewmodel.CollectMoneyViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.CollectMoneyViewModel ViewModel, int fieldId) {
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
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClicGuadanButtonAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickOrderAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.CollectMoneyViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickButton
                    viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clicGuadanButton
                    viewModelClicGuadanButtonAndroidViewViewOnClickListener = (((mViewModelClicGuadanButtonAndroidViewViewOnClickListener == null) ? (mViewModelClicGuadanButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClicGuadanButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickOrder
                    viewModelClickOrderAndroidViewViewOnClickListener = (((mViewModelClickOrderAndroidViewViewOnClickListener == null) ? (mViewModelClickOrderAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickOrderAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.guadanBtn.setOnClickListener(viewModelClicGuadanButtonAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(viewModelClickOrderAndroidViewViewOnClickListener);
            this.okBtn.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.llShopcar.setOnClickListener(mCallback88);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clicGuadanButton(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOrder(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onShopCarClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCollectMoneyBinding>inflate(inflater, ys.app.petproject.R.layout.activity_collect_money, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_collect_money, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityCollectMoneyBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCollectMoneyBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_collect_money_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCollectMoneyBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}