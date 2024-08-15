package com.crowdelivery.delivery_app.DTOs;

import com.crowdelivery.delivery_app.Models.Filter;

public class DriverDTO {

    private Long driverID;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private double radiusFilter;
    private double deliveryLenFilter;

    // Getters and Setters
    public Long getDriverID() {
        return driverID;
    }

    public void setDriverID(Long driverID) {
        this.driverID = driverID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getRadFilter(){
        return this.radiusFilter;
    }

    public void setRadFilter(double radFilter){
        this.radiusFilter = radFilter;
    }

    public double getDeliveryLenFilter(){
        return this.deliveryLenFilter;
    }

    public void setFilters(double deliveryLenFilter) {
        this.deliveryLenFilter = deliveryLenFilter;
    }
}
