package com.crowdelivery.delivery_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crowdelivery.delivery_app.Models.Driver;

import java.util.List;


public interface DriverRepository extends JpaRepository<Driver, Long>{
    
    List<Driver> findByDriverID(Long driverID);

    void deleteById(Long driverID);
}
