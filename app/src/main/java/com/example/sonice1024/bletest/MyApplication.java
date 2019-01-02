package com.example.sonice1024.bletest;


import android.app.Application;

import com.clj.empsun.EmpBleManager;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EmpBleManager.getInstance().initApplication(this);
    }
}
