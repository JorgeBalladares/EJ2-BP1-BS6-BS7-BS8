package com.example.EJ2.Signature.Application.Implements;


import com.example.EJ2.Persona.Infraestructure.dto.Inputs.PersonaInputDTO;
import com.example.EJ2.Profesor.domain.Entities.Profesor;
import com.example.EJ2.Profesor.infraestructure.dto.OutPuts.ProfesorOutFullDTO;
import com.example.EJ2.Profesor.infraestructure.dto.OutPuts.ProfesorOutSimpleDTO;
import com.example.EJ2.Signature.Application.Service.SignatureServices;
import com.example.EJ2.Signature.domain.Entities.SignatureEntity;
import com.example.EJ2.Signature.domain.repositories.SignatureRepository;
import com.example.EJ2.Signature.infraestructure.dto.Inputs.InputSignatureDTO;
import com.example.EJ2.Signature.infraestructure.dto.Outputs.OutFullSignatureDTO;
import com.example.EJ2.Signature.infraestructure.dto.Outputs.OutSimpleSingatureDTO;
import com.example.EJ2.Student.domain.Entities.Student;
import com.example.EJ2.Student.domain.repositories.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SignatureImpl implements SignatureServices {

    @Autowired
    private StudentRepository repoStudent;
    @Autowired
    private ModelMapper model;
    @Autowired
    private SignatureRepository repoSignature;

    public OutFullSignatureDTO addSignature (InputSignatureDTO inputSignature) throws Exception {

        Optional<Student> student =  repoStudent.findById(inputSignature.getStudent());
        SignatureEntity signature = model.map(inputSignature, SignatureEntity.class);

        if(!student.isPresent()){
            throw new Exception("Para, crack");
        }

        signature.setStudent(model.map(student, Student.class));
        repoSignature.save(signature);
        return model.map(signature, OutFullSignatureDTO.class);
    }


    public Object findSignature (String id, String outputType) throws Exception {
        Optional<SignatureEntity> signaOptional = repoSignature.findById(id);
        if (!signaOptional.isPresent()){
            throw new Exception("No existe");
        }
        if(outputType.equals("full")) {
            return model.map(signaOptional, OutFullSignatureDTO.class);
        }
        else {
            return model.map(signaOptional, OutSimpleSingatureDTO.class);
        }
    }

    public List<OutSimpleSingatureDTO> getAllSignatureByID(String id) throws Exception {
        Optional<Student> s = repoStudent.findById(id);
        Student stud = model.map(s, Student.class);
        if(s.isPresent()){
            List<SignatureEntity> lista = stud.getSignatures();
            return lista.stream().map(SignatureEntity -> model.map(SignatureEntity, OutSimpleSingatureDTO.class)).collect(Collectors.toList());
        }
        throw new Exception("Estudiante no existe");
    }


}
