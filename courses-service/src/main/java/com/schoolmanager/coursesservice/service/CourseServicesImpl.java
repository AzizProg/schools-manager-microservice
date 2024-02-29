package com.schoolmanager.studentservice.service;

import com.schoolmanager.studentservice.entity.Student;
import com.schoolmanager.studentservice.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServicesImpl implements  StudentServices{

    StudentRepository repository;

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void createStudent(Student student) {
        repository.save(student);
    }
}
