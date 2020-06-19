package com.algaworks.osworks.api.model;

//Classe para retornar apenas o ID e Nome do cliente quando solicitado pelos GETs

public class ClienteResumoModel {

	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
