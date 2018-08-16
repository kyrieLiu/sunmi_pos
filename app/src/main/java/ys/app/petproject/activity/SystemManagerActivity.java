package ys.app.petproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;

public class SystemManagerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_manager);
        setBackVisiable();
        setTitle("系统设置");
        setBgWhiteStatusBar();
    }

    /**
     * 小票管理
     */
    public void clickTicketMange(View view){
        Intent intent = new Intent(this, TicketMangeActivity.class);
        startActivity(intent);
    }
}
