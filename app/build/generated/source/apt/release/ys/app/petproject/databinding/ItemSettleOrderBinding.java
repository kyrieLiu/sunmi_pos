package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSettleOrderBinding extends android.databinding.ViewDataBinding  {

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
    public final android.support.v7.widget.RecyclerView childRecyclerView;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    public final android.widget.TextView numTv;
    @NonNull
    public final android.widget.TextView orderNameTv;
    @NonNull
    public final android.widget.LinearLayout parentLl;
    @NonNull
    public final android.widget.TextView priceTv;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.SettleOrderItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemSettleOrderBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.childRecyclerView = (android.support.v7.widget.RecyclerView) bindings[7];
        this.childRecyclerView.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.numTv = (android.widget.TextView) bindings[4];
        this.numTv.setTag(null);
        this.orderNameTv = (android.widget.TextView) bindings[2];
        this.orderNameTv.setTag(null);
        this.parentLl = (android.widget.LinearLayout) bindings[1];
        this.parentLl.setTag(null);
        this.priceTv = (android.widget.TextView) bindings[5];
        this.priceTv.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
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
            setItemViewModel((ys.app.petproject.viewmodel.SettleOrderItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.SettleOrderItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.SettleOrderItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.SettleOrderItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelModel((ys.app.petproject.model.OrderInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.SettleOrderItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.OrderInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.expand) {
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
        int itemViewModelModelExpandViewVISIBLEViewGONE = 0;
        int itemViewModelModelOrderDetailedListSize = 0;
        ys.app.petproject.viewmodel.SettleOrderItemViewModel itemViewModel = mItemViewModel;
        java.lang.String priceTvAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt = null;
        double itemViewModelModelRealAmt = 0.0;
        java.lang.String numTvAndroidStringHysjItemViewModelModelVipPhone = null;
        java.lang.String itemViewModelModelOrderDetailedListSizeNumTvAndroidStringJsp = null;
        java.lang.String dateUtilLongFormatDate3ItemViewModelModelOrderTime = null;
        ys.app.petproject.model.OrderInfo itemViewModelModel = null;
        boolean itemViewModelModelOrderInfoContainsMboundView6AndroidStringCz = false;
        java.util.List<ys.app.petproject.model.OrderInfo.OrderDetailedListBean> itemViewModelModelOrderDetailedList = null;
        boolean itemViewModelModelExpand = false;
        java.lang.String itemViewModelModelVipPhone = null;
        long itemViewModelModelOrderTime = 0L;
        boolean itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCz = false;
        boolean itemViewModelModelOrderInfoContainsNumTvAndroidStringCz = false;
        int itemViewModelModelOrderInfoContainsMboundView6AndroidStringCzViewGONEItemViewModelModelExpandViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = null;
        java.lang.String itemViewModelModelOrderInfo = null;
        java.lang.String itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCzOrderNameTvAndroidStringHykczddOrderNameTvAndroidStringSpfwdd = null;
        java.lang.String itemViewModelModelOrderInfoContainsNumTvAndroidStringCzNumTvAndroidStringHysjItemViewModelModelVipPhoneItemViewModelModelOrderDetailedListSizeNumTvAndroidStringJsp = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealAmt = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(1, itemViewModelModel);

            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.realAmt
                        itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                        // read itemViewModel.model.orderDetailedList
                        itemViewModelModelOrderDetailedList = itemViewModelModel.getOrderDetailedList();
                        // read itemViewModel.model.orderTime
                        itemViewModelModelOrderTime = itemViewModelModel.getOrderTime();
                    }


                    // read AppUtil.formatStandardMoney(itemViewModel.model.realAmt)
                    appUtilFormatStandardMoneyItemViewModelModelRealAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelRealAmt);
                    // read DateUtil.longFormatDate3(itemViewModel.model.orderTime)
                    dateUtilLongFormatDate3ItemViewModelModelOrderTime = ys.app.petproject.utils.DateUtil.longFormatDate3(itemViewModelModelOrderTime);


                    // read (@android:string/rmb) + (AppUtil.formatStandardMoney(itemViewModel.model.realAmt))
                    priceTvAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt = (priceTv.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyItemViewModelModelRealAmt);
            }

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.orderInfo
                    itemViewModelModelOrderInfo = itemViewModelModel.getOrderInfo();
                }


                if (itemViewModelModelOrderInfo != null) {
                    // read itemViewModel.model.orderInfo.contains(@android:string/cz)
                    itemViewModelModelOrderInfoContainsMboundView6AndroidStringCz = itemViewModelModelOrderInfo.contains(mboundView6.getResources().getString(R.string.cz));
                }
            if((dirtyFlags & 0xfL) != 0) {
                if(itemViewModelModelOrderInfoContainsMboundView6AndroidStringCz) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemViewModelModelOrderInfo != null) {
                        // read itemViewModel.model.orderInfo.contains(@android:string/cz)
                        itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCz = itemViewModelModelOrderInfo.contains(orderNameTv.getResources().getString(R.string.cz));
                        // read itemViewModel.model.orderInfo.contains(@android:string/cz)
                        itemViewModelModelOrderInfoContainsNumTvAndroidStringCz = itemViewModelModelOrderInfo.contains(numTv.getResources().getString(R.string.cz));
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCz) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0xbL) != 0) {
                    if(itemViewModelModelOrderInfoContainsNumTvAndroidStringCz) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read itemViewModel.model.orderInfo.contains(@android:string/cz) ? @android:string/hykczdd : @android:string/spfwdd
                    itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCzOrderNameTvAndroidStringHykczddOrderNameTvAndroidStringSpfwdd = ((itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCz) ? (orderNameTv.getResources().getString(R.string.hykczdd)) : (orderNameTv.getResources().getString(R.string.spfwdd)));
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::clickOpenOrClose
                        itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = (((mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener == null) ? (mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (itemViewModelModelOrderDetailedList != null) {
                    // read itemViewModel.model.orderDetailedList.size()
                    itemViewModelModelOrderDetailedListSize = itemViewModelModelOrderDetailedList.size();
                }


                // read (itemViewModel.model.orderDetailedList.size()) + (@android:string/jsp)
                itemViewModelModelOrderDetailedListSizeNumTvAndroidStringJsp = (itemViewModelModelOrderDetailedListSize) + (numTv.getResources().getString(R.string.jsp));
        }
        if ((dirtyFlags & 0x40L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.expand
                    itemViewModelModelExpand = itemViewModelModel.isExpand();
                }
            if((dirtyFlags & 0x40L) != 0) {
                if(itemViewModelModelExpand) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read itemViewModel.model.expand ? View.VISIBLE : View.GONE
                itemViewModelModelExpandViewVISIBLEViewGONE = ((itemViewModelModelExpand) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.vipPhone
                    itemViewModelModelVipPhone = itemViewModelModel.getVipPhone();
                }


                // read (@android:string/hysj) + (itemViewModel.model.vipPhone)
                numTvAndroidStringHysjItemViewModelModelVipPhone = (numTv.getResources().getString(R.string.hysj)) + (itemViewModelModelVipPhone);
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read itemViewModel.model.orderInfo.contains(@android:string/cz) ? View.GONE : itemViewModel.model.expand ? View.VISIBLE : View.GONE
                itemViewModelModelOrderInfoContainsMboundView6AndroidStringCzViewGONEItemViewModelModelExpandViewVISIBLEViewGONE = ((itemViewModelModelOrderInfoContainsMboundView6AndroidStringCz) ? (android.view.View.GONE) : (itemViewModelModelExpandViewVISIBLEViewGONE));
        }
        if ((dirtyFlags & 0xbL) != 0) {

                // read itemViewModel.model.orderInfo.contains(@android:string/cz) ? (@android:string/hysj) + (itemViewModel.model.vipPhone) : (itemViewModel.model.orderDetailedList.size()) + (@android:string/jsp)
                itemViewModelModelOrderInfoContainsNumTvAndroidStringCzNumTvAndroidStringHysjItemViewModelModelVipPhoneItemViewModelModelOrderDetailedListSizeNumTvAndroidStringJsp = ((itemViewModelModelOrderInfoContainsNumTvAndroidStringCz) ? (numTvAndroidStringHysjItemViewModelModelVipPhone) : (itemViewModelModelOrderDetailedListSizeNumTvAndroidStringJsp));
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setChildAdapterData(this.childRecyclerView, itemViewModelModelOrderDetailedList);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dateUtilLongFormatDate3ItemViewModelModelOrderTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.numTv, itemViewModelModelOrderInfoContainsNumTvAndroidStringCzNumTvAndroidStringHysjItemViewModelModelVipPhoneItemViewModelModelOrderDetailedListSizeNumTvAndroidStringJsp);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.orderNameTv, itemViewModelModelOrderInfoContainsOrderNameTvAndroidStringCzOrderNameTvAndroidStringHykczddOrderNameTvAndroidStringSpfwdd);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.priceTv, priceTvAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.mboundView6.setVisibility(itemViewModelModelOrderInfoContainsMboundView6AndroidStringCzViewGONEItemViewModelModelExpandViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.parentLl.setOnClickListener(itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SettleOrderItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.SettleOrderItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOpenOrClose(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemSettleOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemSettleOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemSettleOrderBinding>inflate(inflater, ys.app.petproject.R.layout.item_settle_order, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemSettleOrderBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemSettleOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_settle_order, null, false), bindingComponent);
    }
    @NonNull
    public static ItemSettleOrderBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemSettleOrderBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_settle_order_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemSettleOrderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): itemViewModel.model.expand
        flag 3 (0x4L): null
        flag 4 (0x5L): itemViewModel.model.expand ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.model.expand ? View.VISIBLE : View.GONE
        flag 6 (0x7L): itemViewModel.model.orderInfo.contains(@android:string/cz) ? View.GONE : itemViewModel.model.expand ? View.VISIBLE : View.GONE
        flag 7 (0x8L): itemViewModel.model.orderInfo.contains(@android:string/cz) ? View.GONE : itemViewModel.model.expand ? View.VISIBLE : View.GONE
        flag 8 (0x9L): itemViewModel.model.orderInfo.contains(@android:string/cz) ? @android:string/hykczdd : @android:string/spfwdd
        flag 9 (0xaL): itemViewModel.model.orderInfo.contains(@android:string/cz) ? @android:string/hykczdd : @android:string/spfwdd
        flag 10 (0xbL): itemViewModel.model.orderInfo.contains(@android:string/cz) ? (@android:string/hysj) + (itemViewModel.model.vipPhone) : (itemViewModel.model.orderDetailedList.size()) + (@android:string/jsp)
        flag 11 (0xcL): itemViewModel.model.orderInfo.contains(@android:string/cz) ? (@android:string/hysj) + (itemViewModel.model.vipPhone) : (itemViewModel.model.orderDetailedList.size()) + (@android:string/jsp)
    flag mapping end*/
    //end
}