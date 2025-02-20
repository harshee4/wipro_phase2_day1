package com.example.demo.service;



import com.example.demo.entity.Faculty;
import com.example.demo.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public List<Faculty> getFacultiesByDepartmentId(Long departmentId) {
        return facultyRepository.findByDepartmentId(departmentId);
    }

    public Optional<Faculty> getHodByDepartmentId(Long departmentId) {
        return facultyRepository.findByDepartmentIdAndIsHodTrue(departmentId);
    }
}