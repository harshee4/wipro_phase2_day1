package com.example.demo.service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CollrgeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public College addCollege(College college){
        return collegeRepository.save(college);
    }

    public List<College> getAllColleges(){
        return collegeRepository.findAll();
    }

    public Optional<College> getCollegeById(Long id){
        return collegeRepository.findById(id);
    }

    public void deleteCollege(Long id){
        collegeRepository.deleteById(id);
    }
}
