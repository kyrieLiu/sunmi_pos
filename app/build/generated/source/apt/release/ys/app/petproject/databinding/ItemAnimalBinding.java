package ys.app.petproject.databinding;
import ys.app.petproject.R;
import ys.app.petproject.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAnimalBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.widget.TextView textView7;
    // variables
    @Nullable
    private ys.app.petproject.viewmodel.AnimalItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelDeletePetAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mItemViewModelOnClickEditAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemAnimalBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        this.textView7 = (android.widget.TextView) bindings[5];
        this.textView7.setTag(null);
        setRootTag(root);
        // listeners
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
            setItemViewModel((ys.app.petproject.viewmodel.AnimalItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.petproject.viewmodel.AnimalItemViewModel ItemViewModel) {
        updateRegistration(2, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.petproject.viewmodel.AnimalItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModelSelectIsYimiaoImg((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeItemViewModelSelectIsQuchongImg((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeItemViewModel((ys.app.petproject.viewmodel.AnimalItemViewModel) object, fieldId);
            case 3 :
                return onChangeItemViewModelSelectAnimalImg((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModelSelectIsYimiaoImg(android.databinding.ObservableInt ItemViewModelSelectIsYimiaoImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelSelectIsQuchongImg(android.databinding.ObservableInt ItemViewModelSelectIsQuchongImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.petproject.viewmodel.AnimalItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
    private boolean onChangeItemViewModelSelectAnimalImg(android.databinding.ObservableInt ItemViewModelSelectAnimalImg, int fieldId) {
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
        int itemViewModelModelSex = 0;
        java.lang.String stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesNameMboundView2AndroidStringWuItemViewModelModelVarietiesName = null;
        int itemViewModelSelectIsQuchongImgGet = 0;
        long itemViewModelModelVaccineTime = 0L;
        android.databinding.ObservableInt itemViewModelSelectIsYimiaoImg = null;
        android.databinding.ObservableInt itemViewModelSelectIsQuchongImg = null;
        int itemViewModelModelIsInsect = 0;
        ys.app.petproject.viewmodel.AnimalItemViewModel itemViewModel = mItemViewModel;
        double itemViewModelModelWeight = 0.0;
        java.lang.String itemViewModelModelAgeMboundView4AndroidStringSui = null;
        java.lang.String itemViewModelModelIsInsectInt1DateUtilLongFormatDateItemViewModelModelInsectTimeMboundView11AndroidStringWu = null;
        boolean itemViewModelModelIsVaccineInt1 = false;
        boolean int0ItemViewModelModelSex = false;
        java.lang.String dateUtilLongFormatDateItemViewModelModelVaccineTime = null;
        int int0ItemViewModelModelWeightViewGONEViewVISIBLE = 0;
        boolean itemViewModelModelIsInsectOutInt1 = false;
        int itemViewModelModelIsVaccine = 0;
        java.lang.String itemViewModelModelIsInsectOutInt1DateUtilLongFormatDateItemViewModelModelInsectOutTimeMboundView13AndroidStringWu = null;
        int itemViewModelSelectAnimalImgGet = 0;
        java.lang.String itemViewModelModelIsVaccineInt1DateUtilLongFormatDateItemViewModelModelVaccineTimeMboundView9AndroidStringWu = null;
        long itemViewModelModelInsectOutTime = 0L;
        java.lang.String itemViewModelModelWeightJavaLangStringKg = null;
        ys.app.petproject.model.AnimalInfo itemViewModelModel = null;
        int itemViewModelModelIsInsectOut = 0;
        android.databinding.ObservableInt itemViewModelSelectAnimalImg = null;
        int itemViewModelModelAge = 0;
        int itemViewModelSelectIsYimiaoImgGet = 0;
        boolean itemViewModelModelIsInsectInt1 = false;
        java.lang.String itemViewModelModelVarietiesName = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String int0ItemViewModelModelSexTextView7AndroidStringGongTextView7AndroidStringMu = null;
        boolean stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesName = false;
        long itemViewModelModelInsectTime = 0L;
        android.view.View.OnClickListener itemViewModelDeletePetAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener itemViewModelOnClickEditAndroidViewViewOnClickListener = null;
        java.lang.String dateUtilLongFormatDateItemViewModelModelInsectOutTime = null;
        java.lang.String dateUtilLongFormatDateItemViewModelModelInsectTime = null;
        boolean int0ItemViewModelModelWeight = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x25L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.selectIsYimiaoImg
                        itemViewModelSelectIsYimiaoImg = itemViewModel.selectIsYimiaoImg;
                    }
                    updateRegistration(0, itemViewModelSelectIsYimiaoImg);


                    if (itemViewModelSelectIsYimiaoImg != null) {
                        // read itemViewModel.selectIsYimiaoImg.get()
                        itemViewModelSelectIsYimiaoImgGet = itemViewModelSelectIsYimiaoImg.get();
                    }
            }
            if ((dirtyFlags & 0x26L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.selectIsQuchongImg
                        itemViewModelSelectIsQuchongImg = itemViewModel.selectIsQuchongImg;
                    }
                    updateRegistration(1, itemViewModelSelectIsQuchongImg);


                    if (itemViewModelSelectIsQuchongImg != null) {
                        // read itemViewModel.selectIsQuchongImg.get()
                        itemViewModelSelectIsQuchongImgGet = itemViewModelSelectIsQuchongImg.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.sex
                        itemViewModelModelSex = itemViewModelModel.getSex();
                        // read itemViewModel.model.isInsect
                        itemViewModelModelIsInsect = itemViewModelModel.getIsInsect();
                        // read itemViewModel.model.weight
                        itemViewModelModelWeight = itemViewModelModel.getWeight();
                        // read itemViewModel.model.isVaccine
                        itemViewModelModelIsVaccine = itemViewModelModel.getIsVaccine();
                        // read itemViewModel.model.isInsectOut
                        itemViewModelModelIsInsectOut = itemViewModelModel.getIsInsectOut();
                        // read itemViewModel.model.age
                        itemViewModelModelAge = itemViewModelModel.getAge();
                        // read itemViewModel.model.varietiesName
                        itemViewModelModelVarietiesName = itemViewModelModel.getVarietiesName();
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                    }


                    // read 0 == itemViewModel.model.sex
                    int0ItemViewModelModelSex = (0) == (itemViewModelModelSex);
                    // read itemViewModel.model.isInsect == 1
                    itemViewModelModelIsInsectInt1 = (itemViewModelModelIsInsect) == (1);
                    // read (itemViewModel.model.weight) + ("kg")
                    itemViewModelModelWeightJavaLangStringKg = (itemViewModelModelWeight) + ("kg");
                    // read 0 == itemViewModel.model.weight
                    int0ItemViewModelModelWeight = (0) == (itemViewModelModelWeight);
                    // read itemViewModel.model.isVaccine == 1
                    itemViewModelModelIsVaccineInt1 = (itemViewModelModelIsVaccine) == (1);
                    // read itemViewModel.model.isInsectOut == 1
                    itemViewModelModelIsInsectOutInt1 = (itemViewModelModelIsInsectOut) == (1);
                    // read (itemViewModel.model.age) + (@android:string/sui)
                    itemViewModelModelAgeMboundView4AndroidStringSui = (itemViewModelModelAge) + (mboundView4.getResources().getString(R.string.sui));
                    // read StringUtils.isEmptyOrWhitespace(itemViewModel.model.varietiesName)
                    stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesName = ys.app.petproject.utils.StringUtils.isEmptyOrWhitespace(itemViewModelModelVarietiesName);
                if((dirtyFlags & 0x34L) != 0) {
                    if(int0ItemViewModelModelSex) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x34L) != 0) {
                    if(itemViewModelModelIsInsectInt1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x34L) != 0) {
                    if(int0ItemViewModelModelWeight) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x34L) != 0) {
                    if(itemViewModelModelIsVaccineInt1) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x34L) != 0) {
                    if(itemViewModelModelIsInsectOutInt1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x34L) != 0) {
                    if(stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesName) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read 0 == itemViewModel.model.sex ? @android:string/gong : @android:string/mu
                    int0ItemViewModelModelSexTextView7AndroidStringGongTextView7AndroidStringMu = ((int0ItemViewModelModelSex) ? (textView7.getResources().getString(R.string.gong)) : (textView7.getResources().getString(R.string.mu)));
                    // read 0 == itemViewModel.model.weight ? View.GONE : View.VISIBLE
                    int0ItemViewModelModelWeightViewGONEViewVISIBLE = ((int0ItemViewModelModelWeight) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.selectAnimalImg
                        itemViewModelSelectAnimalImg = itemViewModel.selectAnimalImg;
                    }
                    updateRegistration(3, itemViewModelSelectAnimalImg);


                    if (itemViewModelSelectAnimalImg != null) {
                        // read itemViewModel.selectAnimalImg.get()
                        itemViewModelSelectAnimalImgGet = itemViewModelSelectAnimalImg.get();
                    }
            }
            if ((dirtyFlags & 0x24L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::deletePet
                        itemViewModelDeletePetAndroidViewViewOnClickListener = (((mItemViewModelDeletePetAndroidViewViewOnClickListener == null) ? (mItemViewModelDeletePetAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelDeletePetAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::onClickEdit
                        itemViewModelOnClickEditAndroidViewViewOnClickListener = (((mItemViewModelOnClickEditAndroidViewViewOnClickListener == null) ? (mItemViewModelOnClickEditAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mItemViewModelOnClickEditAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x34L) != 0) {

                // read StringUtils.isEmptyOrWhitespace(itemViewModel.model.varietiesName) ? @android:string/wu : itemViewModel.model.varietiesName
                stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesNameMboundView2AndroidStringWuItemViewModelModelVarietiesName = ((stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesName) ? (mboundView2.getResources().getString(R.string.wu)) : (itemViewModelModelVarietiesName));
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.vaccineTime
                    itemViewModelModelVaccineTime = itemViewModelModel.getVaccineTime();
                }


                // read DateUtil.longFormatDate(itemViewModel.model.vaccineTime)
                dateUtilLongFormatDateItemViewModelModelVaccineTime = ys.app.petproject.utils.DateUtil.longFormatDate(itemViewModelModelVaccineTime);
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.insectOutTime
                    itemViewModelModelInsectOutTime = itemViewModelModel.getInsectOutTime();
                }


                // read DateUtil.longFormatDate(itemViewModel.model.insectOutTime)
                dateUtilLongFormatDateItemViewModelModelInsectOutTime = ys.app.petproject.utils.DateUtil.longFormatDate(itemViewModelModelInsectOutTime);
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.insectTime
                    itemViewModelModelInsectTime = itemViewModelModel.getInsectTime();
                }


                // read DateUtil.longFormatDate(itemViewModel.model.insectTime)
                dateUtilLongFormatDateItemViewModelModelInsectTime = ys.app.petproject.utils.DateUtil.longFormatDate(itemViewModelModelInsectTime);
        }

        if ((dirtyFlags & 0x34L) != 0) {

                // read itemViewModel.model.isInsect == 1 ? DateUtil.longFormatDate(itemViewModel.model.insectTime) : @android:string/wu
                itemViewModelModelIsInsectInt1DateUtilLongFormatDateItemViewModelModelInsectTimeMboundView11AndroidStringWu = ((itemViewModelModelIsInsectInt1) ? (dateUtilLongFormatDateItemViewModelModelInsectTime) : (mboundView11.getResources().getString(R.string.wu)));
                // read itemViewModel.model.isInsectOut == 1 ? DateUtil.longFormatDate(itemViewModel.model.insectOutTime) : @android:string/wu
                itemViewModelModelIsInsectOutInt1DateUtilLongFormatDateItemViewModelModelInsectOutTimeMboundView13AndroidStringWu = ((itemViewModelModelIsInsectOutInt1) ? (dateUtilLongFormatDateItemViewModelModelInsectOutTime) : (mboundView13.getResources().getString(R.string.wu)));
                // read itemViewModel.model.isVaccine == 1 ? DateUtil.longFormatDate(itemViewModel.model.vaccineTime) : @android:string/wu
                itemViewModelModelIsVaccineInt1DateUtilLongFormatDateItemViewModelModelVaccineTimeMboundView9AndroidStringWu = ((itemViewModelModelIsVaccineInt1) ? (dateUtilLongFormatDateItemViewModelModelVaccineTime) : (mboundView9.getResources().getString(R.string.wu)));
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, itemViewModelModelIsInsectInt1DateUtilLongFormatDateItemViewModelModelInsectTimeMboundView11AndroidStringWu);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, itemViewModelModelIsInsectOutInt1DateUtilLongFormatDateItemViewModelModelInsectOutTimeMboundView13AndroidStringWu);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringUtilsIsEmptyOrWhitespaceItemViewModelModelVarietiesNameMboundView2AndroidStringWuItemViewModelModelVarietiesName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelWeightJavaLangStringKg);
            this.mboundView3.setVisibility(int0ItemViewModelModelWeightViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemViewModelModelAgeMboundView4AndroidStringSui);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, itemViewModelModelIsVaccineInt1DateUtilLongFormatDateItemViewModelModelVaccineTimeMboundView9AndroidStringWu);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView7, int0ItemViewModelModelSexTextView7AndroidStringGongTextView7AndroidStringMu);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setDrawableTop(this.mboundView1, itemViewModelSelectAnimalImgGet);
        }
        if ((dirtyFlags & 0x26L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setDrawableRight(this.mboundView10, itemViewModelSelectIsQuchongImgGet);
            ys.app.petproject.PetBindingUtil.setDrawableRight(this.mboundView12, itemViewModelSelectIsQuchongImgGet);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(itemViewModelDeletePetAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(itemViewModelOnClickEditAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            ys.app.petproject.PetBindingUtil.setDrawableRight(this.mboundView8, itemViewModelSelectIsYimiaoImgGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AnimalItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.petproject.viewmodel.AnimalItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.deletePet(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.petproject.viewmodel.AnimalItemViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.petproject.viewmodel.AnimalItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickEdit(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemAnimalBinding>inflate(inflater, ys.app.petproject.R.layout.item_animal, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.petproject.R.layout.item_animal, null, false), bindingComponent);
    }
    @NonNull
    public static ItemAnimalBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAnimalBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_animal_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemAnimalBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel.selectIsYimiaoImg
        flag 1 (0x2L): itemViewModel.selectIsQuchongImg
        flag 2 (0x3L): itemViewModel
        flag 3 (0x4L): itemViewModel.selectAnimalImg
        flag 4 (0x5L): itemViewModel.model
        flag 5 (0x6L): null
        flag 6 (0x7L): StringUtils.isEmptyOrWhitespace(itemViewModel.model.varietiesName) ? @android:string/wu : itemViewModel.model.varietiesName
        flag 7 (0x8L): StringUtils.isEmptyOrWhitespace(itemViewModel.model.varietiesName) ? @android:string/wu : itemViewModel.model.varietiesName
        flag 8 (0x9L): itemViewModel.model.isInsect == 1 ? DateUtil.longFormatDate(itemViewModel.model.insectTime) : @android:string/wu
        flag 9 (0xaL): itemViewModel.model.isInsect == 1 ? DateUtil.longFormatDate(itemViewModel.model.insectTime) : @android:string/wu
        flag 10 (0xbL): 0 == itemViewModel.model.weight ? View.GONE : View.VISIBLE
        flag 11 (0xcL): 0 == itemViewModel.model.weight ? View.GONE : View.VISIBLE
        flag 12 (0xdL): itemViewModel.model.isInsectOut == 1 ? DateUtil.longFormatDate(itemViewModel.model.insectOutTime) : @android:string/wu
        flag 13 (0xeL): itemViewModel.model.isInsectOut == 1 ? DateUtil.longFormatDate(itemViewModel.model.insectOutTime) : @android:string/wu
        flag 14 (0xfL): itemViewModel.model.isVaccine == 1 ? DateUtil.longFormatDate(itemViewModel.model.vaccineTime) : @android:string/wu
        flag 15 (0x10L): itemViewModel.model.isVaccine == 1 ? DateUtil.longFormatDate(itemViewModel.model.vaccineTime) : @android:string/wu
        flag 16 (0x11L): 0 == itemViewModel.model.sex ? @android:string/gong : @android:string/mu
        flag 17 (0x12L): 0 == itemViewModel.model.sex ? @android:string/gong : @android:string/mu
    flag mapping end*/
    //end
}