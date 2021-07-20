package com.nelioalves.mc.repository;


import com.nelioalves.mc.domain.enums.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {

	
	
}
																					