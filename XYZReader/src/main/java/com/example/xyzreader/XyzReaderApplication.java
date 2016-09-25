package com.example.xyzreader;

import android.app.Application;

import timber.log.Timber;

public class XyzReaderApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}

