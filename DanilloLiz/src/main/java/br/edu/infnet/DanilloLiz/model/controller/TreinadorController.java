package br.edu.infnet.DanilloLiz.model.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.DanilloLiz.model.domain.Equipe;
import br.edu.infnet.DanilloLiz.model.domain.Treinador;
import br.edu.infnet.DanilloLiz.model.service.EquipeService;
import br.edu.infnet.DanilloLiz.model.service.TreinadorService;

@RestController
@RequestMapping("/api/treinador")
public class TreinadorController {
	
	@Autowired
	private TreinadorService treinadorService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Treinador treinador) {
		treinadorService.incluir(treinador);
	}
	
	@DeleteMapping(value = "/{registro}/excluir")
	public void excluir(@PathVariable int registro) {
		treinadorService.excluir(registro);
		
	}
	
	@GetMapping(value = "/listar")
	public Collection<Treinador> obterLista(){
		return treinadorService.obterLista();
	}
	
	@GetMapping(value = "/{registro}/listar")
	public Treinador obter (@PathVariable int registro) {
		return treinadorService.obter(registro);
	}
}