package com.tkkj.medicalandprovide.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.base.BaseActivity;
import com.tkkj.medicalandprovide.base.BasePresenter;

/**
 * Created by Administrator on 2016/8/28.
 */
public class ExAty extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);


    }

    @Override
    public int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        FragmentTransaction traMain = getSupportFragmentManager().beginTransaction();
        traMain.replace(R.id.main_flay, new AdvisoryFragment());
        //提交业务
        traMain.commit();

    }

    @Override
    protected void initData() {

    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }
}
