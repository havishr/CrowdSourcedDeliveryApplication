package com.crowdelivery.delivery_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crowdelivery.delivery_app.DTOs.DriverDTO;
import com.crowdelivery.delivery_app.Models.Driver;
import com.crowdelivery.delivery_app.Models.Filter;
import com.crowdelivery.delivery_app.Repositories.DriverRepository;

import jakarta.transaction.Transactional;

@Service
public class DriverService {
    
    private final DriverRepository driverRepository;
    
    @Autowired
    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }


    @Transactional
    public void saveDriver(DriverDTO request){

        Filter filter = new Filter(request.getRadFilter(), request.getDeliveryLenFilter());
        Driver driver = new Driver(filter, request.getUsername(), request.getPassword(), request.getEmail(), request.getFirstName(), request.getLastName());

        driverRepository.save(driver);

    }

    public void updateDriver(DriverDTO request){

        Driver driver = this.driverRepository.getReferenceById(request.getDriverID());

        Filter newFilter = new Filter(request.getRadFilter(), request.getDeliveryLenFilter());

        driver.setFilters(newFilter);
        driver.setEmail(request.getEmail());
        driver.setPassword(request.getPassword());
        driver.setUsername(request.getUsername());
        driver.setFirstName(request.getFirstName());
        driver.setLastName(request.getLastName());

        this.driverRepository.save(driver);

        
    }

    public void deleteDriver(DriverDTO request){
        driverRepository.deleteById(request.getDriverID());
    }

    public Driver getDriver(DriverDTO request){
        return driverRepository.findByDriverID(request.getDriverID()).get(0);
    }
    
}
