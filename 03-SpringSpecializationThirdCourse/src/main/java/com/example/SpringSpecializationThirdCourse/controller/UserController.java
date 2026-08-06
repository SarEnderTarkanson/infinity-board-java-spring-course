package com.example.SpringSpecializationThirdCourse.controller;

import com.example.SpringSpecializationThirdCourse.entity.User;
import com.example.SpringSpecializationThirdCourse.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "user created successfully";
    }
}
