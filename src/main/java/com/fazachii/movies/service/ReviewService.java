package com.fazachii.movies.service;

import com.fazachii.movies.model.Review;
import com.fazachii.movies.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {

        Review review = new Review();
        review.setBody(reviewBody);
        review.setImdbId(imdbId);

        reviewRepository.save(review);

        return review;

    }

    public List<Review> getAllReview(String imdbId) {

        return reviewRepository.findByImdbId(imdbId);
    }

    public Optional<Review> getReviewById(String id) {

        return reviewRepository.findById(id);
    }
}
