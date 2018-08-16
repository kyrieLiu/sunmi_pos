package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OutPutRecordListBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.date_ll, 6);
        sViewsWithIds.put(R.id.recyclerView, 7);
        sViewsWithIds.put(R.id.progressbar, 8);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout dateLl;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ImageView noneDataIv;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final ys.app.petproject.widget.wrapperRecylerView.IRecyclerView recyclerView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.inventory.OutPutRecordModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickBeginDateAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickEndDateAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public OutPutRecordListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 6);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.dateLl = (android.widget.LinearLayout) bindings[6];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[4];
        this.networkErrorIv.setTag(null);
        this.noneDataIv = (android.widget.ImageView) bindings[3];
        this.noneDataIv.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[8];
        this.recyclerView = (ys.app.petproject.widget.wrapperRecylerView.IRecyclerView) bindings[7];
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
            setViewModel((ys.app.petproject.viewmodel.inventory.OutPutRecordModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.inventory.OutPutRecordModel ViewModel) {
        updateRegistration(5, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.inventory.OutPutRecordModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObEndTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelIsNoneDataVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelObStartTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModel((ys.app.petproject.viewmodel.inventory.OutPutRecordModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObEndTime(android.databinding.ObservableField<java.lang.String> ViewModelObEndTime, int fieldId) {
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
    private boolean onChangeViewModelIsNoneDataVisible(android.databinding.ObservableBoolean ViewModelIsNoneDataVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObStartTime(android.databinding.ObservableField<java.lang.String> ViewModelObStartTime, int fieldId) {
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
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.inventory.OutPutRecordModel ViewModel, int fieldId) {
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
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObEndTime = null;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        boolean viewModelIsLoadingVisibleGet = false;
        java.lang.String viewModelObEndTimeGet = null;
        java.lang.String viewModelObStartTimeGet = null;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        android.databinding.ObservableField<java.lang.String> viewModelObStartTime = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        int viewModelIsNoneDataVisibleViewVISIBLEViewGONE = 0;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickBeginDateAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        android.view.View.OnClickListener viewModelClickEndDateAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.inventory.OutPutRecordModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obEndTime
                        viewModelObEndTime = viewModel.obEndTime;
                    }
                    updateRegistration(0, viewModelObEndTime);


                    if (viewModelObEndTime != null) {
                        // read viewModel.obEndTime.get()
                        viewModelObEndTimeGet = viewModelObEndTime.get();
                    }
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
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNoneDataVisible
                        viewModelIsNoneDataVisible = viewModel.isNoneDataVisible;
                    }
                    updateRegistration(2, viewModelIsNoneDataVisible);


                    if (viewModelIsNoneDataVisible != null) {
                        // read viewModel.isNoneDataVisible.get()
                        viewModelIsNoneDataVisibleGet = viewModelIsNoneDataVisible.get();
                    }
                if((dirtyFlags & 0x64L) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNoneDataVisibleViewVISIBLEViewGONE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obStartTime
                        viewModelObStartTime = viewModel.obStartTime;
                    }
                    updateRegistration(3, viewModelObStartTime);


                    if (viewModelObStartTime != null) {
                        // read viewModel.obStartTime.get()
                        viewModelObStartTimeGet = viewModelObStartTime.get();
                    }
            }
            if ((dirtyFlags & 0x60L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickBeginDate
                        viewModelClickBeginDateAndroidViewViewOnClickListener = (((mViewModelClickBeginDateAndroidViewViewOnClickListener == null) ? (mViewModelClickBeginDateAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickBeginDateAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickEndDate
                        viewModelClickEndDateAndroidViewViewOnClickListener = (((mViewModelClickEndDateAndroidViewViewOnClickListener == null) ? (mViewModelClickEndDateAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickEndDateAndroidViewViewOnClickListener).setValue(viewModel));
                    }
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
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(viewModelClickBeginDateAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(viewModelClickEndDateAndroidViewViewOnClickListener);
            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObStartTimeGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelObEndTimeGet);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.noneDataIv.setVisibility(viewModelIsNoneDataVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.OutPutRecordModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.inventory.OutPutRecordModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBeginDate(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.OutPutRecordModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.inventory.OutPutRecordModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.inventory.OutPutRecordModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.inventory.OutPutRecordModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickEndDate(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static OutPutRecordListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OutPutRecordListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<OutPutRecordListBinding>inflate(inflater, ys.app.petproject.R.layout.fragment_out_put_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static OutPutRecordListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OutPutRecordListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.fragment_out_put_list, null, false), bindingComponent);
    }
    @NonNull
    public static OutPutRecordListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OutPutRecordListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_out_put_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new OutPutRecordListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obEndTime
        flag 1 (0x2L): viewModel.isNetWorkErrorVisible
        flag 2 (0x3L): viewModel.isNoneDataVisible
        flag 3 (0x4L): viewModel.obStartTime
        flag 4 (0x5L): viewModel.isLoadingVisible
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}