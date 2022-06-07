package com.example.EJ2.Signature.infraestructure.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AsignaturaInputDTO {

    String id_asignatura;

    private String student;

    String asignatura;

    String coments;

    Date initial_Date;

    Date finish_date;
}
