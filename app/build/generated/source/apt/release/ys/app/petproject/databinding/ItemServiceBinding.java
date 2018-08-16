package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemServiceBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll1, 16);
        sViewsWithIds.put(R.id.ll, 17);
        sViewsWithIds.put(R.id.danwei, 18);
        sViewsWithIds.put(R.id.rl0, 19);
        sViewsWithIds.put(R.id.vip_price_tv, 20);
        sViewsWithIds.put(R.id.r20, 21);
    }
    // views
    @NonNull
    public final android.widget.TextView danwei;
    @NonNull
    public final android.widget.TextView jine;
    @NonNull
    public final android.widget.RelativeLayout ll;
    @NonNull
    public final android.widget.LinearLayout ll1;
    @NonNull
    public final android.widget.LinearLayout llPromotionTime;
    @NonNull
    private final ys.app.petproject.widget.RotateTextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    public final android.widget.TextView primaryPriceTv;
    @NonNull
    public final android.widget.TextView promotion;
    @NonNull
    public final android.widget.RelativeLayout r20;
    @NonNull
    public final android.widget.RelativeLayout rl0;
    @NonNull
    public final android.widget.RelativeLayout rl2;
    @NonNull
    public final android.support.v7.widget.CardView rootView;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.widget.TextView vipPriceTv;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ServiceItemViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemServiceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds);
        this.danwei = (android.widget.TextView) bindings[18];
        this.jine = (android.widget.TextView) bindings[6];
        this.jine.setTag(null);
        this.ll = (android.widget.RelativeLayout) bindings[17];
        this.ll1 = (android.widget.LinearLayout) bindings[16];
        this.llPromotionTime = (android.widget.LinearLayout) bindings[11];
        this.llPromotionTime.setTag(null);
        this.mboundView1 = (ys.app.petproject.widget.RotateTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.primaryPriceTv = (android.widget.TextView) bindings[9];
        this.primaryPriceTv.setTag(null);
        this.promotion = (android.widget.TextView) bindings[15];
        this.promotion.setTag(null);
        this.r20 = (android.widget.RelativeLayout) bindings[21];
        this.rl0 = (android.widget.RelativeLayout) bindings[19];
        this.rl2 = (android.widget.RelativeLayout) bindings[5];
        this.rl2.setTag(null);
        this.rootView = (android.support.v7.widget.CardView) bindings[0];
        this.rootView.setTag(null);
        this.view = (android.view.View) bindings[14];
        this.view.setTag(null);
        this.vipPriceTv = (android.widget.TextView) bindings[20];
        setRootTag(root);
        // listeners
        mCallback96 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setItemViewModel((ys.app.petproject.viewmodel.ServiceItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.ServiceItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ServiceItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.ServiceItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelObRealMoneyColor((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeItemViewModelPromotionSetting((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeItemViewModelModel((ys.app.petproject.model.ServiceInfo) object, fieldId);
            case 4 :
                return onChangeItemViewModelObRealMoneyBg((android.databinding.ObservableField<android.graphics.drawable.Drawable>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.ServiceItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelObRealMoneyColor(android.databinding.ObservableField<java.lang.Integer> ItemViewModelObRealMoneyColor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelPromotionSetting(android.databinding.ObservableBoolean ItemViewModelPromotionSetting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.ServiceInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.isPromotion) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.typeName) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.realAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObRealMoneyBg(android.databinding.ObservableField<android.graphics.drawable.Drawable> ItemViewModelObRealMoneyBg, int fieldId) {
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
        ys.app.petproject.viewmodel.ServiceItemViewModel itemViewModel = mItemViewModel;
        int itemViewModelModelIsFoldInt1ViewVISIBLEViewGONE = 0;
        int itemViewModelModelIsFold = 0;
        java.lang.String itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc = null;
        java.lang.String mboundView4AndroidStringZkhItemViewModelModelTypeName = null;
        long itemViewModelModelEndTime = 0L;
        boolean itemViewModelModelIsFoldInt1 = false;
        android.databinding.ObservableField<java.lang.Integer> itemViewModelObRealMoneyColor = null;
        android.graphics.drawable.Drawable itemViewModelObRealMoneyBgGet = null;
        double itemViewModelModelRealAmt = 0.0;
        int itemViewModelModelIsPromotion = 0;
        java.lang.String itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        int itemViewModelModelPromotionType = 0;
        double itemViewModelModelVipAmt = 0.0;
        boolean itemViewModelModelPromotionTypeInt2 = false;
        android.databinding.ObservableBoolean itemViewModelPromotionSetting = null;
        java.lang.String mboundView8AndroidStringRmbItemViewModelModelVipAmt = null;
        java.lang.String mboundView10AndroidStringRmbItemViewModelModelRealAmt = null;
        ys.app.petproject.model.ServiceInfo itemViewModelModel = null;
        boolean itemViewModelPromotionSettingGet = false;
        int androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet = 0;
        java.lang.String jineAndroidStringRmbItemViewModelModelPromotionAmt = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNum = null;
        java.lang.String itemViewModelModelTypeName = null;
        long itemViewModelModelBeginTime = 0L;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelEndTime = null;
        java.lang.String itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc = null;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelBeginTime = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String mboundView4AndroidStringZkhItemViewModelModelTypeNameMboundView4AndroidStringYkh = null;
        int itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<android.graphics.drawable.Drawable> itemViewModelObRealMoneyBg = null;
        boolean itemViewModelModelIsPromotionInt1 = false;
        double itemViewModelModelPromotionNum = 0.0;
        int itemViewModelPromotionSettingViewVISIBLEViewGONE = 0;
        java.lang.Integer itemViewModelObRealMoneyColorGet = null;
        double itemViewModelModelPromotionAmt = 0.0;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x203L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obRealMoneyColor
                        itemViewModelObRealMoneyColor = itemViewModel.obRealMoneyColor;
                    }
                    updateRegistration(1, itemViewModelObRealMoneyColor);


                    if (itemViewModelObRealMoneyColor != null) {
                        // read itemViewModel.obRealMoneyColor.get()
                        itemViewModelObRealMoneyColorGet = itemViewModelObRealMoneyColor.get();
                    }


                    // read android.databinding.DynamicUtil.safeUnbox(itemViewModel.obRealMoneyColor.get())
                    androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet = android.databinding.DynamicUtil.safeUnbox(itemViewModelObRealMoneyColorGet);
            }
            if ((dirtyFlags & 0x22dL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.promotionSetting
                        itemViewModelPromotionSetting = itemViewModel.promotionSetting;
                    }
                    updateRegistration(2, itemViewModelPromotionSetting);


                    if (itemViewModelPromotionSetting != null) {
                        // read itemViewModel.promotionSetting.get()
                        itemViewModelPromotionSettingGet = itemViewModelPromotionSetting.get();
                    }
                if((dirtyFlags & 0x22dL) != 0) {
                    if(itemViewModelPromotionSettingGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x205L) != 0) {
                    if(itemViewModelPromotionSettingGet) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }

                if ((dirtyFlags & 0x205L) != 0) {

                        // read itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
                        itemViewModelPromotionSettingViewVISIBLEViewGONE = ((itemViewModelPromotionSettingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x3e9L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(3, itemViewModelModel);

                if ((dirtyFlags & 0x209L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.isFold
                            itemViewModelModelIsFold = itemViewModelModel.getIsFold();
                            // read itemViewModel.model.endTime
                            itemViewModelModelEndTime = itemViewModelModel.getEndTime();
                            // read itemViewModel.model.promotionType
                            itemViewModelModelPromotionType = itemViewModelModel.getPromotionType();
                            // read itemViewModel.model.vipAmt
                            itemViewModelModelVipAmt = itemViewModelModel.getVipAmt();
                            // read itemViewModel.model.beginTime
                            itemViewModelModelBeginTime = itemViewModelModel.getBeginTime();
                            // read itemViewModel.model.promotionAmt
                            itemViewModelModelPromotionAmt = itemViewModelModel.getPromotionAmt();
                        }


                        // read itemViewModel.model.isFold == 1
                        itemViewModelModelIsFoldInt1 = (itemViewModelModelIsFold) == (1);
                        // read AppUtil.longToStandardTime(itemViewModel.model.endTime)
                        appUtilLongToStandardTimeItemViewModelModelEndTime = ys.app.petproject.utils.AppUtil.longToStandardTime(itemViewModelModelEndTime);
                        // read itemViewModel.model.promotionType == 2
                        itemViewModelModelPromotionTypeInt2 = (itemViewModelModelPromotionType) == (2);
                        // read (@android:string/rmb) + (itemViewModel.model.vipAmt)
                        mboundView8AndroidStringRmbItemViewModelModelVipAmt = (mboundView8.getResources().getString(R.string.rmb)) + (itemViewModelModelVipAmt);
                        // read AppUtil.longToStandardTime(itemViewModel.model.beginTime)
                        appUtilLongToStandardTimeItemViewModelModelBeginTime = ys.app.petproject.utils.AppUtil.longToStandardTime(itemViewModelModelBeginTime);
                        // read (@android:string/rmb) + (itemViewModel.model.promotionAmt)
                        jineAndroidStringRmbItemViewModelModelPromotionAmt = (jine.getResources().getString(R.string.rmb)) + (itemViewModelModelPromotionAmt);
                    if((dirtyFlags & 0x209L) != 0) {
                        if(itemViewModelModelIsFoldInt1) {
                                dirtyFlags |= 0x800L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                        }
                    }
                    if((dirtyFlags & 0x209L) != 0) {
                        if(itemViewModelModelPromotionTypeInt2) {
                                dirtyFlags |= 0x8000L;
                        }
                        else {
                                dirtyFlags |= 0x4000L;
                        }
                    }


                        // read itemViewModel.model.isFold == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsFoldInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsFoldInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x309L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.realAmt
                            itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                        }


                        // read (@android:string/rmb) + (itemViewModel.model.realAmt)
                        mboundView10AndroidStringRmbItemViewModelModelRealAmt = (mboundView10.getResources().getString(R.string.rmb)) + (itemViewModelModelRealAmt);
                }
                if ((dirtyFlags & 0x229L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.isPromotion
                            itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                        }


                        // read itemViewModel.model.isPromotion == 1
                        itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                    if((dirtyFlags & 0x2000L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x20000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                        }
                    }
                    if((dirtyFlags & 0x229L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x80000L;
                        }
                        else {
                                dirtyFlags |= 0x40000L;
                        }
                    }


                        // read itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsPromotionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x289L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.typeName
                            itemViewModelModelTypeName = itemViewModelModel.getTypeName();
                        }


                        // read (@android:string/zkh) + (itemViewModel.model.typeName)
                        mboundView4AndroidStringZkhItemViewModelModelTypeName = (mboundView4.getResources().getString(R.string.zkh)) + (itemViewModelModelTypeName);


                        // read ((@android:string/zkh) + (itemViewModel.model.typeName)) + (@android:string/ykh)
                        mboundView4AndroidStringZkhItemViewModelModelTypeNameMboundView4AndroidStringYkh = (mboundView4AndroidStringZkhItemViewModelModelTypeName) + (mboundView4.getResources().getString(R.string.ykh));
                }
                if ((dirtyFlags & 0x249L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                        }
                }
            }
            if ((dirtyFlags & 0x211L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obRealMoneyBg
                        itemViewModelObRealMoneyBg = itemViewModel.obRealMoneyBg;
                    }
                    updateRegistration(4, itemViewModelObRealMoneyBg);


                    if (itemViewModelObRealMoneyBg != null) {
                        // read itemViewModel.obRealMoneyBg.get()
                        itemViewModelObRealMoneyBgGet = itemViewModelObRealMoneyBg.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x6000L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(3, itemViewModelModel);

            if ((dirtyFlags & 0x2000L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                    }


                    // read itemViewModel.model.isPromotion == 1
                    itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                if((dirtyFlags & 0x2000L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x229L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
                    itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc = ((itemViewModelModelIsPromotionInt1) ? (promotion.getResources().getString(R.string.rjrxc)) : (promotion.getResources().getString(R.string.jrxc)));
            }
            if ((dirtyFlags & 0x4000L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.promotionNum
                        itemViewModelModelPromotionNum = itemViewModelModel.getPromotionNum();
                    }


                    // read AppUtil.discountShow(itemViewModel.model.promotionNum)
                    appUtilDiscountShowItemViewModelModelPromotionNum = ys.app.petproject.utils.AppUtil.discountShow(itemViewModelModelPromotionNum);


                    // read (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                    appUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = (appUtilDiscountShowItemViewModelModelPromotionNum) + (mboundView1.getResources().getString(R.string.zhe));
            }
        }

        if ((dirtyFlags & 0x22dL) != 0) {

                // read itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
                itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc = ((itemViewModelPromotionSettingGet) ? (itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc) : (promotion.getResources().getString(R.string.jrxc)));
        }
        if ((dirtyFlags & 0x209L) != 0) {

                // read itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = ((itemViewModelModelPromotionTypeInt2) ? (mboundView1.getResources().getString(R.string.lijian)) : (appUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe));
        }
        // batch finished
        if ((dirtyFlags & 0x209L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.jine, jineAndroidStringRmbItemViewModelModelPromotionAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, appUtilLongToStandardTimeItemViewModelModelBeginTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, appUtilLongToStandardTimeItemViewModelModelEndTime);
            this.mboundView7.setVisibility(itemViewModelModelIsFoldInt1ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, mboundView8AndroidStringRmbItemViewModelModelVipAmt);
        }
        if ((dirtyFlags & 0x229L) != 0) {
            // api target 1

            this.llPromotionTime.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView1.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.rl2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x309L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, mboundView10AndroidStringRmbItemViewModelModelRealAmt);
        }
        if ((dirtyFlags & 0x203L) != 0) {
            // api target 1

            this.mboundView10.setTextColor(androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet);
            this.primaryPriceTv.setTextColor(androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet);
        }
        if ((dirtyFlags & 0x211L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView10, itemViewModelObRealMoneyBgGet);
        }
        if ((dirtyFlags & 0x249L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x289L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mboundView4AndroidStringZkhItemViewModelModelTypeNameMboundView4AndroidStringYkh);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.promotion.setOnClickListener(mCallback96);
        }
        if ((dirtyFlags & 0x22dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.promotion, itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc);
        }
        if ((dirtyFlags & 0x205L) != 0) {
            // api target 1

            this.promotion.setVisibility(itemViewModelPromotionSettingViewVISIBLEViewGONE);
            this.view.setVisibility(itemViewModelPromotionSettingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        ys.app.petproject.viewmodel.ServiceItemViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.promotionClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemServiceBinding>inflate(inflater, ys.app.petproject.R.layout.item_service, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemServiceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_service, null, false), bindingComponent);
    }
    @NonNull
    public static ItemServiceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemServiceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_service_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemServiceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.obRealMoneyColor
        flag 2 (0x3L): itemViewModel.promotionSetting
        flag 3 (0x4L): itemViewModel.model
        flag 4 (0x5L): itemViewModel.obRealMoneyBg
        flag 5 (0x6L): itemViewModel.model.isPromotion
        flag 6 (0x7L): itemViewModel.model.name
        flag 7 (0x8L): itemViewModel.model.typeName
        flag 8 (0x9L): itemViewModel.model.realAmt
        flag 9 (0xaL): null
        flag 10 (0xbL): itemViewModel.model.isFold == 1 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): itemViewModel.model.isFold == 1 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
        flag 13 (0xeL): itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
        flag 14 (0xfL): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 15 (0x10L): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 16 (0x11L): itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
        flag 17 (0x12L): itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
        flag 18 (0x13L): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 19 (0x14L): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
        flag 21 (0x16L): itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}