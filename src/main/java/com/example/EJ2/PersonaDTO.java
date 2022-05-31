package com.example.EJ2;

import lombok.Data;
import java.util.Date;

@Data
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
