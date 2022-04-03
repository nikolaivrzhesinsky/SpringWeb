package com.example.webspringjpa.repository;

import com.example.webspringjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
