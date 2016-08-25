package com.tkkj.medicalandprovide.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by jl on 2016/8/24.
 */
public class BaseApplication extends Application{
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

    public static Context getContext() {
        return context;
    }

}
