package ys.app.petproject.activity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.gyf.barlibrary.BarHide;
import com.gyf.barlibrary.ImmersionBar;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.MainActivity;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.databinding.ActivityStartBinding;

/**
 * Created by lyy on 2017/2/20 10:05.
 * email：2898049851@qq.com
 */

public class StartActivity extends BaseActivity {

    private ActivityStartBinding binding;
    private ValueAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start);
        init();
        ImmersionBar.with(this).hideBar(BarHide.FLAG_HIDE_BAR).init();
    }

    private void init() {
        mAnimator = ValueAnimator.ofInt(0, 100);
        //2.为目标对象的属性变化设置监听器
        mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if (100 == (int) animation.getAnimatedValue()) {
                    next();
                }
            }

        });

        mAnimator.setDuration(300);
        mAnimator.start();
    }

    private void next() {
        if (SpUtil.getIsLogin()) {
            startActivity(new Intent(StartActivity.this, MainActivity.class));
        } else {
            startActivity(new Intent(StartActivity.this, LoginActivity.class));
        }
        StartActivity.this.finish();
    }
}
