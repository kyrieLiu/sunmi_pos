package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddVipBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 11);
        sViewsWithIds.put(R.id.textView, 12);
        sViewsWithIds.put(R.id.add_vip_card_type, 13);
        sViewsWithIds.put(R.id.tv3, 14);
        sViewsWithIds.put(R.id.ll_add_vip_select, 15);
        sViewsWithIds.put(R.id.rg_add_vip_birthday, 16);
        sViewsWithIds.put(R.id.rb_add_vip_select_birthday, 17);
        sViewsWithIds.put(R.id.rb_add_vip_not_select_birthday, 18);
        sViewsWithIds.put(R.id.ll_add_vip_birthday, 19);
        sViewsWithIds.put(R.id.ll_add_vip_employee, 20);
    }
    // views
    @NonNull
    public final android.widget.TextView addVipBirthdayName;
    @NonNull
    public final android.widget.RelativeLayout addVipCardType;
    @NonNull
    public final android.widget.EditText cardNoEt;
    @NonNull
    public final android.widget.ImageView ivDialogSearchCard;
    @NonNull
    public final android.widget.LinearLayout llAddVipBirthday;
    @NonNull
    public final android.widget.LinearLayout llAddVipEmployee;
    @NonNull
    public final android.widget.LinearLayout llAddVipSelect;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    @NonNull
    public final android.widget.EditText nameEt;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.RadioButton rbAddVipNotSelectBirthday;
    @NonNull
    public final android.widget.RadioButton rbAddVipSelectBirthday;
    @NonNull
    public final android.widget.RadioGroup rgAddVipBirthday;
    @NonNull
    public final android.widget.ImageView selectIv;
    @NonNull
    public final android.widget.EditText telEt;
    @NonNull
    public final android.widget.TextView textView;
    @NonNull
    public final android.widget.TextView tv3;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.widget.EditText vipTypeTv;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.vip.AddVipViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelSelectEmployeeAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickSelectButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener cardNoEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obVipCardNo.get()
            //         is viewModel.obVipCardNo.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(cardNoEt);
            // localize variables for thread safety
            // viewModel.obVipCardNo
            android.databinding.ObservableField<java.lang.String> viewModelObVipCardNo = null;
            // viewModel.obVipCardNo != null
            boolean viewModelObVipCardNoJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obVipCardNo.get()
            java.lang.String viewModelObVipCardNoGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObVipCardNo = viewModel.obVipCardNo;

                viewModelObVipCardNoJavaLangObjectNull = (viewModelObVipCardNo) != (null);
                if (viewModelObVipCardNoJavaLangObjectNull) {




                    viewModelObVipCardNo.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener nameEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obVipName.get()
            //         is viewModel.obVipName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(nameEt);
            // localize variables for thread safety
            // viewModel.obVipName != null
            boolean viewModelObVipNameJavaLangObjectNull = false;
            // viewModel.obVipName.get()
            java.lang.String viewModelObVipNameGet = null;
            // viewModel.obVipName
            android.databinding.ObservableField<java.lang.String> viewModelObVipName = null;
            // viewModel
            ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObVipName = viewModel.obVipName;

                viewModelObVipNameJavaLangObjectNull = (viewModelObVipName) != (null);
                if (viewModelObVipNameJavaLangObjectNull) {




                    viewModelObVipName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener telEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obVipTel.get()
            //         is viewModel.obVipTel.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(telEt);
            // localize variables for thread safety
            // viewModel.obVipTel.get()
            java.lang.String viewModelObVipTelGet = null;
            // viewModel
            ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;
            // viewModel.obVipTel
            android.databinding.ObservableField<java.lang.String> viewModelObVipTel = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obVipTel != null
            boolean viewModelObVipTelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObVipTel = viewModel.obVipTel;

                viewModelObVipTelJavaLangObjectNull = (viewModelObVipTel) != (null);
                if (viewModelObVipTelJavaLangObjectNull) {




                    viewModelObVipTel.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener vipTypeTvandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obVipTypeName.get()
            //         is viewModel.obVipTypeName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(vipTypeTv);
            // localize variables for thread safety
            // viewModel.obVipTypeName.get()
            java.lang.String viewModelObVipTypeNameGet = null;
            // viewModel.obVipTypeName != null
            boolean viewModelObVipTypeNameJavaLangObjectNull = false;
            // viewModel.obVipTypeName
            android.databinding.ObservableField<java.lang.String> viewModelObVipTypeName = null;
            // viewModel
            ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObVipTypeName = viewModel.obVipTypeName;

                viewModelObVipTypeNameJavaLangObjectNull = (viewModelObVipTypeName) != (null);
                if (viewModelObVipTypeNameJavaLangObjectNull) {




                    viewModelObVipTypeName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddVipBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds);
        this.addVipBirthdayName = (android.widget.TextView) bindings[7];
        this.addVipBirthdayName.setTag(null);
        this.addVipCardType = (android.widget.RelativeLayout) bindings[13];
        this.cardNoEt = (android.widget.EditText) bindings[3];
        this.cardNoEt.setTag(null);
        this.ivDialogSearchCard = (android.widget.ImageView) bindings[4];
        this.ivDialogSearchCard.setTag(null);
        this.llAddVipBirthday = (android.widget.LinearLayout) bindings[19];
        this.llAddVipEmployee = (android.widget.LinearLayout) bindings[20];
        this.llAddVipSelect = (android.widget.LinearLayout) bindings[15];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.nameEt = (android.widget.EditText) bindings[1];
        this.nameEt.setTag(null);
        this.okBtn = (android.widget.Button) bindings[10];
        this.okBtn.setTag(null);
        this.rbAddVipNotSelectBirthday = (android.widget.RadioButton) bindings[18];
        this.rbAddVipSelectBirthday = (android.widget.RadioButton) bindings[17];
        this.rgAddVipBirthday = (android.widget.RadioGroup) bindings[16];
        this.selectIv = (android.widget.ImageView) bindings[5];
        this.selectIv.setTag(null);
        this.telEt = (android.widget.EditText) bindings[2];
        this.telEt.setTag(null);
        this.textView = (android.widget.TextView) bindings[12];
        this.tv3 = (android.widget.TextView) bindings[14];
        this.view = (android.view.View) bindings[11];
        this.vipTypeTv = (android.widget.EditText) bindings[6];
        this.vipTypeTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback50 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback51 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewModel((ys.app.petproject.viewmodel.vip.AddVipViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.vip.AddVipViewModel ViewModel) {
        updateRegistration(6, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.vip.AddVipViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObVipTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObVipTel((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObVipName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObButtonEnable((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelEmployeeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelObVipCardNo((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModel((ys.app.petproject.viewmodel.vip.AddVipViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObVipTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObVipTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipTel(android.databinding.ObservableField<java.lang.String> ViewModelObVipTel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipName(android.databinding.ObservableField<java.lang.String> ViewModelObVipName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObButtonEnable(android.databinding.ObservableBoolean ViewModelObButtonEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
    private boolean onChangeViewModelObVipCardNo(android.databinding.ObservableField<java.lang.String> ViewModelObVipCardNo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.vip.AddVipViewModel ViewModel, int fieldId) {
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
        android.databinding.ObservableField<java.lang.String> viewModelObVipTypeName = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipTel = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.text.TextWatcher viewModelTextChangeListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipName = null;
        boolean viewModelObButtonEnableGet = false;
        android.databinding.ObservableBoolean viewModelObButtonEnable = null;
        int spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1nViewVISIBLEViewGONE = 0;
        java.lang.String viewModelObVipTypeNameGet = null;
        java.lang.String spUtilDeviceModel = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmployeeName = null;
        android.view.View.OnClickListener viewModelSelectEmployeeAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSelectButtonAndroidViewViewOnClickListener = null;
        boolean spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n = false;
        java.lang.String viewModelObVipNameGet = null;
        java.lang.String viewModelObVipTelGet = null;
        java.lang.String viewModelObVipCardNoGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipCardNo = null;
        java.lang.String viewModelEmployeeNameGet = null;
        ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x80L) != 0) {

                // read SpUtil.deviceModel
                spUtilDeviceModel = ys.app.petproject.SpUtil.getDeviceModel();


                if (spUtilDeviceModel != null) {
                    // read SpUtil.deviceModel.equals(@android:string/device_p1n)
                    spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n = spUtilDeviceModel.equals(ivDialogSearchCard.getResources().getString(R.string.device_p1n));
                }
            if((dirtyFlags & 0x80L) != 0) {
                if(spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read SpUtil.deviceModel.equals(@android:string/device_p1n) ? View.VISIBLE : View.GONE
                spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1nViewVISIBLEViewGONE = ((spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1n) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipTypeName
                        viewModelObVipTypeName = viewModel.obVipTypeName;
                    }
                    updateRegistration(0, viewModelObVipTypeName);


                    if (viewModelObVipTypeName != null) {
                        // read viewModel.obVipTypeName.get()
                        viewModelObVipTypeNameGet = viewModelObVipTypeName.get();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipTel
                        viewModelObVipTel = viewModel.obVipTel;
                    }
                    updateRegistration(1, viewModelObVipTel);


                    if (viewModelObVipTel != null) {
                        // read viewModel.obVipTel.get()
                        viewModelObVipTelGet = viewModelObVipTel.get();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.textChangeListener
                        viewModelTextChangeListener = viewModel.textChangeListener;
                        // read viewModel::selectEmployee
                        viewModelSelectEmployeeAndroidViewViewOnClickListener = (((mViewModelSelectEmployeeAndroidViewViewOnClickListener == null) ? (mViewModelSelectEmployeeAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelSelectEmployeeAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickSelectButton
                        viewModelClickSelectButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectButtonAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickSelectButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipName
                        viewModelObVipName = viewModel.obVipName;
                    }
                    updateRegistration(2, viewModelObVipName);


                    if (viewModelObVipName != null) {
                        // read viewModel.obVipName.get()
                        viewModelObVipNameGet = viewModelObVipName.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obButtonEnable
                        viewModelObButtonEnable = viewModel.obButtonEnable;
                    }
                    updateRegistration(3, viewModelObButtonEnable);


                    if (viewModelObButtonEnable != null) {
                        // read viewModel.obButtonEnable.get()
                        viewModelObButtonEnableGet = viewModelObButtonEnable.get();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

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
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipCardNo
                        viewModelObVipCardNo = viewModel.obVipCardNo;
                    }
                    updateRegistration(5, viewModelObVipCardNo);


                    if (viewModelObVipCardNo != null) {
                        // read viewModel.obVipCardNo.get()
                        viewModelObVipCardNoGet = viewModelObVipCardNo.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.addVipBirthdayName.setOnClickListener(mCallback51);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.cardNoEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, cardNoEtandroidTextAttrChanged);
            this.ivDialogSearchCard.setVisibility(spUtilDeviceModelEqualsIvDialogSearchCardAndroidStringDeviceP1nViewVISIBLEViewGONE);
            this.ivDialogSearchCard.setOnClickListener(mCallback50);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.telEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, telEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.vipTypeTv, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, vipTypeTvandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cardNoEt, viewModelObVipCardNoGet);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.cardNoEt, viewModelTextChangeListener);
            this.mboundView8.setOnClickListener(viewModelSelectEmployeeAndroidViewViewOnClickListener);
            this.mboundView9.setOnClickListener(viewModelSelectEmployeeAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.nameEt, viewModelTextChangeListener);
            this.okBtn.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            this.selectIv.setOnClickListener(viewModelClickSelectButtonAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.telEt, viewModelTextChangeListener);
            this.vipTypeTv.setOnClickListener(viewModelClickSelectButtonAndroidViewViewOnClickListener);
            ys.app.petproject.PetBindingUtil.setTextChangedListener(this.vipTypeTv, viewModelTextChangeListener);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelEmployeeNameGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameEt, viewModelObVipNameGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            this.okBtn.setEnabled(viewModelObButtonEnableGet);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.telEt, viewModelObVipTelGet);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.vipTypeTv, viewModelObVipTypeNameGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.AddVipViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.vip.AddVipViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.AddVipViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.vip.AddVipViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.selectEmployee(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.vip.AddVipViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.vip.AddVipViewModel value) {
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
                ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.searchCardNo();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.vip.AddVipViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showCardList();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddVipBinding>inflate(inflater, ys.app.petproject.R.layout.activity_add_vip, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddVipBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_add_vip, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddVipBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_vip_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddVipBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obVipTypeName
        flag 1 (0x2L): viewModel.obVipTel
        flag 2 (0x3L): viewModel.obVipName
        flag 3 (0x4L): viewModel.obButtonEnable
        flag 4 (0x5L): viewModel.employeeName
        flag 5 (0x6L): viewModel.obVipCardNo
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): SpUtil.deviceModel.equals(@android:string/device_p1n) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): SpUtil.deviceModel.equals(@android:string/device_p1n) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}