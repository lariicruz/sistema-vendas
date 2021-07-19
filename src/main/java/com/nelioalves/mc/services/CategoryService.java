package com.nelioalves.mc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.mc.domain.Categoria;
import com.nelioalves.mc.repository.CategoriaRepository;

import javax.persistence.Id;

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
