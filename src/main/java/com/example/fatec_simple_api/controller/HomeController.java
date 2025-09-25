package com.example.fatec_simple_api.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Home", description = "Endpoint de boas-vindas")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Bem-vindo a primeira aula de IEC da FATEC! E um 'OI' pra Isa <3 <3!";
    }
}
