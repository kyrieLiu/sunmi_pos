package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOutPutBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.line, 4);
    }
    // views
    @NonNull
    public final android.widget.TextView itemStockName;
    @NonNull
    public final android.widget.TextView itemStockTime;
    @NonNull
    public final android.view.View line;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    public final android.support.v7.widget.CardView rootView;
    // variables
    @Nullable
    private ys.app.petproject.itemmodel.OutPutItemModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickItemAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemOutPutBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.itemStockName = (android.widget.TextView) bindings[2];
        this.itemStockName.setTag(null);
        this.itemStockTime = (android.widget.TextView) bindings[1];
        this.itemStockTime.setTag(null);
        this.line = (android.view.View) bindings[4];
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.rootView = (android.support.v7.widget.CardView) bindings[0];
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setItemViewModel((ys.app.petproject.itemmodel.OutPutItemModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.itemmodel.OutPutItemModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.itemmodel.OutPutItemModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.itemmodel.OutPutItemModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.itemmodel.OutPutItemModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        ys.app.petproject.itemmodel.OutPutItemModel itemViewModel = mItemViewModel;
        long itemViewModelModelDotime = 0L;
        java.lang.String dateUtilLongFormatDate2ItemViewModelModelDotime = null;
        android.view.View.OnClickListener itemViewModelClickItemAndroidViewViewOnClickListener = null;
        ys.app.petproject.model.OutStorageInfo itemViewModelModel = null;
        int itemViewModelModelNum = 0;
        java.lang.String itemViewModelModelUnit = null;
        java.lang.String itemViewModelModelCommdityName = null;
        java.lang.String itemViewModelModelNumItemViewModelModelUnit = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::clickItem
                        itemViewModelClickItemAndroidViewViewOnClickListener = (((mItemViewModelClickItemAndroidViewViewOnClickListener == null) ? (mItemViewModelClickItemAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelClickItemAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.dotime
                    itemViewModelModelDotime = itemViewModelModel.getDotime();
                    // read itemViewModel.model.num
                    itemViewModelModelNum = itemViewModelModel.getNum();
                    // read itemViewModel.model.unit
                    itemViewModelModelUnit = itemViewModelModel.getUnit();
                    // read itemViewModel.model.commdityName
                    itemViewModelModelCommdityName = itemViewModelModel.getCommdityName();
                }


                // read DateUtil.longFormatDate2(itemViewModel.model.dotime)
                dateUtilLongFormatDate2ItemViewModelModelDotime = ys.app.petproject.utils.DateUtil.longFormatDate2(itemViewModelModelDotime);
                // read (itemViewModel.model.num) + (itemViewModel.model.unit)
                itemViewModelModelNumItemViewModelModelUnit = (itemViewModelModelNum) + (itemViewModelModelUnit);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.itemStockName, itemViewModelModelCommdityName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.itemStockTime, dateUtilLongFormatDate2ItemViewModelModelDotime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelNumItemViewModelModelUnit);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.rootView.setOnClickListener(itemViewModelClickItemAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.itemmodel.OutPutItemModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.itemmodel.OutPutItemModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickItem(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemOutPutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOutPutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemOutPutBinding>inflate(inflater, ys.app.petproject.R.layout.item_out_put_inventory, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemOutPutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOutPutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_out_put_inventory, null, false), bindingComponent);
    }
    @NonNull
    public static ItemOutPutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOutPutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_out_put_inventory_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemOutPutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}