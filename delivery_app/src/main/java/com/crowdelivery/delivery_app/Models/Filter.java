package com.crowdelivery.delivery_app.Models;

import org.springframework.security.core.Transient;

@Transient
public class Filter {
    private Double radius;
    private Double rideLen;


    public Filter(Double rad, Double len){
        this.radius = rad;
        this.rideLen = len;
    }

    public void setRadius(Double rad){
        this.radius = rad;
    }

    public void setDriveLen(Double len){
        this.rideLen = len;
    }

    public Double getRadius(){
        return this.radius;
    }

    public Double getRideLen(){
        return this.rideLen;
    }

}
