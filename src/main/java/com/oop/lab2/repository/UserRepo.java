package com.oop.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.oop.lab2.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    Optional<User> findUserByEmail(String email);

    @Query("SELECT u.password FROM User u WHERE u.Id = ?1")
    Optional<String> getPasswordById(String Id);
}