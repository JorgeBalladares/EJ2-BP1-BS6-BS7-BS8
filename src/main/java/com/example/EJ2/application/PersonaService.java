package com.example.EJ2.application;

import com.example.EJ2.domain.Persona;
import com.example.EJ2.infraestructure.dto.PersonaDTO;
import java.util.List;

public interface PersonaService {
        public Persona addPerson(Persona persona);
        public PersonaDTO getByID(int ID);
        public List<PersonaDTO> getPersonByName (String name);
        public PersonaDTO updPerson (int id, PersonaDTO personaDTO);
        public void deleteObj(int id);


}
