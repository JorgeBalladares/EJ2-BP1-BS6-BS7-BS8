package com.example.EJ2.Student.Infraestructure.ControllerStudent;

import com.example.EJ2.Student.Application.UserCase.StudentServiceImpl;
import com.example.EJ2.Student.Infraestructure.dto.StudentSimpleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RemoveSignatureController {

    @Autowired
    StudentServiceImpl servStudent;


    @PostMapping(value = "/remove/{idSignature}/{id}")
    public StudentSimpleDTO removeSigna (@PathVariable("idSignature") String idSignature, @PathVariable("id") String id) throws Exception {
        return servStudent.removeSignature(idSignature, id);
    }

}
