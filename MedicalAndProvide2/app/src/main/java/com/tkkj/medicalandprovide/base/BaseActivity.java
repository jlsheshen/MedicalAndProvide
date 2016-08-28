package com.tkkj.medicalandprovide.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by jl on 2016/8/24.
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>>  extends FragmentActivity{
   public T presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
        setContentView(initLayout());
        initView();
        initData();
    }
    @Override
    protected void onResume() {
        super.onResume();
//        presenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
      //  presenter.dettach();
        super.onDestroy();
    }
    //组件实例化 不需要转型
    protected <T extends View> T bindView(int id){
        return (T)findViewById(id);
    }

    public abstract int initLayout();
    protected abstract void initView();
    protected abstract void initData();
    public abstract T initPresenter();




}
