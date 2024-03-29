package br.edu.infnet.DanilloLiz.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.DanilloLiz.model.domain.Endereco;

// Esse é arquivo é uma interface para servir de ponte com a API de viacep, sua camada externa seria a LocalidadeService. 

@FeignClient(url = "https://viacep.com.br/ws", name = "EnderecoClient")
public interface IEnderecoClient {
	
	@GetMapping(value = "/{cep}/json/")
	Endereco obterPorCep(@PathVariable String cep);
}
