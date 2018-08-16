package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 12);
        sViewsWithIds.put(R.id.title_tv, 13);
        sViewsWithIds.put(R.id.rl0, 14);
        sViewsWithIds.put(R.id.rl2, 15);
        sViewsWithIds.put(R.id.rl3, 16);
        sViewsWithIds.put(R.id.rl4, 17);
        sViewsWithIds.put(R.id.rl7, 18);
        sViewsWithIds.put(R.id.rl6, 19);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.RelativeLayout rl0;
    @NonNull
    public final android.widget.RelativeLayout rl1;
    @NonNull
    public final android.widget.RelativeLayout rl2;
    @NonNull
    public final android.widget.RelativeLayout rl3;
    @NonNull
    public final android.widget.RelativeLayout rl4;
    @NonNull
    public final android.widget.RelativeLayout rl5;
    @NonNull
    public final android.widget.RelativeLayout rl6;
    @NonNull
    public final android.widget.RelativeLayout rl7;
    @NonNull
    public final android.widget.TextView textView8;
    @NonNull
    public final android.widget.TextView titleTv;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private java.lang.String[] mNameArray;
    @Nullable
    private ys.app.petproject.viewmodel.MainViewModel mMainViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.rl0 = (android.widget.RelativeLayout) bindings[14];
        this.rl1 = (android.widget.RelativeLayout) bindings[8];
        this.rl1.setTag(null);
        this.rl2 = (android.widget.RelativeLayout) bindings[15];
        this.rl3 = (android.widget.RelativeLayout) bindings[16];
        this.rl4 = (android.widget.RelativeLayout) bindings[17];
        this.rl5 = (android.widget.RelativeLayout) bindings[6];
        this.rl5.setTag(null);
        this.rl6 = (android.widget.RelativeLayout) bindings[19];
        this.rl7 = (android.widget.RelativeLayout) bindings[18];
        this.textView8 = (android.widget.TextView) bindings[1];
        this.textView8.setTag(null);
        this.titleTv = (android.widget.TextView) bindings[13];
        this.view = (android.view.View) bindings[12];
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
        if (BR.nameArray == variableId) {
            setNameArray((java.lang.String[]) variable);
        }
        else if (BR.mainViewModel == variableId) {
            setMainViewModel((ys.app.petproject.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNameArray(@Nullable java.lang.String[] NameArray) {
        this.mNameArray = NameArray;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.nameArray);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String[] getNameArray() {
        return mNameArray;
    }
    public void setMainViewModel(@Nullable ys.app.petproject.viewmodel.MainViewModel MainViewModel) {
        this.mMainViewModel = MainViewModel;
    }
    @Nullable
    public ys.app.petproject.viewmodel.MainViewModel getMainViewModel() {
        return mMainViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainViewModel((ys.app.petproject.viewmodel.MainViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModel(ys.app.petproject.viewmodel.MainViewModel MainViewModel, int fieldId) {
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
        int spUtilModularInt1ViewGONEViewVISIBLE = 0;
        java.lang.String nameArray5 = null;
        int spUtilModular = 0;
        java.lang.String nameArray0 = null;
        java.lang.String[] nameArray = mNameArray;
        java.lang.String nameArray7 = null;
        java.lang.String nameArray2 = null;
        java.lang.String nameArray1 = null;
        java.lang.String nameArray4 = null;
        java.lang.String nameArray3 = null;
        boolean spUtilModularInt1 = false;
        java.lang.String nameArray6 = null;

        if ((dirtyFlags & 0x4L) != 0) {

                // read SpUtil.modular
                spUtilModular = ys.app.petproject.SpUtil.getModular();


                // read SpUtil.modular == 1
                spUtilModularInt1 = (spUtilModular) == (1);
            if((dirtyFlags & 0x4L) != 0) {
                if(spUtilModularInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read SpUtil.modular == 1 ? View.GONE : View.VISIBLE
                spUtilModularInt1ViewGONEViewVISIBLE = ((spUtilModularInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (nameArray != null) {
                    // read nameArray[5]
                    nameArray5 = getFromArray(nameArray, 5);
                    // read nameArray[0]
                    nameArray0 = getFromArray(nameArray, 0);
                    // read nameArray[7]
                    nameArray7 = getFromArray(nameArray, 7);
                    // read nameArray[2]
                    nameArray2 = getFromArray(nameArray, 2);
                    // read nameArray[1]
                    nameArray1 = getFromArray(nameArray, 1);
                    // read nameArray[4]
                    nameArray4 = getFromArray(nameArray, 4);
                    // read nameArray[3]
                    nameArray3 = getFromArray(nameArray, 3);
                    // read nameArray[6]
                    nameArray6 = getFromArray(nameArray, 6);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, nameArray7);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, nameArray6);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, nameArray2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, nameArray3);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, nameArray4);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, nameArray5);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, nameArray1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, nameArray0);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(spUtilModularInt1ViewGONEViewVISIBLE);
            this.rl1.setVisibility(spUtilModularInt1ViewGONEViewVISIBLE);
            this.rl5.setVisibility(spUtilModularInt1ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, ys.app.petproject.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): mainViewModel
        flag 1 (0x2L): nameArray
        flag 2 (0x3L): null
        flag 3 (0x4L): SpUtil.modular == 1 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): SpUtil.modular == 1 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}