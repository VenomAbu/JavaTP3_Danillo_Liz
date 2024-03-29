package br.edu.infnet.DanilloLiz.model.domain;

// Esse arquivo faz parte da camada de models, que serve para fazer as classes bases que representam entidades e outras coisas da minha aplicação.

// Aqui estão atributos, construtores, métodos e os getters and setters

public class Endereco {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	@Override
	public String toString() {
		return cep + ";" + logradouro + ";" + bairro;
	}
	
	public Endereco() {
		
	}
	
	public Endereco(String cep) {
		this();
		this.cep = cep;
	}
	
	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this(cep);
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.uf = uf;
	}



	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
}
