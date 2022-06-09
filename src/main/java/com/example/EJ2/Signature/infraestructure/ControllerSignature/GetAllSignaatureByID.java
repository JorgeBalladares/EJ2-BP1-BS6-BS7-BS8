package com.example.EJ2.Signature.infraestructure.ControllerSignature;

import com.example.EJ2.Signature.Application.Implements.SignatureImpl;
import com.example.EJ2.Signature.infraestructure.dto.Outputs.OutSimpleSingatureDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllSignaatureByID {
    @Autowired
    SignatureImpl servSign;

    @GetMapping("/signature/student/{id}")
    public List<OutSimpleSingatureDTO> getAllSignatureByID(@PathVariable("id") String id) throws Exception {
        return servSign.getAllSignatureByID(id);
    }
}
