package com.fdwills.quicgithub.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by wills on 16/2/6.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public void showToast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }
}
