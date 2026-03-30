package com.example.movieticketreservationsystem.controller;

import com.example.movieticketreservationsystem.dto.ReservationRequestDto;
import com.example.movieticketreservationsystem.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;
    @PostMapping("/check")
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservationPendingOrRejected(@RequestBody ReservationRequestDto reservationRequestDto){
        reservationService.createReservationPendingOrRejected(reservationRequestDto);
    }

    @PostMapping("/{reservationId}/approved")
    public void  reservationApproved (@PathVariable int reservationId,
                                      @RequestParam(required = false) int adminId){
        reservationService.reservationApproved(reservationId,adminId);
    }

    //test
    @DeleteMapping("/deletePending")
    public void deleteOldReservations() {
        reservationService.deletePendingReservation();
    }

}
