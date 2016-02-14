package com.fdwills.quicgithub.network;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by wills on 16/1/16.
 */
@Module
public class GithubApiModule {

    private static String END_POINT = "https://api.github.com";
    private static String HEADER_ACCEPT = "application/vnd.github.v3+json";

    @Provides
    @Singleton
    GithubApi provideApiService() {
        OkClient client = new OkClient();
        RestAdapter retrofit = new RestAdapter.Builder().setEndpoint(END_POINT).
                setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addHeader("Accept", HEADER_ACCEPT);
                    }
                }).
                setLog(new RestAdapter.Log() {
                    @Override
                    public void log(String message) {
                        Log.d("http", message);
                    }
                }).
                setLogLevel(RestAdapter.LogLevel.FULL).
                build();
        return retrofit.create(GithubApi.class);
    }
}
