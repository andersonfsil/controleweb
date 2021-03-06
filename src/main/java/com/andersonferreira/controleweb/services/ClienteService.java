package com.andersonferreira.controleweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonferreira.controleweb.domain.Cliente;
import com.andersonferreira.controleweb.repositories.ClienteRepository;
import com.andersonferreira.controleweb.services.exceptions.ObjectNotFoundException;;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: "+ id + ", Tipo: " + Cliente.class.getName()));
		
	}

}
