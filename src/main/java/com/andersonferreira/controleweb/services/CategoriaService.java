package com.andersonferreira.controleweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonferreira.controleweb.domain.Categoria;
import com.andersonferreira.controleweb.repositories.CategoriaRepository;
import com.andersonferreira.controleweb.services.exceptions.ObjectNotFoundException;;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: "+ id + ", Tipo: " + Categoria.class.getName()));
		
	}

}
