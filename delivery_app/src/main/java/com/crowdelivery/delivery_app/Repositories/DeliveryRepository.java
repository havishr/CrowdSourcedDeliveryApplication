package com.crowdelivery.delivery_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crowdelivery.delivery_app.Models.Delivery;

import java.util.List;



public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
    
    List<Delivery> findByDeliveryID(Long deliveryID);

    void deleteById(Long deliveryID);
    

}
