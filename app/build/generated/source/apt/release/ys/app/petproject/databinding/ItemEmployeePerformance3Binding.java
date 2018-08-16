package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEmployeePerformance3Binding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_tv, 6);
    }
    // views
    @NonNull
    public final android.widget.TextView cardNoTv;
    @NonNull
    public final android.widget.TextView cardTv;
    @NonNull
    public final android.widget.TextView name;
    @NonNull
    public final android.widget.TextView phone;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemPerformanceTime;
    @NonNull
    public final android.widget.TextView vipMoney;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEmployeePerformance3Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.cardNoTv = (android.widget.TextView) bindings[4];
        this.cardNoTv.setTag(null);
        this.cardTv = (android.widget.TextView) bindings[6];
        this.name = (android.widget.TextView) bindings[2];
        this.name.setTag(null);
        this.phone = (android.widget.TextView) bindings[3];
        this.phone.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemPerformanceTime = (android.widget.TextView) bindings[1];
        this.tvItemPerformanceTime.setTag(null);
        this.vipMoney = (android.widget.TextView) bindings[5];
        this.vipMoney.setTag(null);
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
            setItemViewModel((ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel ItemViewModel, int fieldId) {
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
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRechargeAmt = null;
        java.lang.String itemViewModelModelVipName = null;
        ys.app.petproject.viewmodel.manage.EmployeePerformance3ItemViewModel itemViewModel = mItemViewModel;
        long itemViewModelModelPayDate = 0L;
        java.lang.String dateUtilLongFormatDate3ItemViewModelModelPayDate = null;
        double itemViewModelModelRechargeAmt = 0.0;
        java.lang.String vipMoneyAndroidStringFuhaoAppUtilFormatStandardMoneyItemViewModelModelRechargeAmt = null;
        ys.app.petproject.model.EmployeePerformanceInfo.RechargeListBean itemViewModelModel = null;
        java.lang.String itemViewModelModelVipPhone = null;
        java.lang.String itemViewModelModelVipNameNameAndroidStringMh = null;
        java.lang.String itemViewModelModelVipUserCardNo = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.vipName
                    itemViewModelModelVipName = itemViewModelModel.getVipName();
                    // read itemViewModel.model.payDate
                    itemViewModelModelPayDate = itemViewModelModel.getPayDate();
                    // read itemViewModel.model.rechargeAmt
                    itemViewModelModelRechargeAmt = itemViewModelModel.getRechargeAmt();
                    // read itemViewModel.model.vipPhone
                    itemViewModelModelVipPhone = itemViewModelModel.getVipPhone();
                    // read itemViewModel.model.vipUserCardNo
                    itemViewModelModelVipUserCardNo = itemViewModelModel.getVipUserCardNo();
                }


                // read (itemViewModel.model.vipName) + (@android:string/mh)
                itemViewModelModelVipNameNameAndroidStringMh = (itemViewModelModelVipName) + (name.getResources().getString(R.string.mh));
                // read DateUtil.longFormatDate3(itemViewModel.model.payDate)
                dateUtilLongFormatDate3ItemViewModelModelPayDate = ys.app.petproject.utils.DateUtil.longFormatDate3(itemViewModelModelPayDate);
                // read AppUtil.formatStandardMoney(itemViewModel.model.rechargeAmt)
                appUtilFormatStandardMoneyItemViewModelModelRechargeAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(itemViewModelModelRechargeAmt);


                // read (@android:string/fuhao) + (AppUtil.formatStandardMoney(itemViewModel.model.rechargeAmt))
                vipMoneyAndroidStringFuhaoAppUtilFormatStandardMoneyItemViewModelModelRechargeAmt = (vipMoney.getResources().getString(R.string.fuhao)) + (appUtilFormatStandardMoneyItemViewModelModelRechargeAmt);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cardNoTv, itemViewModelModelVipUserCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, itemViewModelModelVipNameNameAndroidStringMh);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.phone, itemViewModelModelVipPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemPerformanceTime, dateUtilLongFormatDate3ItemViewModelModelPayDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.vipMoney, vipMoneyAndroidStringFuhaoAppUtilFormatStandardMoneyItemViewModelModelRechargeAmt);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemEmployeePerformance3Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeePerformance3Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEmployeePerformance3Binding>inflate(inflater, ys.app.petproject.R.layout.item_employee_performance_3, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemEmployeePerformance3Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeePerformance3Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_employee_performance_3, null, false), bindingComponent);
    }
    @NonNull
    public static ItemEmployeePerformance3Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeePerformance3Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_employee_performance_3_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEmployeePerformance3Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}