package com.myanmar.tmn.movies.data.model;

import com.myanmar.tmn.movies.network.HttpUrlConnectionDataAgent;
import com.myanmar.tmn.movies.network.MoviesDataAgent;

/**
 * Created by msi on 1/4/2018.
 */

public class MoviesModel {

    private static MoviesModel sObjectInstance;
    private MoviesDataAgent mMoviesDataAgent;

    private MoviesModel() {
        mMoviesDataAgent = HttpUrlConnectionDataAgent.getsObjectInstance();
    }

    public static MoviesModel getsObjectInstance() {
        if (sObjectInstance == null) {
            sObjectInstance = new MoviesModel();
        }
        return sObjectInstance;
    }

    /**
     * call from internet
     */
    public void loadMovies(){
        mMoviesDataAgent.loadMovies();
    }
}
