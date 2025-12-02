package com.cuentacorriente.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	CuentaCorriente cc;
		
	@BeforeEach
	void setUp() throws Exception {
	cc = new CuentaCorriente("juan","iddd2");
	}

	@Test
	void testsacardinero() {
		cc.sacardinero(10);
		int saldoesperado=40;
		int saldo=cc.getLimitedesc();
		assertEquals(saldoesperado,saldo);
	}

}
