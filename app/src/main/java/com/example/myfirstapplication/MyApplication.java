package com.example.myfirstapplication;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

public class MyApplication extends LitePalApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        // 直接创建数据库
        LitePal.getDatabase();
    }

}
