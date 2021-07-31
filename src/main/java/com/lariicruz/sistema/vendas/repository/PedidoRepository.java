package com.lariicruz.sistema.vendas.repository;

import com.lariicruz.sistema.vendas.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

	
	
}
																					