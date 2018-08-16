package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGoodsSearchBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll1, 10);
        sViewsWithIds.put(R.id.rl2, 11);
        sViewsWithIds.put(R.id.danwei, 12);
        sViewsWithIds.put(R.id.gg, 13);
        sViewsWithIds.put(R.id.kc, 14);
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
    public final android.widget.LinearLayout ll1;
    @NonNull
    private final ys.app.petproject.widget.RotateTextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.RelativeLayout rl2;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.GoodsSearchItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemGoodsSearchBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.danwei = (android.widget.TextView) bindings[12];
        this.gg = (android.widget.TextView) bindings[13];
        this.jine = (android.widget.TextView) bindings[4];
        this.jine.setTag(null);
        this.kc = (android.widget.TextView) bindings[14];
        this.ll1 = (android.widget.LinearLayout) bindings[10];
        this.mboundView1 = (ys.app.petproject.widget.RotateTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.rl2 = (android.widget.RelativeLayout) bindings[11];
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setItemViewModel((ys.app.petproject.viewmodel.GoodsSearchItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.GoodsSearchItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.GoodsSearchItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.GoodsSearchItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelCostPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.petproject.model.GoodInfo) object, fieldId);
            case 3 :
                return onChangeItemViewModelPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.GoodsSearchItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelCostPrice(android.databinding.ObservableField<java.lang.String> ItemViewModelCostPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.GoodInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.isPromotion) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.unit) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelPrice(android.databinding.ObservableField<java.lang.String> ItemViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String itemViewModelCostPriceGet = null;
        java.lang.String itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianItemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        ys.app.petproject.viewmodel.GoodsSearchItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelCostPrice = null;
        int itemViewModelModelIsPromotion = 0;
        int itemViewModelModelPromotionType = 0;
        android.view.View.OnClickListener itemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener = null;
        boolean itemViewModelModelPromotionTypeInt2 = false;
        java.lang.String mboundView6AndroidStringRmbItemViewModelPrice = null;
        int itemViewModelModelStockNum = 0;
        ys.app.petproject.model.GoodInfo itemViewModelModel = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelPrice = null;
        java.lang.String itemViewModelModelUnit = null;
        java.lang.String itemViewModelModelIsPromotionInt1ItemViewModelCostPriceItemViewModelPrice = null;
        java.lang.String itemViewModelPriceGet = null;
        java.lang.String itemViewModelModelName = null;
        int itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = 0;
        boolean itemViewModelModelIsPromotionInt1 = false;
        double itemViewModelModelPromotionNum = 0.0;
        java.lang.String stringValueOfItemViewModelModelStockNum = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x101L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::clickAddShoppingButton
                        itemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener = (((mItemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener == null) ? (mItemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(2, itemViewModelModel);

            if ((dirtyFlags & 0x11fL) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                    }


                    // read itemViewModel.model.isPromotion == 1
                    itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                if((dirtyFlags & 0x11fL) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x115L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }

                if ((dirtyFlags & 0x115L) != 0) {

                        // read itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsPromotionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x105L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.promotionType
                        itemViewModelModelPromotionType = itemViewModelModel.getPromotionType();
                    }


                    // read itemViewModel.model.promotionType == 2
                    itemViewModelModelPromotionTypeInt2 = (itemViewModelModelPromotionType) == (2);
                if((dirtyFlags & 0x105L) != 0) {
                    if(itemViewModelModelPromotionTypeInt2) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
            }
            if ((dirtyFlags & 0x185L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.stockNum
                        itemViewModelModelStockNum = itemViewModelModel.getStockNum();
                    }


                    // read String.valueOf(itemViewModel.model.stockNum)
                    stringValueOfItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelStockNum);
            }
            if ((dirtyFlags & 0x145L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.unit
                        itemViewModelModelUnit = itemViewModelModel.getUnit();
                    }
            }
            if ((dirtyFlags & 0x125L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                    }
            }
            if ((dirtyFlags & 0x109L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.price
                        itemViewModelPrice = itemViewModel.price;
                    }
                    updateRegistration(3, itemViewModelPrice);


                    if (itemViewModelPrice != null) {
                        // read itemViewModel.price.get()
                        itemViewModelPriceGet = itemViewModelPrice.get();
                    }


                    // read (@android:string/rmb) + (itemViewModel.price.get())
                    mboundView6AndroidStringRmbItemViewModelPrice = (mboundView6.getResources().getString(R.string.rmb)) + (itemViewModelPriceGet);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.costPrice
                    itemViewModelCostPrice = itemViewModel.costPrice;
                }
                updateRegistration(1, itemViewModelCostPrice);


                if (itemViewModelCostPrice != null) {
                    // read itemViewModel.costPrice.get()
                    itemViewModelCostPriceGet = itemViewModelCostPrice.get();
                }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.price
                    itemViewModelPrice = itemViewModel.price;
                }
                updateRegistration(3, itemViewModelPrice);


                if (itemViewModelPrice != null) {
                    // read itemViewModel.price.get()
                    itemViewModelPriceGet = itemViewModelPrice.get();
                }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.promotionNum
                    itemViewModelModelPromotionNum = itemViewModelModel.getPromotionNum();
                }


                // read (itemViewModel.model.promotionNum) + (@android:string/zhe)
                itemViewModelModelPromotionNumMboundView1AndroidStringZhe = (itemViewModelModelPromotionNum) + (mboundView1.getResources().getString(R.string.zhe));
        }

        if ((dirtyFlags & 0x105L) != 0) {

                // read itemViewModel.model.promotionType == 2 ? @android:string/lijian : (itemViewModel.model.promotionNum) + (@android:string/zhe)
                itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianItemViewModelModelPromotionNumMboundView1AndroidStringZhe = ((itemViewModelModelPromotionTypeInt2) ? (mboundView1.getResources().getString(R.string.lijian)) : (itemViewModelModelPromotionNumMboundView1AndroidStringZhe));
        }
        if ((dirtyFlags & 0x11fL) != 0) {

                // read itemViewModel.model.isPromotion == 1 ? itemViewModel.costPrice.get() : itemViewModel.price.get()
                itemViewModelModelIsPromotionInt1ItemViewModelCostPriceItemViewModelPrice = ((itemViewModelModelIsPromotionInt1) ? (itemViewModelCostPriceGet) : (itemViewModelPriceGet));
        }
        // batch finished
        if ((dirtyFlags & 0x11fL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.jine, itemViewModelModelIsPromotionInt1ItemViewModelCostPriceItemViewModelPrice);
        }
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianItemViewModelModelPromotionNumMboundView1AndroidStringZhe);
        }
        if ((dirtyFlags & 0x115L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x125L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x109L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mboundView6AndroidStringRmbItemViewModelPrice);
        }
        if ((dirtyFlags & 0x145L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, itemViewModelModelUnit);
        }
        if ((dirtyFlags & 0x185L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, stringValueOfItemViewModelModelStockNum);
        }
        if ((dirtyFlags & 0x101L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(itemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.GoodsSearchItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.GoodsSearchItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickAddShoppingButton(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemGoodsSearchBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsSearchBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemGoodsSearchBinding>inflate(inflater, ys.app.petproject.R.layout.item_goods_search, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemGoodsSearchBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsSearchBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_goods_search, null, false), bindingComponent);
    }
    @NonNull
    public static ItemGoodsSearchBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsSearchBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_goods_search_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemGoodsSearchBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.costPrice
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.price
        flag 4 (0x5L): itemViewModel.model.isPromotion
        flag 5 (0x6L): itemViewModel.model.name
        flag 6 (0x7L): itemViewModel.model.unit
        flag 7 (0x8L): itemViewModel.model.stockNum
        flag 8 (0x9L): null
        flag 9 (0xaL): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (itemViewModel.model.promotionNum) + (@android:string/zhe)
        flag 10 (0xbL): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (itemViewModel.model.promotionNum) + (@android:string/zhe)
        flag 11 (0xcL): itemViewModel.model.isPromotion == 1 ? itemViewModel.costPrice.get() : itemViewModel.price.get()
        flag 12 (0xdL): itemViewModel.model.isPromotion == 1 ? itemViewModel.costPrice.get() : itemViewModel.price.get()
        flag 13 (0xeL): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}