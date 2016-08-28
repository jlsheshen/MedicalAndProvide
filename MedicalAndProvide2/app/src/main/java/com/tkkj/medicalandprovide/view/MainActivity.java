package com.tkkj.medicalandprovide.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.base.BaseActivity;
import com.tkkj.medicalandprovide.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    RadioButton advisoryBtn,patientBtn,orderBtn,callBtn,myBtn;
    List<Fragment> fragmentList;
    @Override
    public int initLayout() {
        return R.layout.activity_main;
    }
    @Override
    protected void initView() {

        FragmentTransaction traMain = getSupportFragmentManager().beginTransaction();
        traMain.replace(R.id.main_vp, new AdvisoryFragment());
        //提交业务
        traMain.commit();
        advisoryBtn= (RadioButton) bindView(R.id.main_advisory);
        patientBtn = (RadioButton) bindView(R.id.main_patiented);
        orderBtn = (RadioButton) bindView(R.id.main_order);
        callBtn = (RadioButton) bindView(R.id.main_call);
        myBtn = (RadioButton) bindView(R.id.main_my);

        advisoryBtn.setOnClickListener(this);
        patientBtn.setOnClickListener(this);
        orderBtn.setOnClickListener(this);
        callBtn.setOnClickListener(this);
        myBtn.setOnClickListener(this);





    }

    @Override
    protected void initData() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new AdvisoryFragment());
        fragmentList.add(new PatientFragment());
        fragmentList.add(new OrderFragment());
        fragmentList.add(new CallFragment());
        fragmentList.add(new MyFragment());

    }

    @Override
    public MainPresenter initPresenter() {
        return null;
    }


    @Override
    public void onClick(View v) {
        FragmentTransaction traReplace = getSupportFragmentManager().beginTransaction();

        switch (v.getId()){
            case R.id.main_advisory:
                traReplace.replace(R.id.main_vp,new AdvisoryFragment());

                Log.d("MainActivity", "onClick: 触发点击时间");
                break;
            case R.id.main_patiented:
                traReplace.replace(R.id.main_vp,fragmentList.get(1));
                Log.d("MainActivity", "onClick: 触发点击时间");

                break;
            case R.id.main_order:
                traReplace.replace(R.id.main_vp,new OrderFragment());
                break;
            case R.id.main_call:
                traReplace.replace(R.id.main_vp,fragmentList.get(3));
                break;
            case R.id.main_my:
                traReplace.replace(R.id.main_vp,fragmentList.get(4));
                break;

        }
        traReplace.commit();


    }
}
