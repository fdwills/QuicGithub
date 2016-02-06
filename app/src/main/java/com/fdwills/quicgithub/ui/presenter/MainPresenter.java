package com.fdwills.quicgithub.ui.presenter;

import com.fdwills.quicgithub.model.Repo;
import com.fdwills.quicgithub.network.GithubAccessor;
import com.fdwills.quicgithub.ui.activity.BaseActivity;
import com.fdwills.quicgithub.ui.activity.MainActivity;

import java.util.ArrayList;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by wills on 16/2/6.
 */
public class MainPresenter implements IPresenter{

    public MainActivity view;

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    public MainPresenter(BaseActivity view) {
        this.view = (MainActivity)view;
    }

    public void search() {
        view.clear();

        String name = view.getName();
        if (name.equals("")) {
            view.showToast("No user name");
        }

        GithubAccessor.getInstance().repos(name).flatMap(new Func1<ArrayList<Repo>, Observable<Repo>>() {
            @Override
            public Observable<Repo> call(ArrayList<Repo> repos) {
                return Observable.from(repos);
            }
        }).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Observer<Repo>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showToast(e.getMessage());
                    }

                    @Override
                    public void onNext(Repo repo) {
                        view.add(repo);
                    }
                });
    }

}
