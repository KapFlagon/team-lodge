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



    // Constructors
    protected User() {
    }

    public User(Contact primaryEmail, String firstName, String lastName) {
        this.primaryEmail = primaryEmail;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(Contact primaryEmail, Contact primaryPhone, String firstName, String lastName) {
        this(primaryEmail, firstName, lastName);
        this.primaryPhone = primaryPhone;
    }


    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public Contact getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(Contact primaryEmail) {
        if(primaryEmail.getType() == ContactType.EMAIL) {
            this.primaryEmail = primaryEmail;
        } else {
            throw new IllegalArgumentException("Primary e-mail must be of type 'E-mail'.");
        }
    }

    public Contact getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(Contact primaryPhone) {
        if(primaryPhone.getType() == ContactType.EMAIL) {
            throw new IllegalArgumentException("Primary phone must be of type 'Mobile' or 'Landline'.");
        } else {
            this.primaryPhone = primaryPhone;
        }
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


    // Initialisation methods


    // Other methods


}
