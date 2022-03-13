package com.kapflagon.teamlodge.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Club {


    // Variables
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
    private String name;


    // Constructors
    protected Club() {
        // Must be empty for JPA annotations.
    }

    public Club(String name) {
        this.name = name;
    }


    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Initialisation methods


    // Other methods


}
