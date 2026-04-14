package com.biblioteca.Biblioteca.exception;

import com.biblioteca.Biblioteca.exception.exceptions.LivroJaExisteException;
import com.biblioteca.Biblioteca.exception.exceptions.LivroNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(LivroJaExisteException.class)
    public ResponseEntity<String> handleNotFound(LivroJaExisteException ex) {

        String erro = ex.getMessage();

        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }
    @ExceptionHandler
    public ResponseEntity<String> handleNotFound(LivroNaoEncontradoException ex) {
        String erro = ex.getMessage();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }

}
