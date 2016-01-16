package com.fdwills.quicgithub.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.fdwills.quicgithub.R;
import com.fdwills.quicgithub.adapter.RepoAdapter;
import com.fdwills.quicgithub.model.Repo;
import com.fdwills.quicgithub.network.GithubAccessor;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private RepoAdapter mAdapter;
    String user;

    @Bind(R.id.main_text)
    ListView repoViews;
    @Bind(R.id.exit_text)
    EditText exitText;
    @OnClick(R.id.search)
    public void search() {
        mAdapter.clear();

        if (exitText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "No user name", Toast.LENGTH_SHORT).show();
            return;
        }

        user = exitText.getText().toString();
        GithubAccessor.getInstance().repos(user).flatMap(new Func1<ArrayList<Repo>, Observable<Repo>>() {
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
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(Repo repo) {
                        mAdapter.add(repo);
                    }
                });
    }

    @OnItemClick(R.id.main_text)
    public void onListItemClick(int position) {
        Intent intent = new Intent(this, RepoDetailActivity.class);
        intent.putExtra("repo", mAdapter.get(position).name);
        intent.putExtra("username", user);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAdapter = new RepoAdapter(this, R.layout.repo_text, R.id.a_text, new ArrayList<Repo>());
        repoViews.setAdapter(mAdapter);
    }

}
