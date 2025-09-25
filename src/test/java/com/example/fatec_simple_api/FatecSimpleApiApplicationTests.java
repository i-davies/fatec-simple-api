package com.example.fatec_simple_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FatecSimpleApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveRetornarMensagemDeBoasVindasComoStringPura() throws Exception {
        mockMvc.perform(get("/"))
                // Espera que o status da resposta seja 200 OK
                .andExpect(status().isOk())
                // Para uma String pura, o Spring costuma retornar 'text/plain'
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                // Verifica se o corpo da resposta é EXATAMENTE a string esperada
                .andExpect(content().string("Bem-vindo a primeira aula de IEC da FATEC!"));
    }

    @Test
    void deveRetornarListaDeAlunosComoStringJson() throws Exception {
        // A lista de strings é convertida pelo Spring para um array JSON
        String jsonEsperado = "[\"João da Silva\",\"Maria Oliveira\",\"Pedro Martins\"]";

        mockMvc.perform(get("/alunos"))
                // Espera que o status da resposta seja 200 OK
                .andExpect(status().isOk())
                // O tipo de conteúdo ainda é JSON
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                // Verifica se o corpo da resposta é EXATAMENTE a string JSON esperada
                .andExpect(content().string(jsonEsperado));
    }

    @Test
    void deveRetornarListaDeDisciplinasComoStringJson() throws Exception {
        // A lista de strings é convertida pelo Spring para um array JSON
        String jsonEsperado = "[\"Gestão Ágil de Projetos de Software\",\"Algoritmo e Lógica de Programação\",\"Inglês I\",\"Icaro Davies\"]";

        mockMvc.perform(get("/disciplinas"))
                // Espera que o status da resposta seja 200 OK
                .andExpect(status().isOk())
                // O tipo de conteúdo ainda é JSON
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                // Verifica se o corpo da resposta é EXATAMENTE a string JSON esperada
                .andExpect(content().string(jsonEsperado));
    }

}
