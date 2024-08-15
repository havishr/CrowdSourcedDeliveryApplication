package com.crowdelivery.Repositories;

import com.crowdelivery.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DriverRepository extends JpaRepository<Driver, Long>{
    
    List<Driver> findByDriverID(Long driverID);

    void deleteById(Long driverID);
}
