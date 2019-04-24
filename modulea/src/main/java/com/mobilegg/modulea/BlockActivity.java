package com.mobilegg.modulea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobilegg.common.RouterConstants;

@Route(path = RouterConstants.A_BlockActivity)
public class BlockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block_a);

        //ARouter.getInstance().inject(this);
    }
}

