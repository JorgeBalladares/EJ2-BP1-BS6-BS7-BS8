package com.example.EJ2.Persona.Infraestructure.Controller;


import com.example.EJ2.Persona.Application.UserCases.PersonaServiceImpl;
import com.example.EJ2.Persona.Infraestructure.DTO.Inputs.PersonaInputDTO;
import com.example.EJ2.Persona.Infraestructure.DTO.Outputs.PersonaOutSimpleDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEdit {
    @Autowired
    private PersonaServiceImpl servicio;
    @Autowired
    private ModelMapper model;

    @PutMapping("/asignacion/{id}")
    public PersonaOutSimpleDTO modPerson(@PathVariable("id") int id, @RequestBody PersonaInputDTO person) throws Exception {
        return servicio.updPerson(id, person);
        //try {
            //return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.updPerson(id,person));
        //}catch (Exception e){
            //return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
          //  throw new UnprocesableException("Valores válidos");
        //}
    }

}
