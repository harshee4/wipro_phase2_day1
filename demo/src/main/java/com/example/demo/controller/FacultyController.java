package com.example.demo.controller;



import com.example.demo.entity.Faculty;
import com.example.demo.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @PostMapping
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        return ResponseEntity.ok(facultyService.addFaculty(faculty));
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<Faculty>> getFacultiesByDepartmentId(@PathVariable Long departmentId) {
        return ResponseEntity.ok(facultyService.getFacultiesByDepartmentId(departmentId));
    }

    @GetMapping("/hod/department/{departmentId}")
    public ResponseEntity<Faculty> getHodByDepartmentId(@PathVariable Long departmentId) {
        Optional<Faculty> hod = facultyService.getHodByDepartmentId(departmentId);
        return hod.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
