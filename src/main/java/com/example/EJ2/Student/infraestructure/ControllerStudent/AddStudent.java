package com.example.EJ2.Student.infraestructure.ControllerStudent;

import com.example.EJ2.Student.application.Implements.StudentImpl;
import com.example.EJ2.Student.infraestructure.dto.StudentOutputDTOFull;
import com.example.EJ2.Student.infraestructure.dto.StudentInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddStudent {

    @Autowired
    private StudentImpl servStudent;

    @PostMapping(value = "/addStudent")
    public StudentOutputDTOFull addStudent (@RequestBody StudentInputDTO StuInputDTO) throws Exception {
        return servStudent.addStudent(StuInputDTO);
    }

}
