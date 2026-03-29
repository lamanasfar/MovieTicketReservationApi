package com.example.movieticketreservationsystem.exception;

public class NotAvailableSeatsException extends RuntimeException{
    public NotAvailableSeatsException(String message) {
        super(message);
    }
}
