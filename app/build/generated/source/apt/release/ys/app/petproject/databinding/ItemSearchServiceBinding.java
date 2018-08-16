package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSearchServiceBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll1, 9);
        sViewsWithIds.put(R.id.rl2, 10);
        sViewsWithIds.put(R.id.danwei, 11);
    }
    // views
    @NonNull
    public final android.widget.TextView danwei;
    @NonNull
    public final android.widget.TextView jine;
    @NonNull
    public final android.widget.LinearLayout ll1;
    @NonNull
    private final ys.app.petproject.widget.RotateTextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    public final android.widget.RelativeLayout rl2;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.SearchServiceItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemSearchServiceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.danwei = (android.widget.TextView) bindings[11];
        this.jine = (android.widget.TextView) bindings[5];
        this.jine.setTag(null);
        this.ll1 = (android.widget.LinearLayout) bindings[9];
        this.mboundView1 = (ys.app.petproject.widget.RotateTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.rl2 = (android.widget.RelativeLayout) bindings[10];
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setItemViewModel((ys.app.petproject.viewmodel.SearchServiceItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.SearchServiceItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.SearchServiceItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.SearchServiceItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelCostPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.petproject.model.ServiceInfo) object, fieldId);
            case 3 :
                return onChangeItemViewModelPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.SearchServiceItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.ServiceInfo ItemViewModelModel, int fieldId) {
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
        else if (fieldId == BR.typeName) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        ys.app.petproject.viewmodel.SearchServiceItemViewModel itemViewModel = mItemViewModel;
        java.lang.String mboundView4AndroidStringZkhItemViewModelModelTypeName = null;
        java.lang.String itemViewModelModelPromotionNumMboundView1AndroidStringZhe = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelCostPrice = null;
        int itemViewModelModelIsPromotion = 0;
        int itemViewModelModelPromotionType = 0;
        android.view.View.OnClickListener itemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener = null;
        boolean itemViewModelModelPromotionTypeInt2 = false;
        ys.app.petproject.model.ServiceInfo itemViewModelModel = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelPrice = null;
        java.lang.String itemViewModelModelIsPromotionInt1ItemViewModelCostPriceItemViewModelPrice = null;
        java.lang.String itemViewModelModelTypeName = null;
        java.lang.String itemViewModelPriceGet = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String mboundView4AndroidStringZkhItemViewModelModelTypeNameMboundView4AndroidStringYkh = null;
        int itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = 0;
        boolean itemViewModelModelIsPromotionInt1 = false;
        java.lang.String mboundView7AndroidStringRmbItemViewModelPrice = null;
        double itemViewModelModelPromotionNum = 0.0;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x81L) != 0) {

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

            if ((dirtyFlags & 0x9fL) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                    }


                    // read itemViewModel.model.isPromotion == 1
                    itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                if((dirtyFlags & 0x9fL) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x95L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }

                if ((dirtyFlags & 0x95L) != 0) {

                        // read itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsPromotionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x85L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.promotionType
                        itemViewModelModelPromotionType = itemViewModelModel.getPromotionType();
                    }


                    // read itemViewModel.model.promotionType == 2
                    itemViewModelModelPromotionTypeInt2 = (itemViewModelModelPromotionType) == (2);
                if((dirtyFlags & 0x85L) != 0) {
                    if(itemViewModelModelPromotionTypeInt2) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0xc5L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.typeName
                        itemViewModelModelTypeName = itemViewModelModel.getTypeName();
                    }


                    // read (@android:string/zkh) + (itemViewModel.model.typeName)
                    mboundView4AndroidStringZkhItemViewModelModelTypeName = (mboundView4.getResources().getString(R.string.zkh)) + (itemViewModelModelTypeName);


                    // read ((@android:string/zkh) + (itemViewModel.model.typeName)) + (@android:string/ykh)
                    mboundView4AndroidStringZkhItemViewModelModelTypeNameMboundView4AndroidStringYkh = (mboundView4AndroidStringZkhItemViewModelModelTypeName) + (mboundView4.getResources().getString(R.string.ykh));
            }
            if ((dirtyFlags & 0xa5L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                    }
            }
            if ((dirtyFlags & 0x89L) != 0) {

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
                    mboundView7AndroidStringRmbItemViewModelPrice = (mboundView7.getResources().getString(R.string.rmb)) + (itemViewModelPriceGet);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {

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
        if ((dirtyFlags & 0x400L) != 0) {

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
        if ((dirtyFlags & 0x100L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.promotionNum
                    itemViewModelModelPromotionNum = itemViewModelModel.getPromotionNum();
                }


                // read (itemViewModel.model.promotionNum) + (@android:string/zhe)
                itemViewModelModelPromotionNumMboundView1AndroidStringZhe = (itemViewModelModelPromotionNum) + (mboundView1.getResources().getString(R.string.zhe));
        }

        if ((dirtyFlags & 0x85L) != 0) {

                // read itemViewModel.model.promotionType == 2 ? @android:string/lijian : (itemViewModel.model.promotionNum) + (@android:string/zhe)
                itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianItemViewModelModelPromotionNumMboundView1AndroidStringZhe = ((itemViewModelModelPromotionTypeInt2) ? (mboundView1.getResources().getString(R.string.lijian)) : (itemViewModelModelPromotionNumMboundView1AndroidStringZhe));
        }
        if ((dirtyFlags & 0x9fL) != 0) {

                // read itemViewModel.model.isPromotion == 1 ? itemViewModel.costPrice.get() : itemViewModel.price.get()
                itemViewModelModelIsPromotionInt1ItemViewModelCostPriceItemViewModelPrice = ((itemViewModelModelIsPromotionInt1) ? (itemViewModelCostPriceGet) : (itemViewModelPriceGet));
        }
        // batch finished
        if ((dirtyFlags & 0x9fL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.jine, itemViewModelModelIsPromotionInt1ItemViewModelCostPriceItemViewModelPrice);
        }
        if ((dirtyFlags & 0x85L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelPromotionTypeInt2MboundView1AndroidStringLijianItemViewModelModelPromotionNumMboundView1AndroidStringZhe);
        }
        if ((dirtyFlags & 0x95L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelName);
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mboundView4AndroidStringZkhItemViewModelModelTypeNameMboundView4AndroidStringYkh);
        }
        if ((dirtyFlags & 0x89L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringRmbItemViewModelPrice);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(itemViewModelClickAddShoppingButtonAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.SearchServiceItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.SearchServiceItemViewModel value) {
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
    public static ItemSearchServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemSearchServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemSearchServiceBinding>inflate(inflater, ys.app.petproject.R.layout.item_search_service, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemSearchServiceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemSearchServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_search_service, null, false), bindingComponent);
    }
    @NonNull
    public static ItemSearchServiceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemSearchServiceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_search_service_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemSearchServiceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.costPrice
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.price
        flag 4 (0x5L): itemViewModel.model.isPromotion
        flag 5 (0x6L): itemViewModel.model.name
        flag 6 (0x7L): itemViewModel.model.typeName
        flag 7 (0x8L): null
        flag 8 (0x9L): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (itemViewModel.model.promotionNum) + (@android:string/zhe)
        flag 9 (0xaL): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (itemViewModel.model.promotionNum) + (@android:string/zhe)
        flag 10 (0xbL): itemViewModel.model.isPromotion == 1 ? itemViewModel.costPrice.get() : itemViewModel.price.get()
        flag 11 (0xcL): itemViewModel.model.isPromotion == 1 ? itemViewModel.costPrice.get() : itemViewModel.price.get()
        flag 12 (0xdL): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}