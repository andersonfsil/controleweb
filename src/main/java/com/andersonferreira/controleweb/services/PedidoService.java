package com.andersonferreira.controleweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonferreira.controleweb.domain.Pedido;
import com.andersonferreira.controleweb.repositories.PedidoRepository;
import com.andersonferreira.controleweb.services.exceptions.ObjectNotFoundException;;


@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: "+ id + ", Tipo: " + Pedido.class.getName()));
		
	}

}
