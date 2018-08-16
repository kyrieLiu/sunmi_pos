package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVipSearchBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.up_rl, 12);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView9;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemVipMoney;
    @NonNull
    public final android.widget.RelativeLayout upRl;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.vip.VipSearchItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemVipSearchBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 8);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[1];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemVipMoney = (android.widget.TextView) bindings[8];
        this.tvItemVipMoney.setTag(null);
        this.upRl = (android.widget.RelativeLayout) bindings[12];
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
            setItemViewModel((ys.app.petproject.viewmodel.vip.VipSearchItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.vip.VipSearchItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.vip.VipSearchItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.vip.VipSearchItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelCreatShop((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelObAnimal4Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeItemViewModelObAnimal1Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeItemViewModelObAnimal2Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeItemViewModelObAnimal3Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeItemViewModelModel((ys.app.petproject.model.VipInfo) object, fieldId);
            case 7 :
                return onChangeItemViewModelMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.vip.VipSearchItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelCreatShop(android.databinding.ObservableField<java.lang.String> ItemViewModelCreatShop, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal4Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal4Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal1Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal1Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal2Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal2Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal3Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal3Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.VipInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelMoney(android.databinding.ObservableField<java.lang.String> ItemViewModelMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        java.lang.String itemViewModelObAnimal1NameGet = null;
        ys.app.petproject.viewmodel.vip.VipSearchItemViewModel itemViewModel = mItemViewModel;
        android.databinding.ObservableField<java.lang.String> itemViewModelCreatShop = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal4Name = null;
        java.lang.String itemViewModelObAnimal2NameGet = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal1Name = null;
        java.lang.String itemViewModelModelPhone = null;
        java.lang.String itemViewModelModelCardNo = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal2Name = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal3Name = null;
        java.lang.String itemViewModelObAnimal3NameGet = null;
        java.lang.String itemViewModelMoneyGet = null;
        boolean itemViewModelModelCardStateInt3 = false;
        ys.app.petproject.model.VipInfo itemViewModelModel = null;
        java.lang.String itemViewModelModelTypeName = null;
        int itemViewModelModelCardStateInt3ViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelModelName = null;
        java.lang.String itemViewModelCreatShopGet = null;
        java.lang.String itemViewModelObAnimal4NameGet = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelMoney = null;
        java.lang.String javaLangStringNOItemViewModelModelCardNo = null;
        int itemViewModelModelCardState = 0;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x103L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.creatShop
                        itemViewModelCreatShop = itemViewModel.creatShop;
                    }
                    updateRegistration(1, itemViewModelCreatShop);


                    if (itemViewModelCreatShop != null) {
                        // read itemViewModel.creatShop.get()
                        itemViewModelCreatShopGet = itemViewModelCreatShop.get();
                    }
            }
            if ((dirtyFlags & 0x105L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal4Name
                        itemViewModelObAnimal4Name = itemViewModel.obAnimal4Name;
                    }
                    updateRegistration(2, itemViewModelObAnimal4Name);


                    if (itemViewModelObAnimal4Name != null) {
                        // read itemViewModel.obAnimal4Name.get()
                        itemViewModelObAnimal4NameGet = itemViewModelObAnimal4Name.get();
                    }
            }
            if ((dirtyFlags & 0x109L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal1Name
                        itemViewModelObAnimal1Name = itemViewModel.obAnimal1Name;
                    }
                    updateRegistration(3, itemViewModelObAnimal1Name);


                    if (itemViewModelObAnimal1Name != null) {
                        // read itemViewModel.obAnimal1Name.get()
                        itemViewModelObAnimal1NameGet = itemViewModelObAnimal1Name.get();
                    }
            }
            if ((dirtyFlags & 0x111L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal2Name
                        itemViewModelObAnimal2Name = itemViewModel.obAnimal2Name;
                    }
                    updateRegistration(4, itemViewModelObAnimal2Name);


                    if (itemViewModelObAnimal2Name != null) {
                        // read itemViewModel.obAnimal2Name.get()
                        itemViewModelObAnimal2NameGet = itemViewModelObAnimal2Name.get();
                    }
            }
            if ((dirtyFlags & 0x121L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal3Name
                        itemViewModelObAnimal3Name = itemViewModel.obAnimal3Name;
                    }
                    updateRegistration(5, itemViewModelObAnimal3Name);


                    if (itemViewModelObAnimal3Name != null) {
                        // read itemViewModel.obAnimal3Name.get()
                        itemViewModelObAnimal3NameGet = itemViewModelObAnimal3Name.get();
                    }
            }
            if ((dirtyFlags & 0x141L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(6, itemViewModelModel);


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.phone
                        itemViewModelModelPhone = itemViewModelModel.getPhone();
                        // read itemViewModel.model.cardNo
                        itemViewModelModelCardNo = itemViewModelModel.getCardNo();
                        // read itemViewModel.model.typeName
                        itemViewModelModelTypeName = itemViewModelModel.getTypeName();
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                        // read itemViewModel.model.cardState
                        itemViewModelModelCardState = itemViewModelModel.getCardState();
                    }


                    // read ("NO:") + (itemViewModel.model.cardNo)
                    javaLangStringNOItemViewModelModelCardNo = ("NO:") + (itemViewModelModelCardNo);
                    // read itemViewModel.model.cardState == 3
                    itemViewModelModelCardStateInt3 = (itemViewModelModelCardState) == (3);
                if((dirtyFlags & 0x141L) != 0) {
                    if(itemViewModelModelCardStateInt3) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read itemViewModel.model.cardState == 3 ? View.VISIBLE : View.GONE
                    itemViewModelModelCardStateInt3ViewVISIBLEViewGONE = ((itemViewModelModelCardStateInt3) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x181L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.money
                        itemViewModelMoney = itemViewModel.money;
                    }
                    updateRegistration(7, itemViewModelMoney);


                    if (itemViewModelMoney != null) {
                        // read itemViewModel.money.get()
                        itemViewModelMoneyGet = itemViewModelMoney.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, javaLangStringNOItemViewModelModelCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelModelPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelTypeName);
            this.mboundView9.setVisibility(itemViewModelModelCardStateInt3ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x103L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, itemViewModelCreatShopGet);
        }
        if ((dirtyFlags & 0x109L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemViewModelObAnimal1NameGet);
        }
        if ((dirtyFlags & 0x111L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelObAnimal2NameGet);
        }
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, itemViewModelObAnimal3NameGet);
        }
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, itemViewModelObAnimal4NameGet);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemVipMoney, itemViewModelMoneyGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemVipSearchBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipSearchBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemVipSearchBinding>inflate(inflater, ys.app.petproject.R.layout.item_vip_search, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemVipSearchBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipSearchBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_vip_search, null, false), bindingComponent);
    }
    @NonNull
    public static ItemVipSearchBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipSearchBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_vip_search_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemVipSearchBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.creatShop
        flag 2 (0x3L): itemViewModel.obAnimal4Name
        flag 3 (0x4L): itemViewModel.obAnimal1Name
        flag 4 (0x5L): itemViewModel.obAnimal2Name
        flag 5 (0x6L): itemViewModel.obAnimal3Name
        flag 6 (0x7L): itemViewModel.model
        flag 7 (0x8L): itemViewModel.money
        flag 8 (0x9L): null
        flag 9 (0xaL): itemViewModel.model.cardState == 3 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): itemViewModel.model.cardState == 3 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}