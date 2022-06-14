package com.example.EJ2.Student.Application.Services;

import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Student.Infraestructure.dto.StudentOutputDTOFull;
import com.example.EJ2.Student.Infraestructure.dto.StudentInputDTO;

public interface StudentService {
    public StudentOutputDTOFull addStudent(StudentInputDTO inputDTO) throws Exception;
    public Object findId (String id, String outputType) throws Exception;
    public void CheckRoll (Persona person) throws Exception;
}
