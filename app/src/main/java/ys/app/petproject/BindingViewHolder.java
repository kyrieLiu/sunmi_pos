package ys.app.petproject;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;



/**
 * Created by lyy on 2017/2/6 16:57.
 * email：2898049851@qq.com
 */

public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    protected final T mBinding;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public T getBinding() {
        return mBinding;
    }
}
