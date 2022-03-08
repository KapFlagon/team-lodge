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

    @Test
    void changeTeamOwner() {
        User oldOwner = new User( new Contact( ContactType.EMAIL, "0123456"), "Jay", "Doe");
        User newOwner = new User( new Contact( ContactType.EMAIL, "7891012"), "Sam", "Din");
        Team team = new Team("Seniors Division 2", oldOwner);
        team.setOwner(newOwner);

        assertAll(
                () -> assertNotEquals(oldOwner, team.getOwner()),
                () -> assertEquals(newOwner, team.getOwner())
        );
    }

    @Test
    void changeTeamName() {
        User owner = new User( new Contact( ContactType.EMAIL, "0123456"), "Jay", "Doe");
        String oldTeamName = "Seniors Division 2";
        String newTeamName = "Juniors Division 1";
        Team team = new Team(oldTeamName, owner);
        team.setName(newTeamName);

        assertAll(
                () -> assertNotEquals(oldTeamName, team.getName()),
                () -> assertEquals(newTeamName, team.getName())
        );
    }

}
