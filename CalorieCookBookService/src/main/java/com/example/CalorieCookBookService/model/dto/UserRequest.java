package com.example.CalorieCookBookService.model.dto;

import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String password;
    private String phone;
}
