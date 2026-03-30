package com.example.movieticketreservationsystem.scheduler;


import com.example.movieticketreservationsystem.dto.ReservationRequestDto;
import com.example.movieticketreservationsystem.entity.ReservationEntity;
import com.example.movieticketreservationsystem.repository.ReservationRepository;
import com.example.movieticketreservationsystem.service.ReservationService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ScheduledService {
   private final ReservationService reservationService;
    @Scheduled(initialDelay = 10000,fixedRate = 2000) //10 dq
    @Transactional
    public void deletePendingReservation(){
        reservationService.deletePendingReservation();

    }



}


