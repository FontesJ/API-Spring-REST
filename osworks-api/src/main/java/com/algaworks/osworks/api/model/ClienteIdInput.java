package com.algaworks.osworks.api.model;

/*No método 'ordens-servico.criar', é necessário apenas inserir o ID do cliente já cadastrado,
*portanto criei uma classe apenas para receber esse atributo, evitando assim que ocorram possíveis erros
*com a classe pricipal
 */
import javax.validation.constraints.NotNull;

public class ClienteIdInput {		//CLASSE PARA INPUT DE ID NO MÉTODO POST

	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
