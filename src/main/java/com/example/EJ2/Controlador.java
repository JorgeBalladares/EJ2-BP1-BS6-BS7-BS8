package com.example.EJ2;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class Controlador {

    @Autowired
    PersonaImpl servicio;
    @Autowired
    ModelMapper model;
    @Autowired
    PersonaRepository repo;

    @PostMapping(value = "/addPersona")
    public PersonaDTO addPerson(@RequestBody PersonaDTO p1Dto) throws Exception {
       Persona persona = servicio.addPersona(model.map(p1Dto, Persona.class));
        p1Dto.setId(persona.getId());
       return p1Dto;
    }
    @GetMapping(value = "/{id}")
    public Optional<PersonaDTO> getById(@PathVariable("id") Integer id){
        PersonaDTO p = model.map(repo.findById(id), PersonaDTO.class);
        return Optional.ofNullable(p);
    }
    /*
    @GetMapping(value = "/nombre/{name}")
    public List<PersonaDTO> getByName(@PathVariable("name") String name){
       List<Persona> lista = repo.findByName(name);
        List<PersonaDTO> lista2 = new ArrayList<>();
        for (int i = 0; i<lista.size(); i++){
            lista2.add(model.map(lista.get(i), PersonaDTO.class));
        }
       //lista.add(p1);
        return lista2;
    }*/
    @GetMapping(value = "/nombre1/{name}")
    public List<PersonaDTO> getByName(@PathVariable("name") String name){
        List<Persona> lista = repo.findByName(name);
        return lista.stream()
                .map(Persona -> model.map(Persona, PersonaDTO.class))
                .collect(Collectors.toList());
    }
    @GetMapping(value = "/allDisplay")
    public List<PersonaDTO> getAllData(){
        List<Persona> lista = repo.findAll();
        return lista.stream()
                .map(Persona -> model.map(Persona, PersonaDTO.class))
                .collect(Collectors.toList());
    }

}
