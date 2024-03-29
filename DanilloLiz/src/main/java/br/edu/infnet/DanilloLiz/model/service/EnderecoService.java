package br.edu.infnet.DanilloLiz.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.DanilloLiz.model.domain.Endereco;

// Esse arquivo faz parte da camada Service, camada feita para manipular uma classe, dados e outras coisas.
// Nessa camada eu simulo um banco de dados usando um MAP e simulo um CRUD usando os métodos.

@Service 
public class EnderecoService {
	
	private static Map<String, Endereco> enderecos = new HashMap<String, Endereco>();
	
	public void incluir(Endereco endereco) {
		enderecos.put(endereco.getCep(), endereco);
	}
	
	public void excluir (String cep) {
		enderecos.remove(cep);
	}
	
	public Collection<Endereco> obterLista(){
		return enderecos.values();
	}
	
	public Endereco obter(String cep) {
		return enderecos.get(cep);
	}
}
