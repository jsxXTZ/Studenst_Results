package com.management.system.student_results.service;

import com.management.system.student_results.entity.Results;
import com.management.system.student_results.repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddNewResultsService {

    @Autowired
    private ResultsRepository resultsRepository;

    public List<Results> retrieveResults(){
        return resultsRepository.findAll();
    }

    public void deleteResult(String name) {
        System.out.println("name printed" + name);
        resultsRepository.deleteById(name);
        return;
    }

    public void addNewResult(String name, Results results) {
        System.out.println("results" + results);
        resultsRepository.save(results);
    }
}
