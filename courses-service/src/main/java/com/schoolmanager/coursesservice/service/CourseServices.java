package com.schoolmanager.studentservice.service;

import com.schoolmanager.studentservice.entity.Student;

import java.util.List;

public interface StudentServices {
    public List<Student> getAllStudent();

    public  Student getStudentById(Long id);

 public void createStudent(Student student);

}
