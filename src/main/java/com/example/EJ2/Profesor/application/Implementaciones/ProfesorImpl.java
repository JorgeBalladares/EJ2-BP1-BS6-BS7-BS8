package com.example.EJ2.Profesor.application.Implementaciones;



import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Persona.Domain.repositories.PersonaRepository;
import com.example.EJ2.Profesor.application.Services.ProfesorService;
import com.example.EJ2.Profesor.domain.Entities.Profesor;
import com.example.EJ2.Profesor.domain.repositories.ProfesorRepository;
import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorInputDTO;
import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorOutDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfesorImpl implements ProfesorService {
    @Autowired
    private ProfesorRepository repoProf;
    @Autowired
    private ModelMapper model;
    @Autowired
    private PersonaRepository repoPerson;


    public ProfesorOutDTO addProfesor(ProfesorInputDTO inputDTO) throws Exception {
        Optional<Persona> persona = repoPerson.findById(Integer.parseInt(inputDTO.getPersona()));
        if (persona.isPresent()){
            Profesor p = model.map(inputDTO, Profesor.class);
            p.setPersona(model.map(persona, Persona.class));
            repoProf.save(p);
            return model.map(p, ProfesorOutDTO.class);
        }
        throw new Exception("kases crack, para");
    }



}
