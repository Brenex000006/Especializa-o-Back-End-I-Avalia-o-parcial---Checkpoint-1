package com.dh.service;

import com.dh.repository.IMovieFeing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImp implements CatalogServiceImpl {

    @Autowired
    private IMovieFeing movieFeing;

    @Override
    public Object searchByGenre(String genre) {
        return movieFeing.feingSearchMovieByGenre(genre);
    }
}
