package com.example.EJ2.Student.infraestructure.ControllerStudent;

import com.example.EJ2.Student.application.Implementaciones.StudentImpl;
import com.example.EJ2.Student.infraestructure.dto.Student.StudentDTOFull;
import com.example.EJ2.Student.infraestructure.dto.Student.StudentInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddStudent {

    @Autowired
    StudentImpl servStudent;

    @PostMapping(value = "/addStudent")
    public StudentDTOFull addStudent (@RequestBody StudentInputDTO StuInputDTO) throws Exception {
        return servStudent.addStudent(StuInputDTO);
    }

}
