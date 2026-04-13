package com.biblioteca.Biblioteca;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		dotenv.entries().forEach(e ->
				System.setProperty(e.getKey(), e.getValue())
		);
		SpringApplication.run(BibliotecaApplication.class, args);
	}
}
