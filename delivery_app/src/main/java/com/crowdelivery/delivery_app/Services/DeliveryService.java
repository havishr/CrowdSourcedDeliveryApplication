package com.crowdelivery.delivery_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crowdelivery.delivery_app.DTOs.CreateDeliveryDTO;
import com.crowdelivery.delivery_app.DTOs.EditDeliveryDTO;
import com.crowdelivery.delivery_app.Models.Delivery;
import com.crowdelivery.delivery_app.Repositories.DeliveryRepository;

import jakarta.transaction.Transactional;

@Service
public class DeliveryService {
    
    
    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository){
        this.deliveryRepository = deliveryRepository;
    }

    @Transactional
    public void requestDelivery(CreateDeliveryDTO request){

        Delivery delivery = new Delivery(request.getUserID(), request.getDestinationLatitude(), request.getDestinationLongitude(), request.getPackageDescription(), false);

        this.deliveryRepository.save(delivery);
    }


    public void cancelDelivery(EditDeliveryDTO request){
        this.deliveryRepository.deleteById(request.getDeliveryID());
    }

    public void acceptDelivery(EditDeliveryDTO request){
        Delivery delivery = this.deliveryRepository.getReferenceById(request.getDeliveryID());
        if (delivery.getDriver() != null) {
            throw new IllegalStateException("This delivery is already assigned to a driver.");
        }
        
        delivery.setDriver(request.getDriverId());
        delivery.setStatus(true);
        this.deliveryRepository.save(delivery);
        
    }

    public void completeDelivery(EditDeliveryDTO request){
        Delivery delivery = this.deliveryRepository.getReferenceById(request.getDriverId());
        delivery.setStatus(false);
        deliveryRepository.save(delivery);
    }

    public String getCurrentLocation(EditDeliveryDTO request){
        Delivery delivery = this.deliveryRepository.getReferenceById(request.getDeliveryID());
        return "( +" + delivery.getCurrentLatitude() + ", " + delivery.getCurrentLongitude() + ")";
    }


}
