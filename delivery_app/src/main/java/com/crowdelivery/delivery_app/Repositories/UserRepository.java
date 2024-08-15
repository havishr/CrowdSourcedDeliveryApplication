package com.crowdelivery.delivery_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crowdelivery.delivery_app.Models.User;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{
    

    List<User> findByUserID(Long userID);

    void deleteById(Long userID);


}