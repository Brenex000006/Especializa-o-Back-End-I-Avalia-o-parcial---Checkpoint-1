package com.dh.movie.controller;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.service.MovieServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/movie")
@AllArgsConstructor

public class MovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @PostMapping
    public ResponseEntity<?> saveMovie(@RequestBody MovieDTO movieDTO) {
        movieService.saveMovie(movieDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> findAll(@PathVariable(name = "genre") String genre) {
        log.info("Movie-Service - MovieController findAllByGenre: " + genre);
        return ResponseEntity.status(HttpStatus.OK).body(movieService.findAllByGenre(genre));
    }
}
