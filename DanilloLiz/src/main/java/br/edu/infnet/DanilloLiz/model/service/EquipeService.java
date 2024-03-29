package br.edu.infnet.DanilloLiz.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.DanilloLiz.model.domain.Equipe;

//  arquivo faz parte da camada Service, camada feita para manipular uma classe, dados e outras coisas.
// Nessa camada eu simulo um banco de dados usando um MAP e simulo um CRUD usando os métodos.

@Service
public class EquipeService {
	
	// Pseudo banco de dados em forma de MAP para guardar as equipes
	private static Map<String, Equipe> equipes = new HashMap<String, Equipe>();
	
	
	// Criação do CRUD
	public void incluir(Equipe equipe) {
		equipes.put(equipe.getNome(), equipe);
	}
	
	public void excluir(String nome) {
		equipes.remove(nome);
	}
	
	public Collection<Equipe> obterLista() {
		return equipes.values();
	}
	
	public Equipe obter(String nome){
		return equipes.get(nome);
	}
}
