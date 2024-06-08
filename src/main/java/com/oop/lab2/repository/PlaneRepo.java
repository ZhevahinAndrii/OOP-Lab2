package com.oop.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.oop.lab2.entity.Plane;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaneRepo extends JpaRepository<Plane, String> {
    Optional<List<Plane>> findByModel(String model);
    @Modifying
    @Query("DELETE Flight f WHERE f.planeId = ?1")
    void cascadeDelete(String Id);
}