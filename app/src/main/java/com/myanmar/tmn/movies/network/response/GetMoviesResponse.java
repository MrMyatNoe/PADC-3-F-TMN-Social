package com.myanmar.tmn.movies.network.response;

import com.google.gson.annotations.SerializedName;
import com.myanmar.tmn.movies.data.vo.MoviesVO;

import java.util.List;

/**
 * Created by msi on 1/4/2018.
 */

public class GetMoviesResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;

    @SerializedName("popular-movies")
    private List<MoviesVO> moviesList;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<MoviesVO> getMoviesList() {
        return moviesList;
    }
}
