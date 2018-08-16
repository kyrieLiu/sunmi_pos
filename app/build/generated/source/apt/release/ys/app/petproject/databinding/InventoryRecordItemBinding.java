package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InventoryRecordItemBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InventoryRecordItemBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
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
            setItemViewModel((ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel ItemViewModel, int fieldId) {
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
        int itemViewModelModelInventoryNumItemViewModelModelStockNum = 0;
        ys.app.petproject.viewmodel.inventory.InventoryRecordItemViewModel itemViewModel = mItemViewModel;
        java.lang.String stringValueOfItemViewModelModelInventoryNumItemViewModelModelStockNum = null;
        double itemViewModelModelCommodityAmt = 0.0;
        int itemViewModelModelStockNum = 0;
        ys.app.petproject.model.InventoryRecordsInfo.InventoryList2Bean itemViewModelModel = null;
        java.lang.String mboundView2AndroidStringRmbItemViewModelModelCommodityAmt = null;
        java.lang.String itemViewModelModelCommodityName = null;
        int itemViewModelModelInventoryNum = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.commodityAmt
                    itemViewModelModelCommodityAmt = itemViewModelModel.getCommodityAmt();
                    // read itemViewModel.model.stockNum
                    itemViewModelModelStockNum = itemViewModelModel.getStockNum();
                    // read itemViewModel.model.commodityName
                    itemViewModelModelCommodityName = itemViewModelModel.getCommodityName();
                    // read itemViewModel.model.inventoryNum
                    itemViewModelModelInventoryNum = itemViewModelModel.getInventoryNum();
                }


                // read (@android:string/rmb) + (itemViewModel.model.commodityAmt)
                mboundView2AndroidStringRmbItemViewModelModelCommodityAmt = (mboundView2.getResources().getString(R.string.rmb)) + (itemViewModelModelCommodityAmt);
                // read (itemViewModel.model.inventoryNum) - (itemViewModel.model.stockNum)
                itemViewModelModelInventoryNumItemViewModelModelStockNum = (itemViewModelModelInventoryNum) - (itemViewModelModelStockNum);


                // read String.valueOf((itemViewModel.model.inventoryNum) - (itemViewModel.model.stockNum))
                stringValueOfItemViewModelModelInventoryNumItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelInventoryNumItemViewModelModelStockNum);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelCommodityName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mboundView2AndroidStringRmbItemViewModelModelCommodityAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringValueOfItemViewModelModelInventoryNumItemViewModelModelStockNum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static InventoryRecordItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InventoryRecordItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<InventoryRecordItemBinding>inflate(inflater, ys.app.petproject.R.layout.item_inventory_record, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static InventoryRecordItemBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InventoryRecordItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_inventory_record, null, false), bindingComponent);
    }
    @NonNull
    public static InventoryRecordItemBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InventoryRecordItemBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_inventory_record_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new InventoryRecordItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}