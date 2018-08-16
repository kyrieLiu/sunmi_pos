package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NormalAppointmentBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_addGoods_name, 15);
        sViewsWithIds.put(R.id.iv_appointment, 16);
        sViewsWithIds.put(R.id.tv_appointment_time_title, 17);
        sViewsWithIds.put(R.id.iv_appointment_add_pet, 18);
        sViewsWithIds.put(R.id.iv_server, 19);
        sViewsWithIds.put(R.id.tv_appointment_server_title, 20);
        sViewsWithIds.put(R.id.iv_server_detail, 21);
        sViewsWithIds.put(R.id.tv_appointment_server_detail_title, 22);
        sViewsWithIds.put(R.id.iv_appointment_employee, 23);
        sViewsWithIds.put(R.id.tv_appointment_employee_title, 24);
        sViewsWithIds.put(R.id.iv, 25);
        sViewsWithIds.put(R.id.tv, 26);
        sViewsWithIds.put(R.id.iv_appointment_day, 27);
        sViewsWithIds.put(R.id.tv_appointment_time_day_title, 28);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv;
    @NonNull
    public final android.widget.ImageView ivAppointment;
    @NonNull
    public final android.widget.ImageView ivAppointmentAddPet;
    @NonNull
    public final android.widget.ImageView ivAppointmentDay;
    @NonNull
    public final android.widget.ImageView ivAppointmentEmployee;
    @NonNull
    public final android.widget.TextView ivAppointmentServer;
    @NonNull
    public final android.widget.TextView ivAppointmentTime;
    @NonNull
    public final android.widget.TextView ivAppointmentTimeDay;
    @NonNull
    public final android.widget.ImageView ivServer;
    @NonNull
    public final android.widget.ImageView ivServerDetail;
    @NonNull
    public final android.widget.LinearLayout llAddGoodsName;
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.Button mboundView14;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.TextView selectIv;
    @NonNull
    public final android.widget.TextView tv;
    @NonNull
    public final android.widget.TextView tvAppointmentEmployee;
    @NonNull
    public final android.widget.TextView tvAppointmentEmployeeTitle;
    @NonNull
    public final android.widget.TextView tvAppointmentServerDetailTitle;
    @NonNull
    public final android.widget.TextView tvAppointmentServerTitle;
    @NonNull
    public final android.widget.TextView tvAppointmentTimeDayTitle;
    @NonNull
    public final android.widget.TextView tvAppointmentTimeTitle;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.appointment.NormalAppointmentModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.userName.get()
            //         is viewModel.userName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.userName.get()
            java.lang.String viewModelUserNameGet = null;
            // viewModel.userName
            android.databinding.ObservableField<java.lang.String> viewModelUserName = null;
            // viewModel.userName != null
            boolean viewModelUserNameJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUserName = viewModel.userName;

                viewModelUserNameJavaLangObjectNull = (viewModelUserName) != (null);
                if (viewModelUserNameJavaLangObjectNull) {




                    viewModelUserName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.userPhone.get()
            //         is viewModel.userPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.userPhone != null
            boolean viewModelUserPhoneJavaLangObjectNull = false;
            // viewModel
            ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
            // viewModel.userPhone.get()
            java.lang.String viewModelUserPhoneGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.userPhone
            android.databinding.ObservableField<java.lang.String> viewModelUserPhone = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUserPhone = viewModel.userPhone;

                viewModelUserPhoneJavaLangObjectNull = (viewModelUserPhone) != (null);
                if (viewModelUserPhoneJavaLangObjectNull) {




                    viewModelUserPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public NormalAppointmentBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 9);
        final Object[] bindings = mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds);
        this.iv = (android.widget.ImageView) bindings[25];
        this.ivAppointment = (android.widget.ImageView) bindings[16];
        this.ivAppointmentAddPet = (android.widget.ImageView) bindings[18];
        this.ivAppointmentDay = (android.widget.ImageView) bindings[27];
        this.ivAppointmentEmployee = (android.widget.ImageView) bindings[23];
        this.ivAppointmentServer = (android.widget.TextView) bindings[5];
        this.ivAppointmentServer.setTag(null);
        this.ivAppointmentTime = (android.widget.TextView) bindings[3];
        this.ivAppointmentTime.setTag(null);
        this.ivAppointmentTimeDay = (android.widget.TextView) bindings[12];
        this.ivAppointmentTimeDay.setTag(null);
        this.ivServer = (android.widget.ImageView) bindings[19];
        this.ivServerDetail = (android.widget.ImageView) bindings[21];
        this.llAddGoodsName = (android.widget.LinearLayout) bindings[15];
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.Button) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv = (android.widget.TextView) bindings[10];
        this.selectIv.setTag(null);
        this.tv = (android.widget.TextView) bindings[26];
        this.tvAppointmentEmployee = (android.widget.TextView) bindings[8];
        this.tvAppointmentEmployee.setTag(null);
        this.tvAppointmentEmployeeTitle = (android.widget.TextView) bindings[24];
        this.tvAppointmentServerDetailTitle = (android.widget.TextView) bindings[22];
        this.tvAppointmentServerTitle = (android.widget.TextView) bindings[20];
        this.tvAppointmentTimeDayTitle = (android.widget.TextView) bindings[28];
        this.tvAppointmentTimeTitle = (android.widget.TextView) bindings[17];
        setRootTag(root);
        // listeners
        mCallback55 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback56 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback64 = new android.databinding.generated.callback.OnClickListener(this, 12);
        mCallback54 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback53 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback59 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback62 = new android.databinding.generated.callback.OnClickListener(this, 10);
        mCallback63 = new android.databinding.generated.callback.OnClickListener(this, 11);
        mCallback57 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback60 = new android.databinding.generated.callback.OnClickListener(this, 8);
        mCallback58 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback61 = new android.databinding.generated.callback.OnClickListener(this, 9);
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
            setViewModel((ys.app.petproject.viewmodel.appointment.NormalAppointmentModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.appointment.NormalAppointmentModel ViewModel) {
        updateRegistration(8, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.appointment.NormalAppointmentModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAppointmentTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelUserName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelEmployeeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelPetName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelUserPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelFrameTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelServer((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelServerMatter((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModel((ys.app.petproject.viewmodel.appointment.NormalAppointmentModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAppointmentTime(android.databinding.ObservableField<java.lang.String> ViewModelAppointmentTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUserName(android.databinding.ObservableField<java.lang.String> ViewModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmployeeName(android.databinding.ObservableField<java.lang.String> ViewModelEmployeeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPetName(android.databinding.ObservableField<java.lang.String> ViewModelPetName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUserPhone(android.databinding.ObservableField<java.lang.String> ViewModelUserPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFrameTime(android.databinding.ObservableField<java.lang.String> ViewModelFrameTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelServer(android.databinding.ObservableField<java.lang.String> ViewModelServer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelServerMatter(android.databinding.ObservableField<java.lang.String> ViewModelServerMatter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.appointment.NormalAppointmentModel ViewModel, int fieldId) {
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
        java.lang.String viewModelFrameTimeGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelAppointmentTime = null;
        java.lang.String viewModelServerMatterGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelUserName = null;
        java.lang.String viewModelServerGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmployeeName = null;
        android.databinding.ObservableField<java.lang.String> viewModelPetName = null;
        java.lang.String viewModelUserNameGet = null;
        java.lang.String viewModelPetNameGet = null;
        java.lang.String viewModelAppointmentTimeGet = null;
        java.lang.String viewModelUserPhoneGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelUserPhone = null;
        android.databinding.ObservableField<java.lang.String> viewModelFrameTime = null;
        android.databinding.ObservableField<java.lang.String> viewModelServer = null;
        android.databinding.ObservableField<java.lang.String> viewModelServerMatter = null;
        java.lang.String viewModelEmployeeNameGet = null;
        ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.appointmentTime
                        viewModelAppointmentTime = viewModel.appointmentTime;
                    }
                    updateRegistration(0, viewModelAppointmentTime);


                    if (viewModelAppointmentTime != null) {
                        // read viewModel.appointmentTime.get()
                        viewModelAppointmentTimeGet = viewModelAppointmentTime.get();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userName
                        viewModelUserName = viewModel.userName;
                    }
                    updateRegistration(1, viewModelUserName);


                    if (viewModelUserName != null) {
                        // read viewModel.userName.get()
                        viewModelUserNameGet = viewModelUserName.get();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.employeeName
                        viewModelEmployeeName = viewModel.employeeName;
                    }
                    updateRegistration(2, viewModelEmployeeName);


                    if (viewModelEmployeeName != null) {
                        // read viewModel.employeeName.get()
                        viewModelEmployeeNameGet = viewModelEmployeeName.get();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.petName
                        viewModelPetName = viewModel.petName;
                    }
                    updateRegistration(3, viewModelPetName);


                    if (viewModelPetName != null) {
                        // read viewModel.petName.get()
                        viewModelPetNameGet = viewModelPetName.get();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userPhone
                        viewModelUserPhone = viewModel.userPhone;
                    }
                    updateRegistration(4, viewModelUserPhone);


                    if (viewModelUserPhone != null) {
                        // read viewModel.userPhone.get()
                        viewModelUserPhoneGet = viewModelUserPhone.get();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.frameTime
                        viewModelFrameTime = viewModel.frameTime;
                    }
                    updateRegistration(5, viewModelFrameTime);


                    if (viewModelFrameTime != null) {
                        // read viewModel.frameTime.get()
                        viewModelFrameTimeGet = viewModelFrameTime.get();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.server
                        viewModelServer = viewModel.server;
                    }
                    updateRegistration(6, viewModelServer);


                    if (viewModelServer != null) {
                        // read viewModel.server.get()
                        viewModelServerGet = viewModelServer.get();
                    }
            }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.serverMatter
                        viewModelServerMatter = viewModel.serverMatter;
                    }
                    updateRegistration(7, viewModelServerMatter);


                    if (viewModelServerMatter != null) {
                        // read viewModel.serverMatter.get()
                        viewModelServerMatterGet = viewModelServerMatter.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.ivAppointmentServer.setOnClickListener(mCallback55);
            this.ivAppointmentTime.setOnClickListener(mCallback53);
            this.ivAppointmentTimeDay.setOnClickListener(mCallback62);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView11.setOnClickListener(mCallback61);
            this.mboundView13.setOnClickListener(mCallback63);
            this.mboundView14.setOnClickListener(mCallback64);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback54);
            this.mboundView6.setOnClickListener(mCallback56);
            this.mboundView7.setOnClickListener(mCallback57);
            this.mboundView9.setOnClickListener(mCallback59);
            this.selectIv.setOnClickListener(mCallback60);
            this.tvAppointmentEmployee.setOnClickListener(mCallback58);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelUserNameGet);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelAppointmentTimeGet);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelFrameTimeGet);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelUserPhoneGet);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelPetNameGet);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelServerGet);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelServerMatterGet);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelEmployeeNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectServer();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectServer();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.confirmAppointment();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.getAnimalHttp();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.getAnimalHttp();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectEmployee();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectFrameTime();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectFrameTime();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectServerMatter();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectAppointmentTime();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectEmployee();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.NormalAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectAppointmentTime();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static NormalAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NormalAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<NormalAppointmentBinding>inflate(inflater, ys.app.petproject.R.layout.fragment_normal_appointment, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static NormalAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NormalAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.fragment_normal_appointment, null, false), bindingComponent);
    }
    @NonNull
    public static NormalAppointmentBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NormalAppointmentBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_normal_appointment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new NormalAppointmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.appointmentTime
        flag 1 (0x2L): viewModel.userName
        flag 2 (0x3L): viewModel.employeeName
        flag 3 (0x4L): viewModel.petName
        flag 4 (0x5L): viewModel.userPhone
        flag 5 (0x6L): viewModel.frameTime
        flag 6 (0x7L): viewModel.server
        flag 7 (0x8L): viewModel.serverMatter
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}