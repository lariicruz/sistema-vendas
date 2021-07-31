package com.lariicruz.sistema.vendas.services;


import com.lariicruz.sistema.vendas.domain.Pedido;
import com.lariicruz.sistema.vendas.repository.PedidoRepository;
import com.lariicruz.sistema.vendas.services.exeption.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Pedido obj = repo.findById(id).orElse(null);

		if (obj == null)  {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipos" + Pedido.class.getName());
		}
		return obj;
	}
}
