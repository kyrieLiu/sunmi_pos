package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEmployeeListBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEmployeeListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelModel((ys.app.petproject.model.EmployeeInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.petproject.model.EmployeeInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
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
        int itemViewModelModelSex = 0;
        ys.app.petproject.viewmodel.manage.EmployeeListItemViewModel itemViewModel = mItemViewModel;
        java.lang.String appUtilGetTimesItemViewModelModelCreateTime = null;
        java.lang.String itemViewModelModelPhone = null;
        boolean itemViewModelModelSexInt1 = false;
        java.lang.String mboundView6AndroidStringCjsjAppUtilGetTimesItemViewModelModelCreateTime = null;
        java.lang.String mboundView5AndroidStringNoItemViewModelModelJobNumber = null;
        java.lang.String mboundView2AndroidStringZkhItemViewModelModelPost = null;
        ys.app.petproject.model.EmployeeInfo itemViewModelModel = null;
        java.lang.String itemViewModelModelJobNumber = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String itemViewModelModelSexInt1MboundView3AndroidStringNvMboundView3AndroidStringNan = null;
        java.lang.String mboundView2AndroidStringZkhItemViewModelModelPostMboundView2AndroidStringYkh = null;
        long itemViewModelModelCreateTime = 0L;
        java.lang.String itemViewModelModelPost = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(1, itemViewModelModel);


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.sex
                    itemViewModelModelSex = itemViewModelModel.getSex();
                    // read itemViewModel.model.phone
                    itemViewModelModelPhone = itemViewModelModel.getPhone();
                    // read itemViewModel.model.jobNumber
                    itemViewModelModelJobNumber = itemViewModelModel.getJobNumber();
                    // read itemViewModel.model.name
                    itemViewModelModelName = itemViewModelModel.getName();
                    // read itemViewModel.model.createTime
                    itemViewModelModelCreateTime = itemViewModelModel.getCreateTime();
                    // read itemViewModel.model.post
                    itemViewModelModelPost = itemViewModelModel.getPost();
                }


                // read itemViewModel.model.sex == 1
                itemViewModelModelSexInt1 = (itemViewModelModelSex) == (1);
                // read (@android:string/no) + (itemViewModel.model.jobNumber)
                mboundView5AndroidStringNoItemViewModelModelJobNumber = (mboundView5.getResources().getString(R.string.no)) + (itemViewModelModelJobNumber);
                // read AppUtil.getTimes(itemViewModel.model.createTime)
                appUtilGetTimesItemViewModelModelCreateTime = ys.app.petproject.utils.AppUtil.getTimes(itemViewModelModelCreateTime);
                // read (@android:string/zkh) + (itemViewModel.model.post)
                mboundView2AndroidStringZkhItemViewModelModelPost = (mboundView2.getResources().getString(R.string.zkh)) + (itemViewModelModelPost);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelModelSexInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemViewModel.model.sex == 1 ? @android:string/nv : @android:string/nan
                itemViewModelModelSexInt1MboundView3AndroidStringNvMboundView3AndroidStringNan = ((itemViewModelModelSexInt1) ? (mboundView3.getResources().getString(R.string.nv)) : (mboundView3.getResources().getString(R.string.nan)));
                // read (@android:string/cjsj) + (AppUtil.getTimes(itemViewModel.model.createTime))
                mboundView6AndroidStringCjsjAppUtilGetTimesItemViewModelModelCreateTime = (mboundView6.getResources().getString(R.string.cjsj)) + (appUtilGetTimesItemViewModelModelCreateTime);
                // read ((@android:string/zkh) + (itemViewModel.model.post)) + (@android:string/ykh)
                mboundView2AndroidStringZkhItemViewModelModelPostMboundView2AndroidStringYkh = (mboundView2AndroidStringZkhItemViewModelModelPost) + (mboundView2.getResources().getString(R.string.ykh));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mboundView2AndroidStringZkhItemViewModelModelPostMboundView2AndroidStringYkh);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelSexInt1MboundView3AndroidStringNvMboundView3AndroidStringNan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemViewModelModelPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringNoItemViewModelModelJobNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mboundView6AndroidStringCjsjAppUtilGetTimesItemViewModelModelCreateTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemEmployeeListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeeListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEmployeeListBinding>inflate(inflater, ys.app.petproject.R.layout.item_employee_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemEmployeeListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeeListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_employee_list, null, false), bindingComponent);
    }
    @NonNull
    public static ItemEmployeeListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEmployeeListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_employee_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEmployeeListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.model.sex == 1 ? @android:string/nv : @android:string/nan
        flag 4 (0x5L): itemViewModel.model.sex == 1 ? @android:string/nv : @android:string/nan
    flag mapping end*/
    //end
}