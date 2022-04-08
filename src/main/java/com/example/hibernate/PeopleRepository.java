package com.example.hibernate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {

    List<People> findByNameStartsWith(String namePrefix);
}
