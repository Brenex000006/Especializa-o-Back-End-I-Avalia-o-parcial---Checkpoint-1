package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    void saveMovie(MovieDTO movieDTO);

    List<MovieDTO> findAllByGenre(String genre);
}
