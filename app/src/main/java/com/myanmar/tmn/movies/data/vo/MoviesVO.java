package com.myanmar.tmn.movies.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by msi on 12/20/2017.
 */

public class MoviesVO {

    @SerializedName("vote_count")
    private int voteCount;

    @SerializedName("id")
    private int id;

    private boolean video;

    @SerializedName("vote_average")
    private double voteAverage;

    @SerializedName("title")
    private String title;

    @SerializedName("popularity")
    private double popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;
    private String originalTitle;
    @SerializedName("genre_ids")
    private List<Integer> genreIds;
    private String backdropPath;
    private boolean adult;
    private String overview;
    private String releasedDate;

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleasedDate() {
        return releasedDate;
    }
}
