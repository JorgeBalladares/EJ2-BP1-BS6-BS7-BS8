package com.example.EJ2;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity(name = "persona")
@Data

public class Persona {
    @Id
    @GeneratedValue
    @Column(
            name = "id", updatable = false, nullable = false
    )
    private int id;
    @Column (
            name = "usuario", nullable = false, length = 10
    )
    private String usuario;
    @Column (
            name = "password", nullable = false
    )
    private String password;
    @Column (
            name = "name", nullable = false
    )
    private String name;

    @Column(
            name = "surname"
    )
    private String surname;

    @Column(
            name = "company_mail", nullable = false
    )
    private String company_mail;
    @Column(
            name = "personal_mail", nullable = false
    )
    private String personal_email;
    @Column(
            name = "city", nullable = false
    )
    private String city;
    @Column(
            name = "active", nullable = false
    )
    private Boolean active;
    @Column(
            name = "created_date", nullable = false
    )
    private Date created_date;
    @Column(
            name = "imagen_url"
    )
    private String imagen_url;
    @Column(
            name = "termination_date"
    )
    private Date termination_date;
}
