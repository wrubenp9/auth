package com.example.auth.dto;

import com.example.auth.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegisterDTO {
    private String login;
    private String password;
    private UserRole role;
}
