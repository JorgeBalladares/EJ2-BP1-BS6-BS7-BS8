package com.example.EJ2.Profesor.Application.Services;


import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Profesor.Infraestructure.DTO.InPuts.ProfesorInputDTO;
import com.example.EJ2.Profesor.Infraestructure.DTO.OutPuts.ProfesorOutFullDTO;

public interface ProfesorService {

    public ProfesorOutFullDTO addProfesor(ProfesorInputDTO inputDTO) throws Exception;
    public void CheckRoll (Persona person) throws Exception;
    }
