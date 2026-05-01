package com.biblioteca.Biblioteca.exception;

import com.biblioteca.Biblioteca.exception.exceptions.LivroNaoCriadoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LivroNaoCriadoException.class)
    public ResponseEntity<String> handleLivroNaoCriado(LivroNaoCriadoException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
