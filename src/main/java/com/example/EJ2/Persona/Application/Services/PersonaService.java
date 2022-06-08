package com.example.EJ2.Persona.Application.Services;


import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;

import java.util.List;

public interface PersonaService {
        public PersonaDTO addPersona(PersonaDTO persona) throws Exception;
        public PersonaDTO getByID(int ID) throws Exception;
        public List<PersonaDTO> getPersonByName (String name);
        public PersonaDTO updPerson (int id, PersonaDTO personaDTO) throws Exception;
        public List<PersonaDTO> getTotalList() throws Exception;
        public void deleteObj(int id) throws Exception;

}
