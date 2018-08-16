package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddVipCardBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.tv_vip_card_warn, 7);
        sViewsWithIds.put(R.id.ll1, 8);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll1;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView2;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvVipService;
    @NonNull
    public final ys.app.petproject.widget.MyNestedScrollView scrollView;
    @NonNull
    public final android.widget.EditText telEt;
    @NonNull
    public final android.widget.TextView tvVipCardWarn;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.AddVipCardViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener telEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCardName.get()
            //         is viewModel.obCardName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(telEt);
            // localize variables for thread safety
            // viewModel.obCardName.get()
            java.lang.String viewModelObCardNameGet = null;
            // viewModel
            ys.app.petproject.viewmodel.manage.AddVipCardViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obCardName != null
            boolean viewModelObCardNameJavaLangObjectNull = false;
            // viewModel.obCardName
            android.databinding.ObservableField<java.lang.String> viewModelObCardName = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCardName = viewModel.obCardName;

                viewModelObCardNameJavaLangObjectNull = (viewModelObCardName) != (null);
                if (viewModelObCardNameJavaLangObjectNull) {




                    viewModelObCardName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddVipCardBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.ll1 = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.support.v7.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.okBtn = (android.widget.Button) bindings[4];
        this.okBtn.setTag(null);
        this.rvVipService = (android.support.v7.widget.RecyclerView) bindings[3];
        this.rvVipService.setTag(null);
        this.scrollView = (ys.app.petproject.widget.MyNestedScrollView) bindings[6];
        this.telEt = (android.widget.EditText) bindings[1];
        this.telEt.setTag(null);
        this.tvVipCardWarn = (android.widget.TextView) bindings[7];
        this.view = (android.view.View) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((ys.app.petproject.viewmodel.manage.AddVipCardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.AddVipCardViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.AddVipCardViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObIsIsAddVipCard((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelObCardName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelObIsInput((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.petproject.viewmodel.manage.AddVipCardViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObIsIsAddVipCard(android.databinding.ObservableBoolean ViewModelObIsIsAddVipCard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCardName(android.databinding.ObservableField<java.lang.String> ViewModelObCardName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObButtonEnable(android.databinding.ObservableBoolean ViewModelObButtonEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsInput(android.databinding.ObservableBoolean ViewModelObIsInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.manage.AddVipCardViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        android.databinding.ObservableBoolean viewModelObIsIsAddVipCard = null;
        java.lang.String viewModelObCardNameGet = null;
        java.util.List<ys.app.petproject.model.GoodTypeInfo> viewModelGoodTypeInfos = null;
        boolean viewModelObButtonEnableGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObCardName = null;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        java.util.List<ys.app.petproject.model.ServiceTypeInfo> viewModelServiceTypeInfos = null;
        android.databinding.ObservableBoolean viewModelObIsInput = null;
        boolean viewModelObIsIsAddVipCardGet = false;
        boolean viewModelObIsInputGet = false;
        ys.app.petproject.viewmodel.manage.AddVipCardViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x39L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsIsAddVipCard
                        viewModelObIsIsAddVipCard = viewModel.obIsIsAddVipCard;
                        // read viewModel.goodTypeInfos
                        viewModelGoodTypeInfos = viewModel.goodTypeInfos;
                        // read viewModel.serviceTypeInfos
                        viewModelServiceTypeInfos = viewModel.serviceTypeInfos;
                        // read viewModel.obIsInput
                        viewModelObIsInput = viewModel.obIsInput;
                    }
                    updateRegistration(0, viewModelObIsIsAddVipCard);
                    updateRegistration(3, viewModelObIsInput);


                    if (viewModelObIsIsAddVipCard != null) {
                        // read viewModel.obIsIsAddVipCard.get()
                        viewModelObIsIsAddVipCardGet = viewModelObIsIsAddVipCard.get();
                    }
                    if (viewModelObIsInput != null) {
                        // read viewModel.obIsInput.get()
                        viewModelObIsInputGet = viewModelObIsInput.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCardName
                        viewModelObCardName = viewModel.obCardName;
                    }
                    updateRegistration(1, viewModelObCardName);


                    if (viewModelObCardName != null) {
                        // read viewModel.obCardName.get()
                        viewModelObCardNameGet = viewModelObCardName.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obButtonEnable
                        viewModelObButtonEnable = viewModel.obButtonEnable;
                    }
                    updateRegistration(2, viewModelObButtonEnable);


                    if (viewModelObButtonEnable != null) {
                        // read viewModel.obButtonEnable.get()
                        viewModelObButtonEnableGet = viewModelObButtonEnable.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x39L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setGoodsTypeAdapterData(this.mboundView2, viewModelGoodTypeInfos, viewModelObIsInputGet, viewModelObIsIsAddVipCardGet);
            ys.app.petproject.PetBindingUtil.setServiceTypeAdapterData(this.rvVipService, viewModelServiceTypeInfos, viewModelObIsInputGet, viewModelObIsIsAddVipCardGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.okBtn.setEnabled(viewModelObButtonEnableGet);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.okBtn.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.telEt, viewModelObCardNameGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.telEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, telEtandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.AddVipCardViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.AddVipCardViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddVipCardBinding>inflate(inflater, ys.app.petproject.R.layout.activity_add_vip_card, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_add_vip_card, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddVipCardBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipCardBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_vip_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddVipCardBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obIsIsAddVipCard
        flag 1 (0x2L): viewModel.obCardName
        flag 2 (0x3L): viewModel.obButtonEnable
        flag 3 (0x4L): viewModel.obIsInput
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}