package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAllotShopRecordBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_item_allot_record_isCheck, 7);
        sViewsWithIds.put(R.id.textView15, 8);
        sViewsWithIds.put(R.id.tv_allot_type, 9);
        sViewsWithIds.put(R.id.tv_item_allot_record_shopName, 10);
    }
    // views
    @NonNull
    public final android.widget.Button btItemAllotRecord;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    public final android.support.v7.widget.CardView rootView;
    @NonNull
    public final android.widget.TextView textView15;
    @NonNull
    public final android.widget.TextView tvAllotType;
    @NonNull
    public final android.widget.TextView tvItemAllotRecordIsCheck;
    @NonNull
    public final android.widget.TextView tvItemAllotRecordShopName;
    // variables
    @Nullable
    private ys.app.petproject.itemmodel.AllotManageRecordItemModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAllotShopRecordBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.btItemAllotRecord = (android.widget.Button) bindings[2];
        this.btItemAllotRecord.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.rootView = (android.support.v7.widget.CardView) bindings[0];
        this.rootView.setTag(null);
        this.textView15 = (android.widget.TextView) bindings[8];
        this.tvAllotType = (android.widget.TextView) bindings[9];
        this.tvItemAllotRecordIsCheck = (android.widget.TextView) bindings[7];
        this.tvItemAllotRecordShopName = (android.widget.TextView) bindings[10];
        setRootTag(root);
        // listeners
        mCallback97 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((ys.app.petproject.itemmodel.AllotManageRecordItemModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.itemmodel.AllotManageRecordItemModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.itemmodel.AllotManageRecordItemModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.itemmodel.AllotManageRecordItemModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.itemmodel.AllotManageRecordItemModel ItemViewModel, int fieldId) {
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        ys.app.petproject.itemmodel.AllotManageRecordItemModel itemViewModel = mItemViewModel;
        long itemViewModelModelDotime = 0L;
        java.lang.String itemViewModelModelCommodityCode = null;
        java.lang.String appUtilGetTimesItemViewModelModelDotime = null;
        ys.app.petproject.model.AllotRecordInfo itemViewModelModel = null;
        int itemViewModelModelNum = 0;
        java.lang.String itemViewModelModelCommodityName = null;
        java.lang.String itemViewModelModelCommodityTypeName = null;
        java.lang.String itemViewModelModelNumMboundView5AndroidStringEmpty = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.dotime
                    itemViewModelModelDotime = itemViewModelModel.getDotime();
                    // read itemViewModel.model.commodityCode
                    itemViewModelModelCommodityCode = itemViewModelModel.getCommodityCode();
                    // read itemViewModel.model.num
                    itemViewModelModelNum = itemViewModelModel.getNum();
                    // read itemViewModel.model.commodityName
                    itemViewModelModelCommodityName = itemViewModelModel.getCommodityName();
                    // read itemViewModel.model.commodityTypeName
                    itemViewModelModelCommodityTypeName = itemViewModelModel.getCommodityTypeName();
                }


                // read AppUtil.getTimes(itemViewModel.model.dotime)
                appUtilGetTimesItemViewModelModelDotime = ys.app.petproject.utils.AppUtil.getTimes(itemViewModelModelDotime);
                // read (itemViewModel.model.num) + (@android:string/empty)
                itemViewModelModelNumMboundView5AndroidStringEmpty = (itemViewModelModelNum) + (mboundView5.getResources().getString(R.string.empty));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btItemAllotRecord.setOnClickListener(mCallback97);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelCommodityName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelCommodityTypeName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemViewModelModelCommodityCode);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelModelNumMboundView5AndroidStringEmpty);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, appUtilGetTimesItemViewModelModelDotime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        ys.app.petproject.itemmodel.AllotManageRecordItemModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.clickCheck();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemAllotShopRecordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAllotShopRecordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemAllotShopRecordBinding>inflate(inflater, ys.app.petproject.R.layout.item_allot_manage, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemAllotShopRecordBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAllotShopRecordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_allot_manage, null, false), bindingComponent);
    }
    @NonNull
    public static ItemAllotShopRecordBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAllotShopRecordBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_allot_manage_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemAllotShopRecordBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}