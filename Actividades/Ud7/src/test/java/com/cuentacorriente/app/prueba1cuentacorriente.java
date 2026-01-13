package com.cuentacorriente.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class prueba1cuentacorriente {
	
	CuentaCorriente cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("inicio de la prueba");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	System.out.println("fin de la prueba");
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new CuentaCorriente(" "," ");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("1.- crear la cuenta")
	void testcrearcuenta() {
		 cuenta = new CuentaCorriente("adri","125433435D");
		
		int limiteesp = -50;
		int saldoesp = 0;
		assertEquals(limiteesp,cuenta.getLimitedesc(), "el limite es -50");
		assertEquals(saldoesp,cuenta.getSaldo(), "el saldo es 25");
	}
	
	@Test
	@DisplayName("2.- crear la cuenta")
	void testsacardinero() {
		 cuenta = new CuentaCorriente("adri","125433435D");
		cuenta.sacardinero(25);
		int limiteesp = -25;
		
		assertEquals(limiteesp,cuenta.getLimitedesc(), "el limite es -25");
	}
	
	@Test
	@DisplayName("3.- crear la cuenta")
	void testingresardinero() {
		 cuenta = new CuentaCorriente("adri","125433435D");
		cuenta.ingresardinero(25);
		int dineroesp = 25;
		
		assertEquals(dineroesp,cuenta.getSaldo(), "el saldo es 25");
	}
	
	@Test
	@DisplayName("4.- crear la cuenta")
	void testmostrarinfo() {
		 cuenta = new CuentaCorriente("adri","125433435D");
		cuenta.mostrarinfo();
		
	}
}
