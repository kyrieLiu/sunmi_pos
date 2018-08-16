package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InventoryRecordDetailBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InventoryRecordDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
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
            setItemViewModel((ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel ItemViewModel, int fieldId) {
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
        ys.app.petproject.viewmodel.inventory.InventoryRecordDetailViewModel itemViewModel = mItemViewModel;
        java.lang.String stringValueOfItemViewModelModelInventoryNumItemViewModelModelStockNum = null;
        java.lang.String stringValueOfItemViewModelModelInventoryNum = null;
        double itemViewModelModelCommodityAmt = 0.0;
        java.lang.String mboundView4AndroidStringRmbItemViewModelModelCommodityAmt = null;
        int itemViewModelModelStockNum = 0;
        ys.app.petproject.model.InventoryRecordsInfo.InventoryListBean itemViewModelModel = null;
        java.lang.String itemViewModelModelCommodityName = null;
        int itemViewModelModelInventoryNum = 0;
        java.lang.String stringValueOfItemViewModelModelCommodityName = null;
        java.lang.String stringValueOfItemViewModelModelStockNum = null;

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
                mboundView4AndroidStringRmbItemViewModelModelCommodityAmt = (mboundView4.getResources().getString(R.string.rmb)) + (itemViewModelModelCommodityAmt);
                // read String.valueOf(itemViewModel.model.stockNum)
                stringValueOfItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelStockNum);
                // read String.valueOf(itemViewModel.model.commodityName)
                stringValueOfItemViewModelModelCommodityName = java.lang.String.valueOf(itemViewModelModelCommodityName);
                // read (itemViewModel.model.inventoryNum) - (itemViewModel.model.stockNum)
                itemViewModelModelInventoryNumItemViewModelModelStockNum = (itemViewModelModelInventoryNum) - (itemViewModelModelStockNum);
                // read String.valueOf(itemViewModel.model.inventoryNum)
                stringValueOfItemViewModelModelInventoryNum = java.lang.String.valueOf(itemViewModelModelInventoryNum);


                // read String.valueOf((itemViewModel.model.inventoryNum) - (itemViewModel.model.stockNum))
                stringValueOfItemViewModelModelInventoryNumItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelInventoryNumItemViewModelModelStockNum);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, stringValueOfItemViewModelModelCommodityName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringValueOfItemViewModelModelStockNum);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringValueOfItemViewModelModelInventoryNum);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mboundView4AndroidStringRmbItemViewModelModelCommodityAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, stringValueOfItemViewModelModelInventoryNumItemViewModelModelStockNum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static InventoryRecordDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InventoryRecordDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<InventoryRecordDetailBinding>inflate(inflater, ys.app.petproject.R.layout.item_inventory_record_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static InventoryRecordDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InventoryRecordDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_inventory_record_detail, null, false), bindingComponent);
    }
    @NonNull
    public static InventoryRecordDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InventoryRecordDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_inventory_record_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new InventoryRecordDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}