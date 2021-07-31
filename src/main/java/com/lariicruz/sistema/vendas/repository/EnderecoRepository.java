package com.lariicruz.sistema.vendas.repository;

import com.lariicruz.sistema.vendas.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {

	
	
}
																					