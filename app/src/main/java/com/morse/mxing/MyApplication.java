package com.morse.mxing;

import android.app.Application;

/**
 * Created by Administrator on 2017/1/9.
 */

public class MyApplication extends Application {

    private static MyApplication instense;

    public static MyApplication getAppContext() {
        return instense;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instense = this;
    }
}
