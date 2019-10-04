package com.othmaneachoual.movierecommendations.repository;

import com.othmaneachoual.movierecommendations.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
