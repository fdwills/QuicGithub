package com.fdwills.quicgithub.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.fdwills.quicgithub.R;
import com.fdwills.quicgithub.model.RepoDetail;
import com.fdwills.quicgithub.ui.presenter.RepoDetailPresenter;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RepoDetailActivity extends BaseActivity {

    private RepoDetailPresenter repoDetailPresenter;

    @Bind(R.id.avatar)
    ImageView avatar;
    @Bind(R.id.name)
    TextView name;
    @Bind(R.id.full_name)
    TextView fullName;
    @Bind(R.id.description)
    TextView description;
    @Bind(R.id.url)
    TextView url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull);
        ButterKnife.bind(this);
        repoDetailPresenter = new RepoDetailPresenter(this);

        Intent intent = getIntent();
        String user = intent.getStringExtra("username");
        String repo = intent.getStringExtra("repo");
        repoDetailPresenter.getRepoDetail(user, repo);
    }

    public void setRepo(RepoDetail repo) {
        Picasso.with(RepoDetailActivity.this).load(repo.owner.avatar_url).into(avatar);
        name.setText(getResources().getString(R.string.repo_name, repo.name));
        fullName.setText(getResources().getString(R.string.repo_full_name, repo.full_name));
        description.setText(getResources().getString(R.string.repo_description, repo.description));
        url.setText(getResources().getString(R.string.repo_description, repo.url));
    }
}
