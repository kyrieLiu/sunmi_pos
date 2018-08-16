package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGoodsBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll1, 18);
        sViewsWithIds.put(R.id.ll, 19);
        sViewsWithIds.put(R.id.danwei, 20);
        sViewsWithIds.put(R.id.rl0, 21);
        sViewsWithIds.put(R.id.vip_price_tv, 22);
        sViewsWithIds.put(R.id.r20, 23);
        sViewsWithIds.put(R.id.gg, 24);
        sViewsWithIds.put(R.id.kc, 25);
    }
    // views
    @NonNull
    public final android.widget.TextView danwei;
    @NonNull
    public final android.widget.TextView gg;
    @NonNull
    public final android.widget.TextView jine;
    @NonNull
    public final android.widget.TextView kc;
    @NonNull
    public final android.widget.TextView kutv;
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
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
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
    public final android.view.View view1;
    @NonNull
    public final android.widget.TextView vipPriceTv;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.GoodsItemViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback92;
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGoodsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds);
        this.danwei = (android.widget.TextView) bindings[20];
        this.gg = (android.widget.TextView) bindings[24];
        this.jine = (android.widget.TextView) bindings[5];
        this.jine.setTag(null);
        this.kc = (android.widget.TextView) bindings[25];
        this.kutv = (android.widget.TextView) bindings[17];
        this.kutv.setTag(null);
        this.ll = (android.widget.RelativeLayout) bindings[19];
        this.ll1 = (android.widget.LinearLayout) bindings[18];
        this.llPromotionTime = (android.widget.LinearLayout) bindings[12];
        this.llPromotionTime.setTag(null);
        this.mboundView1 = (ys.app.petproject.widget.RotateTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.primaryPriceTv = (android.widget.TextView) bindings[8];
        this.primaryPriceTv.setTag(null);
        this.promotion = (android.widget.TextView) bindings[15];
        this.promotion.setTag(null);
        this.r20 = (android.widget.RelativeLayout) bindings[23];
        this.rl0 = (android.widget.RelativeLayout) bindings[21];
        this.rl2 = (android.widget.RelativeLayout) bindings[4];
        this.rl2.setTag(null);
        this.rootView = (android.support.v7.widget.CardView) bindings[0];
        this.rootView.setTag(null);
        this.view = (android.view.View) bindings[14];
        this.view.setTag(null);
        this.view1 = (android.view.View) bindings[16];
        this.view1.setTag(null);
        this.vipPriceTv = (android.widget.TextView) bindings[22];
        setRootTag(root);
        // listeners
        mCallback92 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback93 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
            setItemViewModel((ys.app.petproject.viewmodel.GoodsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.GoodsItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.GoodsItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.GoodsItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelObRealMoneyColor((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeItemViewModelChuku((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeItemViewModelRuku((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeItemViewModelPromotionSetting((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeItemViewModelModel((ys.app.petproject.model.GoodInfo) object, fieldId);
            case 6 :
                return onChangeItemViewModelObRealMoneyBg((android.databinding.ObservableField<android.graphics.drawable.Drawable>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.GoodsItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
    private boolean onChangeItemViewModelChuku(android.databinding.ObservableBoolean ItemViewModelChuku, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelRuku(android.databinding.ObservableBoolean ItemViewModelRuku, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelPromotionSetting(android.databinding.ObservableBoolean ItemViewModelPromotionSetting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.GoodInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.isPromotion) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.realAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.unit) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObRealMoneyBg(android.databinding.ObservableField<android.graphics.drawable.Drawable> ItemViewModelObRealMoneyBg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        ys.app.petproject.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
        int itemViewModelModelIsFoldInt1ViewVISIBLEViewGONE = 0;
        boolean itemViewModelModelStockNumInt0 = false;
        int itemViewModelModelIsFold = 0;
        java.lang.String itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc = null;
        long itemViewModelModelEndTime = 0L;
        boolean itemViewModelModelIsFoldInt1 = false;
        android.databinding.ObservableField<java.lang.Integer> itemViewModelObRealMoneyColor = null;
        android.graphics.drawable.Drawable itemViewModelObRealMoneyBgGet = null;
        android.databinding.ObservableBoolean itemViewModelChuku = null;
        android.databinding.ObservableBoolean itemViewModelRuku = null;
        double itemViewModelModelRealAmt = 0.0;
        int itemViewModelModelIsPromotion = 0;
        java.lang.String itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        int itemViewModelModelPromotionType = 0;
        double itemViewModelModelVipAmt = 0.0;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelBeginTimeMboundView13AndroidStringBolanghao = null;
        boolean itemViewModelModelPromotionTypeInt2 = false;
        int itemViewModelModelStockNum = 0;
        android.databinding.ObservableBoolean itemViewModelPromotionSetting = null;
        java.lang.String itemViewModelRukuKutvAndroidStringRkItemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = null;
        int itemViewModelChukuViewVISIBLEViewGONE = 0;
        int itemViewModelModelStockNumInt0MboundView11AndroidColorTextYellowMboundView11AndroidColorTextTitle = 0;
        ys.app.petproject.model.GoodInfo itemViewModelModel = null;
        boolean itemViewModelPromotionSettingGet = false;
        int androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet = 0;
        java.lang.String jineAndroidStringRmbItemViewModelModelPromotionAmt = null;
        java.lang.String mboundView7AndroidStringRmbItemViewModelModelVipAmt = null;
        java.lang.String itemViewModelModelUnit = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNum = null;
        java.lang.String mboundView9AndroidStringRmbItemViewModelModelRealAmt = null;
        boolean itemViewModelRukuGet = false;
        long itemViewModelModelBeginTime = 0L;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelEndTime = null;
        java.lang.String itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc = null;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelBeginTime = null;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelBeginTimeMboundView13AndroidStringBolanghaoAppUtilLongToStandardTimeItemViewModelModelEndTime = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String itemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = null;
        boolean itemViewModelChukuGet = false;
        int itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = 0;
        int itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<android.graphics.drawable.Drawable> itemViewModelObRealMoneyBg = null;
        boolean itemViewModelModelIsPromotionInt1 = false;
        double itemViewModelModelPromotionNum = 0.0;
        int itemViewModelPromotionSettingViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfItemViewModelModelStockNum = null;
        java.lang.Integer itemViewModelObRealMoneyColorGet = null;
        double itemViewModelModelPromotionAmt = 0.0;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1003L) != 0) {

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
            if ((dirtyFlags & 0x100dL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.ruku
                        itemViewModelRuku = itemViewModel.ruku;
                    }
                    updateRegistration(3, itemViewModelRuku);


                    if (itemViewModelRuku != null) {
                        // read itemViewModel.ruku.get()
                        itemViewModelRukuGet = itemViewModelRuku.get();
                    }
                if((dirtyFlags & 0x100dL) != 0) {
                    if(itemViewModelRukuGet) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x80000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x10b1L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.promotionSetting
                        itemViewModelPromotionSetting = itemViewModel.promotionSetting;
                    }
                    updateRegistration(4, itemViewModelPromotionSetting);


                    if (itemViewModelPromotionSetting != null) {
                        // read itemViewModel.promotionSetting.get()
                        itemViewModelPromotionSettingGet = itemViewModelPromotionSetting.get();
                    }
                if((dirtyFlags & 0x10b1L) != 0) {
                    if(itemViewModelPromotionSettingGet) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x1011L) != 0) {
                    if(itemViewModelPromotionSettingGet) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }

                if ((dirtyFlags & 0x1011L) != 0) {

                        // read itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
                        itemViewModelPromotionSettingViewVISIBLEViewGONE = ((itemViewModelPromotionSettingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x1fa1L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(5, itemViewModelModel);

                if ((dirtyFlags & 0x1021L) != 0) {

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
                        mboundView7AndroidStringRmbItemViewModelModelVipAmt = (mboundView7.getResources().getString(R.string.rmb)) + (itemViewModelModelVipAmt);
                        // read AppUtil.longToStandardTime(itemViewModel.model.beginTime)
                        appUtilLongToStandardTimeItemViewModelModelBeginTime = ys.app.petproject.utils.AppUtil.longToStandardTime(itemViewModelModelBeginTime);
                        // read (@android:string/rmb) + (itemViewModel.model.promotionAmt)
                        jineAndroidStringRmbItemViewModelModelPromotionAmt = (jine.getResources().getString(R.string.rmb)) + (itemViewModelModelPromotionAmt);
                    if((dirtyFlags & 0x1021L) != 0) {
                        if(itemViewModelModelIsFoldInt1) {
                                dirtyFlags |= 0x4000L;
                        }
                        else {
                                dirtyFlags |= 0x2000L;
                        }
                    }
                    if((dirtyFlags & 0x1021L) != 0) {
                        if(itemViewModelModelPromotionTypeInt2) {
                                dirtyFlags |= 0x40000L;
                        }
                        else {
                                dirtyFlags |= 0x20000L;
                        }
                    }


                        // read itemViewModel.model.isFold == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsFoldInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsFoldInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read (AppUtil.longToStandardTime(itemViewModel.model.beginTime)) + (@android:string/bolanghao)
                        appUtilLongToStandardTimeItemViewModelModelBeginTimeMboundView13AndroidStringBolanghao = (appUtilLongToStandardTimeItemViewModelModelBeginTime) + (mboundView13.getResources().getString(R.string.bolanghao));


                        // read ((AppUtil.longToStandardTime(itemViewModel.model.beginTime)) + (@android:string/bolanghao)) + (AppUtil.longToStandardTime(itemViewModel.model.endTime))
                        appUtilLongToStandardTimeItemViewModelModelBeginTimeMboundView13AndroidStringBolanghaoAppUtilLongToStandardTimeItemViewModelModelEndTime = (appUtilLongToStandardTimeItemViewModelModelBeginTimeMboundView13AndroidStringBolanghao) + (appUtilLongToStandardTimeItemViewModelModelEndTime);
                }
                if ((dirtyFlags & 0x1221L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.realAmt
                            itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                        }


                        // read (@android:string/rmb) + (itemViewModel.model.realAmt)
                        mboundView9AndroidStringRmbItemViewModelModelRealAmt = (mboundView9.getResources().getString(R.string.rmb)) + (itemViewModelModelRealAmt);
                }
                if ((dirtyFlags & 0x10a1L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.isPromotion
                            itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                        }


                        // read itemViewModel.model.isPromotion == 1
                        itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                    if((dirtyFlags & 0x10000L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x4000000L;
                        }
                        else {
                                dirtyFlags |= 0x2000000L;
                        }
                    }
                    if((dirtyFlags & 0x10a1L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x40000000L;
                        }
                        else {
                                dirtyFlags |= 0x20000000L;
                        }
                    }


                        // read itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsPromotionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x1821L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.stockNum
                            itemViewModelModelStockNum = itemViewModelModel.getStockNum();
                        }


                        // read itemViewModel.model.stockNum == 0
                        itemViewModelModelStockNumInt0 = (itemViewModelModelStockNum) == (0);
                        // read String.valueOf(itemViewModel.model.stockNum)
                        stringValueOfItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelStockNum);
                    if((dirtyFlags & 0x1821L) != 0) {
                        if(itemViewModelModelStockNumInt0) {
                                dirtyFlags |= 0x1000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000L;
                        }
                    }


                        // read itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/text_title
                        itemViewModelModelStockNumInt0MboundView11AndroidColorTextYellowMboundView11AndroidColorTextTitle = ((itemViewModelModelStockNumInt0) ? (getColorFromResource(mboundView11, R.color.text_yellow)) : (getColorFromResource(mboundView11, R.color.text_title)));
                }
                if ((dirtyFlags & 0x1421L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.unit
                            itemViewModelModelUnit = itemViewModelModel.getUnit();
                        }
                }
                if ((dirtyFlags & 0x1121L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                        }
                }
            }
            if ((dirtyFlags & 0x1041L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obRealMoneyBg
                        itemViewModelObRealMoneyBg = itemViewModel.obRealMoneyBg;
                    }
                    updateRegistration(6, itemViewModelObRealMoneyBg);


                    if (itemViewModelObRealMoneyBg != null) {
                        // read itemViewModel.obRealMoneyBg.get()
                        itemViewModelObRealMoneyBgGet = itemViewModelObRealMoneyBg.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80080000L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.chuku
                    itemViewModelChuku = itemViewModel.chuku;
                }
                updateRegistration(2, itemViewModelChuku);


                if (itemViewModelChuku != null) {
                    // read itemViewModel.chuku.get()
                    itemViewModelChukuGet = itemViewModelChuku.get();
                }
            if((dirtyFlags & 0x80000000L) != 0) {
                if(itemViewModelChukuGet) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
            if((dirtyFlags & 0x80000L) != 0) {
                if(itemViewModelChukuGet) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }

            if ((dirtyFlags & 0x80000000L) != 0) {

                    // read itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
                    itemViewModelChukuViewVISIBLEViewGONE = ((itemViewModelChukuGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x80000L) != 0) {

                    // read itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
                    itemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = ((itemViewModelChukuGet) ? (kutv.getResources().getString(R.string.ck)) : (kutv.getResources().getString(R.string.ck)));
            }
        }
        if ((dirtyFlags & 0x30000L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(5, itemViewModelModel);

            if ((dirtyFlags & 0x10000L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                    }


                    // read itemViewModel.model.isPromotion == 1
                    itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                if((dirtyFlags & 0x10000L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x10a1L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
                    itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc = ((itemViewModelModelIsPromotionInt1) ? (promotion.getResources().getString(R.string.rjrxc)) : (promotion.getResources().getString(R.string.jrxc)));
            }
            if ((dirtyFlags & 0x20000L) != 0) {

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

        if ((dirtyFlags & 0x10b1L) != 0) {

                // read itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
                itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc = ((itemViewModelPromotionSettingGet) ? (itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc) : (promotion.getResources().getString(R.string.jrxc)));
        }
        if ((dirtyFlags & 0x1021L) != 0) {

                // read itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe = ((itemViewModelModelPromotionTypeInt2) ? (mboundView1.getResources().getString(R.string.lijian)) : (appUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe));
        }
        if ((dirtyFlags & 0x100dL) != 0) {

                // read itemViewModel.ruku.get() ? @android:string/rk : itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
                itemViewModelRukuKutvAndroidStringRkItemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = ((itemViewModelRukuGet) ? (kutv.getResources().getString(R.string.rk)) : (itemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk));
                // read itemViewModel.ruku.get() ? View.VISIBLE : itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
                itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE = ((itemViewModelRukuGet) ? (android.view.View.VISIBLE) : (itemViewModelChukuViewVISIBLEViewGONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1021L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.jine, jineAndroidStringRmbItemViewModelModelPromotionAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumMboundView1AndroidStringZhe);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, appUtilLongToStandardTimeItemViewModelModelBeginTimeMboundView13AndroidStringBolanghaoAppUtilLongToStandardTimeItemViewModelModelEndTime);
            this.mboundView6.setVisibility(itemViewModelModelIsFoldInt1ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringRmbItemViewModelModelVipAmt);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.kutv.setOnClickListener(mCallback93);
            this.promotion.setOnClickListener(mCallback92);
        }
        if ((dirtyFlags & 0x100dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.kutv, itemViewModelRukuKutvAndroidStringRkItemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk);
            this.kutv.setVisibility(itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE);
            this.view1.setVisibility(itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10a1L) != 0) {
            // api target 1

            this.llPromotionTime.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView1.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.rl2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1421L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, itemViewModelModelUnit);
        }
        if ((dirtyFlags & 0x1821L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, stringValueOfItemViewModelModelStockNum);
            this.mboundView11.setTextColor(itemViewModelModelStockNumInt0MboundView11AndroidColorTextYellowMboundView11AndroidColorTextTitle);
        }
        if ((dirtyFlags & 0x1121L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x1221L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, mboundView9AndroidStringRmbItemViewModelModelRealAmt);
        }
        if ((dirtyFlags & 0x1003L) != 0) {
            // api target 1

            this.mboundView9.setTextColor(androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet);
            this.primaryPriceTv.setTextColor(androidDatabindingDynamicUtilSafeUnboxItemViewModelObRealMoneyColorGet);
        }
        if ((dirtyFlags & 0x1041L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView9, itemViewModelObRealMoneyBgGet);
        }
        if ((dirtyFlags & 0x10b1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.promotion, itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc);
        }
        if ((dirtyFlags & 0x1011L) != 0) {
            // api target 1

            this.promotion.setVisibility(itemViewModelPromotionSettingViewVISIBLEViewGONE);
            this.view.setVisibility(itemViewModelPromotionSettingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.petproject.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.promotionClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.petproject.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.kuClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemGoodsBinding>inflate(inflater, ys.app.petproject.R.layout.item_goods, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_goods, null, false), bindingComponent);
    }
    @NonNull
    public static ItemGoodsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_goods_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemGoodsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.obRealMoneyColor
        flag 2 (0x3L): itemViewModel.chuku
        flag 3 (0x4L): itemViewModel.ruku
        flag 4 (0x5L): itemViewModel.promotionSetting
        flag 5 (0x6L): itemViewModel.model
        flag 6 (0x7L): itemViewModel.obRealMoneyBg
        flag 7 (0x8L): itemViewModel.model.isPromotion
        flag 8 (0x9L): itemViewModel.model.name
        flag 9 (0xaL): itemViewModel.model.realAmt
        flag 10 (0xbL): itemViewModel.model.unit
        flag 11 (0xcL): itemViewModel.model.stockNum
        flag 12 (0xdL): null
        flag 13 (0xeL): itemViewModel.model.isFold == 1 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): itemViewModel.model.isFold == 1 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
        flag 16 (0x11L): itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
        flag 17 (0x12L): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 18 (0x13L): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 19 (0x14L): itemViewModel.ruku.get() ? @android:string/rk : itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 20 (0x15L): itemViewModel.ruku.get() ? @android:string/rk : itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 21 (0x16L): itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 22 (0x17L): itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 23 (0x18L): itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/text_title
        flag 24 (0x19L): itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/text_title
        flag 25 (0x1aL): itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
        flag 26 (0x1bL): itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
        flag 27 (0x1cL): itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 28 (0x1dL): itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 29 (0x1eL): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 31 (0x20L): itemViewModel.ruku.get() ? View.VISIBLE : itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 32 (0x21L): itemViewModel.ruku.get() ? View.VISIBLE : itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 33 (0x22L): itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
        flag 34 (0x23L): itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}