package com.crowdelivery.delivery_app.DTOs;

public class EditDeliveryDTO {

    private Long deliveryID; // The ID of the ride being edited
    private Long driverId; // The ID of the driver taking the ride

    // Getters and Setters

    public Long getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(Long deliveryID) {
        this.deliveryID = deliveryID;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }
}
