package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/livros/{id}")
@RestController
public class LivroExemplarController {
    private final ExemplarService exemplarService;



    @Autowired
    public LivroExemplarController (ExemplarService exemplarService) {
        this.exemplarService = exemplarService;
    }

    @PostMapping("/exemplar/{quantidade}")
    public ResponseEntity<List<ExemplarDto>> criarExemplares(@PathVariable int quantidade, @RequestBody ExemplarDto exemplarDto) {
        List<ExemplarDto> exemplaresCriados = exemplarService.criarExemplares(exemplarDto, quantidade);

        return ResponseEntity.ok(exemplaresCriados);
    }
}
