package com.fdwills.quicgithub.network;

import android.util.Log;

import retrofit.ErrorHandler;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;

/**
 * Created by wills on 16/1/16.
 */
public class GithubAccessor {

    private static GithubApi mInstance;

    public static class PWErrorHandler implements ErrorHandler {

        @Override
        public Throwable handleError(RetrofitError cause) {
            return new Throwable(cause.getCause());
        }
    }

    public static GithubApi getInstance() {
        if (mInstance == null) {
            OkClient client = new OkClient();
            RestAdapter retrofit = new RestAdapter.Builder().setEndpoint("https://api.github.com").
                    setRequestInterceptor(new RequestInterceptor() {
                        @Override
                        public void intercept(RequestFacade request) {
                            request.addHeader("Accept", "application/vnd.github.v3+json");
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
            mInstance = retrofit.create(GithubApi.class);
        }

        return mInstance;
    }
}
