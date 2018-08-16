package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTransactionBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemAchivementPayType;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ItemTransactionViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTransactionBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemAchivementPayType = (android.widget.TextView) bindings[3];
        this.tvItemAchivementPayType.setTag(null);
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
            setItemViewModel((ys.app.petproject.viewmodel.ItemTransactionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.ItemTransactionViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ItemTransactionViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.ItemTransactionViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelOrderType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.petproject.model.OrderInfo) object, fieldId);
            case 3 :
                return onChangeItemViewModelOrderMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeItemViewModelIsRefund((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.ItemTransactionViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelOrderType(android.databinding.ObservableField<java.lang.String> ItemViewModelOrderType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.OrderInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelOrderMoney(android.databinding.ObservableField<java.lang.String> ItemViewModelOrderMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelIsRefund(android.databinding.ObservableBoolean ItemViewModelIsRefund, int fieldId) {
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
        int itemViewModelIsRefundViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelOrderTypeGet = null;
        java.lang.String itemViewModelModelPayedMethod = null;
        ys.app.petproject.viewmodel.ItemTransactionViewModel itemViewModel = mItemViewModel;
        android.databinding.ObservableField<java.lang.String> itemViewModelOrderType = null;
        java.lang.String itemViewModelOrderMoneyGet = null;
        java.lang.String appUtilGetTimesItemViewModelModelOrderTime = null;
        ys.app.petproject.model.OrderInfo itemViewModelModel = null;
        long itemViewModelModelOrderTime = 0L;
        android.databinding.ObservableField<java.lang.String> itemViewModelOrderMoney = null;
        java.lang.String appUtilGetPayTypeItemViewModelModelPayedMethod = null;
        boolean itemViewModelIsRefundGet = false;
        android.databinding.ObservableBoolean itemViewModelIsRefund = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.orderType
                        itemViewModelOrderType = itemViewModel.orderType;
                    }
                    updateRegistration(1, itemViewModelOrderType);


                    if (itemViewModelOrderType != null) {
                        // read itemViewModel.orderType.get()
                        itemViewModelOrderTypeGet = itemViewModelOrderType.get();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(2, itemViewModelModel);


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.payedMethod
                        itemViewModelModelPayedMethod = itemViewModelModel.getPayedMethod();
                        // read itemViewModel.model.orderTime
                        itemViewModelModelOrderTime = itemViewModelModel.getOrderTime();
                    }


                    // read AppUtil.getPayType(itemViewModel.model.payedMethod)
                    appUtilGetPayTypeItemViewModelModelPayedMethod = ys.app.petproject.utils.AppUtil.getPayType(itemViewModelModelPayedMethod);
                    // read AppUtil.getTimes(itemViewModel.model.orderTime)
                    appUtilGetTimesItemViewModelModelOrderTime = ys.app.petproject.utils.AppUtil.getTimes(itemViewModelModelOrderTime);
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.orderMoney
                        itemViewModelOrderMoney = itemViewModel.orderMoney;
                    }
                    updateRegistration(3, itemViewModelOrderMoney);


                    if (itemViewModelOrderMoney != null) {
                        // read itemViewModel.orderMoney.get()
                        itemViewModelOrderMoneyGet = itemViewModelOrderMoney.get();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.isRefund
                        itemViewModelIsRefund = itemViewModel.isRefund;
                    }
                    updateRegistration(4, itemViewModelIsRefund);


                    if (itemViewModelIsRefund != null) {
                        // read itemViewModel.isRefund.get()
                        itemViewModelIsRefundGet = itemViewModelIsRefund.get();
                    }
                if((dirtyFlags & 0x31L) != 0) {
                    if(itemViewModelIsRefundGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read itemViewModel.isRefund.get() ? View.VISIBLE : View.GONE
                    itemViewModelIsRefundViewVISIBLEViewGONE = ((itemViewModelIsRefundGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, appUtilGetTimesItemViewModelModelOrderTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAchivementPayType, appUtilGetPayTypeItemViewModelModelPayedMethod);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelOrderMoneyGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(itemViewModelIsRefundViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelOrderTypeGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemTransactionBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemTransactionBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemTransactionBinding>inflate(inflater, ys.app.petproject.R.layout.item_transaction, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemTransactionBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemTransactionBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_transaction, null, false), bindingComponent);
    }
    @NonNull
    public static ItemTransactionBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemTransactionBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_transaction_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemTransactionBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.orderType
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.orderMoney
        flag 4 (0x5L): itemViewModel.isRefund
        flag 5 (0x6L): null
        flag 6 (0x7L): itemViewModel.isRefund.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): itemViewModel.isRefund.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}