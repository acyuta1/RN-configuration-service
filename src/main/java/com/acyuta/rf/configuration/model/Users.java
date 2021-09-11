package com.acyuta.rf.configuration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "user.username.is.empty")
    private String username;

    @NotBlank(message = "user.email.is.empty")
    @Email(message = "user.email.is.invalid")
    private String email;

    @NotBlank(message = "user.email.is.empty")
    private String firstName;

    @NotBlank(message = "user.email.is.empty")
    private String lastName;

    @NotNull(message = "user.date.of.birth.is.empty")
    private LocalDate dateOfBirth;

    @NotNull(message = "user.updated.at.is.empty")
    private LocalDateTime updatedAt;

    private String token;

}
