package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCommitOrderBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 7);
        sViewsWithIds.put(R.id.scrollView, 8);
        sViewsWithIds.put(R.id.seviceRecylerView, 9);
        sViewsWithIds.put(R.id.goodsRecylerView, 10);
        sViewsWithIds.put(R.id.rl_commit_order_alarm, 11);
        sViewsWithIds.put(R.id.tv_commit_order_alarm, 12);
        sViewsWithIds.put(R.id.progressbar, 13);
    }
    // views
    @NonNull
    public final android.support.v7.widget.RecyclerView goodsRecylerView;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    public final android.widget.TextView moneyTv;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final android.widget.RelativeLayout rlCommitOrderAlarm;
    @NonNull
    public final ys.app.petproject.widget.MyNestedScrollView scrollView;
    @NonNull
    public final android.support.v7.widget.RecyclerView seviceRecylerView;
    @NonNull
    public final android.widget.TextView tvCommitOrderAlarm;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.CommitOrderViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityCommitOrderBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 6);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.goodsRecylerView = (android.support.v7.widget.RecyclerView) bindings[10];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.moneyTv = (android.widget.TextView) bindings[4];
        this.moneyTv.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[5];
        this.networkErrorIv.setTag(null);
        this.okBtn = (android.widget.Button) bindings[3];
        this.okBtn.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[13];
        this.rlCommitOrderAlarm = (android.widget.RelativeLayout) bindings[11];
        this.scrollView = (ys.app.petproject.widget.MyNestedScrollView) bindings[8];
        this.seviceRecylerView = (android.support.v7.widget.RecyclerView) bindings[9];
        this.tvCommitOrderAlarm = (android.widget.TextView) bindings[12];
        this.view = (android.view.View) bindings[7];
        setRootTag(root);
        // listeners
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
            setViewModel((ys.app.petproject.viewmodel.CommitOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.CommitOrderViewModel ViewModel) {
        updateRegistration(5, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.CommitOrderViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObCountMoney((android.databinding.ObservableDouble) object, fieldId);
            case 1 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelIsGoodsVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelIsServiceVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModel((ys.app.petproject.viewmodel.CommitOrderViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObCountMoney(android.databinding.ObservableDouble ViewModelObCountMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNetWorkErrorVisible(android.databinding.ObservableBoolean ViewModelIsNetWorkErrorVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsGoodsVisible(android.databinding.ObservableBoolean ViewModelIsGoodsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsServiceVisible(android.databinding.ObservableBoolean ViewModelIsServiceVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.CommitOrderViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        android.databinding.ObservableDouble viewModelObCountMoney = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObCountMoney = null;
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsGoodsVisibleGet = false;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        java.lang.String moneyTvAndroidStringFuhaoAppUtilFormatStandardMoneyViewModelObCountMoney = null;
        boolean viewModelIsLoadingVisibleGet = false;
        android.databinding.ObservableBoolean viewModelIsGoodsVisible = null;
        int viewModelIsGoodsVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelIsServiceVisibleGet = false;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsServiceVisible = null;
        double viewModelObCountMoneyGet = 0.0;
        int viewModelIsServiceVisibleViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        ys.app.petproject.viewmodel.CommitOrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCountMoney
                        viewModelObCountMoney = viewModel.obCountMoney;
                    }
                    updateRegistration(0, viewModelObCountMoney);


                    if (viewModelObCountMoney != null) {
                        // read viewModel.obCountMoney.get()
                        viewModelObCountMoneyGet = viewModelObCountMoney.get();
                    }


                    // read AppUtil.formatStandardMoney(viewModel.obCountMoney.get())
                    appUtilFormatStandardMoneyViewModelObCountMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObCountMoneyGet);


                    // read (@android:string/fuhao) + (AppUtil.formatStandardMoney(viewModel.obCountMoney.get()))
                    moneyTvAndroidStringFuhaoAppUtilFormatStandardMoneyViewModelObCountMoney = (moneyTv.getResources().getString(R.string.fuhao)) + (appUtilFormatStandardMoneyViewModelObCountMoney);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(1, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x62L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x60L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isGoodsVisible
                        viewModelIsGoodsVisible = viewModel.isGoodsVisible;
                    }
                    updateRegistration(2, viewModelIsGoodsVisible);


                    if (viewModelIsGoodsVisible != null) {
                        // read viewModel.isGoodsVisible.get()
                        viewModelIsGoodsVisibleGet = viewModelIsGoodsVisible.get();
                    }
                if((dirtyFlags & 0x64L) != 0) {
                    if(viewModelIsGoodsVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isGoodsVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsGoodsVisibleViewVISIBLEViewGONE = ((viewModelIsGoodsVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isServiceVisible
                        viewModelIsServiceVisible = viewModel.isServiceVisible;
                    }
                    updateRegistration(3, viewModelIsServiceVisible);


                    if (viewModelIsServiceVisible != null) {
                        // read viewModel.isServiceVisible.get()
                        viewModelIsServiceVisibleGet = viewModelIsServiceVisible.get();
                    }
                if((dirtyFlags & 0x68L) != 0) {
                    if(viewModelIsServiceVisibleGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.isServiceVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsServiceVisibleViewVISIBLEViewGONE = ((viewModelIsServiceVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(4, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0x70L) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsServiceVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsGoodsVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.moneyTv, moneyTvAndroidStringFuhaoAppUtilFormatStandardMoneyViewModelObCountMoney);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
            this.okBtn.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.CommitOrderViewModel value) {
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
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCommitOrderBinding>inflate(inflater, ys.app.petproject.R.layout.activity_commit_order, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_commit_order, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityCommitOrderBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCommitOrderBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_commit_order_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCommitOrderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obCountMoney
        flag 1 (0x2L): viewModel.isNetWorkErrorVisible
        flag 2 (0x3L): viewModel.isGoodsVisible
        flag 3 (0x4L): viewModel.isServiceVisible
        flag 4 (0x5L): viewModel.isLoadingVisible
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.isGoodsVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isGoodsVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.isServiceVisible.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.isServiceVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}