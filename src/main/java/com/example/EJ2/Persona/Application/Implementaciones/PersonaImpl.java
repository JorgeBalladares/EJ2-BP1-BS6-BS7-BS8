package com.example.EJ2.Persona.Application.Implementaciones;


import com.example.EJ2.Exception.Customizer.UnprocesableException;
import com.example.EJ2.Persona.Application.Services.PersonaService;
import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Persona.Domain.repositories.PersonaRepository;
import com.example.EJ2.Persona.Infraestructure.dto.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepositorio ;
    @Autowired
    private ModelMapper modelMapper;
    List<Persona> listaPerson ;


    public Persona addPersona(Persona persona) throws Exception {
        if (persona.getUsuario() == null || persona.getPassword() == null || persona.getName() == null || persona.getCompany_mail() == null
                ||persona.getPersonal_email() == null ||persona.getCity() == null ||
                persona.getActive() == null ||persona.getCreated_date() == null){throw new Exception("Faltan campos imprescindibles");}
        if (persona.getUsuario().length() > 10){throw new UnprocesableException("Valores no válidos");}

        else return personaRepositorio.save(persona);
    }


    public PersonaDTO getByID(int ID) throws Exception {
        Optional<Persona> person = personaRepositorio.findById(ID);
        if (person.isPresent()){
            return modelMapper.map(person,PersonaDTO.class);
        }
        throw new Exception("Usuario no encontrado");
    }

    public List<PersonaDTO> getPersonByName (String name){
        listaPerson = personaRepositorio.findByName(name);
        return listaPerson.stream()
                .map(Persona -> modelMapper.map(Persona, PersonaDTO.class))
                .collect(Collectors.toList());
    }

    public PersonaDTO updPerson (int id, PersonaDTO personaDTO) throws Exception {
        listaPerson = personaRepositorio.findAll();
        PersonaDTO dto;
        Persona personaNoDto=null;
        for (Persona person : listaPerson) {
            if (person.getId() == (id)) {
                personaNoDto = person;
            }
        }
        if(personaNoDto==null){
            throw new Exception("null");
        }
        else{
            personaNoDto.setId(id);
            personaNoDto.setUsuario(personaDTO.getUsuario());
            personaNoDto.setPassword(personaDTO.getPassword());
            personaNoDto.setName(personaDTO.getName());
            personaNoDto.setSurname(personaDTO.getSurname());
            personaNoDto.setCompany_mail(personaDTO.getCompany_mail());
            personaNoDto.setPersonal_email(personaDTO.getPersonal_email());
            personaNoDto.setCity(personaDTO.getCity());
            personaNoDto.setActive(personaDTO.getActive());
            personaNoDto.setCreated_date(personaDTO.getCreated_date());
            personaNoDto.setImagen_url(personaDTO.getImagen_url());
            personaNoDto.setTermination_date(personaDTO.getTermination_date());
            personaRepositorio.save(personaNoDto);
            dto = modelMapper.map(personaRepositorio.findById(id), PersonaDTO.class);
            return dto;
        }
    }

    public List<PersonaDTO> getTotalList() throws Exception {
        List<Persona> lista = personaRepositorio.findAll();

        if (lista!=null){
            return lista.stream()
                    .map(Persona -> modelMapper.map(Persona, PersonaDTO.class))
                    .collect(Collectors.toList());
        }
        throw new Exception("Lista vacía");
    }

    public void deleteObj(int id) throws Exception {
        personaRepositorio.deleteById(id);
    }

}
