package com.oop.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.oop.lab2.entity.Race;

import java.util.List;
import java.util.Optional;

@Repository
public interface RaceRepo extends JpaRepository<Race, String> {
    Optional<List<Race>> findByDeparturePlace(String departurePlace);
    Optional<List<Race>> findByArrivalPlace(String arrivalPlace);
    @Modifying
    @Query("DELETE Flight f WHERE f.raceId = ?1")
    void cascadeDelete(String Id);
}