package com.management.system.student_results.resources;

import com.management.system.student_results.entity.Course;
import com.management.system.student_results.service.AddNewCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseResource {
    @Autowired
    public AddNewCourseService addNewCourseService;
    @GetMapping("/retrieve-course")
    public List<Course> retrieveCourse(){
        List<Course> courses = new ArrayList<Course>();
        courses = addNewCourseService.retrieveCourses();
        return courses;
    }

    @DeleteMapping("/delete-course/{name}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String name){
        List<Course> course = new ArrayList<Course>();
        addNewCourseService.deleteCourse(name);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/add-new-course/{name}")
    public ResponseEntity<Void> addNewCourse(
            @PathVariable String name, @RequestBody Course course){
        addNewCourseService.addNewCourse(name, course);
        return ResponseEntity.noContent().build();
    }
}
