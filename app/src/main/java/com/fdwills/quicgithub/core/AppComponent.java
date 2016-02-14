package com.fdwills.quicgithub.core;

import com.fdwills.quicgithub.network.GithubApi;
import com.fdwills.quicgithub.network.GithubApiModule;
import com.fdwills.quicgithub.ui.presenter.BasePresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wills on 16/2/14.
 */

@Singleton
@Component(modules = {GithubApiModule.class})
public interface AppComponent {
    BasePresenter inject(BasePresenter basePresenter);
    GithubApi getApiService();
}
