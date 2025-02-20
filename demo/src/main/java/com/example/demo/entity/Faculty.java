package com.example.demo.entity;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    private boolean isHod; // Indicates if the faculty is the HOD
}