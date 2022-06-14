package com.example.EJ2.Profesor.Infraestructure.ControllerProfesor;


import com.example.EJ2.Profesor.Application.UserCases.ProfesorServiceImpl;
import com.example.EJ2.Profesor.Infraestructure.DTO.InPuts.ProfesorInputDTO;
import com.example.EJ2.Profesor.Infraestructure.DTO.OutPuts.ProfesorOutFullDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddControlProf {

    @Autowired
    private ProfesorServiceImpl profServ;

    @PostMapping(value = "/addProfesor")
    public ProfesorOutFullDTO addProfesor (@RequestBody ProfesorInputDTO inputDTO) throws  Exception{
        return profServ.addProfesor(inputDTO);
    }
}
