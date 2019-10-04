package com.othmaneachoual.movierecommendations.controller;

import com.othmaneachoual.movierecommendations.model.Movie;
import com.othmaneachoual.movierecommendations.repository.MovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieRepository repository;

    public MovieController(MovieRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> findByTitle() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
}
