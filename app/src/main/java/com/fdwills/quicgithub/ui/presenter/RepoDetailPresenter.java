package com.fdwills.quicgithub.ui.presenter;

import com.fdwills.quicgithub.model.RepoDetail;
import com.fdwills.quicgithub.network.GithubAccessor;
import com.fdwills.quicgithub.ui.activity.BaseActivity;
import com.fdwills.quicgithub.ui.activity.RepoDetailActivity;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wills on 16/2/6.
 */
public class RepoDetailPresenter implements IPresenter{

    public RepoDetailActivity view;

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    public RepoDetailPresenter(BaseActivity view) {
        this.view = (RepoDetailActivity)view;
    }

    public void getRepoDetail(String name, String repo) {
        GithubAccessor.getInstance().repo(name, repo).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Observer<RepoDetail>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showToast(e.getMessage());
                    }

                    @Override
                    public void onNext(RepoDetail repo) {
                        view.setRepo(repo);
                    }
                });
    }

}
