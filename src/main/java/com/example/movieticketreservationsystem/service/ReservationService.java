package com.example.movieticketreservationsystem.service;

import com.example.movieticketreservationsystem.constants.ReservationStatus;
import com.example.movieticketreservationsystem.constants.UserRoles;
import com.example.movieticketreservationsystem.dto.ReservationRequestDto;
import com.example.movieticketreservationsystem.entity.MovieEntity;
import com.example.movieticketreservationsystem.entity.UserEntity;
import com.example.movieticketreservationsystem.mapper.ReservationMapper;
import com.example.movieticketreservationsystem.repository.MovieRepository;
import com.example.movieticketreservationsystem.repository.ReservationRepository;
import com.example.movieticketreservationsystem.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional

public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final UserRepository userRepository;
    private final MovieRepository movieRepository;



    public void createReservationPendingOrRejected(ReservationRequestDto reservationRequestDto) {

        var user = checkUserExists(reservationRequestDto.getUserId());
        var movie = checkMovieExists(reservationRequestDto.getMovieId());

        var reservation = ReservationMapper.mapToReservationEntity(reservationRequestDto);

        if(!checkUserStatus(user) || !checkAvailableSeats(movie,reservationRequestDto) || !limitReservation(reservationRequestDto)){
            reservation.setReservationStatus(ReservationStatus.REJECTED);

        }
        else
            reservation.setReservationStatus(ReservationStatus.PENDING);

        reservationRepository.save(reservation);
    }

    public void reservationApproved(int reservationId,int adminId){
        var admin = userRepository.findById(adminId).orElseThrow(() -> new RuntimeException("admin not found"));
        if(admin.getRole() == UserRoles.ADMIN){
            var reservation = reservationRepository.findById(reservationId)
                    .orElseThrow(() -> new RuntimeException("Reservation not found"));
            var movie = checkMovieExists(reservation.getMovieId());
            if(movie.getAvailableSeats() < reservation.getRequestSeats())
                throw new RuntimeException("Not enough available seats");
            reservation.setReservationStatus(ReservationStatus.APPROVED);
            movie.setAvailableSeats(movie.getAvailableSeats() - reservation.getRequestSeats());


        }
    }

    private boolean limitReservation(ReservationRequestDto reservationRequestDto){
        return  reservationRequestDto.getRequestSeats()<=5;

    }

    private UserEntity checkUserExists(int userId){
        var user =userRepository.findById(userId);
        if(user.isEmpty())
            throw new RuntimeException("user not found");//globala cevir

        return user.get();
    }

    private boolean checkUserStatus(UserEntity userEntity){
        return userEntity.isStatus();

    }

    private MovieEntity checkMovieExists(int movieId){
        var movie =movieRepository.findById(movieId);
        if(movie.isEmpty())
            throw new RuntimeException("movie not found");//globall
        return movie.get();
    }

    private boolean checkAvailableSeats(MovieEntity movieEntity,ReservationRequestDto reservationRequestDto){
       return movieEntity.getAvailableSeats() >= reservationRequestDto.getRequestSeats();


    }


}