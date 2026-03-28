package com.example.movieticketreservationsystem.repository;

import com.example.movieticketreservationsystem.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository  extends JpaRepository<MovieEntity,Integer> {
}