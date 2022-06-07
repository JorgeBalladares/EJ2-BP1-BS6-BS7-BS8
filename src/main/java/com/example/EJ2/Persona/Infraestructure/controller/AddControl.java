package com.example.EJ2.Persona.Infraestructure.controller;


import com.example.EJ2.Persona.Application.Implementaciones.PersonaImpl;
import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AddControl {
    @Autowired
    private PersonaImpl servicio;
    @Autowired
    private ModelMapper model;


    @PostMapping(value = "/addPersona")
    //Al haber etiqueta Valid recogera el error 400 del HandlerControlAdvice y si se comenta esta clase genera error 500
    //ya que no sabe que error recoger y envía el genérico. Es algo raro de entender
    public ResponseEntity<PersonaDTO> addPerson(@RequestBody @Valid PersonaDTO p1Dto) throws Exception {
        //try {
        Persona p = servicio.addPersona(model.map(p1Dto, Persona.class));
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(model.map(p, PersonaDTO.class));
        //}catch (Exception e) {
        // return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        //}
    }


}


