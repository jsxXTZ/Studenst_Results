package com.management.system.student_results.service;

import com.management.system.student_results.entity.Course;
import com.management.system.student_results.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddNewCourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> retrieveCourses(){
        return courseRepository.findAll();
    }

    public void deleteCourse(String name) {
        System.out.println("name printed" + name);
        courseRepository.deleteById(name);
        return;
    }

    public void addNewCourse(String name, Course course) {
        System.out.println("student" + course);
        courseRepository.save(course);
    }
}
