package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityCheckBinding;
import ys.app.petproject.viewmodel.CheckViewModel;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by aaa on 2017/3/7.
 */

public class CheckActivity extends BaseActivity {

    private ActivityCheckBinding binding;
    private CheckViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_check);
        setBackVisiable();
        setTitle("盘点");
        ImageView iv_scan= (ImageView) findViewById(R.id.blue_inventory_scan_iv);
        iv_scan.setVisibility(View.VISIBLE);
        iv_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            scan();
            }
        });
        mViewModel = new CheckViewModel(this,binding);
        binding.setViewModel(mViewModel);
        mViewModel.init();
        mViewModel.getDataList();
        setBgWhiteStatusBar();

    }

    /**
     * 扫描
     */
    private void scan() {
        Intent intent = new Intent(this,ScannerActivity.class);
        startActivityForResult(intent, Constants.scan_result_code);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.scan_result_code && null != data){
            String info = data.getStringExtra(Constants.scan_result);
            if (!TextUtil.isEmpty(info) && mViewModel != null) {
                mViewModel.setScanResult(info);
            }
        }
    }
}
