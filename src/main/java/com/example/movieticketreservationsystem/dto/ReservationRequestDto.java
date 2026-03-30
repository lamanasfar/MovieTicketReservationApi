package com.example.movieticketreservationsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationRequestDto {
    private int userId;      // sifarisi kim verir
    private int movieId;// hansi filme baxmaq isteyir
    private int requestSeats;
    private LocalDateTime reservationDate;
}