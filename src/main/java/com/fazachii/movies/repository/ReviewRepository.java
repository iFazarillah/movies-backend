package com.fazachii.movies.repository;

import com.fazachii.movies.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends JpaRepository<Review, String> {
}
