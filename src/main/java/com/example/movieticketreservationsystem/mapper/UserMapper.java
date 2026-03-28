package com.example.movieticketreservationsystem.mapper;

import com.example.movieticketreservationsystem.dto.UserRequestDto;
import com.example.movieticketreservationsystem.entity.UserEntity;

import java.time.LocalDateTime;

public class UserMapper {
    public static UserEntity mapToUserEntity(UserRequestDto userRequestDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequestDto.getName());
        userEntity.setRole(userRequestDto.getRole());
        userEntity.setStatus(userRequestDto.isStatus());
        userEntity.setCreationDate(LocalDateTime.now());
        return userEntity;
    }
}