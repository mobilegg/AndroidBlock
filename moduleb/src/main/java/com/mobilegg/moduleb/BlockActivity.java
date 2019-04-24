package com.mobilegg.moduleb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobilegg.common.RouterConstants;

@Route(path = RouterConstants.B_BlockActivity)
public class BlockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block_b);

        //ARouter.getInstance().inject(this);
    }
}

