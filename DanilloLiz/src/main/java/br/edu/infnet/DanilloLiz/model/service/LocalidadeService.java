package br.edu.infnet.DanilloLiz.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.DanilloLiz.clients.IEnderecoClient;
import br.edu.infnet.DanilloLiz.model.domain.Endereco;

// O Objetivo desssa classe é encapsular a funcionalidade de várias APIs para o fornecimento na minha própria, mas só inclui a viacep atualmente.

@Service
public class LocalidadeService {
	
	@Autowired 
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
}
 