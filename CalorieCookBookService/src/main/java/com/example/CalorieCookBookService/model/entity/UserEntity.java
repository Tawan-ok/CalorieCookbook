package com.example.CalorieCookBookService.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(schema = "public", name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @NotNull
    @Column(name = "username")
    private String username;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @Column(name = "phone", length = 20)
    private String phone;

    @NotBlank
    @Column(name = "role")
    private String role;

    @Email
    @NotBlank
    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private Long age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "height")
    private Long height;

    @Column(name = "activity_level")
    private String activityLevel;

    @Column(name = "bmi")
    private Double BMI;

    @Column(name = "bmr")
    private Double BMR;

    @Column(name = "tdee")
    private Double TDEE;

    @Column(name = "weight_goal")
    private Double weightGoal;

    @Column(name = "food_preferences")
    private String foodPreferences;

    @Column(name = "allergens")
    private String allergens;

    @Column(name = "diseases")
    private String diseases;
}
