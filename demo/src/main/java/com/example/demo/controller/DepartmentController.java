package com.example.demo.controller;



import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.addDepartment(department));
    }

    @GetMapping("/college/{collegeId}")
    public ResponseEntity<List<Department>> getDepartmentsByCollegeId(@PathVariable Long collegeId) {
        return ResponseEntity.ok(departmentService.getDepartmentsByCollegeId(collegeId));
    }
}