package com.dh.playlist;

import com.dh.playlist.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playlist")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/{genero}")
    public String findMovie(@PathVariable String genre){
        return service.getMovie(genre);
    }
}
