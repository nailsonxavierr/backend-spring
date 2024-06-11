package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstore.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
