package com.kapflagon.teamlodge.persistence.repositories;

import com.kapflagon.teamlodge.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClubRepository extends JpaRepository<Club, UUID> {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    Club findClubById(UUID uuid);
    Club findClubByName(String name);
    List<Club> getClubs();

}
