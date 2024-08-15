package com.crowdelivery.delivery_app.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crowdelivery.delivery_app.DTOs.CreateDeliveryDTO;
import com.crowdelivery.delivery_app.DTOs.EditDeliveryDTO;
import com.crowdelivery.delivery_app.Services.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

class DeliveryController{
    
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }

    @PostMapping("/createDelivery")
    public ResponseEntity<?> createDelivery(@RequestBody CreateDeliveryDTO entity) {

        this.deliveryService.requestDelivery(entity);
        return ResponseEntity.ok("Ride Created Successfully");

    }

    @PostMapping("/acceptDelivery")
    public ResponseEntity<?> acceptDelivery(@RequestBody EditDeliveryDTO entity) {

        this.deliveryService.acceptDelivery(entity);

        return ResponseEntity.ok("Ride Accepted");
    }
    
    @PostMapping("/cancelDelivery")
    public ResponseEntity<?> cancelDelivery(@RequestBody EditDeliveryDTO entity) {

        this.deliveryService.cancelDelivery(entity);

        return ResponseEntity.ok("Ride Cancelled");
    }

    @GetMapping("/getDeliveries")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    

    
    
}