package com.schoolmanager.studentservice.controller;

import com.schoolmanager.studentservice.entity.Student;
import com.schoolmanager.studentservice.service.StudentServices;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    StudentServices services;

    @Autowired
    public void setServices(StudentServices services) {
        this.services = services;
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) throws EntityNotFoundException {
         services.createStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return  ResponseEntity.ok(services.getAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
    return ResponseEntity.ok(services.getStudentById(id));
        }
}
