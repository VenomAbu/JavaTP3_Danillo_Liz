package br.edu.infnet.DanilloLiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.DanilloLiz.model.domain.Equipe;
import br.edu.infnet.DanilloLiz.model.service.EquipeService;

@SpringBootTest
public class EquipeServiceTestes {
	
	private EquipeService equipeservice;
	
	@BeforeEach
	void setUp() {
		equipeservice = new EquipeService();
	}
	
	@Test
	void inclusao() {
		Equipe equipe = new Equipe("Liquid" , "LiquidTeam@mail");
		equipeservice.incluir(equipe);
		
		assertEquals(equipe, equipeservice.obter("Liquid"));
	}
	
	@Test
	void esclusao() {
		equipeservice.excluir(null);
	}
	
	@Test
	void recuperacaoTotal() {
		equipeservice.obter(null);
	}
	
	@Test
	void inclusaoMockito() {
	//
	}


}
