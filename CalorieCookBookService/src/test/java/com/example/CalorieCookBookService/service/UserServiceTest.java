//package com.example.CalorieCookBookService.service;
//
//import com.example.CalorieCookBookService.exception.UserException;
//import com.example.CalorieCookBookService.model.entity.UserEntity;
//import com.example.CalorieCookBookService.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//@ExtendWith(MockitoExtension.class)
//class UserServiceTest {
//     @Mock
//     private UserRepository userRepository;
//
//     @InjectMocks
//     private UserService userService;
//
////    @Test
////    void shouldSuccessWhenGetUsers() {
////        List<UserEntity> users = mockUsers();
////
////        when(userRepository.findAll()).thenReturn(users);
////
////        List<UserEntity> response = userService.getUsers();
////
////        assertEquals("dday",response.get(0).getUsername());
////        assertEquals(1L,response.get(0).getId());
////    }
//
//    @Test
//    void  shouldSuccessWhenCreateUser() throws UserException {
//          UserEntity user = new UserEntity();
//          user.setId(1L);
//          user.setUsername("dday");
//          user.setPassword("12345");
//
//          when(userRepository.save(any())).thenReturn(user);
//          UserEntity response = userService.create(user.getUsername(),user.getPassword(),user.getPhone());
//
//          assertEquals("dday",response.getUsername());
//    }
//
//    @Test
//    void  shouldThrowExceptionWhenUsernameExists(){
//        UserEntity existingUser = new UserEntity();
//        existingUser.setId(1L);
//        existingUser.setUsername("dday");
//
//        when(userRepository.findByUsername("dday")).thenReturn(Optional.of(existingUser));
//
//        UserException exception = assertThrows(UserException.class,() -> {
//            userService.create("dday","12345","0913212132");
//        });
//
//        assertEquals("userUsername already exists. Please choose a different username.", exception.getMessage());
//    }
//
//
//    private List<UserEntity> mockUsers(){
//        List<UserEntity> users = new ArrayList<>();
//
//        UserEntity user1 = new UserEntity();
//        user1.setId(1L);
//        user1.setUsername("dday");
//
//
//        users.add(user1);
//
//        return  users;
//
//    }
//
//
//
//}