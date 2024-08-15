
package com.crowdelivery.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery{
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryID;
    private Driver driver;
    private User user;
    private double destinationLatitude;
    private double destinationLongitude;
    private double currentLatitude;
    private double currentLongitude;
    private String packageDescription;
    private boolean active;



    protected Delivery(){}


    public Delivery(Long deliveryID, Driver driver, User user, double destLatitude, double destLongitude){
        this.deliveryID = deliveryID;
        this.driver = driver;
        this.user = user;
        this.destinationLatitude = destLatitude;
        this.destinationLongitude = destLongitude;
    }

    public Long getDeliveryID(){
        return this.deliveryID;
    }
    
    public Driver getDriver(){
        return this.driver;
    }
    public User getUser(){
        return this.user;
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

    public void setDriver(Driver driver){
        this.driver = driver;
    }
    public void setUser(User user){
        this.user = user;
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