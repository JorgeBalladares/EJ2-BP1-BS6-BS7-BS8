package com.example.EJ2.Signature.infraestructure.dto;

import com.example.EJ2.Student.domain.Entities.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AsignaturaOutDTO {

    String id_asignatura;

    private Student student;

    String asignatura;

    String coments;

    Date initial_Date;

    Date finish_date;
}
