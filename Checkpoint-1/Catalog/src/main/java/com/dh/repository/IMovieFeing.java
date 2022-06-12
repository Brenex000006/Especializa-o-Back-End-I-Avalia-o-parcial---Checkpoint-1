package com.dh.repository;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Movie-Service")
@LoadBalancerClient(name = "Movie-Service")
public interface IMovieFeing {

    @GetMapping("/movies/{genre}")
    Object feingSearchMovieByGenre(@PathVariable(value = "genre") String genre);

}