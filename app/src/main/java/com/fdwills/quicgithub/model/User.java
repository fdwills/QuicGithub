package com.fdwills.quicgithub.model;

/**
 * Created by wills on 16/1/16.
 */

public class User {

    public class Plan {

        public String name;
        public Integer space;
        public Integer private_repos;
        public Integer collaborators;

    }

    public String login;
    public Integer id;
    public String avatar_url;
    public String gravatar_id;
    public String url;
    public String html_url;
    public String followers_url;
    public String following_url;
    public String gists_url;
    public String starred_url;
    public String subscriptions_url;
    public String organizations_url;
    public String repos_url;
    public String events_url;
    public String received_events_url;
    public String type;
    public Boolean site_admin;
    public String name;
    public String company;
    public String blog;
    public String location;
    public String email;
    public Boolean hireable;
    public String bio;
    public Integer public_repos;
    public Integer public_gists;
    public Integer followers;
    public Integer following;
    public String created_at;
    public String updated_at;
    public Integer total_private_repos;
    public Integer owned_private_repos;
    public Integer private_gists;
    public Integer disk_usage;
    public Integer collaborators;
    public Plan plan;
}
