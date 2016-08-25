package com.tkkj.medicalandprovide.base;

/**
 * Created by jl on 2016/8/25.
 */
public class BasePresenter<T> {
    public T view;
    public void attach(T view){
        this.view = view;
    }
    public void dettach(){
        view = null;
    }
}
