package com.example.nnit_solutions.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class NNITEntity {

    private Long id;
    private String name;
    private String course;
    private Long age;
    private double fees;
}
