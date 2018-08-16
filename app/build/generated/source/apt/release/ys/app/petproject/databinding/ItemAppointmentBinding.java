package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAppointmentBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_appointment_line, 14);
        sViewsWithIds.put(R.id.tv_item_appointment_age, 15);
        sViewsWithIds.put(R.id.tv_item_appointment_isVip, 16);
        sViewsWithIds.put(R.id.view_appointment_bottom_line, 17);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.Button mboundView11;
    @NonNull
    private final android.widget.Button mboundView13;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    public final android.support.v7.widget.CardView rootView;
    @NonNull
    public final android.widget.TextView tvItemAppointment;
    @NonNull
    public final android.widget.TextView tvItemAppointmentAge;
    @NonNull
    public final android.widget.TextView tvItemAppointmentDayTime;
    @NonNull
    public final android.widget.TextView tvItemAppointmentIsVip;
    @NonNull
    public final android.widget.TextView tvItemAppointmentName;
    @NonNull
    public final android.widget.TextView tvItemAppointmentServerEmployee;
    @NonNull
    public final android.widget.TextView tvItemAppointmentService;
    @NonNull
    public final android.widget.TextView tvItemAppointmentType;
    @NonNull
    public final android.widget.TextView tvItemAppointmentVipPhone;
    @NonNull
    public final android.widget.TextView tvItemAppointmentWeight;
    @NonNull
    public final android.view.View viewAppointmentBottomLine;
    @NonNull
    public final android.view.View viewAppointmentLine;
    @NonNull
    public final android.widget.Button viewAppointmentWaitTime;
    // variables
    @Nullable
    private ys.app.petproject.itemmodel.AppointmentItemModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback101;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAppointmentBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.Button) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (android.widget.Button) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.rootView = (android.support.v7.widget.CardView) bindings[0];
        this.rootView.setTag(null);
        this.tvItemAppointment = (android.widget.TextView) bindings[1];
        this.tvItemAppointment.setTag(null);
        this.tvItemAppointmentAge = (android.widget.TextView) bindings[15];
        this.tvItemAppointmentDayTime = (android.widget.TextView) bindings[2];
        this.tvItemAppointmentDayTime.setTag(null);
        this.tvItemAppointmentIsVip = (android.widget.TextView) bindings[16];
        this.tvItemAppointmentName = (android.widget.TextView) bindings[4];
        this.tvItemAppointmentName.setTag(null);
        this.tvItemAppointmentServerEmployee = (android.widget.TextView) bindings[8];
        this.tvItemAppointmentServerEmployee.setTag(null);
        this.tvItemAppointmentService = (android.widget.TextView) bindings[9];
        this.tvItemAppointmentService.setTag(null);
        this.tvItemAppointmentType = (android.widget.TextView) bindings[5];
        this.tvItemAppointmentType.setTag(null);
        this.tvItemAppointmentVipPhone = (android.widget.TextView) bindings[7];
        this.tvItemAppointmentVipPhone.setTag(null);
        this.tvItemAppointmentWeight = (android.widget.TextView) bindings[6];
        this.tvItemAppointmentWeight.setTag(null);
        this.viewAppointmentBottomLine = (android.view.View) bindings[17];
        this.viewAppointmentLine = (android.view.View) bindings[14];
        this.viewAppointmentWaitTime = (android.widget.Button) bindings[12];
        this.viewAppointmentWaitTime.setTag(null);
        setRootTag(root);
        // listeners
        mCallback100 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback101 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.petproject.itemmodel.AppointmentItemModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.itemmodel.AppointmentItemModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.itemmodel.AppointmentItemModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.itemmodel.AppointmentItemModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelIsWaiting((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeItemViewModelIsFailer((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeItemViewModelIsAready((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.itemmodel.AppointmentItemModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelIsWaiting(android.databinding.ObservableBoolean ItemViewModelIsWaiting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelIsFailer(android.databinding.ObservableBoolean ItemViewModelIsFailer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelIsAready(android.databinding.ObservableBoolean ItemViewModelIsAready, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String itemViewModelModelPetName = null;
        java.lang.String itemViewModelModelPetType2Name = null;
        java.lang.String tvItemAppointmentServiceAndroidStringServerMatterItemViewModelModelProductType2Name = null;
        long itemViewModelModelBespeakDay = 0L;
        int itemViewModelIsFailerViewVISIBLEViewGONE = 0;
        ys.app.petproject.itemmodel.AppointmentItemModel itemViewModel = mItemViewModel;
        android.databinding.ObservableBoolean itemViewModelIsWaiting = null;
        int itemViewModelIsAreadyViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelModelUserName = null;
        int itemViewModelIsAreadyViewGONEViewVISIBLE = 0;
        java.lang.String itemViewModelModelBespeakPoint = null;
        java.lang.String itemViewModelModelProductType2Name = null;
        java.lang.String tvItemAppointmentVipPhoneAndroidStringPhoneItemViewModelModelVipUserPhone = null;
        java.lang.String appUtilGetDayTimesItemViewModelModelBespeakDay = null;
        android.databinding.ObservableBoolean itemViewModelIsFailer = null;
        android.databinding.ObservableBoolean itemViewModelIsAready = null;
        java.lang.String itemViewModelModelVipUserPhone = null;
        ys.app.petproject.model.AppointmentBean itemViewModelModel = null;
        java.lang.String tvItemAppointmentServerEmployeeAndroidStringServerEmployeeItemViewModelModelUserName = null;
        boolean itemViewModelIsAreadyGet = false;
        boolean itemViewModelIsWaitingGet = false;
        int itemViewModelIsWaitingViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelModelVipUserName = null;
        boolean itemViewModelIsFailerGet = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.isWaiting
                        itemViewModelIsWaiting = itemViewModel.isWaiting;
                    }
                    updateRegistration(1, itemViewModelIsWaiting);


                    if (itemViewModelIsWaiting != null) {
                        // read itemViewModel.isWaiting.get()
                        itemViewModelIsWaitingGet = itemViewModelIsWaiting.get();
                    }
                if((dirtyFlags & 0x23L) != 0) {
                    if(itemViewModelIsWaitingGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read itemViewModel.isWaiting.get() ? View.VISIBLE : View.GONE
                    itemViewModelIsWaitingViewVISIBLEViewGONE = ((itemViewModelIsWaitingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.isFailer
                        itemViewModelIsFailer = itemViewModel.isFailer;
                    }
                    updateRegistration(2, itemViewModelIsFailer);


                    if (itemViewModelIsFailer != null) {
                        // read itemViewModel.isFailer.get()
                        itemViewModelIsFailerGet = itemViewModelIsFailer.get();
                    }
                if((dirtyFlags & 0x25L) != 0) {
                    if(itemViewModelIsFailerGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read itemViewModel.isFailer.get() ? View.VISIBLE : View.GONE
                    itemViewModelIsFailerViewVISIBLEViewGONE = ((itemViewModelIsFailerGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.isAready
                        itemViewModelIsAready = itemViewModel.isAready;
                    }
                    updateRegistration(3, itemViewModelIsAready);


                    if (itemViewModelIsAready != null) {
                        // read itemViewModel.isAready.get()
                        itemViewModelIsAreadyGet = itemViewModelIsAready.get();
                    }
                if((dirtyFlags & 0x29L) != 0) {
                    if(itemViewModelIsAreadyGet) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read itemViewModel.isAready.get() ? View.VISIBLE : View.GONE
                    itemViewModelIsAreadyViewVISIBLEViewGONE = ((itemViewModelIsAreadyGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read itemViewModel.isAready.get() ? View.GONE : View.VISIBLE
                    itemViewModelIsAreadyViewGONEViewVISIBLE = ((itemViewModelIsAreadyGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.petName
                        itemViewModelModelPetName = itemViewModelModel.getPetName();
                        // read itemViewModel.model.petType2Name
                        itemViewModelModelPetType2Name = itemViewModelModel.getPetType2Name();
                        // read itemViewModel.model.bespeakDay
                        itemViewModelModelBespeakDay = itemViewModelModel.getBespeakDay();
                        // read itemViewModel.model.userName
                        itemViewModelModelUserName = itemViewModelModel.getUserName();
                        // read itemViewModel.model.bespeakPoint
                        itemViewModelModelBespeakPoint = itemViewModelModel.getBespeakPoint();
                        // read itemViewModel.model.productType2Name
                        itemViewModelModelProductType2Name = itemViewModelModel.getProductType2Name();
                        // read itemViewModel.model.vipUserPhone
                        itemViewModelModelVipUserPhone = itemViewModelModel.getVipUserPhone();
                        // read itemViewModel.model.vipUserName
                        itemViewModelModelVipUserName = itemViewModelModel.getVipUserName();
                    }


                    // read AppUtil.getDayTimes(itemViewModel.model.bespeakDay)
                    appUtilGetDayTimesItemViewModelModelBespeakDay = ys.app.petproject.utils.AppUtil.getDayTimes(itemViewModelModelBespeakDay);
                    // read (@android:string/serverEmployee) + (itemViewModel.model.userName)
                    tvItemAppointmentServerEmployeeAndroidStringServerEmployeeItemViewModelModelUserName = (tvItemAppointmentServerEmployee.getResources().getString(R.string.serverEmployee)) + (itemViewModelModelUserName);
                    // read (@android:string/serverMatter) + (itemViewModel.model.productType2Name)
                    tvItemAppointmentServiceAndroidStringServerMatterItemViewModelModelProductType2Name = (tvItemAppointmentService.getResources().getString(R.string.serverMatter)) + (itemViewModelModelProductType2Name);
                    // read (@android:string/phone) + (itemViewModel.model.vipUserPhone)
                    tvItemAppointmentVipPhoneAndroidStringPhoneItemViewModelModelVipUserPhone = (tvItemAppointmentVipPhone.getResources().getString(R.string.phone)) + (itemViewModelModelVipUserPhone);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(itemViewModelIsAreadyViewGONEViewVISIBLE);
            this.mboundView3.setVisibility(itemViewModelIsAreadyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(itemViewModelIsFailerViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView13.setOnClickListener(mCallback101);
            this.viewAppointmentWaitTime.setOnClickListener(mCallback100);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(itemViewModelIsWaitingViewVISIBLEViewGONE);
            this.viewAppointmentWaitTime.setVisibility(itemViewModelIsWaitingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointment, appUtilGetDayTimesItemViewModelModelBespeakDay);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentDayTime, itemViewModelModelBespeakPoint);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentName, itemViewModelModelVipUserName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentServerEmployee, tvItemAppointmentServerEmployeeAndroidStringServerEmployeeItemViewModelModelUserName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentService, tvItemAppointmentServiceAndroidStringServerMatterItemViewModelModelProductType2Name);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentType, itemViewModelModelPetName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentVipPhone, tvItemAppointmentVipPhoneAndroidStringPhoneItemViewModelModelVipUserPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemAppointmentWeight, itemViewModelModelPetType2Name);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.petproject.itemmodel.AppointmentItemModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.noTimeDialog();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.petproject.itemmodel.AppointmentItemModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.showConfirmDialog();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemAppointmentBinding>inflate(inflater, ys.app.petproject.R.layout.item_appointment, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAppointmentBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_appointment, null, false), bindingComponent);
    }
    @NonNull
    public static ItemAppointmentBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAppointmentBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_appointment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemAppointmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.isWaiting
        flag 2 (0x3L): itemViewModel.isFailer
        flag 3 (0x4L): itemViewModel.isAready
        flag 4 (0x5L): itemViewModel.model
        flag 5 (0x6L): null
        flag 6 (0x7L): itemViewModel.isFailer.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): itemViewModel.isFailer.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): itemViewModel.isAready.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): itemViewModel.isAready.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): itemViewModel.isAready.get() ? View.GONE : View.VISIBLE
        flag 11 (0xcL): itemViewModel.isAready.get() ? View.GONE : View.VISIBLE
        flag 12 (0xdL): itemViewModel.isWaiting.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): itemViewModel.isWaiting.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}