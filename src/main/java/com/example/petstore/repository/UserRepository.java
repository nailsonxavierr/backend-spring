package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}