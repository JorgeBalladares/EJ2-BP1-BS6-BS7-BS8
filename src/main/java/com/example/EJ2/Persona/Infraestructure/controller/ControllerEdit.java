package com.example.EJ2.Persona.Infraestructure.controller;


import com.example.EJ2.Exception.Customizer.UnprocesableException;
import com.example.EJ2.Persona.Application.Implements.PersonaImpl;
import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEdit {
    @Autowired
    private PersonaImpl servicio;
    @Autowired
    private ModelMapper model;

    @PutMapping("/asignacion/{id}")
    public ResponseEntity<PersonaDTO> modPerson(@PathVariable("id") int id, @RequestBody PersonaDTO person) throws Exception {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.updPerson(id,person));
        }catch (Exception e){
            //return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
            throw new UnprocesableException("Valores válidos");
        }
    }

}
