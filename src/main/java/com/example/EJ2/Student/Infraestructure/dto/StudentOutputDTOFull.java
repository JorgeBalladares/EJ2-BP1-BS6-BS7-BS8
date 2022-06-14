package com.example.EJ2.Student.Infraestructure.dto;


import com.example.EJ2.Persona.Infraestructure.DTO.Inputs.PersonaInputDTO;
import com.example.EJ2.Profesor.Infraestructure.DTO.OutPuts.ProfesorOutFullDTO;
import com.example.EJ2.Signature.Infraestructure.DTO.Outputs.OutSimpleSingatureDTO;
import lombok.Data;

import java.util.List;


@Data

public class StudentOutputDTOFull  {

    private String id_student;
    private PersonaInputDTO persona;
    private int num_hours_week;
    private ProfesorOutFullDTO profesor;
    private String branch;
    private List<OutSimpleSingatureDTO>signatures;

}
