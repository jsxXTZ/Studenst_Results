package com.management.system.student_results.service;

import com.management.system.student_results.repository.StudentReposiitory;
import com.management.system.student_results.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddNewStudentService {

    @Autowired
    private StudentReposiitory todoRepository;

    public List<Student> retrieveStudents(){
        return todoRepository.findAll();
    }

    public void deleteStudent(String name) {
        System.out.println("name printed" + name);
        todoRepository.deleteById(name);
        return;
    }

    public void addNewStudent(String name, Student student) {
        System.out.println("student" + student);
        todoRepository.save(student);
    }
}
