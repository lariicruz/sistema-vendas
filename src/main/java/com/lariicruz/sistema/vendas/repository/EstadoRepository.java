package com.lariicruz.sistema.vendas.repository;

import com.lariicruz.sistema.vendas.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {

	
	
}
																					