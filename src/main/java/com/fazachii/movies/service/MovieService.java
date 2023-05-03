package com.fazachii.movies.service;

import com.fazachii.movies.model.Movies;
import com.fazachii.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movies> getMovie(String id) {
        return movieRepository.findById(id);
    }
}
