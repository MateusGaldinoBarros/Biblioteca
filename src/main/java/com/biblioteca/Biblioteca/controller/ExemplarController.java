package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/exemplar")
public class ExemplarController {
    private final ExemplarService exemplarService;

    @Autowired
    public ExemplarController(ExemplarService exemplarService) {
        this.exemplarService = exemplarService;
    }

}
