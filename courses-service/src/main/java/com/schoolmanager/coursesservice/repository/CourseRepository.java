package com.schoolmanager.studentservice.repository;

import com.schoolmanager.studentservice.entity.Student;
import com.schoolmanager.studentservice.service.StudentServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
