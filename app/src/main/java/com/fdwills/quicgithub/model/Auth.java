package com.fdwills.quicgithub.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wills on 16/1/16.
 */
public class Auth {
    public class App {

        public String url;
        public String name;
        public String client_id;

    }
    public Integer id;
    public String url;
    public List<String> scopes = new ArrayList<String>();
    public String token;
    public String token_last_eight;
    public String hashed_token;
    public App app;
    public String note;
    public String note_url;
    public String updated_at;
    public String created_at;
    public String fingerprint;
}
