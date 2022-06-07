package com.example.EJ2.Persona.Infraestructure.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PersonaDTO {
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
}