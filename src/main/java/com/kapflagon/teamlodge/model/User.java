package com.kapflagon.teamlodge.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {


    // Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private Contact primaryEmail;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Contact primaryPhone;


    private List<Contact> additionalContactDetails;

    private List<Address> addressList;

    public Contact getPrimaryPhone() {
        return primaryPhone;
    }


    // Constructors
    protected User() {
    }

    public User(Contact primaryEmail, String firstName, String lastName) {
        this.primaryEmail = primaryEmail;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public Contact getPrimaryEmail() {
        return primaryEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    // Initialisation methods


    // Other methods


}
