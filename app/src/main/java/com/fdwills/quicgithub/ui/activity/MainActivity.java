package com.fdwills.quicgithub.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.fdwills.quicgithub.R;
import com.fdwills.quicgithub.adapter.RepoAdapter;
import com.fdwills.quicgithub.model.Repo;
import com.fdwills.quicgithub.ui.presenter.MainPresenter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class MainActivity extends BaseActivity {

    private RepoAdapter mAdapter;
    private MainPresenter mainPresenter;
    String user;

    @Bind(R.id.main_text)
    ListView repoViews;
    @Bind(R.id.exit_text)
    EditText exitText;
    @OnClick(R.id.search)
    public void search() {
        mainPresenter.search();
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
        mainPresenter = new MainPresenter(this);
        ButterKnife.bind(this);
        mAdapter = new RepoAdapter(this, R.layout.repo_text, R.id.a_text, new ArrayList<Repo>());
        repoViews.setAdapter(mAdapter);
    }

    public String getName() {
        user = exitText.getText().toString();
        return user;
    }

    public void clear() {
        mAdapter.clear();
    }

    public void add(Repo repo) {
        mAdapter.add(repo);
    }
}
