package com.fdwills.quicgithub.network;

import com.fdwills.quicgithub.model.Repo;
import com.fdwills.quicgithub.model.RepoDetail;

import java.util.ArrayList;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by wills on 16/1/16.
 */
public interface GithubApi {
    @GET("/users/{username}/repos")
    Observable<ArrayList<Repo>> repos(@Path("username") String username);

    @GET("/repos/{owner}/{repo}")
    Observable<RepoDetail> repo(@Path("owner") String owner, @Path("repo") String repo);
}
