package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTakeOutInventoryBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 12);
        sViewsWithIds.put(R.id.ll0, 13);
        sViewsWithIds.put(R.id.ll1, 14);
        sViewsWithIds.put(R.id.ll2, 15);
        sViewsWithIds.put(R.id.ll3, 16);
        sViewsWithIds.put(R.id.textView4, 17);
        sViewsWithIds.put(R.id.ll4, 18);
        sViewsWithIds.put(R.id.type_rl, 19);
        sViewsWithIds.put(R.id.iv, 20);
        sViewsWithIds.put(R.id.tv, 21);
        sViewsWithIds.put(R.id.tv2, 22);
        sViewsWithIds.put(R.id.select_iv, 23);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv;
    @NonNull
    public final android.widget.LinearLayout ll0;
    @NonNull
    public final android.widget.LinearLayout ll1;
    @NonNull
    public final android.widget.LinearLayout ll2;
    @NonNull
    public final android.widget.LinearLayout ll3;
    @NonNull
    public final android.widget.LinearLayout ll4;
    @NonNull
    public final android.widget.LinearLayout llTakeOutShop;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.Button mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.EditText mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.widget.ImageView selectIv;
    @NonNull
    public final android.widget.TextView textView16;
    @NonNull
    public final android.widget.TextView textView4;
    @NonNull
    public final android.widget.TextView tv;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.RelativeLayout typeRl;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.TakeOutInventoryViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickSelectButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obTackOutNum.get()
            //         is viewModel.obTackOutNum.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.obTackOutNum != null
            boolean viewModelObTackOutNumJavaLangObjectNull = false;
            // viewModel.obTackOutNum
            android.databinding.ObservableField<java.lang.String> viewModelObTackOutNum = null;
            // viewModel.obTackOutNum.get()
            java.lang.String viewModelObTackOutNumGet = null;
            // viewModel
            ys.app.petproject.viewmodel.TakeOutInventoryViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObTackOutNum = viewModel.obTackOutNum;

                viewModelObTackOutNumJavaLangObjectNull = (viewModelObTackOutNum) != (null);
                if (viewModelObTackOutNumJavaLangObjectNull) {




                    viewModelObTackOutNum.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obBackReason.get()
            //         is viewModel.obBackReason.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel.obBackReason != null
            boolean viewModelObBackReasonJavaLangObjectNull = false;
            // viewModel.obBackReason.get()
            java.lang.String viewModelObBackReasonGet = null;
            // viewModel
            ys.app.petproject.viewmodel.TakeOutInventoryViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obBackReason
            android.databinding.ObservableField<java.lang.String> viewModelObBackReason = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObBackReason = viewModel.obBackReason;

                viewModelObBackReasonJavaLangObjectNull = (viewModelObBackReason) != (null);
                if (viewModelObBackReasonJavaLangObjectNull) {




                    viewModelObBackReason.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityTakeOutInventoryBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds);
        this.iv = (android.widget.ImageView) bindings[20];
        this.ll0 = (android.widget.LinearLayout) bindings[13];
        this.ll1 = (android.widget.LinearLayout) bindings[14];
        this.ll2 = (android.widget.LinearLayout) bindings[15];
        this.ll3 = (android.widget.LinearLayout) bindings[16];
        this.ll4 = (android.widget.LinearLayout) bindings[18];
        this.llTakeOutShop = (android.widget.LinearLayout) bindings[7];
        this.llTakeOutShop.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.widget.Button) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.EditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv = (android.widget.ImageView) bindings[23];
        this.textView16 = (android.widget.TextView) bindings[10];
        this.textView16.setTag(null);
        this.textView4 = (android.widget.TextView) bindings[17];
        this.tv = (android.widget.TextView) bindings[21];
        this.tv2 = (android.widget.TextView) bindings[22];
        this.typeRl = (android.widget.RelativeLayout) bindings[19];
        this.view = (android.view.View) bindings[12];
        setRootTag(root);
        // listeners
        mCallback94 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback95 = new android.databinding.generated.callback.OnClickListener(this, 2);
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
            setViewModel((ys.app.petproject.viewmodel.TakeOutInventoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.TakeOutInventoryViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.TakeOutInventoryViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObTackOutNum((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelShopName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelMResult((ys.app.petproject.model.GoodInfo) object, fieldId);
            case 4 :
                return onChangeViewModelEmployeeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelAllotVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelObBackReason((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObTackOutNum(android.databinding.ObservableField<java.lang.String> ViewModelObTackOutNum, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObButtonEnable(android.databinding.ObservableBoolean ViewModelObButtonEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShopName(android.databinding.ObservableField<java.lang.String> ViewModelShopName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMResult(ys.app.petproject.model.GoodInfo ViewModelMResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.barCode) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.costAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmployeeName(android.databinding.ObservableField<java.lang.String> ViewModelEmployeeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAllotVisible(android.databinding.ObservableBoolean ViewModelAllotVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObBackReason(android.databinding.ObservableField<java.lang.String> ViewModelObBackReason, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.String viewModelShopNameGet = null;
        java.lang.String viewModelMResultName = null;
        java.lang.String viewModelObBackReasonGet = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObTackOutNumGet = null;
        android.text.TextWatcher viewModelTextChangeListener = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultCostAmt = null;
        boolean viewModelObButtonEnableGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObTackOutNum = null;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        android.databinding.ObservableField<java.lang.String> viewModelShopName = null;
        ys.app.petproject.model.GoodInfo viewModelMResult = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmployeeName = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultCostAmtMboundView4AndroidStringYuan = null;
        android.view.View.OnClickListener viewModelClickSelectButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelMResultBarCode = null;
        int viewModelAllotVisibleViewVISIBLEViewGONE = 0;
        int viewModelMResultStockNum = 0;
        double viewModelMResultCostAmt = 0.0;
        android.databinding.ObservableBoolean viewModelAllotVisible = null;
        java.lang.String stringValueOfViewModelMResultStockNum = null;
        android.databinding.ObservableField<java.lang.String> viewModelObBackReason = null;
        boolean viewModelAllotVisibleGet = false;
        java.lang.String viewModelEmployeeNameGet = null;
        ys.app.petproject.viewmodel.TakeOutInventoryViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.textChangeListener
                        viewModelTextChangeListener = viewModel.textChangeListener;
                        // read viewModel::clickSelectButton
                        viewModelClickSelectButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickSelectButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x1081L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obTackOutNum
                        viewModelObTackOutNum = viewModel.obTackOutNum;
                    }
                    updateRegistration(0, viewModelObTackOutNum);


                    if (viewModelObTackOutNum != null) {
                        // read viewModel.obTackOutNum.get()
                        viewModelObTackOutNumGet = viewModelObTackOutNum.get();
                    }
            }
            if ((dirtyFlags & 0x1082L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obButtonEnable
                        viewModelObButtonEnable = viewModel.obButtonEnable;
                    }
                    updateRegistration(1, viewModelObButtonEnable);


                    if (viewModelObButtonEnable != null) {
                        // read viewModel.obButtonEnable.get()
                        viewModelObButtonEnableGet = viewModelObButtonEnable.get();
                    }
            }
            if ((dirtyFlags & 0x1084L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.shopName
                        viewModelShopName = viewModel.shopName;
                    }
                    updateRegistration(2, viewModelShopName);


                    if (viewModelShopName != null) {
                        // read viewModel.shopName.get()
                        viewModelShopNameGet = viewModelShopName.get();
                    }
            }
            if ((dirtyFlags & 0x1f88L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mResult
                        viewModelMResult = viewModel.mResult;
                    }
                    updateRegistration(3, viewModelMResult);

                if ((dirtyFlags & 0x1188L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.name
                            viewModelMResultName = viewModelMResult.getName();
                        }
                }
                if ((dirtyFlags & 0x1288L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.barCode
                            viewModelMResultBarCode = viewModelMResult.getBarCode();
                        }
                }
                if ((dirtyFlags & 0x1488L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.stockNum
                            viewModelMResultStockNum = viewModelMResult.getStockNum();
                        }


                        // read String.valueOf(viewModel.mResult.stockNum)
                        stringValueOfViewModelMResultStockNum = java.lang.String.valueOf(viewModelMResultStockNum);
                }
                if ((dirtyFlags & 0x1888L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.costAmt
                            viewModelMResultCostAmt = viewModelMResult.getCostAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mResult.costAmt)
                        appUtilFormatStandardMoneyViewModelMResultCostAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMResultCostAmt);


                        // read (AppUtil.formatStandardMoney(viewModel.mResult.costAmt)) + (@android:string/yuan)
                        appUtilFormatStandardMoneyViewModelMResultCostAmtMboundView4AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMResultCostAmt) + (mboundView4.getResources().getString(R.string.yuan));
                }
            }
            if ((dirtyFlags & 0x1090L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.employeeName
                        viewModelEmployeeName = viewModel.employeeName;
                    }
                    updateRegistration(4, viewModelEmployeeName);


                    if (viewModelEmployeeName != null) {
                        // read viewModel.employeeName.get()
                        viewModelEmployeeNameGet = viewModelEmployeeName.get();
                    }
            }
            if ((dirtyFlags & 0x10a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.allotVisible
                        viewModelAllotVisible = viewModel.allotVisible;
                    }
                    updateRegistration(5, viewModelAllotVisible);


                    if (viewModelAllotVisible != null) {
                        // read viewModel.allotVisible.get()
                        viewModelAllotVisibleGet = viewModelAllotVisible.get();
                    }
                if((dirtyFlags & 0x10a0L) != 0) {
                    if(viewModelAllotVisibleGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.allotVisible.get() ? View.VISIBLE : View.GONE
                    viewModelAllotVisibleViewVISIBLEViewGONE = ((viewModelAllotVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x10c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obBackReason
                        viewModelObBackReason = viewModel.obBackReason;
                    }
                    updateRegistration(6, viewModelObBackReason);


                    if (viewModelObBackReason != null) {
                        // read viewModel.obBackReason.get()
                        viewModelObBackReasonGet = viewModelObBackReason.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10a0L) != 0) {
            // api target 1

            this.llTakeOutShop.setVisibility(viewModelAllotVisibleViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewModelAllotVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelMResultName);
        }
        if ((dirtyFlags & 0x1082L) != 0) {
            // api target 1

            this.mboundView11.setEnabled(viewModelObButtonEnableGet);
        }
        if ((dirtyFlags & 0x1080L) != 0) {
            // api target 1

            this.mboundView11.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.mboundView5, viewModelTextChangeListener);
            this.mboundView6.setOnClickListener(viewModelClickSelectButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1288L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMResultBarCode);
        }
        if ((dirtyFlags & 0x1488L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringValueOfViewModelMResultStockNum);
        }
        if ((dirtyFlags & 0x1888L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilFormatStandardMoneyViewModelMResultCostAmtMboundView4AndroidStringYuan);
        }
        if ((dirtyFlags & 0x1081L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObTackOutNumGet);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            this.mboundView8.setOnClickListener(mCallback94);
            this.textView16.setOnClickListener(mCallback95);
        }
        if ((dirtyFlags & 0x10c0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelObBackReasonGet);
        }
        if ((dirtyFlags & 0x1084L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelShopNameGet);
        }
        if ((dirtyFlags & 0x1090L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView16, viewModelEmployeeNameGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.TakeOutInventoryViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.TakeOutInventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.TakeOutInventoryViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.TakeOutInventoryViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.TakeOutInventoryViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectAllotShop();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.TakeOutInventoryViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectOutEmployee();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityTakeOutInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTakeOutInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityTakeOutInventoryBinding>inflate(inflater, ys.app.petproject.R.layout.activity_take_out_inventory, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityTakeOutInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTakeOutInventoryBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_take_out_inventory, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityTakeOutInventoryBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTakeOutInventoryBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_take_out_inventory_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityTakeOutInventoryBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obTackOutNum
        flag 1 (0x2L): viewModel.obButtonEnable
        flag 2 (0x3L): viewModel.shopName
        flag 3 (0x4L): viewModel.mResult
        flag 4 (0x5L): viewModel.employeeName
        flag 5 (0x6L): viewModel.allotVisible
        flag 6 (0x7L): viewModel.obBackReason
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): viewModel.mResult.name
        flag 9 (0xaL): viewModel.mResult.barCode
        flag 10 (0xbL): viewModel.mResult.stockNum
        flag 11 (0xcL): viewModel.mResult.costAmt
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.allotVisible.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.allotVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}