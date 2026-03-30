package com.example.movieticketreservationsystem.controller;

import com.example.movieticketreservationsystem.constants.ExceptionCodes;
import com.example.movieticketreservationsystem.exception.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler({
//            UserNotFoundException.class,
//            MovieNotFoundException.class,
//            AdminNotFoundException.class
//    })
//    @ResponseStatus(NOT_FOUND)
//    public ExceptionResponse handleNotFoundExceptions(RuntimeException exception) {
//        return new ExceptionResponse(ExceptionCodes.NOT_FOUND, exception.getMessage());
//    }
    @ExceptionHandler(ReservationNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ExceptionResponse handleNotFoundExceptionsss(ReservationNotFoundException exception) {
        return new ExceptionResponse(ExceptionCodes.NOT_FOUND, exception.getMessage());
    }

    @ExceptionHandler(NotAvailableSeatsException.class)
    @ResponseStatus(BAD_REQUEST)
    public ExceptionResponse handleNotAvailableSeatsException(NotAvailableSeatsException exception) {
        return new ExceptionResponse(ExceptionCodes.NO_AVAILABLE_SEATS, exception.getMessage());
    }
    @ExceptionHandler(InvalidRoleOperationException.class)
    @ResponseStatus(BAD_REQUEST)
    public ExceptionResponse handleInvalidRoleException(InvalidRoleOperationException exception) {
        return new ExceptionResponse(ExceptionCodes.INVALID_ROLE, exception.getMessage());
    }
    @ExceptionHandler(UnauthorizedActionException.class)
    @ResponseStatus(BAD_REQUEST)
    public ExceptionResponse handleUnauthorizedActionException(UnauthorizedActionException exception) {
        return new ExceptionResponse(ExceptionCodes.UNAUTHORIZED_ACTION, exception.getMessage());
    }






}
