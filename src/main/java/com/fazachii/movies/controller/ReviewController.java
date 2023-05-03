package com.fazachii.movies.controller;

import com.fazachii.movies.model.Movies;
import com.fazachii.movies.model.Review;
import com.fazachii.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){

        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }

//    @GetMapping("/{imdbId}")
//    public ResponseEntity<Optional<Movies>> getAllMovieReview(@PathVariable String id){
//        return new ResponseEntity<Optional<Movies>>(movieService.getMovie(id), HttpStatus.OK);
//    }
}
