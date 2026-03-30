package com.example.movieticketreservationsystem.entity;

import com.example.movieticketreservationsystem.constants.ReservationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "reservation")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int id;
    @Column(name = "movie_id")
    private int movieId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "reservation_status")
    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;
    @Column(name = "approved_status")
    private boolean approvedStatus;
    @Column(name = "reservation_date")
    private LocalDateTime reservationDate;
    @Column(name = "request_seats")
    private int requestSeats;

}