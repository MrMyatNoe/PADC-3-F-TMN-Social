package com.myanmar.tmn.movies.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.viewHolder.GenreViewHolder;

/**
 * Created by msi on 12/14/2017.
 */

public class GenreAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_genre,parent,false);
        GenreViewHolder genreViewHolder = new GenreViewHolder(newItems);
        return genreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
