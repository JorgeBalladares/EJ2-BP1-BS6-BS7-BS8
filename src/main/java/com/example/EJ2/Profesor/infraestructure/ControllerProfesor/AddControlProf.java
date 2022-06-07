package com.example.EJ2.Profesor.infraestructure.ControllerProfesor;


import com.example.EJ2.Profesor.application.Implementaciones.ProfesorImpl;
import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorInputDTO;
import com.example.EJ2.Profesor.infraestructure.dto.Profesor.ProfesorOutDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddControlProf {

    @Autowired
    private ProfesorImpl profServ;

    @PostMapping(value = "/addProfesor")
    public ProfesorOutDTO addProfesor (@RequestBody ProfesorInputDTO inputDTO) throws  Exception{
        return profServ.addProfesor(inputDTO);
    }
}
