package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EmployeeServiceBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

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
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.view.View mboundView8;
    @NonNull
    private final android.widget.RelativeLayout mboundView9;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView totalMoneyTv;
    @NonNull
    public final android.widget.TextView tvConform;
    @NonNull
    public final android.widget.TextView tvItemEmployeeDiscount;
    @NonNull
    public final android.widget.TextView typeTv;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EmployeeServiceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.view.View) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[2];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.totalMoneyTv = (android.widget.TextView) bindings[13];
        this.totalMoneyTv.setTag(null);
        this.tvConform = (android.widget.TextView) bindings[11];
        this.tvConform.setTag(null);
        this.tvItemEmployeeDiscount = (android.widget.TextView) bindings[10];
        this.tvItemEmployeeDiscount.setTag(null);
        this.typeTv = (android.widget.TextView) bindings[3];
        this.typeTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback99 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setItemViewModel((ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelObTitle((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelSeeDetail((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObTitle(android.databinding.ObservableField<java.lang.String> ItemViewModelObTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelSeeDetail(android.databinding.ObservableBoolean ItemViewModelSeeDetail, int fieldId) {
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
        java.lang.String typeTvAndroidStringZkhItemViewModelModelProductTypeName = null;
        java.lang.String stringValueOfItemViewModelModelCount = null;
        int itemViewModelModelIsGift = 0;
        int int1ItemViewModelModelIsGiftMboundView7AndroidColorTextLightMboundView7AndroidColorTextNormal = 0;
        ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel itemViewModel = mItemViewModel;
        int itemViewModelModelIsClassification = 0;
        java.lang.String itemViewModelObTitleGet = null;
        int itemViewModelModelIsFold = 0;
        int int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal = 0;
        int int1ItemViewModelModelIsGiftMboundView6AndroidColorTextLightMboundView6AndroidColorTextNormal = 0;
        int int1ItemViewModelModelIsGiftMboundView4AndroidColorTextLightMboundView4AndroidColorTextNormal = 0;
        int int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal = 0;
        int itemViewModelModelIsPromotion = 0;
        int itemViewModelModelVipUserId = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelObTitle = null;
        double itemViewModelModelPrice = 0.0;
        java.lang.String mboundView6AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice = null;
        java.lang.String typeTvAndroidStringZkhItemViewModelModelProductTypeNameTypeTvAndroidStringYkh = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelPrice = null;
        android.databinding.ObservableBoolean itemViewModelSeeDetail = null;
        int itemViewModelSeeDetailViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelModelProductTypeName = null;
        ys.app.petproject.model.SummitOrderInfo itemViewModelModel = null;
        int itemViewModelModelCount = 0;
        boolean itemViewModelSeeDetailGet = false;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealMoney = null;
        int int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = 0;
        int int1ItemViewModelModelIsGiftViewGONEViewVISIBLE = 0;
        java.lang.String itemViewModelModelName = null;
        java.lang.String mboundView7AndroidStringXhStringValueOfItemViewModelModelCount = null;
        boolean int1ItemViewModelModelIsGift = false;
        double itemViewModelModelRealMoney = 0.0;
        double itemViewModelModelVipPrice = 0.0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x13L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obTitle
                        itemViewModelObTitle = itemViewModel.obTitle;
                    }
                    updateRegistration(1, itemViewModelObTitle);


                    if (itemViewModelObTitle != null) {
                        // read itemViewModel.obTitle.get()
                        itemViewModelObTitleGet = itemViewModelObTitle.get();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.seeDetail
                        itemViewModelSeeDetail = itemViewModel.seeDetail;
                    }
                    updateRegistration(2, itemViewModelSeeDetail);


                    if (itemViewModelSeeDetail != null) {
                        // read itemViewModel.seeDetail.get()
                        itemViewModelSeeDetailGet = itemViewModelSeeDetail.get();
                    }
                if((dirtyFlags & 0x15L) != 0) {
                    if(itemViewModelSeeDetailGet) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read itemViewModel.seeDetail.get() ? View.VISIBLE : View.GONE
                    itemViewModelSeeDetailViewVISIBLEViewGONE = ((itemViewModelSeeDetailGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isGift
                        itemViewModelModelIsGift = itemViewModelModel.getIsGift();
                        // read itemViewModel.model.isClassification
                        itemViewModelModelIsClassification = itemViewModelModel.getIsClassification();
                        // read itemViewModel.model.isFold
                        itemViewModelModelIsFold = itemViewModelModel.getIsFold();
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                        // read itemViewModel.model.vipUserId
                        itemViewModelModelVipUserId = itemViewModelModel.getVipUserId();
                        // read itemViewModel.model.price
                        itemViewModelModelPrice = itemViewModelModel.getPrice();
                        // read itemViewModel.model.productTypeName
                        itemViewModelModelProductTypeName = itemViewModelModel.getProductTypeName();
                        // read itemViewModel.model.count
                        itemViewModelModelCount = itemViewModelModel.getCount();
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                        // read itemViewModel.model.realMoney
                        itemViewModelModelRealMoney = itemViewModelModel.getRealMoney();
                        // read itemViewModel.model.vipPrice
                        itemViewModelModelVipPrice = itemViewModelModel.getVipPrice();
                    }


                    // read 1 == itemViewModel.model.isGift
                    int1ItemViewModelModelIsGift = (1) == (itemViewModelModelIsGift);
                    // read AppUtil.formatStandardMoney(itemViewModel.model.price)
                    appUtilFormatStandardMoneyItemViewModelModelPrice = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelPrice);
                    // read (@android:string/zkh) + (itemViewModel.model.productTypeName)
                    typeTvAndroidStringZkhItemViewModelModelProductTypeName = (typeTv.getResources().getString(R.string.zkh)) + (itemViewModelModelProductTypeName);
                    // read String.valueOf(itemViewModel.model.count)
                    stringValueOfItemViewModelModelCount = java.lang.String.valueOf(itemViewModelModelCount);
                    // read AppUtil.formatStandardMoney(itemViewModel.model.realMoney)
                    appUtilFormatStandardMoneyItemViewModelModelRealMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelRealMoney);
                if((dirtyFlags & 0x19L) != 0) {
                    if(int1ItemViewModelModelIsGift) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftMboundView7AndroidColorTextLightMboundView7AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView7, R.color.text_light)) : (getColorFromResource(mboundView7, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(nameTv, R.color.text_light)) : (getColorFromResource(nameTv, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftMboundView6AndroidColorTextLightMboundView6AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView6, R.color.text_light)) : (getColorFromResource(mboundView6, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftMboundView4AndroidColorTextLightMboundView4AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView4, R.color.text_light)) : (getColorFromResource(mboundView4, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(typeTv, R.color.text_light)) : (getColorFromResource(typeTv, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
                    int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = ((int1ItemViewModelModelIsGift) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
                    int1ItemViewModelModelIsGiftViewGONEViewVISIBLE = ((int1ItemViewModelModelIsGift) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read (@android:string/rmb) + (AppUtil.formatStandardMoney(itemViewModel.model.price))
                    mboundView6AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice = (mboundView6.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyItemViewModelModelPrice);
                    // read ((@android:string/zkh) + (itemViewModel.model.productTypeName)) + (@android:string/ykh)
                    typeTvAndroidStringZkhItemViewModelModelProductTypeNameTypeTvAndroidStringYkh = (typeTvAndroidStringZkhItemViewModelModelProductTypeName) + (typeTv.getResources().getString(R.string.ykh));
                    // read (@android:string/xh) + (String.valueOf(itemViewModel.model.count))
                    mboundView7AndroidStringXhStringValueOfItemViewModelModelCount = (mboundView7.getResources().getString(R.string.xh)) + (stringValueOfItemViewModelModelCount);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(int1ItemViewModelModelIsGiftViewVISIBLEViewGONE);
            this.mboundView4.setTextColor(int1ItemViewModelModelIsGiftMboundView4AndroidColorTextLightMboundView4AndroidColorTextNormal);
            ys.app.petproject.PetBindingUtil.setFristPrice(this.mboundView4, itemViewModelModelIsClassification, itemViewModelModelIsPromotion, itemViewModelModelIsFold, itemViewModelModelVipPrice);
            ys.app.petproject.PetBindingUtil.setPrice(this.mboundView5, itemViewModelModelIsClassification, itemViewModelModelIsPromotion);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mboundView6AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice);
            this.mboundView6.setTextColor(int1ItemViewModelModelIsGiftMboundView6AndroidColorTextLightMboundView6AndroidColorTextNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringXhStringValueOfItemViewModelModelCount);
            this.mboundView7.setTextColor(int1ItemViewModelModelIsGiftMboundView7AndroidColorTextLightMboundView7AndroidColorTextNormal);
            this.mboundView8.setVisibility(int1ItemViewModelModelIsGiftViewGONEViewVISIBLE);
            this.mboundView9.setVisibility(int1ItemViewModelModelIsGiftViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
            this.nameTv.setTextColor(int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.totalMoneyTv, appUtilFormatStandardMoneyItemViewModelModelRealMoney);
            ys.app.petproject.PetBindingUtil.setTotalMoney(this.totalMoneyTv, itemViewModelModelRealMoney);
            ys.app.petproject.PetBindingUtil.setCostAndCost(this.tvItemEmployeeDiscount, itemViewModelModelVipUserId, itemViewModelModelIsPromotion, itemViewModelModelIsFold);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.typeTv, typeTvAndroidStringZkhItemViewModelModelProductTypeNameTypeTvAndroidStringYkh);
            this.typeTv.setTextColor(int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(itemViewModelSeeDetailViewVISIBLEViewGONE);
            this.tvConform.setVisibility(itemViewModelSeeDetailViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.tvConform.setOnClickListener(mCallback99);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvConform, itemViewModelObTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        ys.app.petproject.viewmodel.ShoppingCarAdapterViewModel itemViewModel = mItemViewModel;
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
    public static EmployeeServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EmployeeServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EmployeeServiceBinding>inflate(inflater, ys.app.petproject.R.layout.item_employee_shop_car_goods, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static EmployeeServiceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EmployeeServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_employee_shop_car_goods, null, false), bindingComponent);
    }
    @NonNull
    public static EmployeeServiceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EmployeeServiceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_employee_shop_car_goods_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EmployeeServiceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.obTitle
        flag 2 (0x3L): itemViewModel.seeDetail
        flag 3 (0x4L): itemViewModel.model
        flag 4 (0x5L): null
        flag 5 (0x6L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 6 (0x7L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 7 (0x8L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 8 (0x9L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 9 (0xaL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 10 (0xbL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 11 (0xcL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 12 (0xdL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 13 (0xeL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 14 (0xfL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 15 (0x10L): itemViewModel.seeDetail.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): itemViewModel.seeDetail.get() ? View.VISIBLE : View.GONE
        flag 17 (0x12L): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 18 (0x13L): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 19 (0x14L): 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
        flag 20 (0x15L): 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}