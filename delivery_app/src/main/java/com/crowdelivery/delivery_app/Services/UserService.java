package com.crowdelivery.delivery_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crowdelivery.delivery_app.DTOs.UserDTO;
import com.crowdelivery.delivery_app.Models.User;
import com.crowdelivery.delivery_app.Repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Transactional
    public void saveUser(UserDTO request){
        User user = new User(request.getUsername(), request.getPassword(), request.getEmail(), request.getFirstName(), request.getLastName());

        this.userRepository.save(user);
        
    }

    public void updateUser(UserDTO request){

        User user = this.userRepository.getReferenceById(request.getUserID());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setUsername(request.getUsername());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        this.userRepository.save(user);

        
    }

    public void deleteUser(UserDTO request){
        userRepository.deleteById(request.getUserID());
    }

    public User getUser(UserDTO request){
        return userRepository.findByUserID(request.getUserID()).get(0);
    }


    
}
