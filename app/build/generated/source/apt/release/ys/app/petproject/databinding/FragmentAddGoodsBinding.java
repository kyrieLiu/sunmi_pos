package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddGoodsBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv0, 12);
        sViewsWithIds.put(R.id.tv0, 13);
        sViewsWithIds.put(R.id.tv1, 14);
        sViewsWithIds.put(R.id.iv, 15);
        sViewsWithIds.put(R.id.tv, 16);
        sViewsWithIds.put(R.id.tv2, 17);
        sViewsWithIds.put(R.id.iv5, 18);
        sViewsWithIds.put(R.id.tv5, 19);
        sViewsWithIds.put(R.id.tv6, 20);
        sViewsWithIds.put(R.id.iv8, 21);
        sViewsWithIds.put(R.id.tv8, 22);
        sViewsWithIds.put(R.id.tv9, 23);
        sViewsWithIds.put(R.id.iv10, 24);
        sViewsWithIds.put(R.id.tv10, 25);
        sViewsWithIds.put(R.id.tv11, 26);
    }
    // views
    @NonNull
    public final android.widget.EditText editText;
    @NonNull
    public final android.widget.ImageView iv;
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv10;
    @NonNull
    public final android.widget.ImageView iv5;
    @NonNull
    public final android.widget.ImageView iv8;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView10;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.ImageButton mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView8;
    @NonNull
    private final ys.app.petproject.widget.LastInputEditText mboundView9;
    @NonNull
    public final android.widget.ImageView selectIv;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.widget.TextView tv10;
    @NonNull
    public final android.widget.TextView tv11;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.TextView tv5;
    @NonNull
    public final android.widget.TextView tv6;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tv9;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.AddGoodsViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickScanAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsOutOfDate.get()
            //         is viewModel.obGoodsOutOfDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText);
            // localize variables for thread safety
            // viewModel.obGoodsOutOfDate.get()
            java.lang.String viewModelObGoodsOutOfDateGet = null;
            // viewModel.obGoodsOutOfDate != null
            boolean viewModelObGoodsOutOfDateJavaLangObjectNull = false;
            // viewModel.obGoodsOutOfDate
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsOutOfDate = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsOutOfDate = viewModel.obGoodsOutOfDate;

                viewModelObGoodsOutOfDateJavaLangObjectNull = (viewModelObGoodsOutOfDate) != (null);
                if (viewModelObGoodsOutOfDateJavaLangObjectNull) {




                    viewModelObGoodsOutOfDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsName.get()
            //         is viewModel.obGoodsName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.obGoodsName
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsName = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGoodsName != null
            boolean viewModelObGoodsNameJavaLangObjectNull = false;
            // viewModel.obGoodsName.get()
            java.lang.String viewModelObGoodsNameGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsName = viewModel.obGoodsName;

                viewModelObGoodsNameJavaLangObjectNull = (viewModelObGoodsName) != (null);
                if (viewModelObGoodsNameJavaLangObjectNull) {




                    viewModelObGoodsName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsProductDate.get()
            //         is viewModel.obGoodsProductDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // viewModel.obGoodsProductDate
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsProductDate = null;
            // viewModel.obGoodsProductDate.get()
            java.lang.String viewModelObGoodsProductDateGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGoodsProductDate != null
            boolean viewModelObGoodsProductDateJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsProductDate = viewModel.obGoodsProductDate;

                viewModelObGoodsProductDateJavaLangObjectNull = (viewModelObGoodsProductDate) != (null);
                if (viewModelObGoodsProductDateJavaLangObjectNull) {




                    viewModelObGoodsProductDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsCode.get()
            //         is viewModel.obGoodsCode.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.obGoodsCode.get()
            java.lang.String viewModelObGoodsCodeGet = null;
            // viewModel.obGoodsCode
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsCode = null;
            // viewModel.obGoodsCode != null
            boolean viewModelObGoodsCodeJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsCode = viewModel.obGoodsCode;

                viewModelObGoodsCodeJavaLangObjectNull = (viewModelObGoodsCode) != (null);
                if (viewModelObGoodsCodeJavaLangObjectNull) {




                    viewModelObGoodsCode.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsTypeName.get()
            //         is viewModel.obGoodsTypeName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.obGoodsTypeName.get()
            java.lang.String viewModelObGoodsTypeNameGet = null;
            // viewModel.obGoodsTypeName != null
            boolean viewModelObGoodsTypeNameJavaLangObjectNull = false;
            // viewModel.obGoodsTypeName
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsTypeName = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsTypeName = viewModel.obGoodsTypeName;

                viewModelObGoodsTypeNameJavaLangObjectNull = (viewModelObGoodsTypeName) != (null);
                if (viewModelObGoodsTypeNameJavaLangObjectNull) {




                    viewModelObGoodsTypeName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsUnitName.get()
            //         is viewModel.obGoodsUnitName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewModel.obGoodsUnitName != null
            boolean viewModelObGoodsUnitNameJavaLangObjectNull = false;
            // viewModel.obGoodsUnitName
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsUnitName = null;
            // viewModel.obGoodsUnitName.get()
            java.lang.String viewModelObGoodsUnitNameGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsUnitName = viewModel.obGoodsUnitName;

                viewModelObGoodsUnitNameJavaLangObjectNull = (viewModelObGoodsUnitName) != (null);
                if (viewModelObGoodsUnitNameJavaLangObjectNull) {




                    viewModelObGoodsUnitName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsCostPrice.get()
            //         is viewModel.obGoodsCostPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewModel.obGoodsCostPrice
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsCostPrice = null;
            // viewModel.obGoodsCostPrice.get()
            java.lang.String viewModelObGoodsCostPriceGet = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel.obGoodsCostPrice != null
            boolean viewModelObGoodsCostPriceJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsCostPrice = viewModel.obGoodsCostPrice;

                viewModelObGoodsCostPriceJavaLangObjectNull = (viewModelObGoodsCostPrice) != (null);
                if (viewModelObGoodsCostPriceJavaLangObjectNull) {




                    viewModelObGoodsCostPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsRealPrice.get()
            //         is viewModel.obGoodsRealPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewModel.obGoodsRealPrice != null
            boolean viewModelObGoodsRealPriceJavaLangObjectNull = false;
            // viewModel.obGoodsRealPrice.get()
            java.lang.String viewModelObGoodsRealPriceGet = null;
            // viewModel.obGoodsRealPrice
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsRealPrice = null;
            // viewModel
            ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsRealPrice = viewModel.obGoodsRealPrice;

                viewModelObGoodsRealPriceJavaLangObjectNull = (viewModelObGoodsRealPrice) != (null);
                if (viewModelObGoodsRealPriceJavaLangObjectNull) {




                    viewModelObGoodsRealPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddGoodsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 11);
        final Object[] bindings = mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds);
        this.editText = (android.widget.EditText) bindings[11];
        this.editText.setTag(null);
        this.iv = (android.widget.ImageView) bindings[15];
        this.iv0 = (android.widget.ImageView) bindings[12];
        this.iv10 = (android.widget.ImageView) bindings[24];
        this.iv5 = (android.widget.ImageView) bindings[18];
        this.iv8 = (android.widget.ImageView) bindings[21];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.EditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (ys.app.petproject.widget.LastInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (ys.app.petproject.widget.LastInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv = (android.widget.ImageView) bindings[6];
        this.selectIv.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[4];
        this.selectIv0.setTag(null);
        this.tv = (android.widget.TextView) bindings[16];
        this.tv0 = (android.widget.TextView) bindings[13];
        this.tv1 = (android.widget.TextView) bindings[14];
        this.tv10 = (android.widget.TextView) bindings[25];
        this.tv11 = (android.widget.TextView) bindings[26];
        this.tv2 = (android.widget.TextView) bindings[17];
        this.tv5 = (android.widget.TextView) bindings[19];
        this.tv6 = (android.widget.TextView) bindings[20];
        this.tv8 = (android.widget.TextView) bindings[22];
        this.tv9 = (android.widget.TextView) bindings[23];
        setRootTag(root);
        // listeners
        mCallback48 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setViewModel((ys.app.petproject.viewmodel.AddGoodsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.AddGoodsViewModel ViewModel) {
        updateRegistration(10, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.AddGoodsViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObGoodsCostPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObGoodsName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObGoodsCode((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObGoodsRealPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelObGoodsUnitName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelGetTypeHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelObGoodsOutOfDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelObGoodsProductDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelGetUnitHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 9 :
                return onChangeViewModelObGoodsTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModel((ys.app.petproject.viewmodel.AddGoodsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsCostPrice(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsCostPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsName(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsCode(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsRealPrice(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsRealPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsUnitName(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsUnitName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetTypeHttpSuccess(android.databinding.ObservableBoolean ViewModelGetTypeHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsOutOfDate(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsOutOfDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsProductDate(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsProductDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetUnitHttpSuccess(android.databinding.ObservableBoolean ViewModelGetUnitHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.AddGoodsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        android.view.View.OnClickListener viewModelClickSelectUnitButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsCostPrice = null;
        java.lang.String viewModelObGoodsUnitNameGet = null;
        java.lang.String viewModelObGoodsCostPriceGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsName = null;
        android.text.TextWatcher viewModelMChangedListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsCode = null;
        boolean viewModelGetTypeHttpSuccessBooleanTrueBooleanFalse = false;
        java.lang.String viewModelObGoodsRealPriceGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsRealPrice = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsUnitName = null;
        java.lang.String viewModelObGoodsCodeGet = null;
        android.databinding.ObservableBoolean viewModelGetTypeHttpSuccess = null;
        int viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickScanAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = null;
        boolean viewModelGetUnitHttpSuccessGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsOutOfDate = null;
        boolean viewModelGetTypeHttpSuccessGet = false;
        int viewModelGetUnitHttpSuccessViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsProductDate = null;
        android.text.TextWatcher viewModelMTCredTSChangedListener = null;
        android.databinding.ObservableBoolean viewModelGetUnitHttpSuccess = null;
        java.lang.String viewModelObGoodsTypeNameGet = null;
        java.lang.String viewModelObGoodsProductDateGet = null;
        boolean viewModelGetUnitHttpSuccessBooleanTrueBooleanFalse = false;
        java.lang.String viewModelObGoodsOutOfDateGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsTypeName = null;
        ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
        java.lang.String viewModelObGoodsNameGet = null;

        if ((dirtyFlags & 0xfffL) != 0) {


            if ((dirtyFlags & 0xd00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickSelectUnitButton
                        viewModelClickSelectUnitButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.getUnitHttpSuccess
                        viewModelGetUnitHttpSuccess = viewModel.getUnitHttpSuccess;
                    }
                    updateRegistration(8, viewModelGetUnitHttpSuccess);


                    if (viewModelGetUnitHttpSuccess != null) {
                        // read viewModel.getUnitHttpSuccess.get()
                        viewModelGetUnitHttpSuccessGet = viewModelGetUnitHttpSuccess.get();
                    }
                if((dirtyFlags & 0xd00L) != 0) {
                    if(viewModelGetUnitHttpSuccessGet) {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetUnitHttpSuccessViewVISIBLEViewGONE = ((viewModelGetUnitHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.getUnitHttpSuccess.get() ? true : false
                    viewModelGetUnitHttpSuccessBooleanTrueBooleanFalse = ((viewModelGetUnitHttpSuccessGet) ? (true) : (false));
            }
            if ((dirtyFlags & 0xc01L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsCostPrice
                        viewModelObGoodsCostPrice = viewModel.obGoodsCostPrice;
                    }
                    updateRegistration(0, viewModelObGoodsCostPrice);


                    if (viewModelObGoodsCostPrice != null) {
                        // read viewModel.obGoodsCostPrice.get()
                        viewModelObGoodsCostPriceGet = viewModelObGoodsCostPrice.get();
                    }
            }
            if ((dirtyFlags & 0xc02L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsName
                        viewModelObGoodsName = viewModel.obGoodsName;
                    }
                    updateRegistration(1, viewModelObGoodsName);


                    if (viewModelObGoodsName != null) {
                        // read viewModel.obGoodsName.get()
                        viewModelObGoodsNameGet = viewModelObGoodsName.get();
                    }
            }
            if ((dirtyFlags & 0xc00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mChangedListener
                        viewModelMChangedListener = viewModel.mChangedListener;
                        // read viewModel::clickScan
                        viewModelClickScanAndroidViewViewOnClickListener = (((mViewModelClickScanAndroidViewViewOnClickListener == null) ? (mViewModelClickScanAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickScanAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.mTCredTSChangedListener
                        viewModelMTCredTSChangedListener = viewModel.mTCredTSChangedListener;
                    }
            }
            if ((dirtyFlags & 0xc04L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsCode
                        viewModelObGoodsCode = viewModel.obGoodsCode;
                    }
                    updateRegistration(2, viewModelObGoodsCode);


                    if (viewModelObGoodsCode != null) {
                        // read viewModel.obGoodsCode.get()
                        viewModelObGoodsCodeGet = viewModelObGoodsCode.get();
                    }
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsRealPrice
                        viewModelObGoodsRealPrice = viewModel.obGoodsRealPrice;
                    }
                    updateRegistration(3, viewModelObGoodsRealPrice);


                    if (viewModelObGoodsRealPrice != null) {
                        // read viewModel.obGoodsRealPrice.get()
                        viewModelObGoodsRealPriceGet = viewModelObGoodsRealPrice.get();
                    }
            }
            if ((dirtyFlags & 0xc10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsUnitName
                        viewModelObGoodsUnitName = viewModel.obGoodsUnitName;
                    }
                    updateRegistration(4, viewModelObGoodsUnitName);


                    if (viewModelObGoodsUnitName != null) {
                        // read viewModel.obGoodsUnitName.get()
                        viewModelObGoodsUnitNameGet = viewModelObGoodsUnitName.get();
                    }
            }
            if ((dirtyFlags & 0xc20L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getTypeHttpSuccess
                        viewModelGetTypeHttpSuccess = viewModel.getTypeHttpSuccess;
                        // read viewModel::clickSelectTypeButton
                        viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
                    updateRegistration(5, viewModelGetTypeHttpSuccess);


                    if (viewModelGetTypeHttpSuccess != null) {
                        // read viewModel.getTypeHttpSuccess.get()
                        viewModelGetTypeHttpSuccessGet = viewModelGetTypeHttpSuccess.get();
                    }
                if((dirtyFlags & 0xc20L) != 0) {
                    if(viewModelGetTypeHttpSuccessGet) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.getTypeHttpSuccess.get() ? true : false
                    viewModelGetTypeHttpSuccessBooleanTrueBooleanFalse = ((viewModelGetTypeHttpSuccessGet) ? (true) : (false));
                    // read viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = ((viewModelGetTypeHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc40L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsOutOfDate
                        viewModelObGoodsOutOfDate = viewModel.obGoodsOutOfDate;
                    }
                    updateRegistration(6, viewModelObGoodsOutOfDate);


                    if (viewModelObGoodsOutOfDate != null) {
                        // read viewModel.obGoodsOutOfDate.get()
                        viewModelObGoodsOutOfDateGet = viewModelObGoodsOutOfDate.get();
                    }
            }
            if ((dirtyFlags & 0xc80L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsProductDate
                        viewModelObGoodsProductDate = viewModel.obGoodsProductDate;
                    }
                    updateRegistration(7, viewModelObGoodsProductDate);


                    if (viewModelObGoodsProductDate != null) {
                        // read viewModel.obGoodsProductDate.get()
                        viewModelObGoodsProductDateGet = viewModelObGoodsProductDate.get();
                    }
            }
            if ((dirtyFlags & 0xe00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsTypeName
                        viewModelObGoodsTypeName = viewModel.obGoodsTypeName;
                    }
                    updateRegistration(9, viewModelObGoodsTypeName);


                    if (viewModelObGoodsTypeName != null) {
                        // read viewModel.obGoodsTypeName.get()
                        viewModelObGoodsTypeNameGet = viewModelObGoodsTypeName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc40L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, viewModelObGoodsOutOfDateGet);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView10.setOnClickListener(mCallback48);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc02L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObGoodsNameGet);
        }
        if ((dirtyFlags & 0xc80L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelObGoodsProductDateGet);
        }
        if ((dirtyFlags & 0xc04L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelObGoodsCodeGet);
        }
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelClickScanAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView8, viewModelMChangedListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView9, viewModelMTCredTSChangedListener);
            this.selectIv.setOnClickListener(viewModelClickSelectUnitButtonAndroidViewViewOnClickListener);
            this.selectIv0.setOnClickListener(viewModelClickSelectTypeButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xe00L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObGoodsTypeNameGet);
        }
        if ((dirtyFlags & 0xc20L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView5, (android.view.View.OnClickListener)viewModelClickSelectTypeButtonAndroidViewViewOnClickListener, viewModelGetTypeHttpSuccessBooleanTrueBooleanFalse);
            this.selectIv0.setVisibility(viewModelGetTypeHttpSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelObGoodsUnitNameGet);
        }
        if ((dirtyFlags & 0xd00L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView7, (android.view.View.OnClickListener)viewModelClickSelectUnitButtonAndroidViewViewOnClickListener, viewModelGetUnitHttpSuccessBooleanTrueBooleanFalse);
            this.selectIv.setVisibility(viewModelGetUnitHttpSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelObGoodsCostPriceGet);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelObGoodsRealPriceGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddGoodsViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.AddGoodsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectUnitButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddGoodsViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.AddGoodsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickScan(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AddGoodsViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.AddGoodsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectTypeButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.AddGoodsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.manufactureTimeClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentAddGoodsBinding>inflate(inflater, ys.app.petproject.R.layout.fragment_add_goods, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.fragment_add_goods, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentAddGoodsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAddGoodsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_add_goods_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentAddGoodsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obGoodsCostPrice
        flag 1 (0x2L): viewModel.obGoodsName
        flag 2 (0x3L): viewModel.obGoodsCode
        flag 3 (0x4L): viewModel.obGoodsRealPrice
        flag 4 (0x5L): viewModel.obGoodsUnitName
        flag 5 (0x6L): viewModel.getTypeHttpSuccess
        flag 6 (0x7L): viewModel.obGoodsOutOfDate
        flag 7 (0x8L): viewModel.obGoodsProductDate
        flag 8 (0x9L): viewModel.getUnitHttpSuccess
        flag 9 (0xaL): viewModel.obGoodsTypeName
        flag 10 (0xbL): viewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): viewModel.getTypeHttpSuccess.get() ? true : false
        flag 13 (0xeL): viewModel.getTypeHttpSuccess.get() ? true : false
        flag 14 (0xfL): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.getUnitHttpSuccess.get() ? true : false
        flag 19 (0x14L): viewModel.getUnitHttpSuccess.get() ? true : false
    flag mapping end*/
    //end
}