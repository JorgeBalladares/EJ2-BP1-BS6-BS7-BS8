package com.example.EJ2.infraestructure.controller;

import com.example.EJ2.application.PersonaImpl;
import com.example.EJ2.infraestructure.dto.PersonaDTO;
import com.example.EJ2.infraestructure.repository.PersonaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ControllerEdit {

    @Autowired
    private PersonaImpl servicio;
    @Autowired
    private ModelMapper model;

    @PutMapping("/asignacion/{id}")
    public ResponseEntity<PersonaDTO> modPerson(@PathVariable("id") int id, @RequestBody @Valid PersonaDTO personadto) throws Exception {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.updPerson(id,personadto));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        }
    }

}
