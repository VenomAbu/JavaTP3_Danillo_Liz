package br.edu.infnet.DanilloLiz.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.DanilloLiz.model.domain.Treinador;

// Esse arquivo faz parte da camada Service, camada feita para manipular uma classe, dados e outras coisas.
// Nessa camada eu simulo um banco de dados usando um MAP e simulo um CRUD usando os métodos.

@Service
public class TreinadorService {
	
	private static Map<Integer, Treinador> treinadores = new HashMap<Integer, Treinador>();
	
	
	public void incluir(Treinador treinador) {
		treinadores.put(treinador.getRegistro(), treinador);
	}
	
	public void excluir(int registro) {
		treinadores.remove(registro);
	}
	
	public Collection<Treinador> obterLista(){
		return treinadores.values();
	}
	
	public Treinador obter (int registro) {
		return treinadores.get(registro);
	}
}
