package com.example.EJ2.Student.domain.Entities;


import com.example.EJ2.Persona.Domain.Entities.Persona;
import com.example.EJ2.Profesor.domain.Entities.Profesor;
import com.example.EJ2.stringgenerator.StringPrefixedSequenceIdGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentIdGen")
    @GenericGenerator(
            name = "studentIdGen",
            strategy = "com.example.EJ2.stringgenerator.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value =
                            "Stud"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value =
                            "%08d")
            })
    @Column(name = "id_student")
    String id_student;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona")
    private Persona persona;

    @Column (name = "num_hours_week")
    private Integer num_hours_week;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name = "id_profesor")
    private Profesor profesor;

    @Column (name = "branch")
    String branch;

}