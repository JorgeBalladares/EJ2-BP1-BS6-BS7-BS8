package com.example.EJ2.Student.infraestructure.dto.Student;


import com.example.EJ2.Profesor.domain.Entities.Profesor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentOutputDTO {

    private String id_student;
    private int num_hours_week;
    private Profesor profesor;
    private String branch;




}
