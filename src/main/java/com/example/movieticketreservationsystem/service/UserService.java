package com.example.movieticketreservationsystem.service;

import com.example.movieticketreservationsystem.constants.UserRoles;
import com.example.movieticketreservationsystem.dto.UserRequestDto;
import com.example.movieticketreservationsystem.entity.UserEntity;
import com.example.movieticketreservationsystem.exception.InvalidRoleOperationException;
import com.example.movieticketreservationsystem.exception.UnauthorizedActionException;
import com.example.movieticketreservationsystem.exception.UserNotFoundException;
import com.example.movieticketreservationsystem.mapper.UserMapper;
import com.example.movieticketreservationsystem.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public void addUser(UserRequestDto userRequestDto){
        userRepository.save(UserMapper.mapToUserEntity(userRequestDto));
    }

    public void changeUserStatus(int userId, int changedUserStatusId,boolean status){
        var currentUser = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("Current user not found"));;

        if(currentUser.getRole() == UserRoles.ADMIN){
            var changedStatusUser = userRepository.findById(changedUserStatusId).orElseThrow(() -> new UserNotFoundException("Changed user not found"));
            if(changedStatusUser.getRole() == UserRoles.USER) {
                changedStatusUser.setStatus(status);
            }
            else
                throw new InvalidRoleOperationException("Admin status cannot be changed");
        }
        else
            throw new UnauthorizedActionException("Only ADMIN can change user status");



    }
}