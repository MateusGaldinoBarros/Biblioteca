package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    public LivroDTO (LivroDTO dto){
        if(LivroRepository.existsByApi_external_id()){

        }
    }
}
