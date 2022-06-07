package com.example.EJ2.Student.application.Implementaciones;


import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Persona.Domain.repositories.PersonaRepository;
import com.example.EJ2.Profesor.domain.Entities.Profesor;
import com.example.EJ2.Profesor.domain.repositories.ProfesorRepository;
import com.example.EJ2.Student.application.Services.StudentService;
import com.example.EJ2.Student.domain.Entities.Student;
import com.example.EJ2.Student.domain.repositories.StudentRepository;
import com.example.EJ2.Student.infraestructure.dto.Student.StudentDTOFull;
import com.example.EJ2.Student.infraestructure.dto.Student.StudentInputDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository repoStudent;
    @Autowired
    private ModelMapper model;
    @Autowired
    private PersonaRepository repoPerson;
    @Autowired
    private ProfesorRepository repoProf;


    public StudentDTOFull addStudent(StudentInputDTO inputDTO) throws Exception {

        Optional<Profesor> profe = repoProf.findById(inputDTO.getProfesor());
        Optional<Persona> persona = repoPerson.findById(Integer.parseInt(inputDTO.getPersona()));
        Student s = model.map(inputDTO, Student.class);
        if (!profe.isPresent()) {
            throw new Exception("PARA, CRACK");
        }
        if(!persona.isPresent()) {
            throw new Exception("PARA, CRACK");
        }
        s.setPersona(model.map(persona, Persona.class));
        s.setProfesor(model.map(profe, Profesor.class));
        repoStudent.save(s);
        return model.map(s, StudentDTOFull.class);
    }


}




