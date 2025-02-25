//package com.example.CalorieCookBookService.controller;
//
//import com.example.CalorieCookBookService.exception.UserException;
//import com.example.CalorieCookBookService.model.dto.UserRequest;
//import com.example.CalorieCookBookService.model.entity.UserEntity;
//import com.example.CalorieCookBookService.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class UserControllerTest {
//
//    @Mock
//    private UserService userService;
//
//    @InjectMocks
//    private UserController userController;
//
//    @Test
//    void shouldSuccessWhenGetAllUsers(){
//
//        List<UserEntity> mockUsers = mockUsers();
//        when(userService.getUsers()).thenReturn(mockUsers);
//
//        List<UserEntity> response = userController.getAllUsers();
//
//        assertEquals(2, response.size());
//        assertEquals("user1", response.get(0).getUsername());
//        assertEquals("user2", response.get(1).getUsername());
//
//    }
//
//    @Test
//    void shouldSuccessWhenCreateUser() throws UserException {
//        UserEntity mockUser = new UserEntity();
//        mockUser.setId(1L);
//        mockUser.setUsername("newuser");
//
//        when(userService.create(any(), any(),any())).thenReturn(mockUser);
//
//        UserRequest userRequest = new UserRequest();
//        userRequest.setUsername("newuser");
//        userRequest.setPassword("password");
//
//        UserEntity response = userController.createUser(userRequest);
//
//        assertEquals("newuser", response.getUsername());
//    }
//
//    private List<UserEntity> mockUsers(){
//        List<UserEntity> users = new ArrayList<>();
//
//        UserEntity user1 = new UserEntity();
//        user1.setId(1L);
//        user1.setUsername("user1");
//
//        UserEntity user2 = new UserEntity();
//        user2.setId(2L);
//        user2.setUsername("user2");
//
//        users.add(user1);
//        users.add(user2);
//
//        return  users;
//
//    }
//
//
//}