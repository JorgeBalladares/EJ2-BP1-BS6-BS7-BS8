package com.example.EJ2.Profesor.infraestructure.dto.OutPuts;

import com.example.EJ2.Persona.Infraestructure.dto.Inputs.PersonaInputDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfesorOutFullDTO {

    private String id_profesor;
    private PersonaInputDTO persona;
    private String coments;
    private String branch;


}
