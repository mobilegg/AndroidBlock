package com.mobilegg.androidblock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mobilegg.common.RouterConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.gotoTest1).setOnClickListener(this);
        findViewById(R.id.gotoModuleA).setOnClickListener(this);
        findViewById(R.id.gotoModuleB).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
            case R.id.gotoTest1:
                ARouter.getInstance()
                        .build(RouterConstants.Test1Activity)
                        .navigation();
                break;
            case R.id.gotoModuleA:
                ARouter.getInstance()
                        .build(RouterConstants.A_BlockActivity)
                        .navigation();
                break;
            case R.id.gotoModuleB:
                ARouter.getInstance()
                        .build(RouterConstants.B_BlockActivity)
                        .navigation();
                break;
        }
    }
}
