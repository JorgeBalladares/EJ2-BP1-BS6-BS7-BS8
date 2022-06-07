package com.example.EJ2.Signature.domain.Entities;


import com.example.EJ2.Student.domain.Entities.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Estudiante_asignatura")
@Getter
@Setter
public class Estudiante_asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    String id_asignatura;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name = "id_student")
    private Student student;

    @Column(name = "asignatura")
    String asignatura;

    @Column (name = "coments")
    String coments;

    @Column(name = "initial_date")
    @NotNull
    Date initial_Date;

    @Column(name = "finish_date")
    Date finish_date;
}
