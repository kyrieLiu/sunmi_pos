package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AppointmentMainItemModelBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    public final android.support.v7.widget.CardView rootView;
    @NonNull
    public final android.widget.TextView textView17;
    @NonNull
    public final android.widget.TextView tvAppointmentDay;
    @NonNull
    public final android.widget.TextView tvAppointmentWeek;
    // variables
    @Nullable
    private ys.app.petproject.itemmodel.AppointmentMainItemModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AppointmentMainItemModelBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.rootView = (android.support.v7.widget.CardView) bindings[0];
        this.rootView.setTag(null);
        this.textView17 = (android.widget.TextView) bindings[4];
        this.textView17.setTag(null);
        this.tvAppointmentDay = (android.widget.TextView) bindings[1];
        this.tvAppointmentDay.setTag(null);
        this.tvAppointmentWeek = (android.widget.TextView) bindings[2];
        this.tvAppointmentWeek.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.petproject.itemmodel.AppointmentMainItemModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.itemmodel.AppointmentMainItemModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.itemmodel.AppointmentMainItemModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.itemmodel.AppointmentMainItemModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelWeek((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelDay((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.itemmodel.AppointmentMainItemModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelWeek(android.databinding.ObservableField<java.lang.String> ItemViewModelWeek, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelDay(android.databinding.ObservableField<java.lang.String> ItemViewModelDay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String itemViewModelModelSuccessNumberMboundView3AndroidStringEmpty = null;
        ys.app.petproject.itemmodel.AppointmentMainItemModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelModelFailNumberMboundView5AndroidStringEmpty = null;
        int itemViewModelModelFailNumber = 0;
        int itemViewModelModelSuccessNumber = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelWeek = null;
        int itemViewModelModelCheckNumber = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelDay = null;
        ys.app.petproject.model.AppointmentMainBean itemViewModelModel = null;
        java.lang.String itemViewModelWeekGet = null;
        java.lang.String itemViewModelModelCheckNumberTextView17AndroidStringEmpty = null;
        java.lang.String itemViewModelDayGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x13L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.week
                        itemViewModelWeek = itemViewModel.week;
                    }
                    updateRegistration(1, itemViewModelWeek);


                    if (itemViewModelWeek != null) {
                        // read itemViewModel.week.get()
                        itemViewModelWeekGet = itemViewModelWeek.get();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.day
                        itemViewModelDay = itemViewModel.day;
                    }
                    updateRegistration(2, itemViewModelDay);


                    if (itemViewModelDay != null) {
                        // read itemViewModel.day.get()
                        itemViewModelDayGet = itemViewModelDay.get();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.failNumber
                        itemViewModelModelFailNumber = itemViewModelModel.getFailNumber();
                        // read itemViewModel.model.successNumber
                        itemViewModelModelSuccessNumber = itemViewModelModel.getSuccessNumber();
                        // read itemViewModel.model.checkNumber
                        itemViewModelModelCheckNumber = itemViewModelModel.getCheckNumber();
                    }


                    // read (itemViewModel.model.failNumber) + (@android:string/empty)
                    itemViewModelModelFailNumberMboundView5AndroidStringEmpty = (itemViewModelModelFailNumber) + (mboundView5.getResources().getString(R.string.empty));
                    // read (itemViewModel.model.successNumber) + (@android:string/empty)
                    itemViewModelModelSuccessNumberMboundView3AndroidStringEmpty = (itemViewModelModelSuccessNumber) + (mboundView3.getResources().getString(R.string.empty));
                    // read (itemViewModel.model.checkNumber) + (@android:string/empty)
                    itemViewModelModelCheckNumberTextView17AndroidStringEmpty = (itemViewModelModelCheckNumber) + (textView17.getResources().getString(R.string.empty));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelSuccessNumberMboundView3AndroidStringEmpty);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelModelFailNumberMboundView5AndroidStringEmpty);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView17, itemViewModelModelCheckNumberTextView17AndroidStringEmpty);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAppointmentDay, itemViewModelDayGet);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAppointmentWeek, itemViewModelWeekGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static AppointmentMainItemModelBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AppointmentMainItemModelBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AppointmentMainItemModelBinding>inflate(inflater, ys.app.petproject.R.layout.item_appointment_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AppointmentMainItemModelBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AppointmentMainItemModelBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_appointment_main, null, false), bindingComponent);
    }
    @NonNull
    public static AppointmentMainItemModelBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AppointmentMainItemModelBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_appointment_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AppointmentMainItemModelBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.week
        flag 2 (0x3L): itemViewModel.day
        flag 3 (0x4L): itemViewModel.model
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}