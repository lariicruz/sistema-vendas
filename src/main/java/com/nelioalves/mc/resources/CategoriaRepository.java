package com.nelioalves.mc.resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.mc.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,Integer> {

	
	
}
																					