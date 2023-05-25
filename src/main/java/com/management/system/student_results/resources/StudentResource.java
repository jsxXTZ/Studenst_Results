package com.management.system.student_results.resources;

import com.management.system.student_results.service.AddNewStudentService;
import com.management.system.student_results.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentResource {

    @Autowired
    public AddNewStudentService addNewStudentService;
    @GetMapping("/retrieve-students")
    public List<Student> retrieveStudents(){
        List<Student> student = new ArrayList<Student>();
        student = addNewStudentService.retrieveStudents();
        return student;
    }

    @DeleteMapping("/delete-student/{name}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String name){
        List<Student> student = new ArrayList<Student>();
        addNewStudentService.deleteStudent(name);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/add-new-student/{name}")
    public ResponseEntity<Void> addNewStudent(
            @PathVariable String name, @RequestBody Student student){
        addNewStudentService.addNewStudent(name, student);
        return ResponseEntity.noContent().build();
    }
}
