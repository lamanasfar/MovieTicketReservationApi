package com.example.movieticketreservationsystem.mapper;

import com.example.movieticketreservationsystem.dto.ReservationRequestDto;
import com.example.movieticketreservationsystem.entity.ReservationEntity;

import java.time.LocalDateTime;

public class ReservationMapper {
    public static ReservationEntity mapToReservationEntity(ReservationRequestDto reservationRequestDto) {
        ReservationEntity entity = new ReservationEntity();
        entity.setUserId(reservationRequestDto.getUserId());
        entity.setMovieId(reservationRequestDto.getMovieId());
        entity.setReservationDate(LocalDateTime.now());
        entity.setRequestSeats(reservationRequestDto.getRequestSeats());

        return entity;
    }


}