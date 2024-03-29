package br.edu.infnet.DanilloLiz.model.domain;

//Esse arquivo faz parte da camada de models, que serve para fazer as classes bases que representam entidades e outras coisas da minha aplicação.

//Aqui estão atributos, construtores, métodos e os getters and setters


public class Treinador {

	private int registro;
	private String nome;
	private float salario;
	private boolean exCampeao;
	private Equipe equipe;
	
	
	public Treinador() {
		this.nome = null;
		this.salario = 0;
		this.exCampeao = false;
		this.equipe = null;
		
	}
	
	public Treinador(int registro, String nome) {
		this();
		this.registro = registro;
		this.nome = nome;
	}
	
	public Treinador(int registro, String nome, Equipe equipe) {
		this();
		this.registro = registro;
		this.nome = nome;
		this.equipe = equipe;
	}
	
	@Override
	public String toString() {
		return "Treinador: " + nome;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isExCampeao() {
		return exCampeao;
	}
	public void setExCampeao(boolean exCampeao) {
		this.exCampeao = exCampeao;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	// Método que aumenta o salário em 50% caso o treinador seja um renomado ex-campeão.
	public float CalcularSalarioCampeao() {
		if(exCampeao) {
			return (float) (this.salario*1.5);
		} else {
			return this.salario;
		}
	}
	
	
	// Método que retorna uma string que diz se o objeto é ou não campeão
	public String VerificarCampeao() {
		return exCampeao? "Sim" : "Não";
	}
}
