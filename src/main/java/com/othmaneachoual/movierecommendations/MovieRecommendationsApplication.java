package com.othmaneachoual.movierecommendations;

import com.othmaneachoual.movierecommendations.repository.MovieRepository;
import com.othmaneachoual.movierecommendations.util.MovieUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MovieRecommendationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommendationsApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(MovieRepository repository) {
        return args -> {
            List.of("The Matrix,tt0106062", "Crash,tt0375679", "Black Hawk Down,tt0265086")
                    .stream()
                    .map(MovieUtil::buildMovieFromInfo)
                    .forEach(repository::save);
        };
    }
}
