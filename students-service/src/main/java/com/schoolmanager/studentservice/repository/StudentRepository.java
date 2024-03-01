package com.schoolmanager.studentservice.repository;

import com.schoolmanager.studentservice.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long> {
}
