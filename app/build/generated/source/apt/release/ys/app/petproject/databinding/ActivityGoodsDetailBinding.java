package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityGoodsDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 21);
        sViewsWithIds.put(R.id.iv0, 22);
        sViewsWithIds.put(R.id.iv1, 23);
        sViewsWithIds.put(R.id.iv2, 24);
        sViewsWithIds.put(R.id.iv3, 25);
        sViewsWithIds.put(R.id.iv4, 26);
        sViewsWithIds.put(R.id.iv10, 27);
        sViewsWithIds.put(R.id.iv5, 28);
        sViewsWithIds.put(R.id.iv6, 29);
        sViewsWithIds.put(R.id.iv7, 30);
        sViewsWithIds.put(R.id.tv0, 31);
        sViewsWithIds.put(R.id.tv1, 32);
        sViewsWithIds.put(R.id.discount, 33);
        sViewsWithIds.put(R.id.zhekou_cuxiaojia_tv, 34);
        sViewsWithIds.put(R.id.discount_on, 35);
        sViewsWithIds.put(R.id.lijian_cuxiaojia_tv, 36);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout discount;
    @NonNull
    public final android.widget.LinearLayout discountOn;
    @NonNull
    public final android.widget.LinearLayout goodLl;
    @NonNull
    public final android.widget.ImageView img1;
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv1;
    @NonNull
    public final android.widget.ImageView iv10;
    @NonNull
    public final android.widget.ImageView iv2;
    @NonNull
    public final android.widget.ImageView iv3;
    @NonNull
    public final android.widget.ImageView iv4;
    @NonNull
    public final android.widget.ImageView iv5;
    @NonNull
    public final android.widget.ImageView iv6;
    @NonNull
    public final android.widget.ImageView iv7;
    @NonNull
    public final android.widget.TextView lijianCuxiaojiaTv;
    @NonNull
    public final android.widget.EditText lijianEt;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView15;
    @NonNull
    private final android.widget.EditText mboundView17;
    @NonNull
    private final android.widget.EditText mboundView18;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.Button mboundView20;
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
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.ImageView selectIv0;
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
    private ys.app.petproject.viewmodel.GoodsDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
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
            ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.selectType.get()
            //         is viewModel.selectType.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewModel.selectType != null
            boolean viewModelSelectTypeJavaLangObjectNull = false;
            // viewModel.selectType.get()
            java.lang.String viewModelSelectTypeGet = null;
            // viewModel.selectType
            android.databinding.ObservableField<java.lang.String> viewModelSelectType = null;
            // viewModel
            ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener mboundView17androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostBeginDate.get()
            //         is viewModel.obCostBeginDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView17);
            // localize variables for thread safety
            // viewModel.obCostBeginDate
            android.databinding.ObservableField<java.lang.String> viewModelObCostBeginDate = null;
            // viewModel.obCostBeginDate != null
            boolean viewModelObCostBeginDateJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener mboundView18androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostEndDate.get()
            //         is viewModel.obCostEndDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView18);
            // localize variables for thread safety
            // viewModel.obCostEndDate.get()
            java.lang.String viewModelObCostEndDateGet = null;
            // viewModel.obCostEndDate
            android.databinding.ObservableField<java.lang.String> viewModelObCostEndDate = null;
            // viewModel
            ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
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
            ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
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

    public ActivityGoodsDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 14);
        final Object[] bindings = mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds);
        this.discount = (android.widget.LinearLayout) bindings[33];
        this.discountOn = (android.widget.LinearLayout) bindings[35];
        this.goodLl = (android.widget.LinearLayout) bindings[1];
        this.goodLl.setTag(null);
        this.img1 = (android.widget.ImageView) bindings[19];
        this.img1.setTag(null);
        this.iv0 = (android.widget.ImageView) bindings[22];
        this.iv1 = (android.widget.ImageView) bindings[23];
        this.iv10 = (android.widget.ImageView) bindings[27];
        this.iv2 = (android.widget.ImageView) bindings[24];
        this.iv3 = (android.widget.ImageView) bindings[25];
        this.iv4 = (android.widget.ImageView) bindings[26];
        this.iv5 = (android.widget.ImageView) bindings[28];
        this.iv6 = (android.widget.ImageView) bindings[29];
        this.iv7 = (android.widget.ImageView) bindings[30];
        this.lijianCuxiaojiaTv = (android.widget.TextView) bindings[36];
        this.lijianEt = (android.widget.EditText) bindings[16];
        this.lijianEt.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (android.widget.LinearLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.widget.EditText) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.EditText) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.Button) bindings[20];
        this.mboundView20.setTag(null);
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
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[11];
        this.selectIv0.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[31];
        this.tv1 = (android.widget.TextView) bindings[32];
        this.view = (android.view.View) bindings[21];
        this.zhekouCuxiaojiaTv = (android.widget.TextView) bindings[34];
        this.zhekouEt = (android.widget.EditText) bindings[14];
        this.zhekouEt.setTag(null);
        setRootTag(root);
        // listeners
        mCallback32 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback31 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback37 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback35 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback36 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback33 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback34 = new android.databinding.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
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
            setViewModel((ys.app.petproject.viewmodel.GoodsDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.GoodsDetailViewModel ViewModel) {
        updateRegistration(13, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.GoodsDetailViewModel getViewModel() {
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
                return onChangeViewModelObBarCode((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelYkjString((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelObSalesAmt((android.databinding.ObservableDouble) object, fieldId);
            case 6 :
                return onChangeViewModelMResult((ys.app.petproject.model.GoodInfo) object, fieldId);
            case 7 :
                return onChangeViewModelObCostAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelDiscountString((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelObCostEndDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelVipPic((android.databinding.ObservableBoolean) object, fieldId);
            case 11 :
                return onChangeViewModelPromotion((android.databinding.ObservableBoolean) object, fieldId);
            case 12 :
                return onChangeViewModelObVipAmt((android.databinding.ObservableDouble) object, fieldId);
            case 13 :
                return onChangeViewModel((ys.app.petproject.viewmodel.GoodsDetailViewModel) object, fieldId);
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
    private boolean onChangeViewModelObBarCode(android.databinding.ObservableField<java.lang.String> ViewModelObBarCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYkjString(android.databinding.ObservableField<java.lang.String> ViewModelYkjString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObSalesAmt(android.databinding.ObservableDouble ViewModelObSalesAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMResult(ys.app.petproject.model.GoodInfo ViewModelMResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.typeName) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        else if (fieldId == BR.unit) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostAmt(android.databinding.ObservableField<java.lang.String> ViewModelObCostAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDiscountString(android.databinding.ObservableField<java.lang.String> ViewModelDiscountString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostEndDate(android.databinding.ObservableField<java.lang.String> ViewModelObCostEndDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipPic(android.databinding.ObservableBoolean ViewModelVipPic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPromotion(android.databinding.ObservableBoolean ViewModelPromotion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipAmt(android.databinding.ObservableDouble ViewModelObVipAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.GoodsDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
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
        java.lang.String viewModelMResultUnit = null;
        java.lang.String viewModelMResultName = null;
        android.databinding.ObservableField<java.lang.String> viewModelSelectType = null;
        android.databinding.ObservableInt viewModelSelectTypeId = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObVipAmtMboundView7AndroidStringYuan = null;
        boolean viewModelSelectTypeIdInt2 = false;
        boolean viewModelPromotionGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObCostBeginDate = null;
        android.databinding.ObservableField<java.lang.String> viewModelObBarCode = null;
        java.lang.String viewModelObCostAmtGet = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObVipAmt = null;
        android.databinding.ObservableField<java.lang.String> viewModelYkjString = null;
        android.databinding.ObservableDouble viewModelObSalesAmt = null;
        int viewModelSelectTypeIdInt2ViewVISIBLEViewGONE = 0;
        ys.app.petproject.model.GoodInfo viewModelMResult = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObSalesAmt = null;
        java.lang.String viewModelYkjStringGet = null;
        double viewModelObVipAmtGet = 0.0;
        java.lang.String viewModelObCostBeginDateGet = null;
        int viewModelPromotionViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObCostAmt = null;
        android.databinding.ObservableField<java.lang.String> viewModelDiscountString = null;
        boolean viewModelVipPicGet = false;
        java.lang.String viewModelDiscountStringGet = null;
        java.lang.String viewModelMResultTypeName = null;
        int viewModelMResultStockNum = 0;
        java.lang.String appUtilFormatStandardMoneyViewModelObSalesAmtMboundView8AndroidStringYuan = null;
        java.lang.String viewModelObCostEndDateGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObCostEndDate = null;
        android.databinding.ObservableBoolean viewModelVipPic = null;
        int viewModelSelectTypeIdGet = 0;
        double viewModelObSalesAmtGet = 0.0;
        java.lang.String viewModelSelectTypeGet = null;
        java.lang.String stringValueOfViewModelMResultStockNum = null;
        android.databinding.ObservableBoolean viewModelPromotion = null;
        boolean viewModelSelectTypeIdInt1 = false;
        int viewModelSelectTypeIdInt1ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelObBarCodeGet = null;
        android.databinding.ObservableDouble viewModelObVipAmt = null;
        ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7ffffL) != 0) {


            if ((dirtyFlags & 0x42001L) != 0) {

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
            if ((dirtyFlags & 0x42002L) != 0) {

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
                if((dirtyFlags & 0x42002L) != 0) {
                    if(viewModelSelectTypeIdInt2) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x42002L) != 0) {
                    if(viewModelSelectTypeIdInt1) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
                    viewModelSelectTypeIdInt2ViewVISIBLEViewGONE = ((viewModelSelectTypeIdInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
                    viewModelSelectTypeIdInt1ViewVISIBLEViewGONE = ((viewModelSelectTypeIdInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x42004L) != 0) {

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
            if ((dirtyFlags & 0x42008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obBarCode
                        viewModelObBarCode = viewModel.obBarCode;
                    }
                    updateRegistration(3, viewModelObBarCode);


                    if (viewModelObBarCode != null) {
                        // read viewModel.obBarCode.get()
                        viewModelObBarCodeGet = viewModelObBarCode.get();
                    }
            }
            if ((dirtyFlags & 0x42010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ykjString
                        viewModelYkjString = viewModel.ykjString;
                    }
                    updateRegistration(4, viewModelYkjString);


                    if (viewModelYkjString != null) {
                        // read viewModel.ykjString.get()
                        viewModelYkjStringGet = viewModelYkjString.get();
                    }
            }
            if ((dirtyFlags & 0x42020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obSalesAmt
                        viewModelObSalesAmt = viewModel.obSalesAmt;
                    }
                    updateRegistration(5, viewModelObSalesAmt);


                    if (viewModelObSalesAmt != null) {
                        // read viewModel.obSalesAmt.get()
                        viewModelObSalesAmtGet = viewModelObSalesAmt.get();
                    }


                    // read AppUtil.formatStandardMoney(viewModel.obSalesAmt.get())
                    appUtilFormatStandardMoneyViewModelObSalesAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObSalesAmtGet);


                    // read (AppUtil.formatStandardMoney(viewModel.obSalesAmt.get())) + (@android:string/yuan)
                    appUtilFormatStandardMoneyViewModelObSalesAmtMboundView8AndroidStringYuan = (appUtilFormatStandardMoneyViewModelObSalesAmt) + (mboundView8.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0x7e040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mResult
                        viewModelMResult = viewModel.mResult;
                    }
                    updateRegistration(6, viewModelMResult);

                if ((dirtyFlags & 0x52040L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.unit
                            viewModelMResultUnit = viewModelMResult.getUnit();
                        }
                }
                if ((dirtyFlags & 0x46040L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.name
                            viewModelMResultName = viewModelMResult.getName();
                        }
                }
                if ((dirtyFlags & 0x4a040L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.typeName
                            viewModelMResultTypeName = viewModelMResult.getTypeName();
                        }
                }
                if ((dirtyFlags & 0x62040L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.stockNum
                            viewModelMResultStockNum = viewModelMResult.getStockNum();
                        }


                        // read String.valueOf(viewModel.mResult.stockNum)
                        stringValueOfViewModelMResultStockNum = java.lang.String.valueOf(viewModelMResultStockNum);
                }
            }
            if ((dirtyFlags & 0x42080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostAmt
                        viewModelObCostAmt = viewModel.obCostAmt;
                    }
                    updateRegistration(7, viewModelObCostAmt);


                    if (viewModelObCostAmt != null) {
                        // read viewModel.obCostAmt.get()
                        viewModelObCostAmtGet = viewModelObCostAmt.get();
                    }
            }
            if ((dirtyFlags & 0x42100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.discountString
                        viewModelDiscountString = viewModel.discountString;
                    }
                    updateRegistration(8, viewModelDiscountString);


                    if (viewModelDiscountString != null) {
                        // read viewModel.discountString.get()
                        viewModelDiscountStringGet = viewModelDiscountString.get();
                    }
            }
            if ((dirtyFlags & 0x42200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostEndDate
                        viewModelObCostEndDate = viewModel.obCostEndDate;
                    }
                    updateRegistration(9, viewModelObCostEndDate);


                    if (viewModelObCostEndDate != null) {
                        // read viewModel.obCostEndDate.get()
                        viewModelObCostEndDateGet = viewModelObCostEndDate.get();
                    }
            }
            if ((dirtyFlags & 0x42400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipPic
                        viewModelVipPic = viewModel.vipPic;
                    }
                    updateRegistration(10, viewModelVipPic);


                    if (viewModelVipPic != null) {
                        // read viewModel.vipPic.get()
                        viewModelVipPicGet = viewModelVipPic.get();
                    }
            }
            if ((dirtyFlags & 0x42800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.promotion
                        viewModelPromotion = viewModel.promotion;
                    }
                    updateRegistration(11, viewModelPromotion);


                    if (viewModelPromotion != null) {
                        // read viewModel.promotion.get()
                        viewModelPromotionGet = viewModelPromotion.get();
                    }
                if((dirtyFlags & 0x42800L) != 0) {
                    if(viewModelPromotionGet) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read viewModel.promotion.get() ? View.VISIBLE : View.GONE
                    viewModelPromotionViewVISIBLEViewGONE = ((viewModelPromotionGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x43000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipAmt
                        viewModelObVipAmt = viewModel.obVipAmt;
                    }
                    updateRegistration(12, viewModelObVipAmt);


                    if (viewModelObVipAmt != null) {
                        // read viewModel.obVipAmt.get()
                        viewModelObVipAmtGet = viewModelObVipAmt.get();
                    }


                    // read AppUtil.formatStandardMoney(viewModel.obVipAmt.get())
                    appUtilFormatStandardMoneyViewModelObVipAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObVipAmtGet);


                    // read (AppUtil.formatStandardMoney(viewModel.obVipAmt.get())) + (@android:string/yuan)
                    appUtilFormatStandardMoneyViewModelObVipAmtMboundView7AndroidStringYuan = (appUtilFormatStandardMoneyViewModelObVipAmt) + (mboundView7.getResources().getString(R.string.yuan));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            this.img1.setOnClickListener(mCallback36);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.lijianEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, lijianEtandroidTextAttrChanged);
            this.mboundView12.setOnClickListener(mCallback33);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mboundView17.setOnClickListener(mCallback34);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView17, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView17androidTextAttrChanged);
            this.mboundView18.setOnClickListener(mCallback35);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView18, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView18androidTextAttrChanged);
            this.mboundView20.setOnClickListener(mCallback37);
            this.mboundView6.setOnClickListener(mCallback31);
            this.selectIv0.setOnClickListener(mCallback32);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.zhekouEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, zhekouEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x42400L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setImgIsSelect(this.img1, viewModelVipPicGet);
        }
        if ((dirtyFlags & 0x42010L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.lijianEt, viewModelYkjStringGet);
        }
        if ((dirtyFlags & 0x42800L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelPromotionViewVISIBLEViewGONE);
            this.mboundView20.setVisibility(viewModelPromotionViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x42001L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewModelSelectTypeGet);
        }
        if ((dirtyFlags & 0x42002L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(viewModelSelectTypeIdInt1ViewVISIBLEViewGONE);
            this.mboundView15.setVisibility(viewModelSelectTypeIdInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x42004L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewModelObCostBeginDateGet);
        }
        if ((dirtyFlags & 0x42200L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, viewModelObCostEndDateGet);
        }
        if ((dirtyFlags & 0x46040L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMResultName);
        }
        if ((dirtyFlags & 0x42008L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObBarCodeGet);
        }
        if ((dirtyFlags & 0x4a040L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelMResultTypeName);
        }
        if ((dirtyFlags & 0x52040L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelMResultUnit);
        }
        if ((dirtyFlags & 0x42080L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelObCostAmtGet);
        }
        if ((dirtyFlags & 0x43000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, appUtilFormatStandardMoneyViewModelObVipAmtMboundView7AndroidStringYuan);
        }
        if ((dirtyFlags & 0x42020L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, appUtilFormatStandardMoneyViewModelObSalesAmtMboundView8AndroidStringYuan);
        }
        if ((dirtyFlags & 0x62040L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, stringValueOfViewModelMResultStockNum);
        }
        if ((dirtyFlags & 0x42100L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.zhekouEt, viewModelDiscountStringGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.verPassword();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickButton();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.costEndDateTimeClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.vipClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.GoodsDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.costBeginDateTimeClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityGoodsDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityGoodsDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityGoodsDetailBinding>inflate(inflater, ys.app.petproject.R.layout.activity_goods_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityGoodsDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityGoodsDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_goods_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityGoodsDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityGoodsDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_goods_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityGoodsDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.selectType
        flag 1 (0x2L): viewModel.selectTypeId
        flag 2 (0x3L): viewModel.obCostBeginDate
        flag 3 (0x4L): viewModel.obBarCode
        flag 4 (0x5L): viewModel.ykjString
        flag 5 (0x6L): viewModel.obSalesAmt
        flag 6 (0x7L): viewModel.mResult
        flag 7 (0x8L): viewModel.obCostAmt
        flag 8 (0x9L): viewModel.discountString
        flag 9 (0xaL): viewModel.obCostEndDate
        flag 10 (0xbL): viewModel.vipPic
        flag 11 (0xcL): viewModel.promotion
        flag 12 (0xdL): viewModel.obVipAmt
        flag 13 (0xeL): viewModel
        flag 14 (0xfL): viewModel.mResult.name
        flag 15 (0x10L): viewModel.mResult.typeName
        flag 16 (0x11L): viewModel.mResult.unit
        flag 17 (0x12L): viewModel.mResult.stockNum
        flag 18 (0x13L): null
        flag 19 (0x14L): viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.promotion.get() ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.promotion.get() ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}