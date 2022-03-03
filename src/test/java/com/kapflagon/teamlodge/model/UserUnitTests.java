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
        Contact primaryEmail = new Contact(ContactType.EMAIL, email);
        User user = new User(primaryEmail, firstName, lastName);
        assertAll(
                //() -> assertNotNull(user.getId(), "Id is null"),
                () -> assertEquals(primaryEmail, user.getPrimaryEmail()),
                () -> assertEquals(firstName, user.getFirstName()),
                () -> assertEquals(lastName, user.getLastName())
        );
    }


    // Getters and Setters


    // Initialisation methods


    // Other methods


}
