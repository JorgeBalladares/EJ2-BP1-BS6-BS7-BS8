package com.example.EJ2.Signature.infraestructure.dto.Outputs;

import com.example.EJ2.Student.infraestructure.dto.StudentOutputDTOFull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class OutFullSignatureDTO {

    private String codAsignatura;

    private StudentOutputDTOFull student;

    private String asignatura;

    private String coments;

    private Date initial_Date;

    private Date finish_date;
}
