package com.example.EJ2.Persona.Infraestructure.Controller;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient (url = "http://localhost:8081/prof/{id}?outputType=full")
@RequestMapping("/profesor/")

public interface FeignController {





}
