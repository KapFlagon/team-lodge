package com.kapflagon.teamlodge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClubUnitTests {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void createClub() {
        String clubName = "Blue Lions United";
        Club club = new Club(clubName);

        assertAll(
                () -> assertNotNull(club),
                () -> assertEquals(clubName, club.getName())
        );
    }

    @Test
    void changeClubName() {
        String oldClubName = "Blue Lions United";
        String newClubName = "";
        Club club = new Club(oldClubName);

        club.setName(newClubName);

        assertAll(
                () -> assertNotEquals(oldClubName, club.getName()),
                () -> assertEquals(newClubName, club.getName())
        );
    }


}
