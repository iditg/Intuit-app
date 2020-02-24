package com.Intuit.controllers;


import com.Intuit.database.entities.PaymentMeyhod;
import com.Intuit.database.entities.User;
import com.Intuit.facad.PaymentMethodService;
import com.Intuit.facad.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(value = "/{userId}", produces = APPLICATION_JSON_VALUE)
    public User userById(@PathVariable("userId") Integer userId) throws Exception {
        return userService.getById(userId);
    }

}
