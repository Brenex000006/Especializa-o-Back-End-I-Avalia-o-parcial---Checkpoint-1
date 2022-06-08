package com.dh.movie.service;

import com.dh.movie.entity.Movie;

public interface MovieService {
    void save(Movie movie);
    String findBygenre(String genero);
    String findById(String id);
    String findByName(String nameMovie);
    String findByUrlStream(String urlStream);
}
