package ys.app.petproject.activity.inventory;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.BaseWidgetActivity;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityInventoryBinding;
import ys.app.petproject.viewmodel.inventory.InventoryViewModel;

/**
 * Created by lyy on 2017/2/9 11:28.
 * email：2898049851@qq.com
 */

public class InventoryActivity extends BaseActivity {

    private ActivityInventoryBinding binding;
    private InventoryViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_inventory);
        setBackVisiable();
        setTitle("库存");
//        TextView checkTv = (TextView)findViewById(R.id.check_tv);
//        checkTv.setVisibility(View.GONE);
//        checkTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                turnToActivity(CheckActivity.class);
//            }
//        });
        mViewModel = new InventoryViewModel(this,binding);
        binding.setViewModel(mViewModel);
//        mViewModel.init();
//        mViewModel.getData();
        setBgWhiteStatusBar();

    }
}
