package com.andersonferreira.controleweb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andersonferreira.controleweb.domain.Categoria;
import com.andersonferreira.controleweb.repositories.CategoriaRepository;

@SpringBootApplication
public class ControleWebApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ControleWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		//categoriaRepository.save(cat1);
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}
	
	
}
