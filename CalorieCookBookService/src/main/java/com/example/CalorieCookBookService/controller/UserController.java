package com.example.CalorieCookBookService.controller;

import com.example.CalorieCookBookService.exception.UserException;
import com.example.CalorieCookBookService.model.dto.UserRequest;
import com.example.CalorieCookBookService.model.entity.UserEntity;
import com.example.CalorieCookBookService.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserEntity> getAllUsers(){
        List<UserEntity> response = userService.getUsers();

        return  response ;
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserRequest userRequest) throws UserException {
        return userService.create(userRequest.getUsername(), userRequest.getPassword(),userRequest.getPhone());
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world";
    }

    @PostMapping("/hello")
    public String postHello(){
        return  "Hello word";
    }
}
