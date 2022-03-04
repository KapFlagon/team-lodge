package com.kapflagon.teamlodge.model;

import java.util.List;

public class Address {


    // Variables
    private List<String> addressLines;
    private String city;
    private String region;
    private String postCode;
    private String country;

    public Address(List<String> addressLines, String city, String region, String postCode, String country) {
        this.addressLines = addressLines;
        this.city = city;
        this.region = region;
        this.postCode = postCode;
        this.country = country;
    }


    // Constructors


    // Getters and Setters
    public List<String> getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    // Initialisation methods


    // Other methods


}
