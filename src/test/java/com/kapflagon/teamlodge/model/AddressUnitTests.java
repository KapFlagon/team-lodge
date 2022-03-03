package com.kapflagon.teamlodge.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AddressUnitTests {


    // Variables
    private List<String> address_A_lines = new ArrayList<>();
    private String address_A_line_1 = "Apartment 12";
    private String address_A_line_2 = "Grand Coliseum Apartments";
    private String address_A_line_3 = "Main St.";
    private String address_A_city = "Cornello";
    private String address_A_region = "Eastered";
    private String address_A_postcode = "A234 431F";
    private String address_A_country = "Invisiland";

    private List<String> address_B_lines = new ArrayList<>();
    private String address_B_line_1 = "5 All Season lane";
    private String address_B_line_2 = "Charlottesonville";
    private String address_B_line_3= "";
    private String address_B_city = "Townlandia";
    private String address_B_region = "Regionia";
    private String address_B_postcode = "B567 891Z";
    private String address_B_country = "Nowheretonia";

    @BeforeEach
    void setupAddressLines() {
        address_A_lines.add(address_A_line_1);
        address_A_lines.add(address_A_line_2);
        address_A_lines.add(address_A_line_3);
        address_B_lines.add(address_B_line_3);
        address_B_lines.add(address_B_line_1);
        address_B_lines.add(address_B_line_2);
    }

    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void createAddress() {
        Address address = new Address(
                address_A_lines,
                address_A_city,
                address_A_region,
                address_A_postcode,
                address_A_country
        );

        assertAll(
                () -> assertNotNull(address, "Address is null"),
                () -> assertEquals(address_A_lines, address.getAddressLines()),
                () -> assertEquals(address_A_city, address.getCity()),
                () -> assertEquals(address_A_region, address.getRegion()),
                () -> assertEquals(address_A_postcode, address.getPostCode()),
                () -> assertEquals(address_A_country, address.getCountry())
        );
    }

    @Test
    void changeAddress() {
        Address address = new Address(
                address_A_lines,
                address_A_city,
                address_A_region,
                address_A_postcode,
                address_A_country
        );

        address.setAddressLines(address_B_lines);
        address.setCity(address_B_city);
        address.setRegion(address_B_region);
        address.setPostCode(address_B_postcode);
        address.setCountry(address_B_country);

        assertAll(
                () -> assertNotNull(address, "Address is null"),
                () -> assertNotEquals(address_A_lines, address.getAddressLines()),
                () -> assertNotEquals(address_A_city, address.getCity()),
                () -> assertNotEquals(address_A_region, address.getRegion()),
                () -> assertNotEquals(address_A_postcode, address.getPostCode()),
                () -> assertNotEquals(address_A_country, address.getCountry()),
                () -> assertEquals(address_B_lines, address.getAddressLines()),
                () -> assertEquals(address_B_city, address.getCity()),
                () -> assertEquals(address_B_region, address.getRegion()),
                () -> assertEquals(address_B_postcode, address.getPostCode()),
                () -> assertEquals(address_B_country, address.getCountry())
        );
    }


}
