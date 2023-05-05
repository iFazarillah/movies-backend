package com.fazachii.movies.repository;

import com.fazachii.movies.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {


    List<Review> findByImdbId(String imdbId);


}
