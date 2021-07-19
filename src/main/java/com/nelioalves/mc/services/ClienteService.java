package com.nelioalves.mc.services;

import com.nelioalves.mc.domain.Cliente;
import com.nelioalves.mc.repository.ClienteRepository;
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
