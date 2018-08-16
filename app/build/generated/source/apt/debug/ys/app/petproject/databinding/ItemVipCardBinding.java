package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVipCardBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.option_lay, 14);
    }
    // views
    @NonNull
    public final android.widget.Button btVipCardCancellation;
    @NonNull
    public final android.widget.Button btVipCardDelete;
    @NonNull
    public final android.widget.Button btVipCardSelect;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView9;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.LinearLayout optionLay;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.VipCardItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelEditAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mItemViewModelDeleteAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mItemViewModelSetAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mItemViewModelObsoleteAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mItemViewModelCardMembersAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemVipCardBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.btVipCardCancellation = (android.widget.Button) bindings[5];
        this.btVipCardCancellation.setTag(null);
        this.btVipCardDelete = (android.widget.Button) bindings[6];
        this.btVipCardDelete.setTag(null);
        this.btVipCardSelect = (android.widget.Button) bindings[7];
        this.btVipCardSelect.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.support.v7.widget.RecyclerView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.support.v7.widget.RecyclerView) bindings[9];
        this.mboundView9.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[2];
        this.nameTv.setTag(null);
        this.optionLay = (android.widget.LinearLayout) bindings[14];
        this.rootView = (android.widget.LinearLayout) bindings[0];
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
            setItemViewModel((ys.app.petproject.viewmodel.manage.VipCardItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.manage.VipCardItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.VipCardItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.manage.VipCardItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelObShowType((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeItemViewModelObIsInput((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeItemViewModelObIsIsAddVipCard((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeItemViewModelModel((ys.app.petproject.model.VipCardInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.manage.VipCardItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObShowType(android.databinding.ObservableInt ItemViewModelObShowType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObIsInput(android.databinding.ObservableBoolean ItemViewModelObIsInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObIsIsAddVipCard(android.databinding.ObservableBoolean ItemViewModelObIsIsAddVipCard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.VipCardInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.isClick) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.expand) {
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
        android.view.View.OnClickListener itemViewModelEditAndroidViewViewOnClickListener = null;
        java.util.List<ys.app.petproject.model.ServiceTypeInfo> itemViewModelModelCardDiscountList2 = null;
        android.view.View.OnClickListener itemViewModelDeleteAndroidViewViewOnClickListener = null;
        boolean itemViewModelModelStateInt3 = false;
        ys.app.petproject.viewmodel.manage.VipCardItemViewModel itemViewModel = mItemViewModel;
        java.util.List<ys.app.petproject.model.GoodTypeInfo> itemViewModelModelCardDiscountList = null;
        android.databinding.ObservableInt itemViewModelObShowType = null;
        int itemViewModelObShowTypeInt1ViewVISIBLEViewGONE = 0;
        boolean itemViewModelModelClassificationInt2 = false;
        boolean ItemViewModelModelClassificationInt21 = false;
        android.view.View.OnClickListener itemViewModelSetAndroidViewViewOnClickListener = null;
        boolean itemViewModelObShowTypeInt1 = false;
        android.view.View.OnClickListener itemViewModelObsoleteAndroidViewViewOnClickListener = null;
        int itemViewModelModelState = 0;
        android.databinding.ObservableBoolean itemViewModelObIsInput = null;
        boolean itemViewModelObShowTypeInt0 = false;
        int itemViewModelModelStateInt3ViewGONEViewVISIBLE = 0;
        android.databinding.ObservableBoolean itemViewModelObIsIsAddVipCard = null;
        ys.app.petproject.model.VipCardInfo itemViewModelModel = null;
        int itemViewModelObShowTypeInt0ViewVISIBLEViewGONE = 0;
        boolean itemViewModelModelExpand = false;
        int itemViewModelObShowTypeGet = 0;
        int itemViewModelViewCount = 0;
        int itemViewModelModelIsClick = 0;
        java.lang.String itemViewModelModelName = null;
        android.view.View.OnClickListener itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = null;
        boolean itemViewModelObIsInputGet = false;
        int itemViewModelModelClassificationInt2ViewGONEViewVISIBLE = 0;
        int itemViewModelModelClassification = 0;
        android.view.View.OnClickListener itemViewModelCardMembersAndroidViewViewOnClickListener = null;
        boolean itemViewModelObIsIsAddVipCardGet = false;
        int itemViewModelModelClassificationInt2ViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x81L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::edit
                        itemViewModelEditAndroidViewViewOnClickListener = (((mItemViewModelEditAndroidViewViewOnClickListener == null) ? (mItemViewModelEditAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelEditAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::delete
                        itemViewModelDeleteAndroidViewViewOnClickListener = (((mItemViewModelDeleteAndroidViewViewOnClickListener == null) ? (mItemViewModelDeleteAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mItemViewModelDeleteAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::set
                        itemViewModelSetAndroidViewViewOnClickListener = (((mItemViewModelSetAndroidViewViewOnClickListener == null) ? (mItemViewModelSetAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mItemViewModelSetAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::obsolete
                        itemViewModelObsoleteAndroidViewViewOnClickListener = (((mItemViewModelObsoleteAndroidViewViewOnClickListener == null) ? (mItemViewModelObsoleteAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mItemViewModelObsoleteAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::clickOpenOrClose
                        itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = (((mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener == null) ? (mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::cardMembers
                        itemViewModelCardMembersAndroidViewViewOnClickListener = (((mItemViewModelCardMembersAndroidViewViewOnClickListener == null) ? (mItemViewModelCardMembersAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mItemViewModelCardMembersAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }
            if ((dirtyFlags & 0x83L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obShowType
                        itemViewModelObShowType = itemViewModel.obShowType;
                    }
                    updateRegistration(1, itemViewModelObShowType);


                    if (itemViewModelObShowType != null) {
                        // read itemViewModel.obShowType.get()
                        itemViewModelObShowTypeGet = itemViewModelObShowType.get();
                    }


                    // read itemViewModel.obShowType.get() == 1
                    itemViewModelObShowTypeInt1 = (itemViewModelObShowTypeGet) == (1);
                    // read itemViewModel.obShowType.get() == 0
                    itemViewModelObShowTypeInt0 = (itemViewModelObShowTypeGet) == (0);
                if((dirtyFlags & 0x83L) != 0) {
                    if(itemViewModelObShowTypeInt1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x83L) != 0) {
                    if(itemViewModelObShowTypeInt0) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read itemViewModel.obShowType.get() == 1 ? View.VISIBLE : View.GONE
                    itemViewModelObShowTypeInt1ViewVISIBLEViewGONE = ((itemViewModelObShowTypeInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read itemViewModel.obShowType.get() == 0 ? View.VISIBLE : View.GONE
                    itemViewModelObShowTypeInt0ViewVISIBLEViewGONE = ((itemViewModelObShowTypeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x9dL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obIsInput
                        itemViewModelObIsInput = itemViewModel.obIsInput;
                        // read itemViewModel.obIsIsAddVipCard
                        itemViewModelObIsIsAddVipCard = itemViewModel.obIsIsAddVipCard;
                    }
                    updateRegistration(2, itemViewModelObIsInput);
                    updateRegistration(3, itemViewModelObIsIsAddVipCard);


                    if (itemViewModelObIsInput != null) {
                        // read itemViewModel.obIsInput.get()
                        itemViewModelObIsInputGet = itemViewModelObIsInput.get();
                    }
                    if (itemViewModelObIsIsAddVipCard != null) {
                        // read itemViewModel.obIsIsAddVipCard.get()
                        itemViewModelObIsIsAddVipCardGet = itemViewModelObIsIsAddVipCard.get();
                    }
            }
            if ((dirtyFlags & 0xfdL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(4, itemViewModelModel);

                if ((dirtyFlags & 0x9dL) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.cardDiscountList2
                            itemViewModelModelCardDiscountList2 = itemViewModelModel.getCardDiscountList2();
                            // read itemViewModel.model.cardDiscountList
                            itemViewModelModelCardDiscountList = itemViewModelModel.getCardDiscountList();
                        }
                }
                if ((dirtyFlags & 0x91L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.state
                            itemViewModelModelState = itemViewModelModel.getState();
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                            // read itemViewModel.model.classification
                            itemViewModelModelClassification = itemViewModelModel.getClassification();
                        }


                        // read itemViewModel.model.state == 3
                        itemViewModelModelStateInt3 = (itemViewModelModelState) == (3);
                        // read itemViewModel.model.classification != 2
                        itemViewModelModelClassificationInt2 = (itemViewModelModelClassification) != (2);
                        // read itemViewModel.model.classification == 2
                        ItemViewModelModelClassificationInt21 = (itemViewModelModelClassification) == (2);
                    if((dirtyFlags & 0x91L) != 0) {
                        if(itemViewModelModelStateInt3) {
                                dirtyFlags |= 0x800L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                        }
                    }
                    if((dirtyFlags & 0x91L) != 0) {
                        if(itemViewModelModelClassificationInt2) {
                                dirtyFlags |= 0x20000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                        }
                    }
                    if((dirtyFlags & 0x91L) != 0) {
                        if(ItemViewModelModelClassificationInt21) {
                                dirtyFlags |= 0x8000L;
                        }
                        else {
                                dirtyFlags |= 0x4000L;
                        }
                    }


                        // read itemViewModel.model.state == 3 ? View.GONE : View.VISIBLE
                        itemViewModelModelStateInt3ViewGONEViewVISIBLE = ((itemViewModelModelStateInt3) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read itemViewModel.model.classification != 2 ? View.VISIBLE : View.GONE
                        itemViewModelModelClassificationInt2ViewVISIBLEViewGONE = ((itemViewModelModelClassificationInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read itemViewModel.model.classification == 2 ? View.GONE : View.VISIBLE
                        itemViewModelModelClassificationInt2ViewGONEViewVISIBLE = ((ItemViewModelModelClassificationInt21) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
                if ((dirtyFlags & 0xf1L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.expand
                            itemViewModelModelExpand = itemViewModelModel.getExpand();
                            // read itemViewModel.model.isClick
                            itemViewModelModelIsClick = itemViewModelModel.getIsClick();
                        }
                }
            }
            if ((dirtyFlags & 0xf1L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.viewCount
                        itemViewModelViewCount = itemViewModel.viewCount;
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.btVipCardCancellation.setOnClickListener(itemViewModelObsoleteAndroidViewViewOnClickListener);
            this.btVipCardDelete.setOnClickListener(itemViewModelDeleteAndroidViewViewOnClickListener);
            this.mboundView1.setOnClickListener(itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener);
            this.mboundView12.setOnClickListener(itemViewModelCardMembersAndroidViewViewOnClickListener);
            this.mboundView13.setOnClickListener(itemViewModelSetAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(itemViewModelEditAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            this.btVipCardCancellation.setVisibility(itemViewModelModelClassificationInt2ViewGONEViewVISIBLE);
            this.mboundView12.setVisibility(itemViewModelModelClassificationInt2ViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(itemViewModelModelStateInt3ViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x83L) != 0) {
            // api target 1

            this.btVipCardSelect.setVisibility(itemViewModelObShowTypeInt1ViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(itemViewModelObShowTypeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9dL) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setServiceTypeAdapterData(this.mboundView10, itemViewModelModelCardDiscountList2, itemViewModelObIsInputGet, itemViewModelObIsIsAddVipCardGet);
            ys.app.petproject.PetBindingUtil.setGoodsTypeAdapterData(this.mboundView9, itemViewModelModelCardDiscountList, itemViewModelObIsInputGet, itemViewModelObIsIsAddVipCardGet);
        }
        if ((dirtyFlags & 0xf1L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setIsVisFull(this.mboundView8, itemViewModelModelExpand, itemViewModelModelIsClick, itemViewModelViewCount);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.VipCardItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.VipCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.edit(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.VipCardItemViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.manage.VipCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.delete(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.VipCardItemViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.manage.VipCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.set(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.VipCardItemViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.manage.VipCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.obsolete(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.VipCardItemViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.petproject.viewmodel.manage.VipCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOpenOrClose(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.VipCardItemViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.petproject.viewmodel.manage.VipCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.cardMembers(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemVipCardBinding>inflate(inflater, ys.app.petproject.R.layout.item_vip_card, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_vip_card, null, false), bindingComponent);
    }
    @NonNull
    public static ItemVipCardBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipCardBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_vip_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemVipCardBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.obShowType
        flag 2 (0x3L): itemViewModel.obIsInput
        flag 3 (0x4L): itemViewModel.obIsIsAddVipCard
        flag 4 (0x5L): itemViewModel.model
        flag 5 (0x6L): itemViewModel.model.isClick
        flag 6 (0x7L): itemViewModel.model.expand
        flag 7 (0x8L): null
        flag 8 (0x9L): itemViewModel.obShowType.get() == 1 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): itemViewModel.obShowType.get() == 1 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): itemViewModel.model.state == 3 ? View.GONE : View.VISIBLE
        flag 11 (0xcL): itemViewModel.model.state == 3 ? View.GONE : View.VISIBLE
        flag 12 (0xdL): itemViewModel.obShowType.get() == 0 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): itemViewModel.obShowType.get() == 0 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): itemViewModel.model.classification == 2 ? View.GONE : View.VISIBLE
        flag 15 (0x10L): itemViewModel.model.classification == 2 ? View.GONE : View.VISIBLE
        flag 16 (0x11L): itemViewModel.model.classification != 2 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): itemViewModel.model.classification != 2 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}