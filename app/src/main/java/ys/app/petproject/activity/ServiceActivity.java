package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivityServiceBinding;
import ys.app.petproject.viewmodel.ServiceActivityViewModel;

/**
 * Created by admin on 2017/6/7.
 */

public class ServiceActivity extends BaseActivity {
    private ActivityServiceBinding binding;
    private ServiceActivityViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_service);
        setBackVisiable();
        TextView searchAllTv = (TextView) findViewById(R.id.search_all_tv);
        searchAllTv.setVisibility(View.VISIBLE);
        searchAllTv.setHint("搜索服务");
        final int searchFormIntent = getIntent().getIntExtra(Constants.intent_search_from, -1);
        searchAllTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceActivity.this, SearchActivity.class);
                intent.putExtra(Constants.intent_search_type, Constants.intent_search_type_service);
                intent.putExtra(Constants.intent_search_from, searchFormIntent);
                startActivity(intent);
            }
        });
        mViewModel = new ServiceActivityViewModel(this, binding, searchFormIntent);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        mViewModel.clear();
        super.onDestroy();
    }
}
