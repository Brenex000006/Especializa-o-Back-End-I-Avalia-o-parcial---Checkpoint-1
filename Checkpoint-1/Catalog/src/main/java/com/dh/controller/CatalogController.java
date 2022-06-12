package com.dh.controller;

import com.dh.service.CatalogServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/catalog")
class CatalogController {

    @Autowired
    private CatalogServiceImp catalogService;

    @GetMapping("/{genre}")
    public ResponseEntity<?> searchByGenre(@PathVariable(name = "genre") String genre) {
        log.info("Catalog-Service - CatalogController searchByGenre: " + genre);
        return ResponseEntity.status(HttpStatus.OK.value()).body(catalogService.searchByGenre(genre));
    }

}