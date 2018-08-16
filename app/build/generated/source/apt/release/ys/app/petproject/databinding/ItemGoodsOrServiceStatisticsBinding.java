package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGoodsOrServiceStatisticsBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.RelativeLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGoodsOrServiceStatisticsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
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
            setItemViewModel((ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel ItemViewModel, int fieldId) {
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
        ys.app.petproject.viewmodel.GoodsOrServiceStatisticsItemViewModel itemViewModel = mItemViewModel;
        java.lang.String stringValueOfItemViewModelModelTotalAmt = null;
        ys.app.petproject.model.StatisticsDataInfo.ProductTypeListBean itemViewModelModel = null;
        double itemViewModelModelTotalAmt = 0.0;
        java.lang.String appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmt = null;
        java.lang.String itemViewModelModelName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.totalAmt
                    itemViewModelModelTotalAmt = itemViewModelModel.getTotalAmt();
                    // read itemViewModel.model.name
                    itemViewModelModelName = itemViewModelModel.getName();
                }


                // read String.valueOf(itemViewModel.model.totalAmt)
                stringValueOfItemViewModelModelTotalAmt = java.lang.String.valueOf(itemViewModelModelTotalAmt);


                // read AppUtil.formatStandardMoney(String.valueOf(itemViewModel.model.totalAmt))
                appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(stringValueOfItemViewModelModelTotalAmt);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmt);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemGoodsOrServiceStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsOrServiceStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemGoodsOrServiceStatisticsBinding>inflate(inflater, ys.app.petproject.R.layout.item_goods_or_service_statistics, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemGoodsOrServiceStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsOrServiceStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_goods_or_service_statistics, null, false), bindingComponent);
    }
    @NonNull
    public static ItemGoodsOrServiceStatisticsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsOrServiceStatisticsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_goods_or_service_statistics_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemGoodsOrServiceStatisticsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}