package com.management.system.student_results.repository;

import com.management.system.student_results.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentReposiitory extends JpaRepository<Student, String> {

    List<Student> findAll();
    Student save(Student student);
    void deleteById(String name);


}
