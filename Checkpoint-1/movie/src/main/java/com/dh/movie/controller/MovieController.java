package com.dh.movie.controller;

import com.dh.movie.entity.Movie;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Movie Movie){
        service.save(Movie);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genre}")
    public String find(@PathVariable String genre){
        return service.findBygenre(genre);
    }
    public String find(@PathVariable String nameMovie){
        return service.findByName(nameMovie);
    }
    public String find(@PathVariable String id){
        return service.findById(id);
    }
    public String find(@PathVariable String UrlStream){
        return service.findByUrlStream(UrlStream);
    }
}
