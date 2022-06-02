package com.example.EJ2.infraestructure.controller;

import com.example.EJ2.application.PersonaImpl;
import com.example.EJ2.domain.Persona;
import com.example.EJ2.infraestructure.dto.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class ControllerAdd {
    @Autowired
    private PersonaImpl servicio;
    @Autowired
    private ModelMapper model;

    @PostMapping(value = "/addPersona")
    public ResponseEntity<PersonaDTO> addPerson(@RequestBody @Valid PersonaDTO p1Dto) throws Exception {
        try {
            Persona p = servicio.addPersona(model.map(p1Dto, Persona.class));
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(model.map(p, PersonaDTO.class));
        }catch (Exception e){
           return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        }
    }
}
