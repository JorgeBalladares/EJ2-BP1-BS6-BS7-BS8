package com.example.EJ2.Persona.Infraestructure.DTO.Outputs;

import com.example.EJ2.Profesor.Infraestructure.DTO.OutPuts.ProfesorOutSimpleDTO;
import com.example.EJ2.Student.Infraestructure.dto.StudentSimpleDTO;
import lombok.Data;

import java.util.Date;

@Data
public class PersonProfDTOOut {

    private int id;
    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_mail;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;
    private ProfesorOutSimpleDTO profesor;
    private StudentSimpleDTO student;
}
