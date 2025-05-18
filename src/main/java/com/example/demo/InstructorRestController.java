package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorRestController {

    @Value("${instructor.name}")
    private String instructorName;

    @Value("${instructor.department}")
    private String instructorDepartment;

    @GetMapping("/instructor")
    public String getInstructorInfo() {
        return "Instructor Name: " + instructorName +
                ",department: "    + instructorDepartment;
    }
}
