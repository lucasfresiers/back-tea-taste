package com.lucas.teataste.controllers;

import com.lucas.teataste.entities.UserEntity;
import com.lucas.teataste.repository.UserRepository;
import com.lucas.teataste.security.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/users")
    public List<UserEntity> UserController(){
        return this.userRepository.findAll();
    }

    @PostMapping("/users")
    public UserEntity registerNewUserAccount(UserEntity newUser) {
        UserEntity user = new UserEntity();
        user.setMail(newUser.getMail());
        user.setNom("");
        user.setPrenom("");
        user.setUsername("");
        user.setPassword("eazeza");
        newUser.setPrenom("zejrhkazkljehrze");
        user.setPassword(passwordEncoder.encoder().encode(user.getPassword()));
        return userRepository.save(user);
    }
}

