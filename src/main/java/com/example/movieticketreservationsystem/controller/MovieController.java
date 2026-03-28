package com.example.movieticketreservationsystem.controller;

import com.example.movieticketreservationsystem.dto.MovieRequestDto;
import com.example.movieticketreservationsystem.dto.MovieResponseDto;
import com.example.movieticketreservationsystem.repository.MovieRepository;
import com.example.movieticketreservationsystem.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;
    private final MovieRepository movieRepository;

    @PostMapping
    public void addMovie(@RequestBody MovieRequestDto movieRequestDto){
        movieService.addMovie(movieRequestDto);
    }

    @GetMapping("/getAll")
    public List<MovieResponseDto> getAllMovies(){
        return movieService.getAllMovies();
     }



}
