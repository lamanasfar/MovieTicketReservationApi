package com.example.movieticketreservationsystem.controller;


import com.example.movieticketreservationsystem.dto.UserRequestDto;
import com.example.movieticketreservationsystem.repository.UserRepository;
import com.example.movieticketreservationsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    public final UserRepository userRepository;

    @PostMapping
    public void addUser(@RequestBody UserRequestDto userRequestDto){
        userService.addUser(userRequestDto);
    }

    @PutMapping
    public void changeUserStatus(@RequestBody int userId,int changeStatusId,boolean status){
        userService.changeUserStatus(userId,changeStatusId,status);
    }


}