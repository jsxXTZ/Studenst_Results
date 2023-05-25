package com.management.system.student_results;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @RequestMapping("/add-new-student")
    public String getMethod() {
        Map<String, String> map= new HashMap<>();
        return "StudentAdded";
    }
}
