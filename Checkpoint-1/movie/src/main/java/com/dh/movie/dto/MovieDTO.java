package com.dh.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MovieDTO implements Serializable{

    private static final long serialVersionUUID = 1L;

    private Long id;
    private String nomeMovie;
    private String genre;
    private String urlStream;
}