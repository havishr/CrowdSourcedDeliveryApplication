package com.crowdelivery.delivery_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crowdelivery.Models.Delivery;
import com.crowdelivery.Models.Driver;
import com.crowdelivery.Repositories.DeliveryRepository;

import jakarta.transaction.Transactional;

@Service
public class DeliveryService {
    
    
    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository){
        this.deliveryRepository = deliveryRepository;
    }

    @Transactional
    public void requestDelivery(Delivery delivery){
        deliveryRepository.save(delivery);
    }

    public void cancelDelivery(Delivery delivery){
        deliveryRepository.delete(delivery);
    }

    public void acceptDelivery(Delivery delivery, Driver driver){
        if (delivery.getDriver() != null) {
            throw new IllegalStateException("This delivery is already assigned to a driver.");
        }
        delivery.setDriver(driver);
        delivery.setStatus(true);
        deliveryRepository.save(delivery);
    }

    public void completeDelivery(Delivery delivery){
        delivery.setStatus(false);
        deliveryRepository.save(delivery);
    }

    public String getCurrentLocation(Delivery delivery){
        return "( +" + delivery.getCurrentLatitude() + ", " + delivery.getCurrentLongitude() + ")";
    }


}
