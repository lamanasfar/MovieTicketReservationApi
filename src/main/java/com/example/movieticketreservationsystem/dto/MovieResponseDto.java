package com.example.movieticketreservationsystem.dto;

import com.example.movieticketreservationsystem.constants.MovieGenres;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieResponseDto {
    private int id;
    private String title;
    private MovieGenres genre;
    private int totalSeats;
    private int availableSeats;
}