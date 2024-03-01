package com.schoolmanager.studentservice.controller;

import com.schoolmanager.studentservice.entity.Students;
import com.schoolmanager.studentservice.service.StudentServices;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Students students) throws EntityNotFoundException {
         services.createStudent(students);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Students>> getAllStudents(){
        return  ResponseEntity.ok(services.getAllStudent());
    }

    @GetMapping("/get/{id_student}")
    public ResponseEntity<Students> getStudentById(@PathVariable(name ="id_student" ) Long id){
    return ResponseEntity.ok(services.getStudentById(id));
        }
}
