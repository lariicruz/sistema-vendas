package com.lariicruz.sistema.vendas.repository;


import com.lariicruz.sistema.vendas.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

	
	
}
																					