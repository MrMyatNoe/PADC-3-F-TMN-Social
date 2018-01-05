package com.myanmar.tmn.movies.event;

import com.myanmar.tmn.movies.data.vo.MoviesVO;

import java.util.List;

/**
 * Created by msi on 1/4/2018.
 */

public class LoadedMoviesEvent {

    private List<MoviesVO> moviesList;

    public LoadedMoviesEvent(List<MoviesVO> moviesList) {
        this.moviesList = moviesList;
    }

    public List<MoviesVO> getMoviesList() {
        return moviesList;
    }
}
