package com.kapflagon.teamlodge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeamUnitTests {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void createTeam() {
        String teamName = "Seniors Division 2";
        String teamOwnerContactNumber = "123456";
        String teamOwnerFirstName = "Jay";
        String teamOwnerLastName = "Doe";

        Contact teamOwnerContact = new Contact(ContactType.EMAIL, teamOwnerContactNumber);
        User teamOwner = new User(teamOwnerContact, teamOwnerFirstName, teamOwnerLastName);
        Team team = new Team(teamName, teamOwner);

        assertAll(
                () -> assertNotNull(team, "Team is null"),
                () -> assertEquals(teamName, team.getName()),
                () -> assertEquals(teamOwner, team.getOwner())
        );
    }

}
