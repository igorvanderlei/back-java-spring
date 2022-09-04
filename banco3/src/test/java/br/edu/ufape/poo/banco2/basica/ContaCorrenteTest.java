package br.edu.ufape.poo.banco2.basica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaCorrenteTest {
	private Conta c;

	@BeforeEach
	void setUp() throws Exception {
		c = new ContaCorrente("123", 100);
	}

	@Test
	void debitar() {
		try {
			c.debitar(50);
			assertEquals(c.getSaldo(), 50);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}

}
