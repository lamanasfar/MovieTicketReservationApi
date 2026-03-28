package com.example.movieticketreservationsystem.repository;

import com.example.movieticketreservationsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository   extends JpaRepository<UserEntity,Integer> {
}