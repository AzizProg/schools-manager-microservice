package com.schoolmanager.coursesservice.repository;

import com.schoolmanager.coursesservice.entity.CourseEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
}
