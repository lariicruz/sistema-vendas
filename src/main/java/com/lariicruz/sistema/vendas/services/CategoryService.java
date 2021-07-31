package com.lariicruz.sistema.vendas.services;

import com.lariicruz.sistema.vendas.services.exeption.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lariicruz.sistema.vendas.domain.Categoria;
import com.lariicruz.sistema.vendas.repository.CategoriaRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findById(id).orElse(null);

		if (obj == null)  {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipos" + Categoria.class.getName());
		}
		return obj;
	}
}
