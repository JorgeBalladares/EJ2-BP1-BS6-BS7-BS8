package com.example.EJ2.Profesor.infraestructure.dto.Profesor;

import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfesorOutDTO {

    private String id_profesor;

    private PersonaDTO persona;

    private String coments;

    private String branch;


}
