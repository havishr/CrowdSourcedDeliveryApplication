package com.crowdelivery.delivery_app.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crowdelivery.delivery_app.DTOs.DriverDTO;
import com.crowdelivery.delivery_app.Services.DriverService;

@RestController
public class DriverController {
    
    private final DriverService driverService;

    public DriverController(DriverService driverService){
        this.driverService = driverService;
    }

    @PostMapping("/createDriver")
    public ResponseEntity<?> createDriver(@RequestBody DriverDTO entity) {
        
        this.driverService.saveDriver(entity);
        return ResponseEntity.ok("Driver Created Successfully");
    }

    @PostMapping("/updateDriver")
    public ResponseEntity<?> udpateDriver(@RequestBody DriverDTO entity) {
        
        this.driverService.updateDriver(entity);
        return ResponseEntity.ok("Driver Updated Successfully");
    }

    @PostMapping("/deleteDriver")
    public ResponseEntity<?> deleteDriver(@RequestBody DriverDTO entity) {
        
        this.driverService.deleteDriver(entity);
        return ResponseEntity.ok("Driver Deleted Successfully");
    }

    @GetMapping("/getDriver")
    public ResponseEntity<?> getDriver(@RequestBody DriverDTO entity) {
        
        this.driverService.getDriver(entity);
        return ResponseEntity.ok("Driver Retrieved Successfully");
    }
}
