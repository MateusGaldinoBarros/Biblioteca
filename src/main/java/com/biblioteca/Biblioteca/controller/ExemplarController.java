package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.model.Exemplar;
import com.biblioteca.Biblioteca.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/exemplar")
public class ExemplarController {
    private final ExemplarService exemplarService;

    @Autowired
    public ExemplarController(ExemplarService exemplarService) {
        this.exemplarService = exemplarService;
    }

    @PostMapping()
    public ResponseEntity<Exemplar> criarExemplares(@RequestBody ExemplarDto exemplarDto, UriComponentsBuilder uriComponentsBuilder) {
        ExemplarDto exemplarCriado = exemplarService.criarExemplar(exemplarDto);


        //TODO: terminar de criar o metodo post e fazer um loop com a quantidade de exemplares
    }
}
