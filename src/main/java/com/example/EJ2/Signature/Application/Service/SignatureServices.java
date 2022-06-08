package com.example.EJ2.Signature.Application.Service;

import com.example.EJ2.Signature.infraestructure.dto.Inputs.InputSignatureDTO;
import com.example.EJ2.Signature.infraestructure.dto.Outputs.OutFullSignatureDTO;

public interface SignatureServices {

    public OutFullSignatureDTO addSignature (InputSignatureDTO inputSignature) throws Exception;

    public Object findSignature (String id, String outputType) throws Exception;
}
