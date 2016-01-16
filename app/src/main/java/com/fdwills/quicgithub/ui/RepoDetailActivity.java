package com.fdwills.quicgithub.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fdwills.quicgithub.R;
import com.fdwills.quicgithub.model.RepoDetail;
import com.fdwills.quicgithub.network.GithubAccessor;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class RepoDetailActivity extends AppCompatActivity {

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

        Intent intent = getIntent();
        String user = intent.getStringExtra("username");
        String repo = intent.getStringExtra("repo");
        GithubAccessor.getInstance().repo(user, repo).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Observer<RepoDetail>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RepoDetailActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(RepoDetail repo) {
                        Picasso.with(RepoDetailActivity.this).load(repo.owner.avatar_url).into(avatar);
                        name.setText(getResources().getString(R.string.repo_name, repo.name));
                        fullName.setText(getResources().getString(R.string.repo_full_name, repo.full_name));
                        description.setText(getResources().getString(R.string.repo_description, repo.description));
                        url.setText(getResources().getString(R.string.repo_description, repo.url));
                    }
                });
    }
}
