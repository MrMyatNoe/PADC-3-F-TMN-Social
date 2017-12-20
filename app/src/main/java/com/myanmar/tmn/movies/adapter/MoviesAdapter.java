package com.myanmar.tmn.movies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.delegates.MoviesActionDelegates;
import com.myanmar.tmn.movies.viewHolder.ItemsMoviesViewHolder;

/**
 * Created by msi on 12/6/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {

    private MoviesActionDelegates moviesActionDelegates;

    public MoviesAdapter(MoviesActionDelegates moviesActionDelegates) {
        this.moviesActionDelegates = moviesActionDelegates;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItems = inflater.inflate(R.layout.items_movies,parent,false);
        ItemsMoviesViewHolder itemNewsViewHolder = new ItemsMoviesViewHolder(newsItems, moviesActionDelegates);
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
