package com.hackdesk.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue
    Integer userId;
    String firstName;
    String lastName;
    String privileges;
    public User(String firstName, String lastName, String privileges){
        this.firstName = firstName;
        this.lastName = lastName;
        this.privileges = privileges;
    }
}
