package com.example.EJ2.Signature.Infraestructure.ControllerSignature;

import com.example.EJ2.Signature.Application.UserCases.SignatureServiceImpl;
import com.example.EJ2.Signature.Infraestructure.DTO.Outputs.OutFullSignatureDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetSignatures {

    @Autowired
    SignatureServiceImpl servSigna;

    @GetMapping("/getAllSignatures")
    public List<OutFullSignatureDTO> getSignatures() throws Exception {
        return servSigna.getSignatures();
    }

}
