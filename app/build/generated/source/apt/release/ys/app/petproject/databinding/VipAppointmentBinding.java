package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VipAppointmentBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_appointment_search, 16);
        sViewsWithIds.put(R.id.ll_addGoods_name, 17);
        sViewsWithIds.put(R.id.iv_end, 18);
        sViewsWithIds.put(R.id.tv_appointment_end_title, 19);
        sViewsWithIds.put(R.id.iv_server, 20);
        sViewsWithIds.put(R.id.tv_appointment_server_title, 21);
        sViewsWithIds.put(R.id.iv_server_detail, 22);
        sViewsWithIds.put(R.id.tv_appointment_server_detail_title, 23);
        sViewsWithIds.put(R.id.iv_appointment_employee, 24);
        sViewsWithIds.put(R.id.tv_appointment_employee_title, 25);
        sViewsWithIds.put(R.id.iv_appointment, 26);
        sViewsWithIds.put(R.id.tv_appointment_time_title, 27);
        sViewsWithIds.put(R.id.iv_appointment_day, 28);
        sViewsWithIds.put(R.id.tv_appointment_time_day_title, 29);
    }
    // views
    @NonNull
    public final android.widget.TextView etAppointmentSearch;
    @NonNull
    public final android.widget.ImageView ivAppointment;
    @NonNull
    public final android.widget.ImageView ivAppointmentDay;
    @NonNull
    public final android.widget.ImageView ivAppointmentEmployee;
    @NonNull
    public final android.widget.TextView ivAppointmentEnd;
    @NonNull
    public final android.widget.TextView ivAppointmentServer;
    @NonNull
    public final android.widget.TextView ivAppointmentTime;
    @NonNull
    public final android.widget.TextView ivAppointmentTimeDay;
    @NonNull
    public final android.widget.ImageView ivEnd;
    @NonNull
    public final android.widget.ImageView ivServer;
    @NonNull
    public final android.widget.ImageView ivServerDetail;
    @NonNull
    public final android.widget.LinearLayout llAddGoodsName;
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.Button mboundView15;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    public final android.widget.TextView tvAppointmentEmployee;
    @NonNull
    public final android.widget.TextView tvAppointmentEmployeeTitle;
    @NonNull
    public final android.widget.TextView tvAppointmentEndTitle;
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
    private ys.app.petproject.viewmodel.appointment.VipAppointmentModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback79;
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback77;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback78;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VipAppointmentBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 10);
        final Object[] bindings = mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds);
        this.etAppointmentSearch = (android.widget.TextView) bindings[16];
        this.ivAppointment = (android.widget.ImageView) bindings[26];
        this.ivAppointmentDay = (android.widget.ImageView) bindings[28];
        this.ivAppointmentEmployee = (android.widget.ImageView) bindings[24];
        this.ivAppointmentEnd = (android.widget.TextView) bindings[4];
        this.ivAppointmentEnd.setTag(null);
        this.ivAppointmentServer = (android.widget.TextView) bindings[6];
        this.ivAppointmentServer.setTag(null);
        this.ivAppointmentTime = (android.widget.TextView) bindings[11];
        this.ivAppointmentTime.setTag(null);
        this.ivAppointmentTimeDay = (android.widget.TextView) bindings[13];
        this.ivAppointmentTimeDay.setTag(null);
        this.ivEnd = (android.widget.ImageView) bindings[18];
        this.ivServer = (android.widget.ImageView) bindings[20];
        this.ivServerDetail = (android.widget.ImageView) bindings[22];
        this.llAddGoodsName = (android.widget.LinearLayout) bindings[17];
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.Button) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.tvAppointmentEmployee = (android.widget.TextView) bindings[9];
        this.tvAppointmentEmployee.setTag(null);
        this.tvAppointmentEmployeeTitle = (android.widget.TextView) bindings[25];
        this.tvAppointmentEndTitle = (android.widget.TextView) bindings[19];
        this.tvAppointmentServerDetailTitle = (android.widget.TextView) bindings[23];
        this.tvAppointmentServerTitle = (android.widget.TextView) bindings[21];
        this.tvAppointmentTimeDayTitle = (android.widget.TextView) bindings[29];
        this.tvAppointmentTimeTitle = (android.widget.TextView) bindings[27];
        setRootTag(root);
        // listeners
        mCallback79 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback82 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback83 = new android.databinding.generated.callback.OnClickListener(this, 8);
        mCallback77 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback80 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback78 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback81 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback87 = new android.databinding.generated.callback.OnClickListener(this, 12);
        mCallback86 = new android.databinding.generated.callback.OnClickListener(this, 11);
        mCallback76 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback84 = new android.databinding.generated.callback.OnClickListener(this, 9);
        mCallback85 = new android.databinding.generated.callback.OnClickListener(this, 10);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
            setViewModel((ys.app.petproject.viewmodel.appointment.VipAppointmentModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.appointment.VipAppointmentModel ViewModel) {
        updateRegistration(9, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.appointment.VipAppointmentModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAppointmentTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelVipCardNo((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelVipPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelEmployeeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPetName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelVipName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelFrameTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelServer((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelServerMatter((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModel((ys.app.petproject.viewmodel.appointment.VipAppointmentModel) object, fieldId);
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
    private boolean onChangeViewModelVipCardNo(android.databinding.ObservableField<java.lang.String> ViewModelVipCardNo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipPhone(android.databinding.ObservableField<java.lang.String> ViewModelVipPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmployeeName(android.databinding.ObservableField<java.lang.String> ViewModelEmployeeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPetName(android.databinding.ObservableField<java.lang.String> ViewModelPetName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipName(android.databinding.ObservableField<java.lang.String> ViewModelVipName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFrameTime(android.databinding.ObservableField<java.lang.String> ViewModelFrameTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelServer(android.databinding.ObservableField<java.lang.String> ViewModelServer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelServerMatter(android.databinding.ObservableField<java.lang.String> ViewModelServerMatter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.appointment.VipAppointmentModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String viewModelVipCardNoGet = null;
        java.lang.String viewModelServerMatterGet = null;
        java.lang.String viewModelVipNameGet = null;
        java.lang.String viewModelServerGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelVipCardNo = null;
        android.databinding.ObservableField<java.lang.String> viewModelVipPhone = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmployeeName = null;
        android.databinding.ObservableField<java.lang.String> viewModelPetName = null;
        java.lang.String viewModelPetNameGet = null;
        java.lang.String viewModelVipPhoneGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelVipName = null;
        java.lang.String viewModelAppointmentTimeGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelFrameTime = null;
        android.databinding.ObservableField<java.lang.String> viewModelServer = null;
        android.databinding.ObservableField<java.lang.String> viewModelServerMatter = null;
        java.lang.String viewModelEmployeeNameGet = null;
        ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

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
            if ((dirtyFlags & 0x602L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipCardNo
                        viewModelVipCardNo = viewModel.vipCardNo;
                    }
                    updateRegistration(1, viewModelVipCardNo);


                    if (viewModelVipCardNo != null) {
                        // read viewModel.vipCardNo.get()
                        viewModelVipCardNoGet = viewModelVipCardNo.get();
                    }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipPhone
                        viewModelVipPhone = viewModel.vipPhone;
                    }
                    updateRegistration(2, viewModelVipPhone);


                    if (viewModelVipPhone != null) {
                        // read viewModel.vipPhone.get()
                        viewModelVipPhoneGet = viewModelVipPhone.get();
                    }
            }
            if ((dirtyFlags & 0x608L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.employeeName
                        viewModelEmployeeName = viewModel.employeeName;
                    }
                    updateRegistration(3, viewModelEmployeeName);


                    if (viewModelEmployeeName != null) {
                        // read viewModel.employeeName.get()
                        viewModelEmployeeNameGet = viewModelEmployeeName.get();
                    }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.petName
                        viewModelPetName = viewModel.petName;
                    }
                    updateRegistration(4, viewModelPetName);


                    if (viewModelPetName != null) {
                        // read viewModel.petName.get()
                        viewModelPetNameGet = viewModelPetName.get();
                    }
            }
            if ((dirtyFlags & 0x620L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipName
                        viewModelVipName = viewModel.vipName;
                    }
                    updateRegistration(5, viewModelVipName);


                    if (viewModelVipName != null) {
                        // read viewModel.vipName.get()
                        viewModelVipNameGet = viewModelVipName.get();
                    }
            }
            if ((dirtyFlags & 0x640L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.frameTime
                        viewModelFrameTime = viewModel.frameTime;
                    }
                    updateRegistration(6, viewModelFrameTime);


                    if (viewModelFrameTime != null) {
                        // read viewModel.frameTime.get()
                        viewModelFrameTimeGet = viewModelFrameTime.get();
                    }
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.server
                        viewModelServer = viewModel.server;
                    }
                    updateRegistration(7, viewModelServer);


                    if (viewModelServer != null) {
                        // read viewModel.server.get()
                        viewModelServerGet = viewModelServer.get();
                    }
            }
            if ((dirtyFlags & 0x700L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.serverMatter
                        viewModelServerMatter = viewModel.serverMatter;
                    }
                    updateRegistration(8, viewModelServerMatter);


                    if (viewModelServerMatter != null) {
                        // read viewModel.serverMatter.get()
                        viewModelServerMatterGet = viewModelServerMatter.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.ivAppointmentEnd.setOnClickListener(mCallback76);
            this.ivAppointmentServer.setOnClickListener(mCallback78);
            this.ivAppointmentTime.setOnClickListener(mCallback83);
            this.ivAppointmentTimeDay.setOnClickListener(mCallback85);
            this.mboundView10.setOnClickListener(mCallback82);
            this.mboundView12.setOnClickListener(mCallback84);
            this.mboundView14.setOnClickListener(mCallback86);
            this.mboundView15.setOnClickListener(mCallback87);
            this.mboundView5.setOnClickListener(mCallback77);
            this.mboundView7.setOnClickListener(mCallback79);
            this.mboundView8.setOnClickListener(mCallback80);
            this.tvAppointmentEmployee.setOnClickListener(mCallback81);
        }
        if ((dirtyFlags & 0x620L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelVipNameGet);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelEmployeeNameGet);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewModelAppointmentTimeGet);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelFrameTimeGet);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelVipPhoneGet);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelVipCardNoGet);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelPetNameGet);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelServerGet);
        }
        if ((dirtyFlags & 0x700L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelServerMatterGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectServer();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectEmployee();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectAppointmentTime();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setPet();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectServerMatter();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectServer();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectEmployee();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.confirmAppointment();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectFrameTime();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setPet();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectAppointmentTime();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.appointment.VipAppointmentModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectFrameTime();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static VipAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VipAppointmentBinding>inflate(inflater, ys.app.petproject.R.layout.fragment_vip_appointment, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VipAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.fragment_vip_appointment, null, false), bindingComponent);
    }
    @NonNull
    public static VipAppointmentBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipAppointmentBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_vip_appointment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VipAppointmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.appointmentTime
        flag 1 (0x2L): viewModel.vipCardNo
        flag 2 (0x3L): viewModel.vipPhone
        flag 3 (0x4L): viewModel.employeeName
        flag 4 (0x5L): viewModel.petName
        flag 5 (0x6L): viewModel.vipName
        flag 6 (0x7L): viewModel.frameTime
        flag 7 (0x8L): viewModel.server
        flag 8 (0x9L): viewModel.serverMatter
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}