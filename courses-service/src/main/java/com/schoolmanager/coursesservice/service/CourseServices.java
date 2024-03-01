package com.schoolmanager.coursesservice.service;

import com.schoolmanager.coursesservice.entity.CourseEntity;


import java.util.List;

public interface CourseServices {
    public List<CourseEntity> getAllCourses();

    public  CourseEntity getCourseById(Long id);

 public void createCourse(CourseEntity student);

}
