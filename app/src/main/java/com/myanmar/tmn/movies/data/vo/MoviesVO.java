package com.myanmar.tmn.movies.data.vo;

/**
 * Created by msi on 12/20/2017.
 */

public class MoviesVO {

    private int voteCount;
    private int id;
    private boolean video;
    private double vote_average;
    private String title;
    private int popularity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private Integer[] genreIds;
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

    public double getVote_average() {
        return vote_average;
    }

    public String getTitle() {
        return title;
    }

    public int getPopularity() {
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

    public Integer[] getGenreIds() {
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
