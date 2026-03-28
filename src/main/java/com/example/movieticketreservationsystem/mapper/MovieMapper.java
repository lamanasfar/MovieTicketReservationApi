package com.example.movieticketreservationsystem.mapper;


import com.example.movieticketreservationsystem.dto.MovieRequestDto;
import com.example.movieticketreservationsystem.dto.MovieResponseDto;
import com.example.movieticketreservationsystem.entity.MovieEntity;

import java.time.LocalDateTime;

public class MovieMapper {
    public static MovieEntity mapToMovieEntity(MovieRequestDto movieRequestDto){
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setGenre(movieRequestDto.getGenre());
        movieEntity.setTitle(movieRequestDto.getTitle());
        movieEntity.setTotalSeats(movieRequestDto.getTotalSeats());
        movieEntity.setAvailableSeats(movieRequestDto.getAvailableSeats());
        movieEntity.setCreationDate(LocalDateTime.now());
        return movieEntity;


    }

        public static MovieResponseDto mapToResponse(MovieEntity movie) {
            MovieResponseDto dto = new MovieResponseDto();
            dto.setTitle(movie.getTitle());
            dto.setGenre(movie.getGenre());
            dto.setAvailableSeats(movie.getAvailableSeats());
            return dto;
        }


}