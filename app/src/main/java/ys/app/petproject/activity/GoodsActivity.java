package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityGoodsBinding;
import ys.app.petproject.viewmodel.GoodsActivityViewModel;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * Created by admin on 2017/6/7.
 */

public class GoodsActivity extends BaseActivity {

    private ActivityGoodsBinding binding;
    private GoodsActivityViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_goods);
        setBackVisiable();
        TextView searchAllTv = (TextView)findViewById(R.id.search_all_tv);
        searchAllTv.setVisibility(View.VISIBLE);
        searchAllTv.setHint("搜索商品");

        searchAllTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoodsActivity.this,SearchActivity.class);
                intent.putExtra(Constants.intent_search_type,Constants.intent_search_type_goods);
                intent.putExtra(Constants.intent_search_from,getIntent().getIntExtra(Constants.intent_search_from,-1));
                startActivity(intent);
            }
        });
        ImageView iv_scan= (ImageView) findViewById(R.id.blue_inventory_scan_iv);
        iv_scan.setVisibility(View.VISIBLE);
        iv_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scan();
            }
        });
        mViewModel = new GoodsActivityViewModel(this, binding);
        binding.setViewModel(mViewModel);
        mViewModel.init();
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

    @Override
    protected void onDestroy() {
        mViewModel.clear();
        super.onDestroy();
    }
}
