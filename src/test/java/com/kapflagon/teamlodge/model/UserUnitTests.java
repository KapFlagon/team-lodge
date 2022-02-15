package com.kapflagon.teamlodge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserUnitTests {


    // Variables


    // Constructors
    @Test
    public void testUserCreation() {
        String email = "jamesdoyle@mail.com";
        String firstName = "james";
        String lastName = "Doyle";
        User user = new User(email, firstName, lastName);
        assertAll(
                () -> assertNotNull(user.getId(), "Id is null"),
                () -> assertEquals(user.getEmail(), email),
                () -> assertEquals(user.getFirstName(), firstName),
                () -> assertEquals(user.getLastName(), lastName)
        );
    }


    // Getters and Setters


    // Initialisation methods


    // Other methods


}
