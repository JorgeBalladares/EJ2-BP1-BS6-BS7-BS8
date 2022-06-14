package com.example.EJ2.Signature.Infraestructure.ControllerSignature;

import com.example.EJ2.Signature.Application.UserCases.SignatureServiceImpl;
import com.example.EJ2.Signature.Infraestructure.DTO.Inputs.InputSignatureDTO;
import com.example.EJ2.Signature.Infraestructure.DTO.Outputs.OutFullSignatureDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddControlSignature {

    @Autowired
    private SignatureServiceImpl servSignature;

    @PostMapping("/addSignature")
    public OutFullSignatureDTO addSignaure(@RequestBody InputSignatureDTO inputDTO) throws Exception {
        return servSignature.addSignature(inputDTO);
    }



}
