package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SunmiScanBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_tool_bar, 1);
        sViewsWithIds.put(R.id.et_auth_code, 2);
        sViewsWithIds.put(R.id.view, 3);
        sViewsWithIds.put(R.id.text_lay, 4);
        sViewsWithIds.put(R.id.tv_personal_pay, 5);
        sViewsWithIds.put(R.id.surface_view, 6);
        sViewsWithIds.put(R.id.finder_view, 7);
    }
    // views
    @NonNull
    public final android.widget.EditText etAuthCode;
    @NonNull
    public final ys.app.petproject.shangmi.scan.FinderView finderView;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.view.SurfaceView surfaceView;
    @NonNull
    public final android.widget.LinearLayout textLay;
    @NonNull
    public final android.widget.TextView tvPersonalPay;
    @NonNull
    public final android.view.View view;
    @Nullable
    public final android.view.View viewToolBar;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.SandPayCodeModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SunmiScanBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.etAuthCode = (android.widget.EditText) bindings[2];
        this.finderView = (ys.app.petproject.shangmi.scan.FinderView) bindings[7];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.surfaceView = (android.view.SurfaceView) bindings[6];
        this.textLay = (android.widget.LinearLayout) bindings[4];
        this.tvPersonalPay = (android.widget.TextView) bindings[5];
        this.view = (android.view.View) bindings[3];
        this.viewToolBar = (android.view.View) bindings[1];
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
        if (BR.viewModel == variableId) {
            setViewModel((ys.app.petproject.viewmodel.SandPayCodeModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.petproject.viewmodel.SandPayCodeModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public ys.app.petproject.viewmodel.SandPayCodeModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.petproject.viewmodel.SandPayCodeModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.petproject.viewmodel.SandPayCodeModel ViewModel, int fieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static SunmiScanBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SunmiScanBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<SunmiScanBinding>inflate(inflater, ys.app.petproject.R.layout.ac_sunmi_scan_finder, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static SunmiScanBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SunmiScanBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.ac_sunmi_scan_finder, null, false), bindingComponent);
    }
    @NonNull
    public static SunmiScanBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SunmiScanBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ac_sunmi_scan_finder_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new SunmiScanBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}