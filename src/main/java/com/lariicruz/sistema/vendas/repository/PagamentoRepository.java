package com.lariicruz.sistema.vendas.repository;


import com.lariicruz.sistema.vendas.domain.enums.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {

	
	
}
																					