package com.example.movieticketreservationsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationResponseDto {
    private int reservationId;
    private boolean reservationStatus;  // true = reserved, false = failed
    private boolean approvedStatus;     // true = approved, false = rejected
    private String message;             // əlavə info (məsələn: "Uğurlu", "Yerlər doludur")
}