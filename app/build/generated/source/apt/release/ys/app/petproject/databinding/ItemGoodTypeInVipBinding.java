package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGoodTypeInVipBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.zhe_tv, 3);
    }
    // views
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView zheTv;
    @NonNull
    public final android.widget.EditText zhekouTv;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener zhekouTvandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemViewModel.obGoodCost.get()
            //         is itemViewModel.obGoodCost.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(zhekouTv);
            // localize variables for thread safety
            // itemViewModel
            ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel itemViewModel = mItemViewModel;
            // itemViewModel != null
            boolean itemViewModelJavaLangObjectNull = false;
            // itemViewModel.obGoodCost
            android.databinding.ObservableField<java.lang.String> itemViewModelObGoodCost = null;
            // itemViewModel.obGoodCost.get()
            java.lang.String itemViewModelObGoodCostGet = null;
            // itemViewModel.obGoodCost != null
            boolean itemViewModelObGoodCostJavaLangObjectNull = false;



            itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
            if (itemViewModelJavaLangObjectNull) {


                itemViewModelObGoodCost = itemViewModel.obGoodCost;

                itemViewModelObGoodCostJavaLangObjectNull = (itemViewModelObGoodCost) != (null);
                if (itemViewModelObGoodCostJavaLangObjectNull) {




                    itemViewModelObGoodCost.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ItemGoodTypeInVipBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.nameTv = (android.widget.TextView) bindings[2];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.zheTv = (android.widget.TextView) bindings[3];
        this.zhekouTv = (android.widget.EditText) bindings[1];
        this.zhekouTv.setTag(null);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelObGoodCost((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.petproject.model.GoodTypeInfo) object, fieldId);
            case 3 :
                return onChangeItemViewModelEditTextEditable((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeItemViewModelMIsAddVipCard((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
    private boolean onChangeItemViewModelObGoodCost(android.databinding.ObservableField<java.lang.String> ItemViewModelObGoodCost, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.GoodTypeInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelEditTextEditable(android.databinding.ObservableBoolean ItemViewModelEditTextEditable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelMIsAddVipCard(android.databinding.ObservableBoolean ItemViewModelMIsAddVipCard, int fieldId) {
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
        android.text.TextWatcher itemViewModelTextChangeListener = null;
        java.lang.String itemViewModelModelClassifyName = null;
        java.lang.String itemViewModelMIsAddVipCardItemViewModelModelNameItemViewModelModelClassifyName = null;
        boolean itemViewModelMIsAddVipCardGet = false;
        ys.app.petproject.viewmodel.GoodTypeInVipItemViewModel itemViewModel = mItemViewModel;
        android.databinding.ObservableField<java.lang.String> itemViewModelObGoodCost = null;
        ys.app.petproject.model.GoodTypeInfo itemViewModelModel = null;
        java.lang.String itemViewModelObGoodCostGet = null;
        android.databinding.ObservableBoolean itemViewModelEditTextEditable = null;
        android.databinding.ObservableBoolean itemViewModelMIsAddVipCard = null;
        boolean itemViewModelEditTextEditableGet = false;
        java.lang.String itemViewModelModelName = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x21L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.textChangeListener
                        itemViewModelTextChangeListener = itemViewModel.textChangeListener;
                    }
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obGoodCost
                        itemViewModelObGoodCost = itemViewModel.obGoodCost;
                    }
                    updateRegistration(1, itemViewModelObGoodCost);


                    if (itemViewModelObGoodCost != null) {
                        // read itemViewModel.obGoodCost.get()
                        itemViewModelObGoodCostGet = itemViewModelObGoodCost.get();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.editTextEditable
                        itemViewModelEditTextEditable = itemViewModel.editTextEditable;
                    }
                    updateRegistration(3, itemViewModelEditTextEditable);


                    if (itemViewModelEditTextEditable != null) {
                        // read itemViewModel.editTextEditable.get()
                        itemViewModelEditTextEditableGet = itemViewModelEditTextEditable.get();
                    }
            }
            if ((dirtyFlags & 0x35L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.mIsAddVipCard
                        itemViewModelMIsAddVipCard = itemViewModel.mIsAddVipCard;
                    }
                    updateRegistration(4, itemViewModelMIsAddVipCard);


                    if (itemViewModelMIsAddVipCard != null) {
                        // read itemViewModel.mIsAddVipCard.get()
                        itemViewModelMIsAddVipCardGet = itemViewModelMIsAddVipCard.get();
                    }
                if((dirtyFlags & 0x35L) != 0) {
                    if(itemViewModelMIsAddVipCardGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xc0L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(2, itemViewModelModel);

            if ((dirtyFlags & 0x40L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.classifyName
                        itemViewModelModelClassifyName = itemViewModelModel.getClassifyName();
                    }
            }
            if ((dirtyFlags & 0x80L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                    }
            }
        }

        if ((dirtyFlags & 0x35L) != 0) {

                // read itemViewModel.mIsAddVipCard.get() ? itemViewModel.model.name : itemViewModel.model.classifyName
                itemViewModelMIsAddVipCardItemViewModelModelNameItemViewModelModelClassifyName = ((itemViewModelMIsAddVipCardGet) ? (itemViewModelModelName) : (itemViewModelModelClassifyName));
        }
        // batch finished
        if ((dirtyFlags & 0x35L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelMIsAddVipCardItemViewModelModelNameItemViewModelModelClassifyName);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.zhekouTv, itemViewModelObGoodCostGet);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.zhekouTv, itemViewModelTextChangeListener);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setEditTextEditable(this.zhekouTv, itemViewModelEditTextEditableGet, itemViewModelEditTextEditableGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.zhekouTv, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, zhekouTvandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemGoodTypeInVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodTypeInVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemGoodTypeInVipBinding>inflate(inflater, ys.app.petproject.R.layout.item_good_type_in_vip, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemGoodTypeInVipBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodTypeInVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_good_type_in_vip, null, false), bindingComponent);
    }
    @NonNull
    public static ItemGoodTypeInVipBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodTypeInVipBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_good_type_in_vip_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemGoodTypeInVipBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.obGoodCost
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.editTextEditable
        flag 4 (0x5L): itemViewModel.mIsAddVipCard
        flag 5 (0x6L): null
        flag 6 (0x7L): itemViewModel.mIsAddVipCard.get() ? itemViewModel.model.name : itemViewModel.model.classifyName
        flag 7 (0x8L): itemViewModel.mIsAddVipCard.get() ? itemViewModel.model.name : itemViewModel.model.classifyName
    flag mapping end*/
    //end
}