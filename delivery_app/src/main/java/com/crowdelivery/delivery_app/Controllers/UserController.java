package com.crowdelivery.delivery_app.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.crowdelivery.delivery_app.DTOs.UserDTO;
import com.crowdelivery.delivery_app.Services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class UserController {
    

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody UserDTO entity) {
        
        userService.saveUser(entity);
        
        return ResponseEntity.ok("User Created Successfully");
    }

    @PostMapping("/updateUser")
    public ResponseEntity<?> updateUser(@RequestBody UserDTO entity) {
        
        userService.saveUser(entity);
        
        return ResponseEntity.ok("User Updated Successfully");
    }

    @PostMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestBody UserDTO entity) {
        
        userService.deleteUser(entity);
        
        return ResponseEntity.ok("User Deleted Successfully");
    }

    @GetMapping("/getUser")
    public ResponseEntity<?> getUser(@RequestBody UserDTO entity) {
        
        userService.getUser(entity);
        
        return ResponseEntity.ok("User Retrieved Successfully");
    }
    
    

    
}
