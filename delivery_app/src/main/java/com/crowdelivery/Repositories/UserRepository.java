package com.crowdelivery.Repositories;

import com.crowdelivery.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{
    

    List<User> findByUserID(Long userID);

    void deleteById(Long userID);


}