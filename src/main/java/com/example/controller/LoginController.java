package com.example.controller;

import com.example.entity.User;
import com.example.repositories.UserRepository;
import com.example.services.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by prengifo on 21/12/2016.
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    private SessionManager sessionManager;
    private UserRepository userRepository;

    @Autowired
    public LoginController(SessionManager sessionManager,UserRepository userRepository){
        super();
        this.userRepository=userRepository;
        this.sessionManager=sessionManager;
    }


    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        System.out.println("sessionManager =======>"+sessionManager);
        System.out.println("userRepository =======>"+userRepository);
        System.out.println("USER" + userRepository.findOne(1));
        System.out.println("USER" + userRepository.findAll());
        System.out.println("USER" + sessionManager.findUserById(1));
        return "Hello World!";
    }

    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity findUser(){
        List<User> userList =  userRepository.findAll();
        return new ResponseEntity(userList, HttpStatus.OK);
    }
}
