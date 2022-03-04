package com.kapflagon.teamlodge.model;

public class Contact {


    // Variables
    private ContactType type;
    private String detail;

    public Contact(ContactType type, String detail) {
        this.type = type;
        this.detail = detail;
    }


    // Constructors


    // Getters and Setters
    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    // Initialisation methods


    // Other methods


}
