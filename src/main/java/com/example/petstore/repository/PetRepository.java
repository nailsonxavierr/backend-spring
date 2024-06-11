package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstore.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}