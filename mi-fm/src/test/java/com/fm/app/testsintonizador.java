package com.fm.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testsintonizador {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	Sintonizador sintonizador;
	@BeforeEach
	void setUp() throws Exception {
		sintonizador = new Sintonizador();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	
	}

	@Test
	void testconstructor() {
		double valoresperado= 80.0;
		double valor = sintonizador.getFrecuencia();
		assertEquals(valoresperado,valor);
	}

}
