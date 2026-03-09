package com.two.bank_system.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.two.bank_system.domain.User;

@Service
public class UserService {

    public String getUser() {
        return "Hello Users";
    }
    public String createUser(@RequestParam String name, @RequestParam String email) {
        User user = new User(name, email);
        return "User Created: " + user.getName() + " with email: " + user.getEmail();
    }

    public String changeEmail(@RequestParam String name, @RequestParam String newEmail) {
        // user.setEmail(newEmail);
        return "Email changed for user: " + name + " to new email: " + newEmail;
    }
}