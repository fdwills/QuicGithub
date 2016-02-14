package com.fdwills.quicgithub;

import android.app.Application;

import com.fdwills.quicgithub.network.GithubApiModule;
import com.fdwills.quicgithub.core.AppComponent;
import com.fdwills.quicgithub.core.DaggerAppComponent;

/**
 * Created by wills on 16/2/14.
 */
public class QuicGithubApp extends Application {
    
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .githubApiModule(new GithubApiModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
