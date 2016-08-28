package com.tkkj.medicalandprovide.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.tkkj.medicalandprovide.R;

/**
 * Created by Administrator on 2016/8/28.
 */
public class ExAty extends FragmentActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction traMain = getSupportFragmentManager().beginTransaction();
        traMain.replace(R.id.main_flay, new AdvisoryFragment());
        //提交业务
        traMain.commit();

    }
}
