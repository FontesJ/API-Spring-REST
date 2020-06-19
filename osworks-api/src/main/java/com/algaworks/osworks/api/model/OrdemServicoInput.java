package com.algaworks.osworks.api.model;

/* No método 'ordens-servico.criar', só é possível preencher os campos 'descrição', 'preço' e 'clienteId'.
*  portanto criei uma classe apenas para receber esses parâmetros, a fim de evitar possíveis problemas
*  com a classe principal
 */

import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrdemServicoInput {

	@NotBlank
	private String descricao;
	
	@NotNull
	private BigDecimal preco;
	
	@Valid
	@NotNull
	private ClienteIdInput cliente;	//UTILIZAMOS APENAS O ID DO CLIENTE PARA SELECIONÁ-LO

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public ClienteIdInput getCliente() {
		return cliente;
	}

	public void setCliente(ClienteIdInput cliente) {
		this.cliente = cliente;
	}

}
