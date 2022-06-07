package com.example.EJ2.Profesor.application.Services;


import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorInputDTO;
import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorOutDTO;

public interface ProfesorService {

    public ProfesorOutDTO addProfesor(ProfesorInputDTO inputDTO) throws Exception;
}
