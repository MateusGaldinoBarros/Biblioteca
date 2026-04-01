package com.biblioteca.Biblioteca.exception.exceptions;

public class LivroJaExisteException extends RuntimeException {
    public LivroJaExisteException(String message) {
        super(message);
    }
}
