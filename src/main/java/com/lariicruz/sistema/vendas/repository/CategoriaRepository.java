package com.lariicruz.sistema.vendas.repository;

import com.lariicruz.sistema.vendas.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,Integer> {

	
	
}
																					