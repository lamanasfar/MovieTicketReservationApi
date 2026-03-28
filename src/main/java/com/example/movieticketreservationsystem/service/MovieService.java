package com.example.movieticketreservationsystem.service;

import com.example.movieticketreservationsystem.dto.MovieRequestDto;
import com.example.movieticketreservationsystem.dto.MovieResponseDto;
import com.example.movieticketreservationsystem.entity.MovieEntity;
import com.example.movieticketreservationsystem.mapper.MovieMapper;
import com.example.movieticketreservationsystem.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    public final MovieRepository movieRepository;
    public void addMovie(MovieRequestDto movieRequestDto){
        movieRepository.save(MovieMapper.mapToMovieEntity(movieRequestDto));
    }
    public List<MovieResponseDto> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(movie -> MovieMapper.mapToResponse(movie))
                .toList();
    }


}