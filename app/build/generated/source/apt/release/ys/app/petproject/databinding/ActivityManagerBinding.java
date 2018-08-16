package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityManagerBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 9);
        sViewsWithIds.put(R.id.ll, 10);
        sViewsWithIds.put(R.id.textView9, 11);
        sViewsWithIds.put(R.id.textView15, 12);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.support.v7.widget.CardView mboundView1;
    @NonNull
    private final android.support.v7.widget.CardView mboundView2;
    @NonNull
    private final android.support.v7.widget.CardView mboundView3;
    @NonNull
    private final android.support.v7.widget.CardView mboundView4;
    @NonNull
    private final android.support.v7.widget.CardView mboundView5;
    @NonNull
    private final android.support.v7.widget.CardView mboundView6;
    @NonNull
    private final android.support.v7.widget.CardView mboundView7;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.TextView textView15;
    @NonNull
    public final android.widget.TextView textView9;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.manage.ManagerViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickModifyBossPswBtnAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickOkBtnAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickModifyBtnAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mViewModelClickVipCardBtnAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mViewModelClickAboutBtnAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityManagerBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.ll = (android.widget.LinearLayout) bindings[10];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.v7.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.support.v7.widget.CardView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.support.v7.widget.CardView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.support.v7.widget.CardView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.support.v7.widget.CardView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.support.v7.widget.CardView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.support.v7.widget.CardView) bindings[7];
        this.mboundView7.setTag(null);
        this.okBtn = (android.widget.Button) bindings[8];
        this.okBtn.setTag(null);
        this.textView15 = (android.widget.TextView) bindings[12];
        this.textView9 = (android.widget.TextView) bindings[11];
        this.view = (android.view.View) bindings[9];
        setRootTag(root);
        // listeners
        mCallback44 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback45 = new android.databinding.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewModel == variableId) {
            setViewModel((ys.app.petproject.viewmodel.manage.ManagerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.manage.ManagerViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.manage.ManagerViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.petproject.viewmodel.manage.ManagerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.manage.ManagerViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
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
        android.view.View.OnClickListener viewModelClickModifyBossPswBtnAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickOkBtnAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickModifyBtnAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickVipCardBtnAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickAboutBtnAndroidViewViewOnClickListener = null;
        ys.app.petproject.viewmodel.manage.ManagerViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickModifyBossPswBtn
                    viewModelClickModifyBossPswBtnAndroidViewViewOnClickListener = (((mViewModelClickModifyBossPswBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickModifyBossPswBtnAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickModifyBossPswBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickOkBtn
                    viewModelClickOkBtnAndroidViewViewOnClickListener = (((mViewModelClickOkBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickOkBtnAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickOkBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickManagerEmployeeBtn
                    viewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener = (((mViewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickModifyBtn
                    viewModelClickModifyBtnAndroidViewViewOnClickListener = (((mViewModelClickModifyBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickModifyBtnAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickModifyBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickVipCardBtn
                    viewModelClickVipCardBtnAndroidViewViewOnClickListener = (((mViewModelClickVipCardBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickVipCardBtnAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mViewModelClickVipCardBtnAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickAboutBtn
                    viewModelClickAboutBtnAndroidViewViewOnClickListener = (((mViewModelClickAboutBtnAndroidViewViewOnClickListener == null) ? (mViewModelClickAboutBtnAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mViewModelClickAboutBtnAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback44);
            this.mboundView4.setOnClickListener(mCallback45);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(viewModelClickManagerEmployeeBtnAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(viewModelClickVipCardBtnAndroidViewViewOnClickListener);
            this.mboundView5.setOnClickListener(viewModelClickModifyBtnAndroidViewViewOnClickListener);
            this.mboundView6.setOnClickListener(viewModelClickModifyBossPswBtnAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(viewModelClickAboutBtnAndroidViewViewOnClickListener);
            this.okBtn.setOnClickListener(viewModelClickOkBtnAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ManagerViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.manage.ManagerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickModifyBossPswBtn(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ManagerViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.manage.ManagerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOkBtn(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ManagerViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.petproject.viewmodel.manage.ManagerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickManagerEmployeeBtn(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ManagerViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.petproject.viewmodel.manage.ManagerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickModifyBtn(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ManagerViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.petproject.viewmodel.manage.ManagerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickVipCardBtn(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.manage.ManagerViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.petproject.viewmodel.manage.ManagerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickAboutBtn(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.manage.ManagerViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickSystemMange();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.petproject.viewmodel.manage.ManagerViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickAllotMange();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityManagerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityManagerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityManagerBinding>inflate(inflater, ys.app.petproject.R.layout.activity_manager, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityManagerBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityManagerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_manager, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityManagerBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityManagerBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_manager_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityManagerBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}