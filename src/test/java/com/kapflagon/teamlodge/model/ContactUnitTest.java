package com.kapflagon.teamlodge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactUnitTest {


    // Variables
    private String email = "jaydoe@teamlodge.com";
    private String number = "01234567";


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods

    @Test
    void createEmailContact() {
        Contact contact = new Contact(ContactType.EMAIL, email);
        assertAll(
                () -> assertNotNull(contact,"Contact is null"),
                () -> assertEquals(ContactType.EMAIL, contact.getType()),
                () -> assertEquals(email, contact.getDetail())
        );
    }

    @Test
    void createMobilePhoneContact() {
        Contact contact = new Contact(ContactType.MOBILEPHONE, number);
        assertAll(
                () -> assertNotNull(contact,"Contact is null"),
                () -> assertEquals(ContactType.MOBILEPHONE, contact.getType()),
                () -> assertEquals(number, contact.getDetail())
        );
    }

    @Test
    void changeContactTypeAndDetail() {
        Contact contact = new Contact(ContactType.LANDLINEPHONE, number);
        contact.setType(ContactType.EMAIL);
        contact.setDetail(email);

        assertAll(
                () -> assertNotNull(contact,"Contact is null"),
                () -> assertNotEquals(ContactType.LANDLINEPHONE, contact.getType()),
                () -> assertEquals(ContactType.EMAIL, contact.getType()),
                () -> assertNotEquals(number, contact.getDetail()),
                () -> assertEquals(email, contact.getDetail())
        );
    }

}
