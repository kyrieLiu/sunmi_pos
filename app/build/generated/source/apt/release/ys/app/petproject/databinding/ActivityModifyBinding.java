package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityModifyBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 14);
        sViewsWithIds.put(R.id.iv0, 15);
        sViewsWithIds.put(R.id.tv0, 16);
        sViewsWithIds.put(R.id.tv1, 17);
        sViewsWithIds.put(R.id.iv, 18);
        sViewsWithIds.put(R.id.tv, 19);
        sViewsWithIds.put(R.id.tv2, 20);
        sViewsWithIds.put(R.id.tv_see_vipMoney, 21);
    }
    // views
    @NonNull
    public final ys.app.petproject.widget.LastInputEditText etCostMoney;
    @NonNull
    public final ys.app.petproject.widget.LastInputEditText etVipMoney;
    @NonNull
    public final android.widget.ImageView iv;
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView11;
    @NonNull
    private final android.widget.EditText mboundView12;
    @NonNull
    private final android.widget.Button mboundView13;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.ImageButton mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.EditText mboundView7;
    @NonNull
    public final android.widget.TextView selectIv;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.TextView tvSeeCostMoney;
    @NonNull
    public final android.widget.TextView tvSeeVipMoney;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.ModifyViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickScanAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etCostMoneyandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostAmt.get()
            //         is viewModel.obCostAmt.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etCostMoney);
            // localize variables for thread safety
            // viewModel.obCostAmt
            android.databinding.ObservableField<java.lang.String> viewModelObCostAmt = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel.obCostAmt.get()
            java.lang.String viewModelObCostAmtGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obCostAmt != null
            boolean viewModelObCostAmtJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCostAmt = viewModel.obCostAmt;

                viewModelObCostAmtJavaLangObjectNull = (viewModelObCostAmt) != (null);
                if (viewModelObCostAmtJavaLangObjectNull) {




                    viewModelObCostAmt.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener etVipMoneyandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obVipAmt.get()
            //         is viewModel.obVipAmt.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etVipMoney);
            // localize variables for thread safety
            // viewModel.obVipAmt != null
            boolean viewModelObVipAmtJavaLangObjectNull = false;
            // viewModel.obVipAmt
            android.databinding.ObservableField<java.lang.String> viewModelObVipAmt = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel.obVipAmt.get()
            java.lang.String viewModelObVipAmtGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObVipAmt = viewModel.obVipAmt;

                viewModelObVipAmtJavaLangObjectNull = (viewModelObVipAmt) != (null);
                if (viewModelObVipAmtJavaLangObjectNull) {




                    viewModelObVipAmt.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obName.get()
            //         is viewModel.obName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.obName != null
            boolean viewModelObNameJavaLangObjectNull = false;
            // viewModel.obName.get()
            java.lang.String viewModelObNameGet = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel.obName
            android.databinding.ObservableField<java.lang.String> viewModelObName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObName = viewModel.obName;

                viewModelObNameJavaLangObjectNull = (viewModelObName) != (null);
                if (viewModelObNameJavaLangObjectNull) {




                    viewModelObName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView11androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obRealAmt.get()
            //         is viewModel.obRealAmt.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView11);
            // localize variables for thread safety
            // viewModel.obRealAmt
            android.databinding.ObservableField<java.lang.String> viewModelObRealAmt = null;
            // viewModel.obRealAmt != null
            boolean viewModelObRealAmtJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obRealAmt.get()
            java.lang.String viewModelObRealAmtGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObRealAmt = viewModel.obRealAmt;

                viewModelObRealAmtJavaLangObjectNull = (viewModelObRealAmt) != (null);
                if (viewModelObRealAmtJavaLangObjectNull) {




                    viewModelObRealAmt.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obStockNum.get()
            //         is viewModel.obStockNum.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewModel.obStockNum
            android.databinding.ObservableField<java.lang.String> viewModelObStockNum = null;
            // viewModel.obStockNum.get()
            java.lang.String viewModelObStockNumGet = null;
            // viewModel.obStockNum != null
            boolean viewModelObStockNumJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObStockNum = viewModel.obStockNum;

                viewModelObStockNumJavaLangObjectNull = (viewModelObStockNum) != (null);
                if (viewModelObStockNumJavaLangObjectNull) {




                    viewModelObStockNum.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obBarCode.get()
            //         is viewModel.obBarCode.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.obBarCode.get()
            java.lang.String viewModelObBarCodeGet = null;
            // viewModel.obBarCode
            android.databinding.ObservableField<java.lang.String> viewModelObBarCode = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel.obBarCode != null
            boolean viewModelObBarCodeJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObBarCode = viewModel.obBarCode;

                viewModelObBarCodeJavaLangObjectNull = (viewModelObBarCode) != (null);
                if (viewModelObBarCodeJavaLangObjectNull) {




                    viewModelObBarCode.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obTypeName.get()
            //         is viewModel.obTypeName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.obTypeName.get()
            java.lang.String viewModelObTypeNameGet = null;
            // viewModel.obTypeName
            android.databinding.ObservableField<java.lang.String> viewModelObTypeName = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obTypeName != null
            boolean viewModelObTypeNameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObTypeName = viewModel.obTypeName;

                viewModelObTypeNameJavaLangObjectNull = (viewModelObTypeName) != (null);
                if (viewModelObTypeNameJavaLangObjectNull) {




                    viewModelObTypeName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obUnitName.get()
            //         is viewModel.obUnitName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewModel.obUnitName != null
            boolean viewModelObUnitNameJavaLangObjectNull = false;
            // viewModel.obUnitName.get()
            java.lang.String viewModelObUnitNameGet = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obUnitName
            android.databinding.ObservableField<java.lang.String> viewModelObUnitName = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObUnitName = viewModel.obUnitName;

                viewModelObUnitNameJavaLangObjectNull = (viewModelObUnitName) != (null);
                if (viewModelObUnitNameJavaLangObjectNull) {




                    viewModelObUnitName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener tvSeeCostMoneyandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obSeeCostAmt.get()
            //         is viewModel.obSeeCostAmt.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(tvSeeCostMoney);
            // localize variables for thread safety
            // viewModel.obSeeCostAmt.get()
            java.lang.String viewModelObSeeCostAmtGet = null;
            // viewModel.obSeeCostAmt != null
            boolean viewModelObSeeCostAmtJavaLangObjectNull = false;
            // viewModel.obSeeCostAmt
            android.databinding.ObservableField<java.lang.String> viewModelObSeeCostAmt = null;
            // viewModel
            ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObSeeCostAmt = viewModel.obSeeCostAmt;

                viewModelObSeeCostAmtJavaLangObjectNull = (viewModelObSeeCostAmt) != (null);
                if (viewModelObSeeCostAmtJavaLangObjectNull) {




                    viewModelObSeeCostAmt.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityModifyBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 12);
        final Object[] bindings = mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds);
        this.etCostMoney = (ys.app.petproject.widget.LastInputEditText) bindings[8];
        this.etCostMoney.setTag(null);
        this.etVipMoney = (ys.app.petproject.widget.LastInputEditText) bindings[10];
        this.etVipMoney.setTag(null);
        this.iv = (android.widget.ImageView) bindings[18];
        this.iv0 = (android.widget.ImageView) bindings[15];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ys.app.petproject.widget.LastInputEditText) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.EditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.Button) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.EditText) bindings[7];
        this.mboundView7.setTag(null);
        this.selectIv = (android.widget.TextView) bindings[6];
        this.selectIv.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[4];
        this.selectIv0.setTag(null);
        this.tv = (android.widget.TextView) bindings[19];
        this.tv0 = (android.widget.TextView) bindings[16];
        this.tv1 = (android.widget.TextView) bindings[17];
        this.tv2 = (android.widget.TextView) bindings[20];
        this.tvSeeCostMoney = (android.widget.TextView) bindings[9];
        this.tvSeeCostMoney.setTag(null);
        this.tvSeeVipMoney = (android.widget.TextView) bindings[21];
        this.view = (android.view.View) bindings[14];
        setRootTag(root);
        // listeners
        mCallback9 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback8 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback7 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
            setViewModel((ys.app.petproject.viewmodel.ModifyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.ModifyViewModel ViewModel) {
        updateRegistration(11, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.ModifyViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObBarCode((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObSeeCostAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObRealAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelGetTypeHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelObCostAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelObTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelObName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelObUnitName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelObStockNum((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelGetUnitHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 10 :
                return onChangeViewModelObVipAmt((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModel((ys.app.petproject.viewmodel.ModifyViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObBarCode(android.databinding.ObservableField<java.lang.String> ViewModelObBarCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObSeeCostAmt(android.databinding.ObservableField<java.lang.String> ViewModelObSeeCostAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObRealAmt(android.databinding.ObservableField<java.lang.String> ViewModelObRealAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetTypeHttpSuccess(android.databinding.ObservableBoolean ViewModelGetTypeHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostAmt(android.databinding.ObservableField<java.lang.String> ViewModelObCostAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObName(android.databinding.ObservableField<java.lang.String> ViewModelObName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObUnitName(android.databinding.ObservableField<java.lang.String> ViewModelObUnitName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObStockNum(android.databinding.ObservableField<java.lang.String> ViewModelObStockNum, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetUnitHttpSuccess(android.databinding.ObservableBoolean ViewModelGetUnitHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipAmt(android.databinding.ObservableField<java.lang.String> ViewModelObVipAmt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.ModifyViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
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
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObStockNumGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObBarCode = null;
        android.text.TextWatcher viewModelMChangedListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObSeeCostAmt = null;
        android.text.TextWatcher viewModelMVipAmtChangedListener = null;
        java.lang.String viewModelObCostAmtGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObRealAmt = null;
        android.databinding.ObservableBoolean viewModelGetTypeHttpSuccess = null;
        java.lang.String viewModelObVipAmtGet = null;
        int viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObCostAmt = null;
        android.databinding.ObservableField<java.lang.String> viewModelObTypeName = null;
        java.lang.String viewModelObRealAmtGet = null;
        java.lang.String viewModelObSeeCostAmtGet = null;
        android.view.View.OnClickListener viewModelClickScanAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObNameGet = null;
        boolean viewModelGetUnitHttpSuccessGet = false;
        boolean viewModelGetTypeHttpSuccessGet = false;
        int viewModelGetUnitHttpSuccessViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObName = null;
        android.databinding.ObservableField<java.lang.String> viewModelObUnitName = null;
        java.lang.String viewModelObUnitNameGet = null;
        android.text.TextWatcher viewModelMTCredTSChangedListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObStockNum = null;
        android.databinding.ObservableBoolean viewModelGetUnitHttpSuccess = null;
        java.lang.String viewModelObBarCodeGet = null;
        java.lang.String viewModelObTypeNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipAmt = null;
        ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.mChangedListener
                        viewModelMChangedListener = viewModel.mChangedListener;
                        // read viewModel.mVipAmtChangedListener
                        viewModelMVipAmtChangedListener = viewModel.mVipAmtChangedListener;
                        // read viewModel::clickScan
                        viewModelClickScanAndroidViewViewOnClickListener = (((mViewModelClickScanAndroidViewViewOnClickListener == null) ? (mViewModelClickScanAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickScanAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.mTCredTSChangedListener
                        viewModelMTCredTSChangedListener = viewModel.mTCredTSChangedListener;
                    }
            }
            if ((dirtyFlags & 0x1801L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obBarCode
                        viewModelObBarCode = viewModel.obBarCode;
                    }
                    updateRegistration(0, viewModelObBarCode);


                    if (viewModelObBarCode != null) {
                        // read viewModel.obBarCode.get()
                        viewModelObBarCodeGet = viewModelObBarCode.get();
                    }
            }
            if ((dirtyFlags & 0x1802L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obSeeCostAmt
                        viewModelObSeeCostAmt = viewModel.obSeeCostAmt;
                    }
                    updateRegistration(1, viewModelObSeeCostAmt);


                    if (viewModelObSeeCostAmt != null) {
                        // read viewModel.obSeeCostAmt.get()
                        viewModelObSeeCostAmtGet = viewModelObSeeCostAmt.get();
                    }
            }
            if ((dirtyFlags & 0x1804L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obRealAmt
                        viewModelObRealAmt = viewModel.obRealAmt;
                    }
                    updateRegistration(2, viewModelObRealAmt);


                    if (viewModelObRealAmt != null) {
                        // read viewModel.obRealAmt.get()
                        viewModelObRealAmtGet = viewModelObRealAmt.get();
                    }
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getTypeHttpSuccess
                        viewModelGetTypeHttpSuccess = viewModel.getTypeHttpSuccess;
                    }
                    updateRegistration(3, viewModelGetTypeHttpSuccess);


                    if (viewModelGetTypeHttpSuccess != null) {
                        // read viewModel.getTypeHttpSuccess.get()
                        viewModelGetTypeHttpSuccessGet = viewModelGetTypeHttpSuccess.get();
                    }
                if((dirtyFlags & 0x1808L) != 0) {
                    if(viewModelGetTypeHttpSuccessGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = ((viewModelGetTypeHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostAmt
                        viewModelObCostAmt = viewModel.obCostAmt;
                    }
                    updateRegistration(4, viewModelObCostAmt);


                    if (viewModelObCostAmt != null) {
                        // read viewModel.obCostAmt.get()
                        viewModelObCostAmtGet = viewModelObCostAmt.get();
                    }
            }
            if ((dirtyFlags & 0x1820L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obTypeName
                        viewModelObTypeName = viewModel.obTypeName;
                    }
                    updateRegistration(5, viewModelObTypeName);


                    if (viewModelObTypeName != null) {
                        // read viewModel.obTypeName.get()
                        viewModelObTypeNameGet = viewModelObTypeName.get();
                    }
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obName
                        viewModelObName = viewModel.obName;
                    }
                    updateRegistration(6, viewModelObName);


                    if (viewModelObName != null) {
                        // read viewModel.obName.get()
                        viewModelObNameGet = viewModelObName.get();
                    }
            }
            if ((dirtyFlags & 0x1880L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obUnitName
                        viewModelObUnitName = viewModel.obUnitName;
                    }
                    updateRegistration(7, viewModelObUnitName);


                    if (viewModelObUnitName != null) {
                        // read viewModel.obUnitName.get()
                        viewModelObUnitNameGet = viewModelObUnitName.get();
                    }
            }
            if ((dirtyFlags & 0x1900L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obStockNum
                        viewModelObStockNum = viewModel.obStockNum;
                    }
                    updateRegistration(8, viewModelObStockNum);


                    if (viewModelObStockNum != null) {
                        // read viewModel.obStockNum.get()
                        viewModelObStockNumGet = viewModelObStockNum.get();
                    }
            }
            if ((dirtyFlags & 0x1a00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getUnitHttpSuccess
                        viewModelGetUnitHttpSuccess = viewModel.getUnitHttpSuccess;
                    }
                    updateRegistration(9, viewModelGetUnitHttpSuccess);


                    if (viewModelGetUnitHttpSuccess != null) {
                        // read viewModel.getUnitHttpSuccess.get()
                        viewModelGetUnitHttpSuccessGet = viewModelGetUnitHttpSuccess.get();
                    }
                if((dirtyFlags & 0x1a00L) != 0) {
                    if(viewModelGetUnitHttpSuccessGet) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetUnitHttpSuccessViewVISIBLEViewGONE = ((viewModelGetUnitHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1c00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipAmt
                        viewModelObVipAmt = viewModel.obVipAmt;
                    }
                    updateRegistration(10, viewModelObVipAmt);


                    if (viewModelObVipAmt != null) {
                        // read viewModel.obVipAmt.get()
                        viewModelObVipAmtGet = viewModelObVipAmt.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etCostMoney, viewModelObCostAmtGet);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.etCostMoney, viewModelMChangedListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.etVipMoney, viewModelMVipAmtChangedListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView11, viewModelMTCredTSChangedListener);
            this.mboundView13.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(viewModelClickScanAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCostMoney, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCostMoneyandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etVipMoney, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etVipMoneyandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView11, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView11androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView5.setOnClickListener(mCallback7);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            this.selectIv.setOnClickListener(mCallback8);
            this.selectIv0.setOnClickListener(mCallback6);
            this.tvSeeCostMoney.setOnClickListener(mCallback9);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvSeeCostMoney, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvSeeCostMoneyandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1c00L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etVipMoney, viewModelObVipAmtGet);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObNameGet);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelObRealAmtGet);
        }
        if ((dirtyFlags & 0x1900L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewModelObStockNumGet);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelObBarCodeGet);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObTypeNameGet);
        }
        if ((dirtyFlags & 0x1880L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelObUnitNameGet);
        }
        if ((dirtyFlags & 0x1a00L) != 0) {
            // api target 1

            this.selectIv.setVisibility(viewModelGetUnitHttpSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 1

            this.selectIv0.setVisibility(viewModelGetTypeHttpSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvSeeCostMoney, viewModelObSeeCostAmtGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ModifyViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.ModifyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.ModifyViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.ModifyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickScan(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.verPassword();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectUnitDialog();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickSelectTypeButton();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.ModifyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickSelectTypeButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityModifyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityModifyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityModifyBinding>inflate(inflater, ys.app.petproject.R.layout.activity_modify, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityModifyBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityModifyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_modify, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityModifyBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityModifyBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_modify_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityModifyBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obBarCode
        flag 1 (0x2L): viewModel.obSeeCostAmt
        flag 2 (0x3L): viewModel.obRealAmt
        flag 3 (0x4L): viewModel.getTypeHttpSuccess
        flag 4 (0x5L): viewModel.obCostAmt
        flag 5 (0x6L): viewModel.obTypeName
        flag 6 (0x7L): viewModel.obName
        flag 7 (0x8L): viewModel.obUnitName
        flag 8 (0x9L): viewModel.obStockNum
        flag 9 (0xaL): viewModel.getUnitHttpSuccess
        flag 10 (0xbL): viewModel.obVipAmt
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}