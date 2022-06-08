package com.example.EJ2.Student.application.Implements;

import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Persona.Domain.repositories.PersonaRepository;
import com.example.EJ2.Profesor.domain.Entities.Profesor;
import com.example.EJ2.Profesor.domain.repositories.ProfesorRepository;
import com.example.EJ2.Student.application.Services.StudentService;
import com.example.EJ2.Student.domain.Entities.Student;
import com.example.EJ2.Student.domain.repositories.StudentRepository;
import com.example.EJ2.Student.infraestructure.dto.StudentOutputDTOFull;
import com.example.EJ2.Student.infraestructure.dto.StudentInputDTO;
import com.example.EJ2.Student.infraestructure.dto.StudentSimpleDTO;
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


    public StudentOutputDTOFull addStudent(StudentInputDTO inputDTO) throws Exception {
        Optional<Profesor> profe = repoProf.findById(inputDTO.getProfesor());
        Optional<Persona> persona = repoPerson.findById(Integer.parseInt(inputDTO.getPersona()));
        Student s = model.map(inputDTO, Student.class);
        if (!profe.isPresent()) {
            throw new Exception("PARA, CRACK");
        }
        if(!persona.isPresent()) {
            throw new Exception("PARA, CRACK");
        }
        CheckRoll(model.map(persona, Persona.class)); //Comprobación previa si esta asignado el id ya a otro objeto
        s.setPersona(model.map(persona, Persona.class));
        s.setProfesor(model.map(profe, Profesor.class));
        repoStudent.save(s);
        return model.map(s, StudentOutputDTOFull.class);
    }

    public Object findId (String id, String outputType) throws Exception {
                Optional<Student> student = repoStudent.findById(id);
        if (!student.isPresent()){
            throw new Exception("No existe");
        }
        if(outputType.equals("full")) {
            return model.map(student, StudentOutputDTOFull.class);
        }
        else {
            return model.map(student, StudentSimpleDTO.class);
        }
    }

    /*----Procedimiento para comprobar si existe ya una asignacion al id,
    se establece en la entidad persona la relacion
                    @onetoone(mapped...)-------*/
    public void CheckRoll (Persona person) throws Exception {
        if (person.getRolProfesor()!=null){
            throw new Exception("Persona asignada a un profesor");
        }
        else if(person.getRolEstudiante()!=null){
            throw new Exception("Persona asignada a un estudiante");
        }
        else{
            System.out.println("añadidos");
        }
    }
}




