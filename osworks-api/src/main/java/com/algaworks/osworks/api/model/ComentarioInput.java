package com.algaworks.osworks.api.model;

import javax.validation.constraints.NotBlank;

public class ComentarioInput {	//Classe para inserir apenas a descrição no método 'cometarios.criar'

	@NotBlank
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
