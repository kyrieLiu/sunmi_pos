package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VipPetListBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView4;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.itemmodel.VipPetItemViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VipPetListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.support.v7.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[1];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.petproject.itemmodel.VipPetItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.itemmodel.VipPetItemViewModel ItemViewModel) {
        updateRegistration(1, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.itemmodel.VipPetItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModelVipName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeItemViewModel((ys.app.petproject.itemmodel.VipPetItemViewModel) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.petproject.model.VipInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModelVipName(android.databinding.ObservableField<java.lang.String> ItemViewModelVipName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.itemmodel.VipPetItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.VipInfo ItemViewModelModel, int fieldId) {
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
        android.databinding.ObservableField<java.lang.String> itemViewModelVipName = null;
        ys.app.petproject.itemmodel.VipPetItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelVipNameGet = null;
        ys.app.petproject.model.VipInfo itemViewModelModel = null;
        java.util.List<ys.app.petproject.model.AnimalInfo> itemViewModelModelPetList = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.vipName
                        itemViewModelVipName = itemViewModel.vipName;
                    }
                    updateRegistration(0, itemViewModelVipName);


                    if (itemViewModelVipName != null) {
                        // read itemViewModel.vipName.get()
                        itemViewModelVipNameGet = itemViewModelVipName.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(2, itemViewModelModel);


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.petList
                        itemViewModelModelPetList = itemViewModelModel.getPetList();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setVipPetAdapterData(this.mboundView4, itemViewModelModelPetList);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelVipNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        ys.app.petproject.itemmodel.VipPetItemViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.clickDetail();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static VipPetListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipPetListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VipPetListBinding>inflate(inflater, ys.app.petproject.R.layout.item_vip_pet_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VipPetListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipPetListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_vip_pet_list, null, false), bindingComponent);
    }
    @NonNull
    public static VipPetListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipPetListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_vip_pet_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VipPetListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel.vipName
        flag 1 (0x2L): itemViewModel
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}