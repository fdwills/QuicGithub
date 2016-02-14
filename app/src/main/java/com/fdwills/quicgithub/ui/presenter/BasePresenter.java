package com.fdwills.quicgithub.ui.presenter;

import com.fdwills.quicgithub.network.GithubApi;
import com.fdwills.quicgithub.ui.activity.BaseActivity;

import javax.inject.Inject;

/**
 * Created by wills on 16/2/6.
 */
public class BasePresenter {

    @Inject
    GithubApi GitHubAPI;

    public BasePresenter(BaseActivity baseActivity) {
        baseActivity.getComponent().inject(this);
    }

    void start() {

    }

    void finish() {

    }
}