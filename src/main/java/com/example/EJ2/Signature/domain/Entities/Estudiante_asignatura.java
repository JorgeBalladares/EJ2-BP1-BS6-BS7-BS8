package com.example.EJ2.Signature.domain.Entities;


import com.example.EJ2.Student.domain.Entities.Student;
import com.example.EJ2.stringgenerator.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Estudiante_asignatura")
@Getter
@Setter
public class Estudiante_asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "signatureGen")
    @GenericGenerator(
            name = "signatureGen",
            strategy = "com.example.EJ2.stringgenerator.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value =
                            "Signature"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value =
                            "%08d")
            })
    @Column(name = "id_asignatura")
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
