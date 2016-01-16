package com.fdwills.quicgithub.model;

/**
 * Created by wills on 16/1/16.
 */
public class RepoDetail {
    public class Organization {

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

    }

    public class Owner {

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

    }

    public class Parent {

        public Integer id;
        public Owner owner;
        public String name;
        public String full_name;
        public String description;
        public Boolean _private;
        public Boolean fork;
        public String url;
        public String html_url;
        public String archive_url;
        public String assignees_url;
        public String blobs_url;
        public String branches_url;
        public String clone_url;
        public String collaborators_url;
        public String comments_url;
        public String commits_url;
        public String compare_url;
        public String contents_url;
        public String contributors_url;
        public String downloads_url;
        public String events_url;
        public String forks_url;
        public String git_commits_url;
        public String git_refs_url;
        public String git_tags_url;
        public String git_url;
        public String hooks_url;
        public String issue_comment_url;
        public String issue_events_url;
        public String issues_url;
        public String keys_url;
        public String labels_url;
        public String languages_url;
        public String merges_url;
        public String milestones_url;
        public String mirror_url;
        public String notifications_url;
        public String pulls_url;
        public String releases_url;
        public String ssh_url;
        public String stargazers_url;
        public String statuses_url;
        public String subscribers_url;
        public String subscription_url;
        public String svn_url;
        public String tags_url;
        public String teams_url;
        public String trees_url;
        public String homepage;
        public Object language;
        public Integer forks_count;
        public Integer stargazers_count;
        public Integer watchers_count;
        public Integer size;
        public String default_branch;
        public Integer open_issues_count;
        public Boolean has_issues;
        public Boolean has_wiki;
        public Boolean has_pages;
        public Boolean has_downloads;
        public String pushed_at;
        public String created_at;
        public String updated_at;
        public Permissions permissions;

    }

    public class Permissions {

        public Boolean admin;
        public Boolean push;
        public Boolean pull;

    }

    public class Source {

        public Integer id;
        public Owner owner;
        public String name;
        public String full_name;
        public String description;
        public Boolean _private;
        public Boolean fork;
        public String url;
        public String html_url;
        public String archive_url;
        public String assignees_url;
        public String blobs_url;
        public String branches_url;
        public String clone_url;
        public String collaborators_url;
        public String comments_url;
        public String commits_url;
        public String compare_url;
        public String contents_url;
        public String contributors_url;
        public String downloads_url;
        public String events_url;
        public String forks_url;
        public String git_commits_url;
        public String git_refs_url;
        public String git_tags_url;
        public String git_url;
        public String hooks_url;
        public String issue_comment_url;
        public String issue_events_url;
        public String issues_url;
        public String keys_url;
        public String labels_url;
        public String languages_url;
        public String merges_url;
        public String milestones_url;
        public String mirror_url;
        public String notifications_url;
        public String pulls_url;
        public String releases_url;
        public String ssh_url;
        public String stargazers_url;
        public String statuses_url;
        public String subscribers_url;
        public String subscription_url;
        public String svn_url;
        public String tags_url;
        public String teams_url;
        public String trees_url;
        public String homepage;
        public Object language;
        public Integer forks_count;
        public Integer stargazers_count;
        public Integer watchers_count;
        public Integer size;
        public String default_branch;
        public Integer open_issues_count;
        public Boolean has_issues;
        public Boolean has_wiki;
        public Boolean has_pages;
        public Boolean has_downloads;
        public String pushed_at;
        public String created_at;
        public String updated_at;
        public Permissions permissions;

    }
    public Integer id;
    public Owner owner;
    public String name;
    public String full_name;
    public String description;
    public Boolean _private;
    public Boolean fork;
    public String url;
    public String html_url;
    public String archive_url;
    public String assignees_url;
    public String blobs_url;
    public String branches_url;
    public String clone_url;
    public String collaborators_url;
    public String comments_url;
    public String commits_url;
    public String compare_url;
    public String contents_url;
    public String contributors_url;
    public String downloads_url;
    public String events_url;
    public String forks_url;
    public String git_commits_url;
    public String git_refs_url;
    public String git_tags_url;
    public String git_url;
    public String hooks_url;
    public String issue_comment_url;
    public String issue_events_url;
    public String issues_url;
    public String keys_url;
    public String labels_url;
    public String languages_url;
    public String merges_url;
    public String milestones_url;
    public String mirror_url;
    public String notifications_url;
    public String pulls_url;
    public String releases_url;
    public String ssh_url;
    public String stargazers_url;
    public String statuses_url;
    public String subscribers_url;
    public String subscription_url;
    public String svn_url;
    public String tags_url;
    public String teams_url;
    public String trees_url;
    public String homepage;
    public Object language;
    public Integer forks_count;
    public Integer stargazers_count;
    public Integer watchers_count;
    public Integer size;
    public String default_branch;
    public Integer open_issues_count;
    public Boolean has_issues;
    public Boolean has_wiki;
    public Boolean has_pages;
    public Boolean has_downloads;
    public String pushed_at;
    public String created_at;
    public String updated_at;
    public Permissions permissions;
    public Integer subscribers_count;
    public Organization organization;
    public Parent parent;
    public Source source;

}