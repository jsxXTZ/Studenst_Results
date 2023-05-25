package com.management.system.student_results.resources;

import com.management.system.student_results.entity.Results;
import com.management.system.student_results.service.AddNewResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResultsResource {
    @Autowired
    public AddNewResultsService addNewResultsService;
    @GetMapping("/retrieve-results")
    public List<Results> retrieveResults(){
        List<Results> results = new ArrayList<Results>();
        results = addNewResultsService.retrieveResults();
        return results;
    }

    @DeleteMapping("/delete-result/{name}")
    public ResponseEntity<Void> deleteResult(@PathVariable String name){
        List<Results> results = new ArrayList<Results>();
        addNewResultsService.deleteResult(name);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/add-new-result/{name}")
    public ResponseEntity<Void> addNewResult(
            @PathVariable String name, @RequestBody Results results){
        addNewResultsService.addNewResult(name, results);
        return ResponseEntity.noContent().build();
    }
}
