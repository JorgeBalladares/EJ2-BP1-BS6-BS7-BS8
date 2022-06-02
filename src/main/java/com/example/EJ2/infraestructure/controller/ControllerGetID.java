package com.example.EJ2.infraestructure.controller;

import com.example.EJ2.application.PersonaImpl;
import com.example.EJ2.infraestructure.dto.PersonaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerGetID {
    @Autowired
    private PersonaImpl servicio;


    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonaDTO> getById(@PathVariable("id") int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.getByID(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
