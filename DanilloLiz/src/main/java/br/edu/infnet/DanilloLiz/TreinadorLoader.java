package br.edu.infnet.DanilloLiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.DanilloLiz.model.domain.Equipe;
import br.edu.infnet.DanilloLiz.model.domain.Treinador;
import br.edu.infnet.DanilloLiz.model.service.EquipeService;
import br.edu.infnet.DanilloLiz.model.service.LocalidadeService;
import br.edu.infnet.DanilloLiz.model.service.TreinadorService;

// Esse é arquivo é parte da camada Loader, que roda junto da main. 


@Component
public class TreinadorLoader implements ApplicationRunner {
	
	@Autowired
	private TreinadorService treinadorService;
	@Autowired
	private EquipeService equipeService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Instanciando 2 novos treinadores
		Treinador t1 = new Treinador(1, "Daigo Umehara");
		Treinador t2 = new Treinador(2, "Tokido");
		
		// Relacionando com as Equipes
		t1.setEquipe(equipeService.obter("Liquid"));
		t2.setEquipe(equipeService.obter("Liquid"));
		
		// Incluindo eles no pseudo banco de dados 
		treinadorService.incluir(t1);
		treinadorService.incluir(t2);
		
		// Exibindo-os no console
		System.out.println(treinadorService.obterLista());
		
	}
}

