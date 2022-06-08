package com.example.EJ2.Student.infraestructure.dto;


import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;
import com.example.EJ2.Profesor.infraestructure.dto.OutPuts.ProfesorOutFullDTO;
import lombok.Data;


@Data

public class StudentOutputDTOFull  {

    private String id_student;
    private PersonaDTO persona;
    private int num_hours_week;
    private ProfesorOutFullDTO profesor;
    private String branch;

}
