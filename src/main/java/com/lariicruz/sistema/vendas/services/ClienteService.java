package com.lariicruz.sistema.vendas.services;

import com.lariicruz.sistema.vendas.domain.Cliente;
import com.lariicruz.sistema.vendas.repository.ClienteRepository;
import com.lariicruz.sistema.vendas.services.exeption.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Cliente obj = repo.findById(id).orElse(null);

		if (obj == null)  {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipos" + Cliente.class.getName());
		}
		return obj;
	}
}
