package com.kapflagon.teamlodge.model;

public class Team {


    // Variables
    private String name;
    private User owner;


    // Constructors
    public Team(String name, User owner) {
        this.name = name;
        this.owner = owner;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    // Initialisation methods


    // Other methods


}
