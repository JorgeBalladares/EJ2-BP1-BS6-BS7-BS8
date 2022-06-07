package com.example.EJ2.Student.infraestructure.dto.Student;


import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;
import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorOutDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentDTOFull {

    private String id_student;
    private PersonaDTO persona;
    private int num_hours_week;
    private ProfesorOutDTO profesor;
    private String branch;


}
