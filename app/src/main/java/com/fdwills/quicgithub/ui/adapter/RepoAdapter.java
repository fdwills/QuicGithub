package com.fdwills.quicgithub.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fdwills.quicgithub.model.Repo;

import java.util.ArrayList;

/**
 * Created by wills on 16/1/16.
 */
public class RepoAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    ArrayList<Repo> mRepos;
    int mResource;

    public RepoAdapter(Context context, int resource, int textViewResourceId, ArrayList<Repo> repos) {
        super(context, resource, textViewResourceId, repos);
        this.mRepos = repos;

        inflater = LayoutInflater.from(context);
        mResource = resource;
    }

    public Repo get(int position) {
        return mRepos.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) convertView = inflater.inflate(mResource, parent, false);
        ((TextView)convertView).setText(mRepos.get(position).name);
        return convertView;
    }
}
