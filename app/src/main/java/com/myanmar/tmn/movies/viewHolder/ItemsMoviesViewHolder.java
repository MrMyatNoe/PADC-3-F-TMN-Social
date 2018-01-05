package com.myanmar.tmn.movies.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.data.vo.MoviesVO;
import com.myanmar.tmn.movies.delegates.MoviesActionDelegates;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by msi on 12/6/2017.
 */

public class ItemsMoviesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_rating)
    TextView tvRating;

    @BindView(R.id.img_it)
    ImageView imagePoster;

    @BindView(R.id.tv_movie_title)
    TextView movieTitle;

    @BindView(R.id.tv_movie_genre)
    TextView genre;

    @BindView(R.id.ratingBar)
    RatingBar movieRating;

    private MoviesActionDelegates moviesActionDelegates;

    public ItemsMoviesViewHolder(View itemView, MoviesActionDelegates moviesActionDelegates) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.moviesActionDelegates = moviesActionDelegates;
    }

    @OnClick(R.id.cv_movies_items_root)
    public void onClickMovie(View view) {
        // Toast.makeText(view.getContext(),"Hello",Toast.LENGTH_SHORT).show();
        moviesActionDelegates.onTapMoviesItem();
    }

    public void setMovies(MoviesVO movies) {
        movieTitle.setText(movies.getTitle());
        genre.setText(movies.getOriginalLanguage());

        tvRating.setText(String.valueOf(movies.getVoteAverage()));
        movieRating.setRating(Float.parseFloat(String.valueOf(movies.getVoteAverage())));

        Glide.with(imagePoster.getContext()).load(movies.getPosterPath()).into(imagePoster);

        if (movies.getPosterPath() != null) {
            imagePoster.setVisibility(View.VISIBLE);
            Glide.with(imagePoster.getContext())
                    .load(movies.getPosterPath())
                    .into(imagePoster);
        }else {
            imagePoster.setVisibility(View.GONE);
        }
    }
}