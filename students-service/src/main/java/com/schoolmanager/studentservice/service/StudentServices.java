package com.schoolmanager.studentservice.service;

import com.schoolmanager.studentservice.entity.Students;

import java.util.List;

public interface StudentServices {
    public List<Students> getAllStudent();

    public Students getStudentById(Long id);

 public void createStudent(Students students);

}
