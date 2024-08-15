
package com.crowdelivery.delivery_app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery{
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryID;
    private Long driverID;
    private Long userID;
    private double destinationLatitude;
    private double destinationLongitude;
    private double currentLatitude;
    private double currentLongitude;
    private String packageDescription;
    private boolean active;



    protected Delivery(){}


    public Delivery(Long user, double destLatitude, double destLongitude, String packageDesc, boolean active){
        this.userID = user;
        this.destinationLatitude = destLatitude;
        this.destinationLongitude = destLongitude;
        this.packageDescription = packageDesc;
        this.active = active;
    }

    public Long getDeliveryID(){
        return this.deliveryID;
    }
    
    public Long getDriver(){
        return this.driverID;
    }
    public Long getUser(){
        return this.userID;
    }
    public double getDestinationLongitude(){
        return this.destinationLatitude;
    }
    public double getDestinationLatitude(){
        return this.destinationLongitude;
    }

    public double getCurrentLongitude(){
        return this.currentLongitude;
    }
    public double getCurrentLatitude(){
        return this.currentLatitude;
    }
    public String getPackage(){
        return this.packageDescription;
    }
    public boolean getStatus(){
        return this.active;
    }


    public void setDeliveryID(Long deliveryID){
        this.deliveryID = deliveryID;
    }

    public void setDriver(Long driverID){
        this.driverID = driverID;
    }
    public void setUser(Long userID){
        this.userID = userID;
    }

    public void setDestinationLatitude(double destLatitude){
        this.destinationLatitude = destLatitude;
    }

    public void setDestinationLongitude(double destLongitude){
        this.destinationLongitude = destLongitude;
    }

    public void setCurrentLatitude(double curLatitude){
        this.destinationLatitude = curLatitude;
    }

    public void setCurrentLongitude(double curLongitude){
        this.destinationLongitude = curLongitude;
    }
    public void setPackageDesc(String packageDesc){
        this.packageDescription = packageDesc;
    }
    public void setStatus(boolean active){
        this.active = active;
    }
}