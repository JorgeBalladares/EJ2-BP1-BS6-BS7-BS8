package com.example.EJ2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaImpl {

    @Autowired
    PersonaRepository personaRepositorio;

    public Persona addPersona(Persona persona) throws Exception {
        if (persona.getUsuario() == null || persona.getPassword() == null || persona.getName() == null || persona.getCompany_mail() == null
                ||persona.getPersonal_email() == null ||persona.getCity() == null ||persona.getActive() == null ||persona.getCreated_date() == null){throw new Exception("Faltan campos imprescindibles");}
        if (persona.getUsuario().length() > 10){throw new Exception("El campo usuario no puede contener mas de 10 digitos");}

        else return personaRepositorio.save(persona);
    }

}
