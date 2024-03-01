package com.schoolmanager.coursesservice.service;

import com.schoolmanager.coursesservice.entity.CourseEntity;
import com.schoolmanager.coursesservice.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServicesImpl implements CourseServices {

    CourseRepository repository;

    @Autowired
    public void setRepository(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return repository.findAll();
    }

    @Override
    public CourseEntity getCourseById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void createCourse(CourseEntity student) {
        repository.save(student);
    }
}
