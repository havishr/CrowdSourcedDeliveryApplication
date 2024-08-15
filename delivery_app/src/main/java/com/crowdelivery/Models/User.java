package com.crowdelivery.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


    protected User(){}

    public User(Long userid, String username, String password, String email, String firstName, String lastName){
        this.userID = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getUserID(){
        return this.userID;
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
    public void setUserID(Long newUserID){
        this.userID = newUserID;
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

    public void firstName(String firstName){
        this.firstName = firstName;
    }

    public void lastName(String lastName){
        this.lastName = lastName;
    }

}