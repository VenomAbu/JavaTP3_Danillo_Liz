package br.edu.infnet.DanilloLiz.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.DanilloLiz.model.domain.Endereco;
import br.edu.infnet.DanilloLiz.model.service.LocalidadeService;

@RestController
@RequestMapping("/api/localidade")
public class LocalidadeController {

	@Autowired
	private LocalidadeService localidadeService;
	
	@GetMapping(value = "/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		return localidadeService.obterPorCep(cep);
	}
}
