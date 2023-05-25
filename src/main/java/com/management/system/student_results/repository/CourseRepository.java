package com.management.system.student_results.repository;

import com.management.system.student_results.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {

    List<Course> findAll();
    Course save(Course course);
    void deleteById(String name);


}