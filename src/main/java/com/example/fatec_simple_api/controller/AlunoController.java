package com.example.fatec_simple_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@Tag(name = "Alunos", description = "Endpoint para consulta de alunos")
public class AlunoController {

    @GetMapping()
    @Operation(summary = "Lista todos os alunos", description = "Retorna uma lista fixa de nomes de alunos.")
    public List<String> getAlunos() {
        // Retornando um vetor (lista) simples de nomes
        return Arrays.asList("João da Silva", "Maria Oliveira", "Pedro Martins","Éric Pinheiro");
    }
}
