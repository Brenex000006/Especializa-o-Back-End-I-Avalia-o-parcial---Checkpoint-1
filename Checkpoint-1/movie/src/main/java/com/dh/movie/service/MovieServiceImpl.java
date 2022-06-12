package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.model.Movie;
import org.modelmapper.ModelMapper;
import com.dh.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movierepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveMovie(MovieDTO movieDTO) {
        Movie movieModel = modelMapper.map(movieDTO, Movie.class);
        MovieRepository.save(movieModel);
    }

    @Override
    public List<MovieDTO> findAllByGenre(String genre) {
        List<Movie> movieModelList = MovieRepository.findAllByGenreContainsIgnoreCase(genre);
        return movieModelList.stream().map(movieModel -> modelMapper.map(movieModel, MovieDTO.class)).collect(Collectors.toList());
    }
}
