package com.example.movieticketreservationsystem.dto;

import com.example.movieticketreservationsystem.constants.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDto {
    private String name;
    private UserRoles role;
    private boolean status;

}
