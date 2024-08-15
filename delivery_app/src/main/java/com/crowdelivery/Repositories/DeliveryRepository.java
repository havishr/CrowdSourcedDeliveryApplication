package com.crowdelivery.Repositories;

import com.crowdelivery.Models.Delivery;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;



public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
    
    List<Delivery> findByDeliveryID(Long deliveryID);

    void deleteById(Long deliveryID);
    

}
