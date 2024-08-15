package com.crowdelivery.delivery_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crowdelivery.Repositories.UserRepository;
import com.crowdelivery.Models.User;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Transactional
    public void saveUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.deleteById(user.getUserID());
    }

    public User getUser(User user){
        return userRepository.findByUserID(user.getUserID()).get(0);
    }
    
}
