package com.lariicruz.sistema.vendas.domain;

import com.lariicruz.sistema.vendas.domain.enums.EstadoPagamento;
import com.lariicruz.sistema.vendas.domain.enums.Pagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;
    private Integer numeroDeParcela;

    public PagamentoComCartao() {
        // TODO Auto-generated constructor stub
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcela) {
        super(id, estado, pedido);
        this.numeroDeParcela = numeroDeParcela;
    }

    public Integer getNumeroDeParcela() {
        return numeroDeParcela;
    }

    public void setNumeroDeParcela(Integer numeroDeParcela) {
        this.numeroDeParcela = numeroDeParcela;
    }

}
