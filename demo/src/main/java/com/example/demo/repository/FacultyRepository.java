package com.example.demo.repository;

import com.example.demo.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByDepartmentId(Long departmentId);
    Optional<Faculty> findByDepartmentIdAndIsHodTrue(Long departmentId);
}