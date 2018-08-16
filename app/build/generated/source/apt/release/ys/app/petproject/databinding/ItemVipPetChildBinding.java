package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVipPetChildBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_item_vip_pet_content, 1);
        sViewsWithIds.put(R.id.tv_item_vip_pet_name, 2);
        sViewsWithIds.put(R.id.tv_item_vip_pet_undoneBrithday, 3);
        sViewsWithIds.put(R.id.tv_item_vip_pet_undoneInsect, 4);
        sViewsWithIds.put(R.id.tv_item_vip_pet_undoneInsectOut, 5);
        sViewsWithIds.put(R.id.tv_item_vip_pet_undoneVaccine, 6);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout llItemVipPetContent;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemVipPetName;
    @NonNull
    public final android.widget.TextView tvItemVipPetUndoneBrithday;
    @NonNull
    public final android.widget.TextView tvItemVipPetUndoneInsect;
    @NonNull
    public final android.widget.TextView tvItemVipPetUndoneInsectOut;
    @NonNull
    public final android.widget.TextView tvItemVipPetUndoneVaccine;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemVipPetChildBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.llItemVipPetContent = (android.widget.LinearLayout) bindings[1];
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemVipPetName = (android.widget.TextView) bindings[2];
        this.tvItemVipPetUndoneBrithday = (android.widget.TextView) bindings[3];
        this.tvItemVipPetUndoneInsect = (android.widget.TextView) bindings[4];
        this.tvItemVipPetUndoneInsectOut = (android.widget.TextView) bindings[5];
        this.tvItemVipPetUndoneVaccine = (android.widget.TextView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
    public static ItemVipPetChildBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipPetChildBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemVipPetChildBinding>inflate(inflater, ys.app.petproject.R.layout.item_vip_pet_child, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemVipPetChildBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipPetChildBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_vip_pet_child, null, false), bindingComponent);
    }
    @NonNull
    public static ItemVipPetChildBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVipPetChildBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_vip_pet_child_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemVipPetChildBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}