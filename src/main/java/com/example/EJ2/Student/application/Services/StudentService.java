package com.example.EJ2.Student.application.Services;

import com.example.EJ2.Student.infraestructure.dto.Student.StudentDTOFull;
import com.example.EJ2.Student.infraestructure.dto.Student.StudentInputDTO;

public interface StudentService {
    public StudentDTOFull addStudent(StudentInputDTO inputDTO) throws Exception;
}
