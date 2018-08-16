package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEmployeePerformanceBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 10);
        sViewsWithIds.put(R.id.recyclerView1, 11);
        sViewsWithIds.put(R.id.recyclerView2, 12);
        sViewsWithIds.put(R.id.recyclerView3, 13);
        sViewsWithIds.put(R.id.progressbar, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView9;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView1;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView2;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView3;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityEmployeePerformanceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 9);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[8];
        this.networkErrorIv.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[14];
        this.recyclerView1 = (android.support.v7.widget.RecyclerView) bindings[11];
        this.recyclerView2 = (android.support.v7.widget.RecyclerView) bindings[12];
        this.recyclerView3 = (android.support.v7.widget.RecyclerView) bindings[13];
        this.view = (android.view.View) bindings[10];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setViewModel((ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel ViewModel) {
        updateRegistration(7, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelObIsChargeSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelObIsServiceSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelObChargeTotalMoney((android.databinding.ObservableDouble) object, fieldId);
            case 4 :
                return onChangeViewModelObIsGoodsSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelObGoodsTotalMoney((android.databinding.ObservableDouble) object, fieldId);
            case 7 :
                return onChangeViewModel((ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel) object, fieldId);
            case 8 :
                return onChangeViewModelObServiceTotalMoney((android.databinding.ObservableDouble) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsNetWorkErrorVisible(android.databinding.ObservableBoolean ViewModelIsNetWorkErrorVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsChargeSuccess(android.databinding.ObservableBoolean ViewModelObIsChargeSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsServiceSuccess(android.databinding.ObservableBoolean ViewModelObIsServiceSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObChargeTotalMoney(android.databinding.ObservableDouble ViewModelObChargeTotalMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsGoodsSuccess(android.databinding.ObservableBoolean ViewModelObIsGoodsSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsTotalMoney(android.databinding.ObservableDouble ViewModelObGoodsTotalMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObServiceTotalMoney(android.databinding.ObservableDouble ViewModelObServiceTotalMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        java.lang.String appUtilFormatStandardMoneyViewModelObServiceTotalMoney = null;
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        boolean viewModelIsLoadingVisibleGet = false;
        int viewModelObIsServiceSuccessViewVISIBLEViewGONE = 0;
        java.lang.String mboundView5AndroidStringSpzeAppUtilFormatStandardMoneyViewModelObGoodsTotalMoney = null;
        java.lang.String mboundView3AndroidStringFwzeAppUtilFormatStandardMoneyViewModelObServiceTotalMoney = null;
        double viewModelObGoodsTotalMoneyGet = 0.0;
        java.lang.String mboundView7AndroidStringCzzeAppUtilFormatStandardMoneyViewModelObChargeTotalMoney = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObChargeTotalMoney = null;
        java.lang.String appUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney = null;
        boolean viewModelObIsServiceSuccessGet = false;
        java.lang.String mboundView3AndroidStringFwzeAppUtilFormatStandardMoneyViewModelObServiceTotalMoneyMboundView3AndroidStringYuan = null;
        android.databinding.ObservableBoolean viewModelObIsChargeSuccess = null;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelObIsGoodsSuccessGet = false;
        int viewModelObIsChargeSuccessViewVISIBLEViewGONE = 0;
        java.lang.String mboundView5AndroidStringSpzeAppUtilFormatStandardMoneyViewModelObGoodsTotalMoneyMboundView5AndroidStringYuan = null;
        android.databinding.ObservableBoolean viewModelObIsServiceSuccess = null;
        double viewModelObServiceTotalMoneyGet = 0.0;
        java.lang.String mboundView1AndroidStringLjzeAppUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoneyMboundView1AndroidStringYuan = null;
        double mathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney = 0.0;
        java.lang.String appUtilFormatStandardMoneyViewModelObGoodsTotalMoney = null;
        java.lang.String mboundView7AndroidStringCzzeAppUtilFormatStandardMoneyViewModelObChargeTotalMoneyMboundView7AndroidStringYuan = null;
        android.databinding.ObservableDouble viewModelObChargeTotalMoney = null;
        android.databinding.ObservableBoolean viewModelObIsGoodsSuccess = null;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        int viewModelObIsGoodsSuccessViewVISIBLEViewGONE = 0;
        boolean viewModelObIsChargeSuccessGet = false;
        double viewModelObChargeTotalMoneyGet = 0.0;
        java.lang.String mboundView1AndroidStringLjzeAppUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney = null;
        android.databinding.ObservableDouble viewModelObGoodsTotalMoney = null;
        ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel viewModel = mViewModel;
        android.databinding.ObservableDouble viewModelObServiceTotalMoney = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x281L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(0, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x281L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x282L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsChargeSuccess
                        viewModelObIsChargeSuccess = viewModel.obIsChargeSuccess;
                    }
                    updateRegistration(1, viewModelObIsChargeSuccess);


                    if (viewModelObIsChargeSuccess != null) {
                        // read viewModel.obIsChargeSuccess.get()
                        viewModelObIsChargeSuccessGet = viewModelObIsChargeSuccess.get();
                    }
                if((dirtyFlags & 0x282L) != 0) {
                    if(viewModelObIsChargeSuccessGet) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read viewModel.obIsChargeSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelObIsChargeSuccessViewVISIBLEViewGONE = ((viewModelObIsChargeSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x284L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsServiceSuccess
                        viewModelObIsServiceSuccess = viewModel.obIsServiceSuccess;
                    }
                    updateRegistration(2, viewModelObIsServiceSuccess);


                    if (viewModelObIsServiceSuccess != null) {
                        // read viewModel.obIsServiceSuccess.get()
                        viewModelObIsServiceSuccessGet = viewModelObIsServiceSuccess.get();
                    }
                if((dirtyFlags & 0x284L) != 0) {
                    if(viewModelObIsServiceSuccessGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.obIsServiceSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelObIsServiceSuccessViewVISIBLEViewGONE = ((viewModelObIsServiceSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3c8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obChargeTotalMoney
                        viewModelObChargeTotalMoney = viewModel.obChargeTotalMoney;
                        // read viewModel.obGoodsTotalMoney
                        viewModelObGoodsTotalMoney = viewModel.obGoodsTotalMoney;
                        // read viewModel.obServiceTotalMoney
                        viewModelObServiceTotalMoney = viewModel.obServiceTotalMoney;
                    }
                    updateRegistration(3, viewModelObChargeTotalMoney);
                    updateRegistration(6, viewModelObGoodsTotalMoney);
                    updateRegistration(8, viewModelObServiceTotalMoney);


                    if (viewModelObChargeTotalMoney != null) {
                        // read viewModel.obChargeTotalMoney.get()
                        viewModelObChargeTotalMoneyGet = viewModelObChargeTotalMoney.get();
                    }
                    if (viewModelObGoodsTotalMoney != null) {
                        // read viewModel.obGoodsTotalMoney.get()
                        viewModelObGoodsTotalMoneyGet = viewModelObGoodsTotalMoney.get();
                    }
                    if (viewModelObServiceTotalMoney != null) {
                        // read viewModel.obServiceTotalMoney.get()
                        viewModelObServiceTotalMoneyGet = viewModelObServiceTotalMoney.get();
                    }

                if ((dirtyFlags & 0x288L) != 0) {

                        // read AppUtil.formatStandardMoney(viewModel.obChargeTotalMoney.get())
                        appUtilFormatStandardMoneyViewModelObChargeTotalMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObChargeTotalMoneyGet);


                        // read (@android:string/czze) + (AppUtil.formatStandardMoney(viewModel.obChargeTotalMoney.get()))
                        mboundView7AndroidStringCzzeAppUtilFormatStandardMoneyViewModelObChargeTotalMoney = (mboundView7.getResources().getString(R.string.czze)) + (appUtilFormatStandardMoneyViewModelObChargeTotalMoney);


                        // read ((@android:string/czze) + (AppUtil.formatStandardMoney(viewModel.obChargeTotalMoney.get()))) + (@android:string/yuan)
                        mboundView7AndroidStringCzzeAppUtilFormatStandardMoneyViewModelObChargeTotalMoneyMboundView7AndroidStringYuan = (mboundView7AndroidStringCzzeAppUtilFormatStandardMoneyViewModelObChargeTotalMoney) + (mboundView7.getResources().getString(R.string.yuan));
                }
                if ((dirtyFlags & 0x2c0L) != 0) {

                        // read AppUtil.formatStandardMoney(viewModel.obGoodsTotalMoney.get())
                        appUtilFormatStandardMoneyViewModelObGoodsTotalMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObGoodsTotalMoneyGet);


                        // read (@android:string/spze) + (AppUtil.formatStandardMoney(viewModel.obGoodsTotalMoney.get()))
                        mboundView5AndroidStringSpzeAppUtilFormatStandardMoneyViewModelObGoodsTotalMoney = (mboundView5.getResources().getString(R.string.spze)) + (appUtilFormatStandardMoneyViewModelObGoodsTotalMoney);


                        // read ((@android:string/spze) + (AppUtil.formatStandardMoney(viewModel.obGoodsTotalMoney.get()))) + (@android:string/yuan)
                        mboundView5AndroidStringSpzeAppUtilFormatStandardMoneyViewModelObGoodsTotalMoneyMboundView5AndroidStringYuan = (mboundView5AndroidStringSpzeAppUtilFormatStandardMoneyViewModelObGoodsTotalMoney) + (mboundView5.getResources().getString(R.string.yuan));
                }
                if ((dirtyFlags & 0x380L) != 0) {

                        // read AppUtil.formatStandardMoney(viewModel.obServiceTotalMoney.get())
                        appUtilFormatStandardMoneyViewModelObServiceTotalMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelObServiceTotalMoneyGet);


                        // read (@android:string/fwze) + (AppUtil.formatStandardMoney(viewModel.obServiceTotalMoney.get()))
                        mboundView3AndroidStringFwzeAppUtilFormatStandardMoneyViewModelObServiceTotalMoney = (mboundView3.getResources().getString(R.string.fwze)) + (appUtilFormatStandardMoneyViewModelObServiceTotalMoney);


                        // read ((@android:string/fwze) + (AppUtil.formatStandardMoney(viewModel.obServiceTotalMoney.get()))) + (@android:string/yuan)
                        mboundView3AndroidStringFwzeAppUtilFormatStandardMoneyViewModelObServiceTotalMoneyMboundView3AndroidStringYuan = (mboundView3AndroidStringFwzeAppUtilFormatStandardMoneyViewModelObServiceTotalMoney) + (mboundView3.getResources().getString(R.string.yuan));
                }

                    // read MathUtil.add(viewModel.obServiceTotalMoney.get(), viewModel.obGoodsTotalMoney.get(), viewModel.obChargeTotalMoney.get())
                    mathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney = ys.app.petproject.utils.MathUtil.add(viewModelObServiceTotalMoneyGet, viewModelObGoodsTotalMoneyGet, viewModelObChargeTotalMoneyGet);


                    // read AppUtil.formatStandardMoney(MathUtil.add(viewModel.obServiceTotalMoney.get(), viewModel.obGoodsTotalMoney.get(), viewModel.obChargeTotalMoney.get()))
                    appUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney = ys.app.petproject.utils.AppUtil.formatStandardMoney(mathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney);


                    // read (@android:string/ljze) + (AppUtil.formatStandardMoney(MathUtil.add(viewModel.obServiceTotalMoney.get(), viewModel.obGoodsTotalMoney.get(), viewModel.obChargeTotalMoney.get())))
                    mboundView1AndroidStringLjzeAppUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney = (mboundView1.getResources().getString(R.string.ljze)) + (appUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney);


                    // read ((@android:string/ljze) + (AppUtil.formatStandardMoney(MathUtil.add(viewModel.obServiceTotalMoney.get(), viewModel.obGoodsTotalMoney.get(), viewModel.obChargeTotalMoney.get())))) + (@android:string/yuan)
                    mboundView1AndroidStringLjzeAppUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoneyMboundView1AndroidStringYuan = (mboundView1AndroidStringLjzeAppUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoney) + (mboundView1.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0x290L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsGoodsSuccess
                        viewModelObIsGoodsSuccess = viewModel.obIsGoodsSuccess;
                    }
                    updateRegistration(4, viewModelObIsGoodsSuccess);


                    if (viewModelObIsGoodsSuccess != null) {
                        // read viewModel.obIsGoodsSuccess.get()
                        viewModelObIsGoodsSuccessGet = viewModelObIsGoodsSuccess.get();
                    }
                if((dirtyFlags & 0x290L) != 0) {
                    if(viewModelObIsGoodsSuccessGet) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.obIsGoodsSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelObIsGoodsSuccessViewVISIBLEViewGONE = ((viewModelObIsGoodsSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x280L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x2a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(5, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0x2a0L) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x3c8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringLjzeAppUtilFormatStandardMoneyMathUtilAddViewModelObServiceTotalMoneyViewModelObGoodsTotalMoneyViewModelObChargeTotalMoneyMboundView1AndroidStringYuan);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelObIsServiceSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mboundView3AndroidStringFwzeAppUtilFormatStandardMoneyViewModelObServiceTotalMoneyMboundView3AndroidStringYuan);
        }
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelObIsGoodsSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringSpzeAppUtilFormatStandardMoneyViewModelObGoodsTotalMoneyMboundView5AndroidStringYuan);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(viewModelObIsChargeSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringCzzeAppUtilFormatStandardMoneyViewModelObChargeTotalMoneyMboundView7AndroidStringYuan);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.EmployeePerformanceViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityEmployeePerformanceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeePerformanceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityEmployeePerformanceBinding>inflate(inflater, ys.app.petproject.R.layout.activity_employee_performance, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityEmployeePerformanceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeePerformanceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_employee_performance, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityEmployeePerformanceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeePerformanceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_employee_performance_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityEmployeePerformanceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.obIsChargeSuccess
        flag 2 (0x3L): viewModel.obIsServiceSuccess
        flag 3 (0x4L): viewModel.obChargeTotalMoney
        flag 4 (0x5L): viewModel.obIsGoodsSuccess
        flag 5 (0x6L): viewModel.isLoadingVisible
        flag 6 (0x7L): viewModel.obGoodsTotalMoney
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): viewModel.obServiceTotalMoney
        flag 9 (0xaL): null
        flag 10 (0xbL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.obIsServiceSuccess.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.obIsServiceSuccess.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.obIsChargeSuccess.get() ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.obIsChargeSuccess.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.obIsGoodsSuccess.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.obIsGoodsSuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}