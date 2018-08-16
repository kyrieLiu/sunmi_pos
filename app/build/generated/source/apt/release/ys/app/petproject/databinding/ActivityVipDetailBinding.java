package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVipDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 15);
        sViewsWithIds.put(R.id.iv0, 16);
        sViewsWithIds.put(R.id.textView3, 17);
        sViewsWithIds.put(R.id.iv1, 18);
        sViewsWithIds.put(R.id.iv2, 19);
        sViewsWithIds.put(R.id.iv3, 20);
        sViewsWithIds.put(R.id.tv_vip_detail_type, 21);
        sViewsWithIds.put(R.id.iv4, 22);
        sViewsWithIds.put(R.id.ll_vip_detail_birthday, 23);
        sViewsWithIds.put(R.id.tv_vip_detail_birthday_name, 24);
        sViewsWithIds.put(R.id.iv6, 25);
        sViewsWithIds.put(R.id.recyclerView, 26);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv1;
    @NonNull
    public final android.widget.ImageView iv2;
    @NonNull
    public final android.widget.ImageView iv3;
    @NonNull
    public final android.widget.ImageView iv4;
    @NonNull
    public final android.widget.ImageView iv6;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    public final android.widget.LinearLayout llVipDetailBirthday;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.RelativeLayout mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.widget.TextView tvVipDetailBirthdayName;
    @NonNull
    public final android.widget.TextView tvVipDetailCardNO;
    @NonNull
    public final android.widget.TextView tvVipDetailName;
    @NonNull
    public final android.widget.TextView tvVipDetailPhone;
    @NonNull
    public final android.widget.TextView tvVipDetailRefund;
    @NonNull
    public final android.widget.TextView tvVipDetailType;
    @NonNull
    public final android.widget.TextView tvVipcardDetailType;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.vip.VipDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickChargeAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickRefundMoneyAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickAddAnimalAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickModifyButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityVipDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds);
        this.iv0 = (android.widget.ImageView) bindings[16];
        this.iv1 = (android.widget.ImageView) bindings[18];
        this.iv2 = (android.widget.ImageView) bindings[19];
        this.iv3 = (android.widget.ImageView) bindings[20];
        this.iv4 = (android.widget.ImageView) bindings[22];
        this.iv6 = (android.widget.ImageView) bindings[25];
        this.ll = (android.widget.LinearLayout) bindings[6];
        this.ll.setTag(null);
        this.llVipDetailBirthday = (android.widget.LinearLayout) bindings[23];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.RelativeLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.ImageView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[26];
        this.textView3 = (android.widget.TextView) bindings[17];
        this.tvVipDetailBirthdayName = (android.widget.TextView) bindings[24];
        this.tvVipDetailCardNO = (android.widget.TextView) bindings[9];
        this.tvVipDetailCardNO.setTag(null);
        this.tvVipDetailName = (android.widget.TextView) bindings[7];
        this.tvVipDetailName.setTag(null);
        this.tvVipDetailPhone = (android.widget.TextView) bindings[8];
        this.tvVipDetailPhone.setTag(null);
        this.tvVipDetailRefund = (android.widget.TextView) bindings[5];
        this.tvVipDetailRefund.setTag(null);
        this.tvVipDetailType = (android.widget.TextView) bindings[21];
        this.tvVipcardDetailType = (android.widget.TextView) bindings[11];
        this.tvVipcardDetailType.setTag(null);
        this.view = (android.view.View) bindings[15];
        setRootTag(root);
        // listeners
        mCallback72 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((ys.app.petproject.viewmodel.vip.VipDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.vip.VipDetailViewModel ViewModel) {
        updateRegistration(3, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.vip.VipDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelMInfo((ys.app.petproject.model.VipInfo) object, fieldId);
            case 2 :
                return onChangeViewModelIsAnimal((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModel((ys.app.petproject.viewmodel.vip.VipDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMoney(android.databinding.ObservableField<java.lang.String> ViewModelMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMInfo(ys.app.petproject.model.VipInfo ViewModelMInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsAnimal(android.databinding.ObservableBoolean ViewModelIsAnimal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.vip.VipDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.info) {
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
        java.lang.String viewModelMInfoName = null;
        android.view.View.OnClickListener viewModelClickChargeAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickRefundMoneyAndroidViewViewOnClickListener = null;
        java.lang.String viewModelMoneyGet = null;
        int viewModelIsAnimalViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfViewModelMInfoIntegral = null;
        android.view.View.OnClickListener viewModelClickAddAnimalAndroidViewViewOnClickListener = null;
        int viewModelIsAnimalViewGONEViewVISIBLE = 0;
        boolean viewModelIsAnimalGet = false;
        int viewModelMInfoIntegral = 0;
        java.lang.String viewModelMInfoTypeName = null;
        java.lang.String viewModelMInfoCardNo = null;
        java.lang.String viewModelMInfoPhone = null;
        android.databinding.ObservableField<java.lang.String> viewModelMoney = null;
        ys.app.petproject.model.VipInfo viewModelMInfo = null;
        android.databinding.ObservableBoolean viewModelIsAnimal = null;
        ys.app.petproject.viewmodel.vip.VipDetailViewModel viewModel = mViewModel;
        android.view.View.OnClickListener viewModelClickModifyButtonAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickCharge
                        viewModelClickChargeAndroidViewViewOnClickListener = (((mViewModelClickChargeAndroidViewViewOnClickListener == null) ? (mViewModelClickChargeAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickChargeAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickRefundMoney
                        viewModelClickRefundMoneyAndroidViewViewOnClickListener = (((mViewModelClickRefundMoneyAndroidViewViewOnClickListener == null) ? (mViewModelClickRefundMoneyAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickRefundMoneyAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickAddAnimal
                        viewModelClickAddAnimalAndroidViewViewOnClickListener = (((mViewModelClickAddAnimalAndroidViewViewOnClickListener == null) ? (mViewModelClickAddAnimalAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickAddAnimalAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickModifyButton
                        viewModelClickModifyButtonAndroidViewViewOnClickListener = (((mViewModelClickModifyButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickModifyButtonAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickModifyButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.money
                        viewModelMoney = viewModel.money;
                    }
                    updateRegistration(0, viewModelMoney);


                    if (viewModelMoney != null) {
                        // read viewModel.money.get()
                        viewModelMoneyGet = viewModelMoney.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mInfo
                        viewModelMInfo = viewModel.mInfo;
                    }
                    updateRegistration(1, viewModelMInfo);


                    if (viewModelMInfo != null) {
                        // read viewModel.mInfo.name
                        viewModelMInfoName = viewModelMInfo.getName();
                        // read viewModel.mInfo.integral
                        viewModelMInfoIntegral = viewModelMInfo.getIntegral();
                        // read viewModel.mInfo.typeName
                        viewModelMInfoTypeName = viewModelMInfo.getTypeName();
                        // read viewModel.mInfo.cardNo
                        viewModelMInfoCardNo = viewModelMInfo.getCardNo();
                        // read viewModel.mInfo.phone
                        viewModelMInfoPhone = viewModelMInfo.getPhone();
                    }


                    // read String.valueOf(viewModel.mInfo.integral)
                    stringValueOfViewModelMInfoIntegral = java.lang.String.valueOf(viewModelMInfoIntegral);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isAnimal
                        viewModelIsAnimal = viewModel.isAnimal;
                    }
                    updateRegistration(2, viewModelIsAnimal);


                    if (viewModelIsAnimal != null) {
                        // read viewModel.isAnimal.get()
                        viewModelIsAnimalGet = viewModelIsAnimal.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelIsAnimalGet) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.isAnimal.get() ? View.VISIBLE : View.GONE
                    viewModelIsAnimalViewVISIBLEViewGONE = ((viewModelIsAnimalGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.isAnimal.get() ? View.GONE : View.VISIBLE
                    viewModelIsAnimalViewGONEViewVISIBLE = ((viewModelIsAnimalGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback72);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelMoneyGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, stringValueOfViewModelMInfoIntegral);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipDetailCardNO, viewModelMInfoCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipDetailName, viewModelMInfoName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipDetailPhone, viewModelMInfoPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipcardDetailType, viewModelMInfoTypeName);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView13.setVisibility(viewModelIsAnimalViewVISIBLEViewGONE);
            this.mboundView14.setVisibility(viewModelIsAnimalViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView14.setOnClickListener(viewModelClickAddAnimalAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(viewModelClickAddAnimalAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(viewModelClickModifyButtonAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(viewModelClickChargeAndroidViewViewOnClickListener);
            this.tvVipDetailRefund.setOnClickListener(viewModelClickRefundMoneyAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.VipDetailViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.vip.VipDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickCharge(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.VipDetailViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.vip.VipDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickRefundMoney(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.VipDetailViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.vip.VipDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickAddAnimal(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.VipDetailViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.vip.VipDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickModifyButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.petproject.viewmodel.vip.VipDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.clickVipRecharge();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityVipDetailBinding>inflate(inflater, ys.app.petproject.R.layout.activity_vip_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_vip_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityVipDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityVipDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_vip_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityVipDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.money
        flag 1 (0x2L): viewModel.mInfo
        flag 2 (0x3L): viewModel.isAnimal
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.isAnimal.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.isAnimal.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.isAnimal.get() ? View.GONE : View.VISIBLE
        flag 8 (0x9L): viewModel.isAnimal.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}