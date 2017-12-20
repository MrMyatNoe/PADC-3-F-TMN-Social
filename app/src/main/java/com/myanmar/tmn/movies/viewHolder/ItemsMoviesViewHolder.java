package com.myanmar.tmn.movies.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.delegates.MoviesActionDelegates;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by msi on 12/6/2017.
 */

public class ItemsMoviesViewHolder extends RecyclerView.ViewHolder {

    private MoviesActionDelegates moviesActionDelegates;

    public ItemsMoviesViewHolder(View itemView, MoviesActionDelegates moviesActionDelegates) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        this.moviesActionDelegates = moviesActionDelegates;
    }

    @OnClick(R.id.cv_movies_items_root)
    public void onClickMovie(View view){
       // Toast.makeText(view.getContext(),"Hello",Toast.LENGTH_SHORT).show();
        moviesActionDelegates.onTapMoviesItem();
    }
}
