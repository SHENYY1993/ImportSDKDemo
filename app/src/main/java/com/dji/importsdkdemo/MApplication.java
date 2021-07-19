package com.dji.importsdkdemo;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;
public class MApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //Note: Since some of SDK classes now need to be loaded before using, the loading process is done by Helper.install(). Developer needs to invoke this method before using any SDK functionality. Failing to do so will result in unexpected crashes.
        Helper.install(MApplication.this);
    }
}
