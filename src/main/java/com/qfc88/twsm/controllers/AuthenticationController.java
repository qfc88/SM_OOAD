package com.qfc88.twsm.controllers;

import com.qfc88.twsm.models.ApplicationUser;
import com.qfc88.twsm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final UserService userService;

    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    //go to http://server:8000/auth/register
    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody ApplicationUser user) {

        return userService.registerUser(user);
    }

}
