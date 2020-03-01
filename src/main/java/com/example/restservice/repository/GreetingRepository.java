package com.example.restservice.repository;

import com.example.restservice.model.Greeting;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}