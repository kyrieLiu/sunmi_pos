package ys.app.petproject.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.databinding.ActivitySearchBinding;
import ys.app.petproject.viewmodel.SearchViewModel;

/**
 * Created by admin on 2017/6/8.
 */

public class SearchActivity extends BaseActivity {
    private ActivitySearchBinding binding;
    private SearchViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        setBackVisiable();
        LinearLayout searchLl = (LinearLayout) findViewById(R.id.search_view);
        TextView searchTv = (TextView) findViewById(R.id.search_tv);
        TextView typeTv = (TextView) findViewById(R.id.type_tv);
        EditText inputEt = (EditText) findViewById(R.id.input_et);
        ImageView deleteTextIv = (ImageView) findViewById(R.id.delete_text_iv);
        Intent intent=getIntent();
        int searchTypeExtra = intent.getIntExtra(Constants.intent_search_type, -1);
        int searchFromExtra = intent.getIntExtra(Constants.intent_search_from, -1);
        int vipFlag=intent.getIntExtra(Constants.intent_flag,0);
        mViewModel = new SearchViewModel(this, binding,searchLl,searchTv,typeTv,inputEt,deleteTextIv,searchTypeExtra,searchFromExtra,vipFlag);
        binding.setViewModel(mViewModel);
        setBgWhiteStatusBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewModel.clear();
    }
}
