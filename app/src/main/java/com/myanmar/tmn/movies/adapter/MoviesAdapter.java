package com.myanmar.tmn.movies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.data.vo.MoviesVO;
import com.myanmar.tmn.movies.delegates.MoviesActionDelegates;
import com.myanmar.tmn.movies.viewHolder.ItemsMoviesViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msi on 12/6/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<ItemsMoviesViewHolder> {

    private MoviesActionDelegates moviesActionDelegates;

    //To show data dynamically
    private List<MoviesVO> moviesList;

    public MoviesAdapter(MoviesActionDelegates moviesActionDelegates) {
        this.moviesActionDelegates = moviesActionDelegates;
        moviesList = new ArrayList<>();
    }

    @Override
    public ItemsMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItems = inflater.inflate(R.layout.items_movies,parent,false);
        ItemsMoviesViewHolder itemNewsViewHolder = new ItemsMoviesViewHolder(newsItems, moviesActionDelegates);
        return itemNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemsMoviesViewHolder holder, int position) {
        holder.setMovies(moviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void setMoviesList(List<MoviesVO> moviesList) {
        this.moviesList = moviesList;
        //if data is added to adapter view, set this method
        notifyDataSetChanged();
    }
}
