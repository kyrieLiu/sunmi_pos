package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ServiceDetailActivityBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 17);
        sViewsWithIds.put(R.id.iv0, 18);
        sViewsWithIds.put(R.id.iv2, 19);
        sViewsWithIds.put(R.id.iv5, 20);
        sViewsWithIds.put(R.id.iv10, 21);
        sViewsWithIds.put(R.id.iv7, 22);
        sViewsWithIds.put(R.id.tv0, 23);
        sViewsWithIds.put(R.id.tv1, 24);
        sViewsWithIds.put(R.id.discount, 25);
        sViewsWithIds.put(R.id.zhekou_cuxiaojia_tv, 26);
        sViewsWithIds.put(R.id.discount_on, 27);
        sViewsWithIds.put(R.id.lijian_cuxiaojia_tv, 28);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout discount;
    @NonNull
    public final android.widget.LinearLayout discountOn;
    @NonNull
    public final android.widget.ImageView img1;
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv10;
    @NonNull
    public final android.widget.ImageView iv2;
    @NonNull
    public final android.widget.ImageView iv5;
    @NonNull
    public final android.widget.ImageView iv7;
    @NonNull
    public final android.widget.TextView lijianCuxiaojiaTv;
    @NonNull
    public final android.widget.EditText lijianEt;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.EditText mboundView13;
    @NonNull
    private final android.widget.EditText mboundView14;
    @NonNull
    private final android.widget.Button mboundView16;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.LinearLayout serviceLl;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.widget.TextView zhekouCuxiaojiaTv;
    @NonNull
    public final android.widget.EditText zhekouEt;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ServiceDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener lijianEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ykjString.get()
            //         is viewModel.ykjString.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(lijianEt);
            // localize variables for thread safety
            // viewModel.ykjString
            android.databinding.ObservableField<java.lang.String> viewModelYkjString = null;
            // viewModel.ykjString.get()
            java.lang.String viewModelYkjStringGet = null;
            // viewModel.ykjString != null
            boolean viewModelYkjStringJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelYkjString = viewModel.ykjString;

                viewModelYkjStringJavaLangObjectNull = (viewModelYkjString) != (null);
                if (viewModelYkjStringJavaLangObjectNull) {




                    viewModelYkjString.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView13androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostBeginDate.get()
            //         is viewModel.obCostBeginDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView13);
            // localize variables for thread safety
            // viewModel.obCostBeginDate
            android.databinding.ObservableField<java.lang.String> viewModelObCostBeginDate = null;
            // viewModel.obCostBeginDate != null
            boolean viewModelObCostBeginDateJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel.obCostBeginDate.get()
            java.lang.String viewModelObCostBeginDateGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCostBeginDate = viewModel.obCostBeginDate;

                viewModelObCostBeginDateJavaLangObjectNull = (viewModelObCostBeginDate) != (null);
                if (viewModelObCostBeginDateJavaLangObjectNull) {




                    viewModelObCostBeginDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView14androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostEndDate.get()
            //         is viewModel.obCostEndDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView14);
            // localize variables for thread safety
            // viewModel.obCostEndDate.get()
            java.lang.String viewModelObCostEndDateGet = null;
            // viewModel.obCostEndDate
            android.databinding.ObservableField<java.lang.String> viewModelObCostEndDate = null;
            // viewModel
            ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obCostEndDate != null
            boolean viewModelObCostEndDateJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCostEndDate = viewModel.obCostEndDate;

                viewModelObCostEndDateJavaLangObjectNull = (viewModelObCostEndDate) != (null);
                if (viewModelObCostEndDateJavaLangObjectNull) {




                    viewModelObCostEndDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.selectType.get()
            //         is viewModel.selectType.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewModel.selectType != null
            boolean viewModelSelectTypeJavaLangObjectNull = false;
            // viewModel.selectType.get()
            java.lang.String viewModelSelectTypeGet = null;
            // viewModel.selectType
            android.databinding.ObservableField<java.lang.String> viewModelSelectType = null;
            // viewModel
            ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSelectType = viewModel.selectType;

                viewModelSelectTypeJavaLangObjectNull = (viewModelSelectType) != (null);
                if (viewModelSelectTypeJavaLangObjectNull) {




                    viewModelSelectType.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener zhekouEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.discountString.get()
            //         is viewModel.discountString.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(zhekouEt);
            // localize variables for thread safety
            // viewModel.discountString
            android.databinding.ObservableField<java.lang.String> viewModelDiscountString = null;
            // viewModel
            ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.discountString.get()
            java.lang.String viewModelDiscountStringGet = null;
            // viewModel.discountString != null
            boolean viewModelDiscountStringJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDiscountString = viewModel.discountString;

                viewModelDiscountStringJavaLangObjectNull = (viewModelDiscountString) != (null);
                if (viewModelDiscountStringJavaLangObjectNull) {




                    viewModelDiscountString.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ServiceDetailActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 10);
        final Object[] bindings = mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds);
        this.discount = (android.widget.LinearLayout) bindings[25];
        this.discountOn = (android.widget.LinearLayout) bindings[27];
        this.img1 = (android.widget.ImageView) bindings[15];
        this.img1.setTag(null);
        this.iv0 = (android.widget.ImageView) bindings[18];
        this.iv10 = (android.widget.ImageView) bindings[21];
        this.iv2 = (android.widget.ImageView) bindings[19];
        this.iv5 = (android.widget.ImageView) bindings[20];
        this.iv7 = (android.widget.ImageView) bindings[22];
        this.lijianCuxiaojiaTv = (android.widget.TextView) bindings[28];
        this.lijianEt = (android.widget.EditText) bindings[12];
        this.lijianEt.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (android.widget.EditText) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.EditText) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView16 = (android.widget.Button) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[7];
        this.selectIv0.setTag(null);
        this.serviceLl = (android.widget.LinearLayout) bindings[1];
        this.serviceLl.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[23];
        this.tv1 = (android.widget.TextView) bindings[24];
        this.view = (android.view.View) bindings[17];
        this.zhekouCuxiaojiaTv = (android.widget.TextView) bindings[26];
        this.zhekouEt = (android.widget.EditText) bindings[10];
        this.zhekouEt.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback13 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback14 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback11 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback12 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback10 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
        if (BR.viewModel == variableId) {
            setViewModel((ys.app.petproject.viewmodel.ServiceDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ServiceDetailViewModel ViewModel) {
        updateRegistration(9, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ServiceDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelSelectTypeId((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelObCostBeginDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelYkjString((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelMResult((ys.app.petproject.model.ServiceInfo) object, fieldId);
            case 5 :
                return onChangeViewModelDiscountString((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelObCostEndDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelVipPic((android.databinding.ObservableBoolean) object, fieldId);
            case 8 :
                return onChangeViewModelPromotion((android.databinding.ObservableBoolean) object, fieldId);
            case 9 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ServiceDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectType(android.databinding.ObservableField<java.lang.String> ViewModelSelectType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectTypeId(android.databinding.ObservableInt ViewModelSelectTypeId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostBeginDate(android.databinding.ObservableField<java.lang.String> ViewModelObCostBeginDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYkjString(android.databinding.ObservableField<java.lang.String> ViewModelYkjString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMResult(ys.app.petproject.model.ServiceInfo ViewModelMResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.typeName) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.realAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDiscountString(android.databinding.ObservableField<java.lang.String> ViewModelDiscountString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostEndDate(android.databinding.ObservableField<java.lang.String> ViewModelObCostEndDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipPic(android.databinding.ObservableBoolean ViewModelVipPic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPromotion(android.databinding.ObservableBoolean ViewModelPromotion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ServiceDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String viewModelMResultName = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultVipAmt = null;
        android.databinding.ObservableField<java.lang.String> viewModelSelectType = null;
        android.databinding.ObservableInt viewModelSelectTypeId = null;
        boolean viewModelSelectTypeIdInt2 = false;
        boolean viewModelPromotionGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObCostBeginDate = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultRealAmtMboundView4AndroidStringYuan = null;
        android.databinding.ObservableField<java.lang.String> viewModelYkjString = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultRealAmt = null;
        double viewModelMResultVipAmt = 0.0;
        int viewModelSelectTypeIdInt2ViewVISIBLEViewGONE = 0;
        ys.app.petproject.model.ServiceInfo viewModelMResult = null;
        java.lang.String viewModelYkjStringGet = null;
        java.lang.String viewModelObCostBeginDateGet = null;
        int viewModelPromotionViewVISIBLEViewGONE = 0;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultVipAmtMboundView5AndroidStringYuan = null;
        android.databinding.ObservableField<java.lang.String> viewModelDiscountString = null;
        boolean viewModelVipPicGet = false;
        java.lang.String viewModelDiscountStringGet = null;
        java.lang.String viewModelMResultTypeName = null;
        java.lang.String viewModelObCostEndDateGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObCostEndDate = null;
        android.databinding.ObservableBoolean viewModelVipPic = null;
        double viewModelMResultRealAmt = 0.0;
        int viewModelSelectTypeIdGet = 0;
        java.lang.String viewModelSelectTypeGet = null;
        android.databinding.ObservableBoolean viewModelPromotion = null;
        boolean viewModelSelectTypeIdInt1 = false;
        int viewModelSelectTypeIdInt1ViewVISIBLEViewGONE = 0;
        ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x2201L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectType
                        viewModelSelectType = viewModel.selectType;
                    }
                    updateRegistration(0, viewModelSelectType);


                    if (viewModelSelectType != null) {
                        // read viewModel.selectType.get()
                        viewModelSelectTypeGet = viewModelSelectType.get();
                    }
            }
            if ((dirtyFlags & 0x2202L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectTypeId
                        viewModelSelectTypeId = viewModel.selectTypeId;
                    }
                    updateRegistration(1, viewModelSelectTypeId);


                    if (viewModelSelectTypeId != null) {
                        // read viewModel.selectTypeId.get()
                        viewModelSelectTypeIdGet = viewModelSelectTypeId.get();
                    }


                    // read viewModel.selectTypeId.get() == 2
                    viewModelSelectTypeIdInt2 = (viewModelSelectTypeIdGet) == (2);
                    // read viewModel.selectTypeId.get() == 1
                    viewModelSelectTypeIdInt1 = (viewModelSelectTypeIdGet) == (1);
                if((dirtyFlags & 0x2202L) != 0) {
                    if(viewModelSelectTypeIdInt2) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x2202L) != 0) {
                    if(viewModelSelectTypeIdInt1) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
                    viewModelSelectTypeIdInt2ViewVISIBLEViewGONE = ((viewModelSelectTypeIdInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
                    viewModelSelectTypeIdInt1ViewVISIBLEViewGONE = ((viewModelSelectTypeIdInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x2204L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostBeginDate
                        viewModelObCostBeginDate = viewModel.obCostBeginDate;
                    }
                    updateRegistration(2, viewModelObCostBeginDate);


                    if (viewModelObCostBeginDate != null) {
                        // read viewModel.obCostBeginDate.get()
                        viewModelObCostBeginDateGet = viewModelObCostBeginDate.get();
                    }
            }
            if ((dirtyFlags & 0x2208L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ykjString
                        viewModelYkjString = viewModel.ykjString;
                    }
                    updateRegistration(3, viewModelYkjString);


                    if (viewModelYkjString != null) {
                        // read viewModel.ykjString.get()
                        viewModelYkjStringGet = viewModelYkjString.get();
                    }
            }
            if ((dirtyFlags & 0x3e10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mResult
                        viewModelMResult = viewModel.mResult;
                    }
                    updateRegistration(4, viewModelMResult);

                if ((dirtyFlags & 0x2610L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.name
                            viewModelMResultName = viewModelMResult.getName();
                        }
                }
                if ((dirtyFlags & 0x2210L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.vipAmt
                            viewModelMResultVipAmt = viewModelMResult.getVipAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mResult.vipAmt)
                        appUtilFormatStandardMoneyViewModelMResultVipAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMResultVipAmt);


                        // read (AppUtil.formatStandardMoney(viewModel.mResult.vipAmt)) + (@android:string/yuan)
                        appUtilFormatStandardMoneyViewModelMResultVipAmtMboundView5AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMResultVipAmt) + (mboundView5.getResources().getString(R.string.yuan));
                }
                if ((dirtyFlags & 0x2a10L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.typeName
                            viewModelMResultTypeName = viewModelMResult.getTypeName();
                        }
                }
                if ((dirtyFlags & 0x3210L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.realAmt
                            viewModelMResultRealAmt = viewModelMResult.getRealAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mResult.realAmt)
                        appUtilFormatStandardMoneyViewModelMResultRealAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMResultRealAmt);


                        // read (AppUtil.formatStandardMoney(viewModel.mResult.realAmt)) + (@android:string/yuan)
                        appUtilFormatStandardMoneyViewModelMResultRealAmtMboundView4AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMResultRealAmt) + (mboundView4.getResources().getString(R.string.yuan));
                }
            }
            if ((dirtyFlags & 0x2220L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.discountString
                        viewModelDiscountString = viewModel.discountString;
                    }
                    updateRegistration(5, viewModelDiscountString);


                    if (viewModelDiscountString != null) {
                        // read viewModel.discountString.get()
                        viewModelDiscountStringGet = viewModelDiscountString.get();
                    }
            }
            if ((dirtyFlags & 0x2240L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostEndDate
                        viewModelObCostEndDate = viewModel.obCostEndDate;
                    }
                    updateRegistration(6, viewModelObCostEndDate);


                    if (viewModelObCostEndDate != null) {
                        // read viewModel.obCostEndDate.get()
                        viewModelObCostEndDateGet = viewModelObCostEndDate.get();
                    }
            }
            if ((dirtyFlags & 0x2280L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipPic
                        viewModelVipPic = viewModel.vipPic;
                    }
                    updateRegistration(7, viewModelVipPic);


                    if (viewModelVipPic != null) {
                        // read viewModel.vipPic.get()
                        viewModelVipPicGet = viewModelVipPic.get();
                    }
            }
            if ((dirtyFlags & 0x2300L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.promotion
                        viewModelPromotion = viewModel.promotion;
                    }
                    updateRegistration(8, viewModelPromotion);


                    if (viewModelPromotion != null) {
                        // read viewModel.promotion.get()
                        viewModelPromotionGet = viewModelPromotion.get();
                    }
                if((dirtyFlags & 0x2300L) != 0) {
                    if(viewModelPromotionGet) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read viewModel.promotion.get() ? View.VISIBLE : View.GONE
                    viewModelPromotionViewVISIBLEViewGONE = ((viewModelPromotionGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.img1.setOnClickListener(mCallback14);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.lijianEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, lijianEtandroidTextAttrChanged);
            this.mboundView13.setOnClickListener(mCallback12);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView13, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView13androidTextAttrChanged);
            this.mboundView14.setOnClickListener(mCallback13);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView14, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView14androidTextAttrChanged);
            this.mboundView16.setOnClickListener(mCallback15);
            this.mboundView8.setOnClickListener(mCallback11);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.selectIv0.setOnClickListener(mCallback10);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.zhekouEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, zhekouEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x2280L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setImgIsSelect(this.img1, viewModelVipPicGet);
        }
        if ((dirtyFlags & 0x2208L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.lijianEt, viewModelYkjStringGet);
        }
        if ((dirtyFlags & 0x2202L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelSelectTypeIdInt2ViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewModelSelectTypeIdInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2204L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelObCostBeginDateGet);
        }
        if ((dirtyFlags & 0x2240L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelObCostEndDateGet);
        }
        if ((dirtyFlags & 0x2300L) != 0) {
            // api target 1

            this.mboundView16.setVisibility(viewModelPromotionViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(viewModelPromotionViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2610L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMResultName);
        }
        if ((dirtyFlags & 0x2a10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelMResultTypeName);
        }
        if ((dirtyFlags & 0x3210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilFormatStandardMoneyViewModelMResultRealAmtMboundView4AndroidStringYuan);
        }
        if ((dirtyFlags & 0x2210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, appUtilFormatStandardMoneyViewModelMResultVipAmtMboundView5AndroidStringYuan);
        }
        if ((dirtyFlags & 0x2201L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelSelectTypeGet);
        }
        if ((dirtyFlags & 0x2220L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.zhekouEt, viewModelDiscountStringGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickButton();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.costEndDateTimeClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.vipClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.costBeginDateTimeClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ServiceDetailActivityBinding>inflate(inflater, ys.app.petproject.R.layout.activity_service_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_service_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ServiceDetailActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ServiceDetailActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_service_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ServiceDetailActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.selectType
        flag 1 (0x2L): viewModel.selectTypeId
        flag 2 (0x3L): viewModel.obCostBeginDate
        flag 3 (0x4L): viewModel.ykjString
        flag 4 (0x5L): viewModel.mResult
        flag 5 (0x6L): viewModel.discountString
        flag 6 (0x7L): viewModel.obCostEndDate
        flag 7 (0x8L): viewModel.vipPic
        flag 8 (0x9L): viewModel.promotion
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): viewModel.mResult.name
        flag 11 (0xcL): viewModel.mResult.typeName
        flag 12 (0xdL): viewModel.mResult.realAmt
        flag 13 (0xeL): null
        flag 14 (0xfL): viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.promotion.get() ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.promotion.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}