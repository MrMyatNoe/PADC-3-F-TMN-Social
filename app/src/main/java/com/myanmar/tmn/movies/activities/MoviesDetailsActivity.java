package com.myanmar.tmn.movies.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.adapter.GenreAdapter;
import com.myanmar.tmn.movies.adapter.ItemsDetailsAdapter;
import com.myanmar.tmn.movies.adapter.ItemsInMoviesDetailsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by msi on 12/12/2017.
 */

public class MoviesDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movie_genre)
    RecyclerView genre;

    @BindView(R.id.vp_movies_trailer_images)
    ViewPager vpMoviesTrailerImages;

    /*@BindView(R.id.rv_movie_image)
    RecyclerView rvMovieImage;*/

    private GenreAdapter genreAdapter;

    private ItemsInMoviesDetailsAdapter itemsInMoviesDetailsAdapter;

    private ItemsDetailsAdapter itemsDetailsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_movies_details);
        ButterKnife.bind(this,this);

        genreAdapter = new GenreAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,false);
        genre.setLayoutManager(linearLayoutManager);
        genre.setAdapter(genreAdapter);

        itemsInMoviesDetailsAdapter = new ItemsInMoviesDetailsAdapter();
        vpMoviesTrailerImages.setAdapter(itemsInMoviesDetailsAdapter);

       /* itemsDetailsAdapter = new ItemsDetailsAdapter();
        rvMovieImage.setLayoutManager(linearLayoutManager);
        rvMovieImage.setAdapter(itemsDetailsAdapter);*/
    }
}