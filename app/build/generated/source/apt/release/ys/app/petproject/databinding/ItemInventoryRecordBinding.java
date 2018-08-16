package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemInventoryRecordBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.up_rl, 6);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.LinearLayout upRl;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemInventoryRecordBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[1];
        this.nameTv.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[5];
        this.recyclerView.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.upRl = (android.widget.LinearLayout) bindings[6];
        setRootTag(root);
        // listeners
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
            setItemViewModel((ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelModel((ys.app.petproject.model.InventoryRecordsInfo) object, fieldId);
            case 2 :
                return onChangeItemViewModelListData((android.databinding.ObservableField<java.util.List<ys.app.petproject.model.InventoryRecordsInfo.InventoryList2Bean>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.InventoryRecordsInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelListData(android.databinding.ObservableField<java.util.List<ys.app.petproject.model.InventoryRecordsInfo.InventoryList2Bean>> ItemViewModelListData, int fieldId) {
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
        java.lang.String mboundView2AndroidStringPyAppUtilFormatStandardMoneyItemViewModelModelInventoryProfit = null;
        double itemViewModelModelInventoryProfit = 0.0;
        ys.app.petproject.viewmodel.ItemInventoryRecordItemViewModel itemViewModel = mItemViewModel;
        long itemViewModelModelDotime = 0L;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelInventoryProfit = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelInventoryLosses = null;
        java.util.List<ys.app.petproject.model.InventoryRecordsInfo.InventoryList2Bean> itemViewModelListDataGet = null;
        java.lang.String dateUtilLongFormatDate2ItemViewModelModelDotime = null;
        double itemViewModelModelInventoryLosses = 0.0;
        java.lang.String mboundView3AndroidStringPkAppUtilFormatStandardMoneyItemViewModelModelInventoryLosses = null;
        boolean appUtilGetListSizeIsEmptyItemViewModelListData = false;
        ys.app.petproject.model.InventoryRecordsInfo itemViewModelModel = null;
        java.lang.String mboundView3AndroidStringPkAppUtilFormatStandardMoneyItemViewModelModelInventoryLossesMboundView3AndroidStringYuan = null;
        int appUtilGetListSizeIsEmptyItemViewModelListDataViewGONEViewVISIBLE = 0;
        android.databinding.ObservableField<java.util.List<ys.app.petproject.model.InventoryRecordsInfo.InventoryList2Bean>> itemViewModelListData = null;
        java.lang.String mboundView2AndroidStringPyAppUtilFormatStandardMoneyItemViewModelModelInventoryProfitMboundView2AndroidStringYuan = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(1, itemViewModelModel);


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.inventoryProfit
                        itemViewModelModelInventoryProfit = itemViewModelModel.getInventoryProfit();
                        // read itemViewModel.model.dotime
                        itemViewModelModelDotime = itemViewModelModel.getDotime();
                        // read itemViewModel.model.inventoryLosses
                        itemViewModelModelInventoryLosses = itemViewModelModel.getInventoryLosses();
                    }


                    // read AppUtil.formatStandardMoney(itemViewModel.model.inventoryProfit)
                    appUtilFormatStandardMoneyItemViewModelModelInventoryProfit = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelInventoryProfit);
                    // read DateUtil.longFormatDate2(itemViewModel.model.dotime)
                    dateUtilLongFormatDate2ItemViewModelModelDotime = ys.app.petproject.utils.DateUtil.longFormatDate2(itemViewModelModelDotime);
                    // read AppUtil.formatStandardMoney(itemViewModel.model.inventoryLosses)
                    appUtilFormatStandardMoneyItemViewModelModelInventoryLosses = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelInventoryLosses);


                    // read (@android:string/py) + (AppUtil.formatStandardMoney(itemViewModel.model.inventoryProfit))
                    mboundView2AndroidStringPyAppUtilFormatStandardMoneyItemViewModelModelInventoryProfit = (mboundView2.getResources().getString(R.string.py)) + (appUtilFormatStandardMoneyItemViewModelModelInventoryProfit);
                    // read (@android:string/pk) + (AppUtil.formatStandardMoney(itemViewModel.model.inventoryLosses))
                    mboundView3AndroidStringPkAppUtilFormatStandardMoneyItemViewModelModelInventoryLosses = (mboundView3.getResources().getString(R.string.pk)) + (appUtilFormatStandardMoneyItemViewModelModelInventoryLosses);


                    // read ((@android:string/py) + (AppUtil.formatStandardMoney(itemViewModel.model.inventoryProfit))) + (@android:string/yuan)
                    mboundView2AndroidStringPyAppUtilFormatStandardMoneyItemViewModelModelInventoryProfitMboundView2AndroidStringYuan = (mboundView2AndroidStringPyAppUtilFormatStandardMoneyItemViewModelModelInventoryProfit) + (mboundView2.getResources().getString(R.string.yuan));
                    // read ((@android:string/pk) + (AppUtil.formatStandardMoney(itemViewModel.model.inventoryLosses))) + (@android:string/yuan)
                    mboundView3AndroidStringPkAppUtilFormatStandardMoneyItemViewModelModelInventoryLossesMboundView3AndroidStringYuan = (mboundView3AndroidStringPkAppUtilFormatStandardMoneyItemViewModelModelInventoryLosses) + (mboundView3.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.listData
                        itemViewModelListData = itemViewModel.listData;
                    }
                    updateRegistration(2, itemViewModelListData);


                    if (itemViewModelListData != null) {
                        // read itemViewModel.listData.get()
                        itemViewModelListDataGet = itemViewModelListData.get();
                    }


                    // read AppUtil.getListSizeIsEmpty(itemViewModel.listData.get())
                    appUtilGetListSizeIsEmptyItemViewModelListData = ys.app.petproject.utils.AppUtil.getListSizeIsEmpty(itemViewModelListDataGet);
                if((dirtyFlags & 0xdL) != 0) {
                    if(appUtilGetListSizeIsEmptyItemViewModelListData) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read AppUtil.getListSizeIsEmpty(itemViewModel.listData.get()) ? View.GONE : View.VISIBLE
                    appUtilGetListSizeIsEmptyItemViewModelListDataViewGONEViewVISIBLE = ((appUtilGetListSizeIsEmptyItemViewModelListData) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mboundView2AndroidStringPyAppUtilFormatStandardMoneyItemViewModelModelInventoryProfitMboundView2AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mboundView3AndroidStringPkAppUtilFormatStandardMoneyItemViewModelModelInventoryLossesMboundView3AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, dateUtilLongFormatDate2ItemViewModelModelDotime);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(appUtilGetListSizeIsEmptyItemViewModelListDataViewGONEViewVISIBLE);
            ys.app.petproject.PetBindingUtil.setInventoryRecordsAdapterData(this.recyclerView, itemViewModelListDataGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemInventoryRecordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemInventoryRecordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemInventoryRecordBinding>inflate(inflater, ys.app.petproject.R.layout.item_inventory_records, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemInventoryRecordBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemInventoryRecordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_inventory_records, null, false), bindingComponent);
    }
    @NonNull
    public static ItemInventoryRecordBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemInventoryRecordBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_inventory_records_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemInventoryRecordBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): itemViewModel.listData
        flag 3 (0x4L): null
        flag 4 (0x5L): AppUtil.getListSizeIsEmpty(itemViewModel.listData.get()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): AppUtil.getListSizeIsEmpty(itemViewModel.listData.get()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}