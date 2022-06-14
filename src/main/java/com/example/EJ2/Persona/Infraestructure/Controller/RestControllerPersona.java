package com.example.EJ2.Persona.Infraestructure.Controller;

import com.example.EJ2.Profesor.Domain.Entities.Profesor;
import com.example.EJ2.Profesor.Infraestructure.DTO.OutPuts.ProfesorOutFullDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestControllerPersona {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ModelMapper model;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ProfesorOutFullDTO getApi (@PathVariable ("id") String id,
                                      @RequestParam(name = "outputType", defaultValue = "simple") String outputType){
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", "outputType");
        //restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8081/"));
        Profesor profesor = restTemplate.getForObject("http://localhost:8080/prof/AUS00000001?outputType=full", Profesor.class, pathVariables);
        return model.map(profesor, ProfesorOutFullDTO.class);
    }

}
