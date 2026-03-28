package com.example.movieticketreservationsystem.dto;

import com.example.movieticketreservationsystem.constants.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseDto {
    private int id;
    private String name;
    private UserRoles role;
    private boolean status;
    private LocalDateTime creationDate;
}