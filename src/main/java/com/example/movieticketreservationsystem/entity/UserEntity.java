package com.example.movieticketreservationsystem.entity;

import com.example.movieticketreservationsystem.constants.UserRoles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DateTimeException;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "names")
    private String name;
    @Column(name = "roles")
    private UserRoles role;
    @Column(name = "active_status")
    private boolean status;
    @Column(name = "created_date")
    private LocalDateTime creationDate;

}