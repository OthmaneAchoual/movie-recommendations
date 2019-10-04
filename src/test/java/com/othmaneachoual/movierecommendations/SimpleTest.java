package com.othmaneachoual.movierecommendations;

import com.othmaneachoual.movierecommendations.util.MovieUtil;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void testMovieBuilder() {
        var info = "Foo,4578";
        var movie = MovieUtil.buildMovieFromInfo(info);
        Assert.assertThat(movie.getImdb(), CoreMatchers.is("4578"));
        Assert.assertThat(movie.getTitle(), CoreMatchers.is("Foo"));
    }
}
