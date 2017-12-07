package com.myanmar.tmn.movies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.viewHolder.ItemsViewHolder;

/**
 * Created by msi on 12/6/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItems = inflater.inflate(R.layout.items_movies,parent,false);
        ItemsViewHolder itemNewsViewHolder = new ItemsViewHolder(newsItems);
        return itemNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
