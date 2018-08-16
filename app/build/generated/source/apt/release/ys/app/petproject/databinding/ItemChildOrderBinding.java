package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChildOrderBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.view.View mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView totalMoneyTv;
    @NonNull
    public final android.widget.TextView typeTv;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.OrderChildItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChildOrderBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.view.View) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[1];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.totalMoneyTv = (android.widget.TextView) bindings[10];
        this.totalMoneyTv.setTag(null);
        this.typeTv = (android.widget.TextView) bindings[2];
        this.typeTv.setTag(null);
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
            setItemViewModel((ys.app.petproject.viewmodel.OrderChildItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.OrderChildItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.OrderChildItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.OrderChildItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelModel((ys.app.petproject.model.OrderInfo.OrderDetailedListBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.OrderChildItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.OrderInfo.OrderDetailedListBean ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.String typeTvAndroidStringZkhItemViewModelModelProductTypeName = null;
        java.lang.String stringValueOfItemViewModelModelCount = null;
        int itemViewModelModelIsGift = 0;
        double itemViewModelModelCountVipMoney = 0.0;
        ys.app.petproject.viewmodel.OrderChildItemViewModel itemViewModel = mItemViewModel;
        int int1ItemViewModelModelIsGiftMboundView3AndroidColorTextLightMboundView3AndroidColorTextNormal = 0;
        int itemViewModelModelIsClassification = 0;
        int itemViewModelModelIsFold = 0;
        int int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal = 0;
        int int1ItemViewModelModelIsGiftMboundView6AndroidColorTextLightMboundView6AndroidColorTextNormal = 0;
        int int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal = 0;
        int itemViewModelModelIsPromotion = 0;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelCountVipMoney = null;
        java.lang.String mboundView6AndroidStringXhStringValueOfItemViewModelModelCount = null;
        int itemViewModelModelVipUserId = 0;
        double itemViewModelModelPrice = 0.0;
        java.lang.String typeTvAndroidStringZkhItemViewModelModelProductTypeNameTypeTvAndroidStringYkh = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelPrice = null;
        java.lang.String itemViewModelModelProductTypeName = null;
        ys.app.petproject.model.OrderInfo.OrderDetailedListBean itemViewModelModel = null;
        int itemViewModelModelCount = 0;
        int int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = 0;
        int int1ItemViewModelModelIsGiftViewGONEViewVISIBLE = 0;
        java.lang.String itemViewModelModelName = null;
        java.lang.String mboundView5AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice = null;
        boolean int1ItemViewModelModelIsGift = false;
        double itemViewModelModelRealMoney = 0.0;
        double itemViewModelModelVipPrice = 0.0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(1, itemViewModelModel);


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.isGift
                    itemViewModelModelIsGift = itemViewModelModel.getIsGift();
                    // read itemViewModel.model.countVipMoney
                    itemViewModelModelCountVipMoney = itemViewModelModel.getCountVipMoney();
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
                // read AppUtil.formatStandardMoney(itemViewModel.model.countVipMoney)
                appUtilFormatStandardMoneyItemViewModelModelCountVipMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelCountVipMoney);
                // read AppUtil.formatStandardMoney(itemViewModel.model.price)
                appUtilFormatStandardMoneyItemViewModelModelPrice = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelPrice);
                // read (@android:string/zkh) + (itemViewModel.model.productTypeName)
                typeTvAndroidStringZkhItemViewModelModelProductTypeName = (typeTv.getResources().getString(R.string.zkh)) + (itemViewModelModelProductTypeName);
                // read String.valueOf(itemViewModel.model.count)
                stringValueOfItemViewModelModelCount = java.lang.String.valueOf(itemViewModelModelCount);
            if((dirtyFlags & 0x7L) != 0) {
                if(int1ItemViewModelModelIsGift) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
            }


                // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                int1ItemViewModelModelIsGiftMboundView3AndroidColorTextLightMboundView3AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView3, R.color.text_light)) : (getColorFromResource(mboundView3, R.color.text_normal)));
                // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(nameTv, R.color.text_light)) : (getColorFromResource(nameTv, R.color.text_normal)));
                // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                int1ItemViewModelModelIsGiftMboundView6AndroidColorTextLightMboundView6AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView6, R.color.text_light)) : (getColorFromResource(mboundView6, R.color.text_normal)));
                // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(typeTv, R.color.text_light)) : (getColorFromResource(typeTv, R.color.text_normal)));
                // read 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
                int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = ((int1ItemViewModelModelIsGift) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
                int1ItemViewModelModelIsGiftViewGONEViewVISIBLE = ((int1ItemViewModelModelIsGift) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read (@android:string/rmb) + (AppUtil.formatStandardMoney(itemViewModel.model.price))
                mboundView5AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice = (mboundView5.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyItemViewModelModelPrice);
                // read ((@android:string/zkh) + (itemViewModel.model.productTypeName)) + (@android:string/ykh)
                typeTvAndroidStringZkhItemViewModelModelProductTypeNameTypeTvAndroidStringYkh = (typeTvAndroidStringZkhItemViewModelModelProductTypeName) + (typeTv.getResources().getString(R.string.ykh));
                // read (@android:string/xh) + (String.valueOf(itemViewModel.model.count))
                mboundView6AndroidStringXhStringValueOfItemViewModelModelCount = (mboundView6.getResources().getString(R.string.xh)) + (stringValueOfItemViewModelModelCount);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(int1ItemViewModelModelIsGiftViewVISIBLEViewGONE);
            this.mboundView3.setTextColor(int1ItemViewModelModelIsGiftMboundView3AndroidColorTextLightMboundView3AndroidColorTextNormal);
            ys.app.petproject.PetBindingUtil.setFristPrice(this.mboundView3, itemViewModelModelIsClassification, itemViewModelModelIsPromotion, itemViewModelModelIsFold, itemViewModelModelVipPrice);
            ys.app.petproject.PetBindingUtil.setPrice(this.mboundView4, itemViewModelModelIsClassification, itemViewModelModelIsPromotion);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice);
            this.mboundView6.setTextColor(int1ItemViewModelModelIsGiftMboundView6AndroidColorTextLightMboundView6AndroidColorTextNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mboundView6AndroidStringXhStringValueOfItemViewModelModelCount);
            this.mboundView7.setVisibility(int1ItemViewModelModelIsGiftViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(int1ItemViewModelModelIsGiftViewGONEViewVISIBLE);
            ys.app.petproject.PetBindingUtil.setCostAndCost(this.mboundView9, itemViewModelModelVipUserId, itemViewModelModelIsPromotion, itemViewModelModelIsFold);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
            this.nameTv.setTextColor(int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.totalMoneyTv, appUtilFormatStandardMoneyItemViewModelModelCountVipMoney);
            ys.app.petproject.PetBindingUtil.setTotalMoney(this.totalMoneyTv, itemViewModelModelRealMoney);
            this.typeTv.setTextColor(int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.typeTv, typeTvAndroidStringZkhItemViewModelModelProductTypeNameTypeTvAndroidStringYkh);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemChildOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemChildOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemChildOrderBinding>inflate(inflater, ys.app.petproject.R.layout.item_child_order, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemChildOrderBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemChildOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_child_order, null, false), bindingComponent);
    }
    @NonNull
    public static ItemChildOrderBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemChildOrderBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_child_order_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemChildOrderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
        flag 3 (0x4L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 4 (0x5L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 5 (0x6L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 6 (0x7L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 7 (0x8L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 8 (0x9L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 9 (0xaL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 10 (0xbL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 11 (0xcL): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 12 (0xdL): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 13 (0xeL): 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
        flag 14 (0xfL): 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}