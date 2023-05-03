package com.fazachii.movies.service;

import com.fazachii.movies.model.Movies;
import com.fazachii.movies.model.Review;
import com.fazachii.movies.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId){

        Review review = new Review();
        review.setBody(reviewBody);
        review.setImdbId(imdbId);

        reviewRepository.save(review);

        return review;

    }
}
