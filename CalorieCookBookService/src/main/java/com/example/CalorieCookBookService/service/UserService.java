package com.example.CalorieCookBookService.service;

import com.example.CalorieCookBookService.exception.UserException;
import com.example.CalorieCookBookService.model.entity.UserEntity;
import com.example.CalorieCookBookService.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository, int value) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUsers(){

        return userRepository.findAll();
    }

    public UserEntity create(String username,String password,String phone) throws UserException {
        Optional<UserEntity> existingUser = userRepository.findByUsername(username);

        if (existingUser.isPresent()) {
            throw UserException.createDuplicateUsername();
        }

        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhone(phone);

        return userRepository.save(user);
    }

}
