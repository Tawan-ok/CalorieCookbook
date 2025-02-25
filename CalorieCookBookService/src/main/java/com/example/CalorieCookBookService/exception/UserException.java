package com.example.CalorieCookBookService.exception;

public class UserException extends BaseException{

    public UserException(String code) {
        super("user" + code);
    }

    public static UserException createDuplicateUsername() {
        return new UserException("Username already exists. Please choose a different username.");
    }

    public  static UserException idNotFound(){
        return new UserException("Id not found");
    }
}
