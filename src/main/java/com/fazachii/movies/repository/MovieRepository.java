package com.fazachii.movies.repository;

import com.fazachii.movies.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, String> {
}
