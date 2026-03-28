package com.example.movieticketreservationsystem.entity;


import com.example.movieticketreservationsystem.constants.MovieGenres;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "movies")

public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private MovieGenres genre;
    @Column(name = "total_seats")
    private int totalSeats;
    @Column(name = "avaliable_seats")
    private int availableSeats;
    @Column(name = "created_at")
    private LocalDateTime creationDate;


}