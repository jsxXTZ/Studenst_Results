package com.management.system.student_results.repository;

import com.management.system.student_results.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultsRepository extends JpaRepository<Results, String> {

    List<Results> findAll();
    Results save(Results results);
    void deleteById(String name);


}

