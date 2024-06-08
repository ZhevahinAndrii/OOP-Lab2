package com.oop.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.oop.lab2.entity.Crewmate;

import java.util.List;
import java.util.Optional;

@Repository
public interface CrewRepo extends JpaRepository<Crewmate, String> {
    Optional<List<Crewmate>> findByName(String name);
    Optional<List<Crewmate>> findByQualification(String qualification);

    @Query("SELECT b.id FROM Brigade b")
    Optional<List<String>> getBrigadeIds();
}