package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVipConsumeBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ItemVipConsumeViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemVipConsumeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
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
            setItemViewModel((ys.app.petproject.viewmodel.ItemVipConsumeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.ItemVipConsumeViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ItemVipConsumeViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.ItemVipConsumeViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelModel((ys.app.petproject.model.OrderInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.ItemVipConsumeViewModel ItemViewModel, int fieldId) {
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemViewModelModelPayedMethod = null;
        ys.app.petproject.viewmodel.ItemVipConsumeViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelModelOrderNo = null;
        double itemViewModelModelRealAmt = 0.0;
        ys.app.petproject.model.OrderInfo itemViewModelModel = null;
        java.lang.String appUtilGetPayTypeItemViewModelModelPayedMethod = null;
        long itemViewModelModelPayedTime = 0L;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealAmt = null;
        java.lang.String appUtilGetTimesItemViewModelModelPayedTime = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(1, itemViewModelModel);


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.payedMethod
                    itemViewModelModelPayedMethod = itemViewModelModel.getPayedMethod();
                    // read itemViewModel.model.orderNo
                    itemViewModelModelOrderNo = itemViewModelModel.getOrderNo();
                    // read itemViewModel.model.realAmt
                    itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                    // read itemViewModel.model.payedTime
                    itemViewModelModelPayedTime = itemViewModelModel.getPayedTime();
                }


                // read AppUtil.getPayType(itemViewModel.model.payedMethod)
                appUtilGetPayTypeItemViewModelModelPayedMethod = ys.app.petproject.utils.AppUtil.getPayType(itemViewModelModelPayedMethod);
                // read AppUtil.formatStandardMoney(itemViewModel.model.realAmt)
                appUtilFormatStandardMoneyItemViewModelModelRealAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelRealAmt);
                // read AppUtil.getTimes(itemViewModel.model.payedTime)
                appUtilGetTimesItemViewModelModelPayedTime = ys.app.petproject.utils.AppUtil.getTimes(itemViewModelModelPayedTime);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, appUtilFormatStandardMoneyItemViewModelModelRealAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelModelOrderNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, appUtilGetTimesItemViewModelModelPayedTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilGetPayTypeItemViewModelModelPayedMethod);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemVipConsumeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipConsumeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemVipConsumeBinding>inflate(inflater, ys.app.petproject.R.layout.item_vip_consume, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemVipConsumeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipConsumeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_vip_consume, null, false), bindingComponent);
    }
    @NonNull
    public static ItemVipConsumeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipConsumeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_vip_consume_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemVipConsumeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}