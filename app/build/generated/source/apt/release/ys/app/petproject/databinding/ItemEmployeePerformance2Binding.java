package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEmployeePerformance2Binding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.TextView employeeNameTv;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
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
    private ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEmployeePerformance2Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.employeeNameTv = (android.widget.TextView) bindings[1];
        this.employeeNameTv.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[2];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.totalMoneyTv = (android.widget.TextView) bindings[9];
        this.totalMoneyTv.setTag(null);
        this.typeTv = (android.widget.TextView) bindings[3];
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
            setItemViewModel((ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel ItemViewModel, int fieldId) {
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
        java.lang.String stringValueOfItemViewModelModelCount = null;
        double itemViewModelModelCountVipMoney = 0.0;
        ys.app.petproject.viewmodel.manage.EmployeePerformance2ItemViewModel itemViewModel = mItemViewModel;
        int itemViewModelModelIsClassification = 0;
        int itemViewModelModelIsFold = 0;
        long itemViewModelModelPayDate = 0L;
        int itemViewModelModelIsPromotion = 0;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelCountVipMoney = null;
        int itemViewModelModelVipUserId = 0;
        double itemViewModelModelPrice = 0.0;
        java.lang.String dateUtilLongFormatDate3ItemViewModelModelPayDate = null;
        java.lang.String mboundView6AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelPrice = null;
        java.lang.String itemViewModelModelProductTypeName = null;
        ys.app.petproject.model.EmployeePerformanceInfo.OrderDetailedListProductBean itemViewModelModel = null;
        int itemViewModelModelCount = 0;
        java.lang.String itemViewModelModelName = null;
        java.lang.String mboundView7AndroidStringXhStringValueOfItemViewModelModelCount = null;
        double itemViewModelModelRealMoney = 0.0;
        double itemViewModelModelVipPrice = 0.0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.countVipMoney
                    itemViewModelModelCountVipMoney = itemViewModelModel.getCountVipMoney();
                    // read itemViewModel.model.isClassification
                    itemViewModelModelIsClassification = itemViewModelModel.getIsClassification();
                    // read itemViewModel.model.isFold
                    itemViewModelModelIsFold = itemViewModelModel.getIsFold();
                    // read itemViewModel.model.payDate
                    itemViewModelModelPayDate = itemViewModelModel.getPayDate();
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


                // read AppUtil.formatStandardMoney(itemViewModel.model.countVipMoney)
                appUtilFormatStandardMoneyItemViewModelModelCountVipMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelCountVipMoney);
                // read DateUtil.longFormatDate3(itemViewModel.model.payDate)
                dateUtilLongFormatDate3ItemViewModelModelPayDate = ys.app.petproject.utils.DateUtil.longFormatDate3(itemViewModelModelPayDate);
                // read AppUtil.formatStandardMoney(itemViewModel.model.price)
                appUtilFormatStandardMoneyItemViewModelModelPrice = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelPrice);
                // read String.valueOf(itemViewModel.model.count)
                stringValueOfItemViewModelModelCount = java.lang.String.valueOf(itemViewModelModelCount);


                // read (@android:string/rmb) + (AppUtil.formatStandardMoney(itemViewModel.model.price))
                mboundView6AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice = (mboundView6.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyItemViewModelModelPrice);
                // read (@android:string/xh) + (String.valueOf(itemViewModel.model.count))
                mboundView7AndroidStringXhStringValueOfItemViewModelModelCount = (mboundView7.getResources().getString(R.string.xh)) + (stringValueOfItemViewModelModelCount);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.employeeNameTv, dateUtilLongFormatDate3ItemViewModelModelPayDate);
            ys.app.petproject.PetBindingUtil.setFristPrice(this.mboundView4, itemViewModelModelIsClassification, itemViewModelModelIsPromotion, itemViewModelModelIsFold, itemViewModelModelVipPrice);
            ys.app.petproject.PetBindingUtil.setPrice(this.mboundView5, itemViewModelModelIsClassification, itemViewModelModelIsPromotion);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mboundView6AndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelPrice);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringXhStringValueOfItemViewModelModelCount);
            ys.app.petproject.PetBindingUtil.setCostAndCost(this.mboundView8, itemViewModelModelVipUserId, itemViewModelModelIsPromotion, itemViewModelModelIsFold);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.totalMoneyTv, appUtilFormatStandardMoneyItemViewModelModelCountVipMoney);
            ys.app.petproject.PetBindingUtil.setTotalMoney(this.totalMoneyTv, itemViewModelModelRealMoney);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.typeTv, itemViewModelModelProductTypeName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemEmployeePerformance2Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeePerformance2Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEmployeePerformance2Binding>inflate(inflater, ys.app.petproject.R.layout.item_employee_performance_2, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemEmployeePerformance2Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeePerformance2Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_employee_performance_2, null, false), bindingComponent);
    }
    @NonNull
    public static ItemEmployeePerformance2Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeePerformance2Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_employee_performance_2_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEmployeePerformance2Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}