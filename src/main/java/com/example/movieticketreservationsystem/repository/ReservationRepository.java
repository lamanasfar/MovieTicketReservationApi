package com.example.movieticketreservationsystem.repository;


import com.example.movieticketreservationsystem.constants.ReservationStatus;
import com.example.movieticketreservationsystem.entity.ReservationEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Transactional
@Repository
public interface ReservationRepository  extends JpaRepository<ReservationEntity,Integer> {


}