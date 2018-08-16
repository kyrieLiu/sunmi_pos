package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NumCardDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 4);
        sViewsWithIds.put(R.id.ll_num_card_top, 5);
        sViewsWithIds.put(R.id.ll_num_card_name, 6);
        sViewsWithIds.put(R.id.et_card_name, 7);
        sViewsWithIds.put(R.id.et_card_money, 8);
        sViewsWithIds.put(R.id.rl_num_card_top, 9);
        sViewsWithIds.put(R.id.rv_num_card_top, 10);
        sViewsWithIds.put(R.id.root_view, 11);
        sViewsWithIds.put(R.id.divide_view, 12);
        sViewsWithIds.put(R.id.viewPager, 13);
        sViewsWithIds.put(R.id.tabLayout, 14);
        sViewsWithIds.put(R.id.qiehuan_tv, 15);
    }
    // views
    @NonNull
    public final android.widget.ImageView arrowIv;
    @NonNull
    public final android.view.View bgView;
    @NonNull
    public final android.view.View divideView;
    @NonNull
    public final android.widget.EditText etCardMoney;
    @NonNull
    public final android.widget.EditText etCardName;
    @NonNull
    public final android.widget.LinearLayout llNumCardName;
    @NonNull
    public final android.widget.LinearLayout llNumCardTop;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    public final android.widget.TextView qiehuanTv;
    @NonNull
    public final android.widget.LinearLayout rlNumCardTop;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvNumCardTop;
    @NonNull
    public final android.support.design.widget.TabLayout tabLayout;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.support.v4.view.ViewPager viewPager;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.NumCardDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickArrowAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public NumCardDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds);
        this.arrowIv = (android.widget.ImageView) bindings[3];
        this.arrowIv.setTag(null);
        this.bgView = (android.view.View) bindings[2];
        this.bgView.setTag(null);
        this.divideView = (android.view.View) bindings[12];
        this.etCardMoney = (android.widget.EditText) bindings[8];
        this.etCardName = (android.widget.EditText) bindings[7];
        this.llNumCardName = (android.widget.LinearLayout) bindings[6];
        this.llNumCardTop = (android.widget.LinearLayout) bindings[5];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.qiehuanTv = (android.widget.TextView) bindings[15];
        this.rlNumCardTop = (android.widget.LinearLayout) bindings[9];
        this.rootView = (android.widget.RelativeLayout) bindings[11];
        this.rvNumCardTop = (android.support.v7.widget.RecyclerView) bindings[10];
        this.tabLayout = (android.support.design.widget.TabLayout) bindings[14];
        this.view = (android.view.View) bindings[4];
        this.viewPager = (android.support.v4.view.ViewPager) bindings[13];
        setRootTag(root);
        // listeners
        mCallback98 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.petproject.viewmodel.manage.NumCardDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.NumCardDetailViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.NumCardDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.petproject.viewmodel.manage.NumCardDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.manage.NumCardDetailViewModel ViewModel, int fieldId) {
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
        android.view.View.OnClickListener viewModelClickArrowAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.manage.NumCardDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickArrow
                    viewModelClickArrowAndroidViewViewOnClickListener = (((mViewModelClickArrowAndroidViewViewOnClickListener == null) ? (mViewModelClickArrowAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickArrowAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.arrowIv.setOnClickListener(viewModelClickArrowAndroidViewViewOnClickListener);
            this.bgView.setOnClickListener(viewModelClickArrowAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback98);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.NumCardDetailViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.NumCardDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickArrow(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.manage.NumCardDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.commitData();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static NumCardDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NumCardDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<NumCardDetailBinding>inflate(inflater, ys.app.petproject.R.layout.activity_num_card_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static NumCardDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NumCardDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_num_card_detail, null, false), bindingComponent);
    }
    @NonNull
    public static NumCardDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NumCardDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_num_card_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new NumCardDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}