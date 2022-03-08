package com.kapflagon.teamlodge.model;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class UserUnitTests {


    // Variables


    // Constructors
    @Test
    public void testUserCreationWithEmailOnly() {
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

    @Test
    public void testUserCreationWithEmailAndPhone() {
        String email = "jaydoe@mail.com";
        String firstName = "Jay";
        String lastName = "Doe";
        String phoneNumber = "01234567";
        Contact primaryEmail = new Contact(ContactType.EMAIL, email);
        Contact primaryPhone = new Contact(ContactType.MOBILEPHONE, phoneNumber);
        User user = new User(primaryEmail, primaryPhone, firstName, lastName);
        assertAll(
                () -> assertEquals(primaryEmail, user.getPrimaryEmail()),
                () -> assertEquals(primaryPhone, user.getPrimaryPhone()),
                () -> assertEquals(firstName, user.getFirstName()),
                () -> assertEquals(lastName, user.getLastName())
        );
    }

    @Test
    public void changeUserContactDetails() {
        String firstName = "Jay";
        String lastName = "Doe";
        Contact oldPrimaryEmail = new Contact(ContactType.EMAIL, "jaydoe@mail.com");
        Contact newPrimaryEmail = new Contact(ContactType.EMAIL, "doe.jay@newmail.com");
        Contact oldPrimaryPhone = new Contact(ContactType.MOBILEPHONE, "01234567");
        Contact newPrimaryPhone = new Contact(ContactType.MOBILEPHONE, "89101234");

        User user = new User(oldPrimaryEmail, oldPrimaryPhone, firstName, lastName);
        user.setPrimaryEmail(newPrimaryEmail);
        user.setPrimaryPhone(newPrimaryPhone);

        assertAll(
                () -> assertNotEquals(oldPrimaryEmail, user.getPrimaryEmail()),
                () -> assertEquals(newPrimaryEmail, user.getPrimaryEmail()),
                () -> assertNotEquals(oldPrimaryPhone, user.getPrimaryPhone()),
                () -> assertEquals(newPrimaryPhone, user.getPrimaryPhone())
        );
    }

    @Test
    public void changeUserName() {
        String oldFirstName = "Jay";
        String newFirstName = "Sam";
        String oldLastName = "Doe";
        String newLastName = "Din";
        Contact primaryEmail = new Contact(ContactType.EMAIL, "jaydoe@mail.com");

        User user = new User(primaryEmail, oldFirstName, oldLastName);
        user.setFirstName(newFirstName);
        user.setLastName(newLastName);

        assertAll(
                () -> assertNotEquals(oldFirstName, user.getFirstName()),
                () -> assertEquals(newFirstName, user.getFirstName()),
                () -> assertNotEquals(oldLastName, user.getLastName()),
                () -> assertEquals(newLastName, user.getLastName())
        );
    }

    @Test
    void userPrimaryEmailWithWrongContactType() {
        Contact oldPrimaryEmail = new Contact(ContactType.EMAIL, "jaydoe@mail.com");
        Contact phoneContact = new Contact(ContactType.MOBILEPHONE, "01234567");

        User user = new User(oldPrimaryEmail, "Jay", "Doe");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            user.setPrimaryEmail(phoneContact);
        });
    }

    @Test
    void userPrimaryPhoneWithWrongContactType() {
        Contact oldPrimaryPhone = new Contact(ContactType.MOBILEPHONE, "01234567");
        Contact emailContact = new Contact(ContactType.EMAIL, "jaydoe@mail.com");

        User user = new User(emailContact, oldPrimaryPhone, "Jay", "Doe");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            user.setPrimaryPhone(emailContact);
        });
    }


    // Getters and Setters


    // Initialisation methods


    // Other methods


}
