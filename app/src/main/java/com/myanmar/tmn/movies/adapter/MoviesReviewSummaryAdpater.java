package com.myanmar.tmn.movies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.viewHolder.MoviesReviewsSummaryViewHolder;

/**
 * Created by msi on 12/20/2017.
 */

public class MoviesReviewSummaryAdpater extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View moviesItems = layoutInflater.inflate(R.layout.movie_review_summary,parent,false);
        MoviesReviewsSummaryViewHolder moviesReviewsSummaryViewHolder = new MoviesReviewsSummaryViewHolder(moviesItems);
        return moviesReviewsSummaryViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
