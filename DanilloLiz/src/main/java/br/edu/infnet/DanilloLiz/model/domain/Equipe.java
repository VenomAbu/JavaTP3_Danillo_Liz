package br.edu.infnet.DanilloLiz.model.domain;

import java.util.List;

// Esse arquivo faz parte da camada de models, que serve para fazer as classes bases que representam entidades e outras coisas da minha aplicação.

// Aqui estão atributos, construtores, métodos e os getters and setters

public class Equipe {
	private String nome;
	private String email;
	private List<Treinador> treinadores;
	private Endereco endereco;
	
	public Equipe() {
		
	}
	
	public Equipe(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Equipe(String nome, String email) {
		this(nome);
		this.setEmail(email);
	}
	
	// Esse contrutor é capaz de receber o atributo endereço
	public Equipe(String nome, String email, Endereco endereco) {
		this(nome, email);
		this.setEndereco(endereco);
	}
	
	@Override
	public String toString() {
		return "Equipe: " + nome + " - " + email + " - " + endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Treinador> getTreinadores() {
		return treinadores;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTreinadores(List<Treinador> treinadores) {
		this.treinadores = treinadores;
	}
}

