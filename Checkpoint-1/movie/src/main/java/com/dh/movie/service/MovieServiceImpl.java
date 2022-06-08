package com.dh.movie.service;

import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(Movie Movie) {
        repository.save(Movie);
    }

    @Override
    public String findBygenre(String genre) {
        return repository.findBygenre(genre).getNomeMovie();
    }
    public String findById(String id) {
        return repository.findById(id).getNomeMovie();
    }
    public String findByName(String nameMovie) {
        return repository.findByName(nameMovie).getNomeMovie();
    }
    public String findByUrlStream(String urlStream) {
        return repository.findByUrlStream(urlStream).getNomeMovie();
    }
}
