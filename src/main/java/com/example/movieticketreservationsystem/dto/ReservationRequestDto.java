package com.example.movieticketreservationsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationRequestDto {
    private int userId;      // sifarisi kim verir
    private int movieId;// hansi filme baxmaq isteyir
    private int requestSeats;
}