package com.crowdelivery.delivery_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crowdelivery.Repositories.DriverRepository;
import com.crowdelivery.Models.Driver;

import jakarta.transaction.Transactional;

@Service
public class DriverService {
    
    private final DriverRepository driverRepository;
    
    @Autowired
    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }


    @Transactional
    public void saveDriver(Driver driver){
        driverRepository.save(driver);
    }

    public void deleteDriver(Driver driver){
        driverRepository.deleteById(driver.getDriverID());
    }

    public Driver getDriver(Driver driver){
        return driverRepository.findByDriverID(driver.getDriverID()).get(0);
    }
    
}
