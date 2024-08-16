package com.crowdelivery.delivery_app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Driver{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long driverID;

    @Transient
    private Filter filters;
    
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


    protected Driver(){}

    public Driver(Filter filters, String username, String password, String email, String firstName, String lastName){
        this.filters = filters;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Long getDriverID(){
        return this.driverID;
    }

    public Filter getFilters(){
        return this.filters;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setDriverID(Long newDriverID){
        this.driverID = newDriverID;
    }

    public void setFilters(Filter newFilters){
        this.filters = newFilters;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}