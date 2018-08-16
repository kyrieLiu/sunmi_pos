package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEmployeeDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 7);
        sViewsWithIds.put(R.id.textView10, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    public final android.widget.TextView textView10;
    @NonNull
    public final android.widget.TextView textView11;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEmployeeDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.textView10 = (android.widget.TextView) bindings[8];
        this.textView11 = (android.widget.TextView) bindings[2];
        this.textView11.setTag(null);
        this.view = (android.view.View) bindings[7];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel ViewModel) {
        updateRegistration(1, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelModel((ys.app.petproject.model.EmployeeInfo) object, fieldId);
            case 1 :
                return onChangeViewModel((ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelModel(ys.app.petproject.model.EmployeeInfo ViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelModelPost = null;
        java.lang.String viewModelModelSexInt1MboundView3AndroidStringNvMboundView3AndroidStringNan = null;
        int viewModelModelSex = 0;
        java.lang.String viewModelModelJobNumber = null;
        boolean viewModelModelSexInt1 = false;
        java.lang.String viewModelModelName = null;
        ys.app.petproject.model.EmployeeInfo viewModelModel = null;
        java.lang.String viewModelModelPhone = null;
        ys.app.petproject.viewmodel.manage.EmployeeDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.model
                    viewModelModel = viewModel.getModel();
                }
                updateRegistration(0, viewModelModel);


                if (viewModelModel != null) {
                    // read viewModel.model.post
                    viewModelModelPost = viewModelModel.getPost();
                    // read viewModel.model.sex
                    viewModelModelSex = viewModelModel.getSex();
                    // read viewModel.model.jobNumber
                    viewModelModelJobNumber = viewModelModel.getJobNumber();
                    // read viewModel.model.name
                    viewModelModelName = viewModelModel.getName();
                    // read viewModel.model.phone
                    viewModelModelPhone = viewModelModel.getPhone();
                }


                // read viewModel.model.sex == 1
                viewModelModelSexInt1 = (viewModelModelSex) == (1);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelModelSexInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.model.sex == 1 ? @android:string/nv : @android:string/nan
                viewModelModelSexInt1MboundView3AndroidStringNvMboundView3AndroidStringNan = ((viewModelModelSexInt1) ? (mboundView3.getResources().getString(R.string.nv)) : (mboundView3.getResources().getString(R.string.nan)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelModelSexInt1MboundView3AndroidStringNvMboundView3AndroidStringNan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelModelPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelModelJobNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelModelPost);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, viewModelModelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityEmployeeDetailBinding>inflate(inflater, ys.app.petproject.R.layout.activity_employee_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_employee_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityEmployeeDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeeDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_employee_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityEmployeeDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.model
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.model.sex == 1 ? @android:string/nv : @android:string/nan
        flag 4 (0x5L): viewModel.model.sex == 1 ? @android:string/nv : @android:string/nan
    flag mapping end*/
    //end
}