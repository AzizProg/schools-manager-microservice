package com.schoolmanager.coursesservice.controller;

import com.schoolmanager.coursesservice.entity.CourseEntity;
import com.schoolmanager.coursesservice.service.CourseServices;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    CourseServices services;

    @Autowired
    public void setServices(CourseServices services) {
        this.services = services;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCourse(@RequestBody CourseEntity student) throws EntityNotFoundException {
         services.createCourse(student);
    }

    @GetMapping
    public ResponseEntity<List<CourseEntity>> getAllCourses(){
        return  ResponseEntity.ok(services.getAllCourses());
    }

    @GetMapping("/{id_course}")
    public ResponseEntity<CourseEntity> getCourseById(@PathVariable(name = "id_course") Long id){
    return ResponseEntity.ok(services.getCourseById(id));
        }
}
