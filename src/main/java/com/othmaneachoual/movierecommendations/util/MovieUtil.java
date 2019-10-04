package com.othmaneachoual.movierecommendations.util;

import com.othmaneachoual.movierecommendations.model.Movie;

public final class MovieUtil {
    public static Movie buildMovieFromInfo(String info) {
        var split = info.split(",");
        var movie = new Movie();
        movie.setTitle(split[0]);
        movie.setImdb(split[1]);
        return movie;
    }
}
