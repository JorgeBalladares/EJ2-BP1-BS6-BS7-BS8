package com.example.EJ2.Signature.Infraestructure.DTO.Outputs;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class OutSimpleSingatureDTO {

    private String codAsignatura;

    private String asignatura;

    private String coments;

    private Date initial_Date;

    private Date finish_date;

}
