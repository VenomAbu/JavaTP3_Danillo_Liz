package br.edu.infnet.DanilloLiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.DanilloLiz.model.domain.Endereco;
import br.edu.infnet.DanilloLiz.model.domain.Equipe;
import br.edu.infnet.DanilloLiz.model.domain.Treinador;
import br.edu.infnet.DanilloLiz.model.service.EquipeService;
import br.edu.infnet.DanilloLiz.model.service.LocalidadeService;
import br.edu.infnet.DanilloLiz.model.service.TreinadorService;

// Esse é arquivo é parte da camada Loader, que roda junto da main. 


// @Component associa a classe ao framework
// implements ApplicationRunner faz que o método obrigatório run seja executado junto do main
@Component
public class EquipeLoader implements ApplicationRunner {
	
	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EquipeService equipeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Instanciar obj EquipeService para usar seus métodos
		// Testar alguns métodos CRUD do EquipeService
		
		
		 // Criação de um endereço padrão para facilitar minha vida
		 Endereco equipeEndereco = localidadeService.obterPorCep("20010020");
		 
		 // Criação das equipes usando seus respectivos construtores
		 Equipe e1 = new Equipe("Liquid" , "LiquidTeam@mail", equipeEndereco);
		 Equipe e2 = new Equipe("Solid", "SolidTeam@mail", equipeEndereco);
		 Equipe e3 = new Equipe("Wolfs", "WolfsTeam@mail", equipeEndereco);
		 
		 // Relacionando com os treinadores
		 
		 // AINDA NÃO SEI COMO FAZER, QUE COISA!
		 
		equipeService.incluir(e1);
		equipeService.incluir(e2);
		equipeService.incluir(e3);
		
		System.out.println(" - " + equipeService.obterLista());
	}
}
