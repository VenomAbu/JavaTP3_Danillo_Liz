package br.edu.infnet.DanilloLiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.DanilloLiz.model.domain.Treinador;

@SpringBootTest
class TreinadorTests {

	
	@Test
	void TreinadorCampeao() {
		Treinador t1 = new Treinador();
		t1.setNome("Daigo Umehara");
		t1.setRegistro(1);
		t1.setSalario(4000);
		t1.setExCampeao(true);
		System.out.println();
		
		assertEquals("Daigo Umehara", t1.getNome());
		assertEquals(1, t1.getRegistro());
		assertEquals(4000, t1.getSalario());
		assertEquals(true, t1.isExCampeao());
		assertEquals("Sim", t1.VerificarCampeao());
		assertEquals(6000, t1.CalcularSalarioCampeao());
	}

	@Test
	void TreinadorNãoCampeão() {
		Treinador t1 = new Treinador();
		t1.setNome("Nephew");
		t1.setRegistro(2);
		t1.setSalario(4000);
		t1.setExCampeao(false);
		System.out.println();
		
		assertEquals("Nephew", t1.getNome());
		assertEquals(2, t1.getRegistro());
		assertEquals(4000, t1.getSalario());
		assertEquals(false, t1.isExCampeao());
		assertEquals("Não", t1.VerificarCampeao());
		assertEquals(4000, t1.CalcularSalarioCampeao());
	}	

}
