package com.example.services;

import com.example.entity.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by prengifo on 21/12/2016.
 */
@Service
public class SessionManager {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(Integer id){
        return userRepository.findOne(id);
    }
}
