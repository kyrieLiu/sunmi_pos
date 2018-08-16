package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OutStorageDetialBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 12);
        sViewsWithIds.put(R.id.shop_tv2, 13);
        sViewsWithIds.put(R.id.textView3, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
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
    private final android.widget.RelativeLayout mboundView9;
    @NonNull
    public final android.widget.TextView shopTv2;
    @NonNull
    public final android.widget.TextView textView2;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.widget.TextView tvShop;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.model.OutStorageInfo mDataBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OutStorageDetialBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
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
        this.mboundView9 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.shopTv2 = (android.widget.TextView) bindings[13];
        this.textView2 = (android.widget.TextView) bindings[3];
        this.textView2.setTag(null);
        this.textView3 = (android.widget.TextView) bindings[14];
        this.tvShop = (android.widget.TextView) bindings[2];
        this.tvShop.setTag(null);
        this.view = (android.view.View) bindings[12];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.dataBean == variableId) {
            setDataBean((ys.app.petproject.model.OutStorageInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDataBean(@Nullable ys.app.petproject.model.OutStorageInfo DataBean) {
        this.mDataBean = DataBean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dataBean);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.model.OutStorageInfo getDataBean() {
        return mDataBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String stringValueOfDataBeanNum = null;
        java.lang.String dateUtilLongFormatDate2DataBeanDotime = null;
        double dataBeanRealMoney = 0.0;
        java.lang.String stringValueOfDataBeanCostAmt = null;
        java.lang.String dataBeanUnit = null;
        int dataBeanRealMoneyInt0ViewGONEViewVISIBLE = 0;
        java.lang.String stringValueOfDataBeanRealAmt = null;
        boolean textUtilIsEmptyDataBeanReasons = false;
        java.lang.String dataBeanReasons = null;
        double dataBeanCostAmt = 0.0;
        long dataBeanDotime = 0L;
        boolean dataBeanRealMoneyInt0 = false;
        double dataBeanRealAmt = 0.0;
        java.lang.String stringValueOfDataBeanRealMoney = null;
        ys.app.petproject.model.OutStorageInfo dataBean = mDataBean;
        java.lang.String dataBeanTypeName = null;
        java.lang.String textUtilIsEmptyDataBeanReasonsMboundView11AndroidStringWuDataBeanReasons = null;
        int dataBeanNum = 0;
        java.lang.String dataBeanCommdityName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dataBean != null) {
                    // read dataBean.realMoney
                    dataBeanRealMoney = dataBean.getRealMoney();
                    // read dataBean.unit
                    dataBeanUnit = dataBean.getUnit();
                    // read dataBean.reasons
                    dataBeanReasons = dataBean.getReasons();
                    // read dataBean.costAmt
                    dataBeanCostAmt = dataBean.getCostAmt();
                    // read dataBean.dotime
                    dataBeanDotime = dataBean.getDotime();
                    // read dataBean.realAmt
                    dataBeanRealAmt = dataBean.getRealAmt();
                    // read dataBean.typeName
                    dataBeanTypeName = dataBean.getTypeName();
                    // read dataBean.num
                    dataBeanNum = dataBean.getNum();
                    // read dataBean.commdityName
                    dataBeanCommdityName = dataBean.getCommdityName();
                }


                // read dataBean.realMoney == 0
                dataBeanRealMoneyInt0 = (dataBeanRealMoney) == (0);
                // read String.valueOf(dataBean.realMoney)
                stringValueOfDataBeanRealMoney = java.lang.String.valueOf(dataBeanRealMoney);
                // read TextUtil.isEmpty(dataBean.reasons)
                textUtilIsEmptyDataBeanReasons = ys.app.petproject.widget.timeselector.Utils.TextUtil.isEmpty(dataBeanReasons);
                // read String.valueOf(dataBean.costAmt)
                stringValueOfDataBeanCostAmt = java.lang.String.valueOf(dataBeanCostAmt);
                // read DateUtil.longFormatDate2(dataBean.dotime)
                dateUtilLongFormatDate2DataBeanDotime = ys.app.petproject.utils.DateUtil.longFormatDate2(dataBeanDotime);
                // read String.valueOf(dataBean.realAmt)
                stringValueOfDataBeanRealAmt = java.lang.String.valueOf(dataBeanRealAmt);
                // read String.valueOf(dataBean.num)
                stringValueOfDataBeanNum = java.lang.String.valueOf(dataBeanNum);
            if((dirtyFlags & 0x3L) != 0) {
                if(dataBeanRealMoneyInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(textUtilIsEmptyDataBeanReasons) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read dataBean.realMoney == 0 ? View.GONE : View.VISIBLE
                dataBeanRealMoneyInt0ViewGONEViewVISIBLE = ((dataBeanRealMoneyInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read TextUtil.isEmpty(dataBean.reasons) ? @android:string/wu : dataBean.reasons
                textUtilIsEmptyDataBeanReasonsMboundView11AndroidStringWuDataBeanReasons = ((textUtilIsEmptyDataBeanReasons) ? (mboundView11.getResources().getString(R.string.wu)) : (dataBeanReasons));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, stringValueOfDataBeanRealMoney);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, textUtilIsEmptyDataBeanReasonsMboundView11AndroidStringWuDataBeanReasons);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataBeanTypeName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, stringValueOfDataBeanNum);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, dataBeanUnit);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, stringValueOfDataBeanCostAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, stringValueOfDataBeanRealAmt);
            this.mboundView9.setVisibility(dataBeanRealMoneyInt0ViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, dateUtilLongFormatDate2DataBeanDotime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvShop, dataBeanCommdityName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static OutStorageDetialBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OutStorageDetialBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<OutStorageDetialBinding>inflate(inflater, ys.app.petproject.R.layout.activity_out_storage_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static OutStorageDetialBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OutStorageDetialBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_out_storage_detail, null, false), bindingComponent);
    }
    @NonNull
    public static OutStorageDetialBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OutStorageDetialBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_out_storage_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new OutStorageDetialBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): dataBean
        flag 1 (0x2L): null
        flag 2 (0x3L): dataBean.realMoney == 0 ? View.GONE : View.VISIBLE
        flag 3 (0x4L): dataBean.realMoney == 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtil.isEmpty(dataBean.reasons) ? @android:string/wu : dataBean.reasons
        flag 5 (0x6L): TextUtil.isEmpty(dataBean.reasons) ? @android:string/wu : dataBean.reasons
    flag mapping end*/
    //end
}