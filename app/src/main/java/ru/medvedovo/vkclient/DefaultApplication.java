package ru.medvedovo.vkclient;

import android.app.Application;

import com.vk.sdk.VKSdk;

public class DefaultApplication extends Application {
    @Override
    public void onCreate () {
        super.onCreate();
        VKSdk.initialize(getApplicationContext());
    }
}
