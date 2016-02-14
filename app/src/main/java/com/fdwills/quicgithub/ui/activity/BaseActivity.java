package com.fdwills.quicgithub.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.fdwills.quicgithub.QuicGithubApp;
import com.fdwills.quicgithub.core.AppComponent;

/**
 * Created by wills on 16/2/6.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public void showToast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }

    public AppComponent getComponent() {
        QuicGithubApp applicationContext = (QuicGithubApp) getApplicationContext();
        return applicationContext.getAppComponent();
    }
}
