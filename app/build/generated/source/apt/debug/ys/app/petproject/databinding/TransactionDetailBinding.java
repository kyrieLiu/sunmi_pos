package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TransactionDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 19);
        sViewsWithIds.put(R.id.scrollView, 20);
        sViewsWithIds.put(R.id.textView3, 21);
        sViewsWithIds.put(R.id.tv2, 22);
        sViewsWithIds.put(R.id.tv3, 23);
        sViewsWithIds.put(R.id.tv4, 24);
        sViewsWithIds.put(R.id.tv5, 25);
        sViewsWithIds.put(R.id.tv6, 26);
        sViewsWithIds.put(R.id.tv7, 27);
        sViewsWithIds.put(R.id.tv8, 28);
        sViewsWithIds.put(R.id.tv10, 29);
        sViewsWithIds.put(R.id.tv11, 30);
        sViewsWithIds.put(R.id.recyclerView, 31);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.view.View mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.view.View mboundView9;
    @NonNull
    public final android.widget.TextView modifyTv;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.ScrollView scrollView;
    @NonNull
    public final android.widget.TextView textView2;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.widget.TextView tv10;
    @NonNull
    public final android.widget.TextView tv11;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.TextView tv3;
    @NonNull
    public final android.widget.TextView tv4;
    @NonNull
    public final android.widget.TextView tv5;
    @NonNull
    public final android.widget.TextView tv6;
    @NonNull
    public final android.widget.TextView tv7;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tvName;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.TransactionDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TransactionDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds);
        this.ll = (android.widget.LinearLayout) bindings[1];
        this.ll.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.view.View) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.view.View) bindings[9];
        this.mboundView9.setTag(null);
        this.modifyTv = (android.widget.TextView) bindings[17];
        this.modifyTv.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[31];
        this.scrollView = (android.widget.ScrollView) bindings[20];
        this.textView2 = (android.widget.TextView) bindings[2];
        this.textView2.setTag(null);
        this.textView3 = (android.widget.TextView) bindings[21];
        this.tv10 = (android.widget.TextView) bindings[29];
        this.tv11 = (android.widget.TextView) bindings[30];
        this.tv2 = (android.widget.TextView) bindings[22];
        this.tv3 = (android.widget.TextView) bindings[23];
        this.tv4 = (android.widget.TextView) bindings[24];
        this.tv5 = (android.widget.TextView) bindings[25];
        this.tv6 = (android.widget.TextView) bindings[26];
        this.tv7 = (android.widget.TextView) bindings[27];
        this.tv8 = (android.widget.TextView) bindings[28];
        this.tvName = (android.widget.TextView) bindings[16];
        this.tvName.setTag(null);
        this.view = (android.view.View) bindings[19];
        setRootTag(root);
        // listeners
        mCallback41 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((ys.app.petproject.viewmodel.TransactionDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.TransactionDetailViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.TransactionDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObIsChargeType((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelOrderInfo((ys.app.petproject.model.OrderInfo) object, fieldId);
            case 2 :
                return onChangeViewModelMRechargeListBean((ys.app.petproject.model.OrderInfo.RechargeListBean) object, fieldId);
            case 3 :
                return onChangeViewModelIsVis((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.petproject.viewmodel.TransactionDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObIsChargeType(android.databinding.ObservableBoolean ViewModelObIsChargeType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderInfo(ys.app.petproject.model.OrderInfo ViewModelOrderInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMRechargeListBean(ys.app.petproject.model.OrderInfo.RechargeListBean ViewModelMRechargeListBean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.userName) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVis(android.databinding.ObservableBoolean ViewModelIsVis, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.TransactionDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String appUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = null;
        java.lang.String viewModelMRechargeListBeanVipPhone = null;
        java.lang.String appUtilGetPayTypeViewModelOrderInfoPayedMethod = null;
        java.lang.String viewModelOrderInfoPayedMethod = null;
        boolean appUtilIsPaySucViewModelOrderInfoStatus = false;
        java.lang.String viewModelOrderInfoOrderNo = null;
        java.lang.String appUtilIsPaySucViewModelOrderInfoStatusMboundView12AndroidStringZfcgMboundView12AndroidStringZfsb = null;
        java.lang.String mboundView11AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = null;
        double viewModelOrderInfoRealAmt = 0.0;
        double viewModelOrderInfoFavouredAmt = 0.0;
        java.lang.String mboundView15AndroidStringRmbAppUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = null;
        java.lang.String appUtilGetTimesViewModelOrderInfoOrderTime = null;
        double viewModelOrderInfoTotalAmt = 0.0;
        int viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelObIsChargeType = null;
        boolean viewModelOrderInfoIsRefundInt0 = false;
        java.lang.String viewModelMRechargeListBeanUserName = null;
        int viewModelObIsChargeTypeViewGONEViewVISIBLE = 0;
        ys.app.petproject.model.OrderInfo viewModelOrderInfo = null;
        int viewModelOrderInfoIsRefund = 0;
        long viewModelOrderInfoOrderTime = 0L;
        boolean viewModelObIsChargeTypeGet = false;
        java.lang.String viewModelOrderInfoStatus = null;
        int viewModelIsVisViewVISIBLEViewGONE = 0;
        java.lang.String viewModelMRechargeListBeanVipUserCardNo = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = null;
        ys.app.petproject.model.OrderInfo.RechargeListBean viewModelMRechargeListBean = null;
        java.lang.String appUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = null;
        boolean viewModelIsVisGet = false;
        android.databinding.ObservableBoolean viewModelIsVis = null;
        double viewModelMRechargeListBeanRechargeAmt = 0.0;
        java.lang.String mboundView7AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = null;
        ys.app.petproject.viewmodel.TransactionDetailViewModel viewModel = mViewModel;
        java.lang.String appUtilFormatStandardMoneyViewModelOrderInfoRealAmt = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsChargeType
                        viewModelObIsChargeType = viewModel.obIsChargeType;
                    }
                    updateRegistration(0, viewModelObIsChargeType);


                    if (viewModelObIsChargeType != null) {
                        // read viewModel.obIsChargeType.get()
                        viewModelObIsChargeTypeGet = viewModelObIsChargeType.get();
                    }
                if((dirtyFlags & 0x51L) != 0) {
                    if(viewModelObIsChargeTypeGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.obIsChargeType.get() ? View.GONE : View.VISIBLE
                    viewModelObIsChargeTypeViewGONEViewVISIBLE = ((viewModelObIsChargeTypeGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderInfo
                        viewModelOrderInfo = viewModel.orderInfo;
                    }
                    updateRegistration(1, viewModelOrderInfo);


                    if (viewModelOrderInfo != null) {
                        // read viewModel.orderInfo.payedMethod
                        viewModelOrderInfoPayedMethod = viewModelOrderInfo.getPayedMethod();
                        // read viewModel.orderInfo.orderNo
                        viewModelOrderInfoOrderNo = viewModelOrderInfo.getOrderNo();
                        // read viewModel.orderInfo.realAmt
                        viewModelOrderInfoRealAmt = viewModelOrderInfo.getRealAmt();
                        // read viewModel.orderInfo.favouredAmt
                        viewModelOrderInfoFavouredAmt = viewModelOrderInfo.getFavouredAmt();
                        // read viewModel.orderInfo.totalAmt
                        viewModelOrderInfoTotalAmt = viewModelOrderInfo.getTotalAmt();
                        // read viewModel.orderInfo.isRefund
                        viewModelOrderInfoIsRefund = viewModelOrderInfo.getIsRefund();
                        // read viewModel.orderInfo.orderTime
                        viewModelOrderInfoOrderTime = viewModelOrderInfo.getOrderTime();
                        // read viewModel.orderInfo.status
                        viewModelOrderInfoStatus = viewModelOrderInfo.getStatus();
                    }


                    // read AppUtil.getPayType(viewModel.orderInfo.payedMethod)
                    appUtilGetPayTypeViewModelOrderInfoPayedMethod = ys.app.petproject.utils.AppUtil.getPayType(viewModelOrderInfoPayedMethod);
                    // read AppUtil.formatStandardMoney(viewModel.orderInfo.realAmt)
                    appUtilFormatStandardMoneyViewModelOrderInfoRealAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelOrderInfoRealAmt);
                    // read AppUtil.formatStandardMoney(viewModel.orderInfo.favouredAmt)
                    appUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelOrderInfoFavouredAmt);
                    // read AppUtil.formatStandardMoney(viewModel.orderInfo.totalAmt)
                    appUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelOrderInfoTotalAmt);
                    // read viewModel.orderInfo.isRefund == 0
                    viewModelOrderInfoIsRefundInt0 = (viewModelOrderInfoIsRefund) == (0);
                    // read AppUtil.getTimes(viewModel.orderInfo.orderTime)
                    appUtilGetTimesViewModelOrderInfoOrderTime = ys.app.petproject.utils.AppUtil.getTimes(viewModelOrderInfoOrderTime);
                    // read AppUtil.isPaySuc(viewModel.orderInfo.status)
                    appUtilIsPaySucViewModelOrderInfoStatus = ys.app.petproject.utils.AppUtil.isPaySuc(viewModelOrderInfoStatus);
                if((dirtyFlags & 0x52L) != 0) {
                    if(viewModelOrderInfoIsRefundInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x52L) != 0) {
                    if(appUtilIsPaySucViewModelOrderInfoStatus) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read (@android:string/rmb) + (AppUtil.formatStandardMoney(viewModel.orderInfo.favouredAmt))
                    mboundView11AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = (mboundView11.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt);
                    // read (@android:string/rmb) + (AppUtil.formatStandardMoney(viewModel.orderInfo.totalAmt))
                    mboundView7AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = (mboundView7.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyViewModelOrderInfoTotalAmt);
                    // read viewModel.orderInfo.isRefund == 0 ? View.VISIBLE : View.GONE
                    viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE = ((viewModelOrderInfoIsRefundInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read AppUtil.isPaySuc(viewModel.orderInfo.status) ? @android:string/zfcg : @android:string/zfsb
                    appUtilIsPaySucViewModelOrderInfoStatusMboundView12AndroidStringZfcgMboundView12AndroidStringZfsb = ((appUtilIsPaySucViewModelOrderInfoStatus) ? (mboundView12.getResources().getString(R.string.zfcg)) : (mboundView12.getResources().getString(R.string.zfsb)));
            }
            if ((dirtyFlags & 0x74L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mRechargeListBean
                        viewModelMRechargeListBean = viewModel.mRechargeListBean;
                    }
                    updateRegistration(2, viewModelMRechargeListBean);

                if ((dirtyFlags & 0x54L) != 0) {

                        if (viewModelMRechargeListBean != null) {
                            // read viewModel.mRechargeListBean.vipPhone
                            viewModelMRechargeListBeanVipPhone = viewModelMRechargeListBean.getVipPhone();
                            // read viewModel.mRechargeListBean.vipUserCardNo
                            viewModelMRechargeListBeanVipUserCardNo = viewModelMRechargeListBean.getVipUserCardNo();
                            // read viewModel.mRechargeListBean.rechargeAmt
                            viewModelMRechargeListBeanRechargeAmt = viewModelMRechargeListBean.getRechargeAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mRechargeListBean.rechargeAmt)
                        appUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = ys.app.petproject.utils.AppUtil.formatStandardMoney(viewModelMRechargeListBeanRechargeAmt);


                        // read (@android:string/rmb) + (AppUtil.formatStandardMoney(viewModel.mRechargeListBean.rechargeAmt))
                        mboundView15AndroidStringRmbAppUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = (mboundView15.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt);
                }

                    if (viewModelMRechargeListBean != null) {
                        // read viewModel.mRechargeListBean.userName
                        viewModelMRechargeListBeanUserName = viewModelMRechargeListBean.getUserName();
                    }
            }
            if ((dirtyFlags & 0x58L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVis
                        viewModelIsVis = viewModel.isVis;
                    }
                    updateRegistration(3, viewModelIsVis);


                    if (viewModelIsVis != null) {
                        // read viewModel.isVis.get()
                        viewModelIsVisGet = viewModelIsVis.get();
                    }
                if((dirtyFlags & 0x58L) != 0) {
                    if(viewModelIsVisGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.isVis.get() ? View.VISIBLE : View.GONE
                    viewModelIsVisViewVISIBLEViewGONE = ((viewModelIsVisGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
            this.mboundView9.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, mboundView11AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, appUtilIsPaySucViewModelOrderInfoStatusMboundView12AndroidStringZfcgMboundView12AndroidStringZfsb);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, appUtilGetTimesViewModelOrderInfoOrderTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilGetPayTypeViewModelOrderInfoPayedMethod);
            this.mboundView7.setVisibility(viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoTotalAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, appUtilFormatStandardMoneyViewModelOrderInfoRealAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, viewModelOrderInfoOrderNo);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(viewModelIsVisViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelMRechargeListBeanVipUserCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, mboundView15AndroidStringRmbAppUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, viewModelMRechargeListBeanVipPhone);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.modifyTv.setOnClickListener(mCallback41);
        }
        if ((dirtyFlags & 0x74L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, viewModelMRechargeListBeanUserName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.TransactionDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.modifyClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TransactionDetailBinding>inflate(inflater, ys.app.petproject.R.layout.activity_transaction_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_transaction_detail, null, false), bindingComponent);
    }
    @NonNull
    public static TransactionDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TransactionDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_transaction_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TransactionDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obIsChargeType
        flag 1 (0x2L): viewModel.orderInfo
        flag 2 (0x3L): viewModel.mRechargeListBean
        flag 3 (0x4L): viewModel.isVis
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): viewModel.mRechargeListBean.userName
        flag 6 (0x7L): null
        flag 7 (0x8L): AppUtil.isPaySuc(viewModel.orderInfo.status) ? @android:string/zfcg : @android:string/zfsb
        flag 8 (0x9L): AppUtil.isPaySuc(viewModel.orderInfo.status) ? @android:string/zfcg : @android:string/zfsb
        flag 9 (0xaL): viewModel.orderInfo.isRefund == 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.orderInfo.isRefund == 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.obIsChargeType.get() ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.obIsChargeType.get() ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewModel.isVis.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.isVis.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}