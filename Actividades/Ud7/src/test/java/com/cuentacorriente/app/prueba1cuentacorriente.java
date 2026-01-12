package com.cuentacorriente.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class prueba1cuentacorriente {

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
		CuentaCorriente cuenta = new CuentaCorriente(" "," ");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("1.- crear la cuenta")
	void testcrearcuenta() {
		CuentaCorriente cuenta = new CuentaCorriente("adri","125433435D");
		
		int limiteesp = 50;
		
		assertEquals(limiteesp,cuenta.getLimitedesc(), "el limite es -50");
	}
	
	@Test
	@DisplayName("2.- crear la cuenta")
	void testsacardinero() {
		CuentaCorriente cuenta = new CuentaCorriente("adri","125433435D");
		cuenta.sacardinero(25);
		int limiteesp = 25;
		
		assertEquals(limiteesp,cuenta.getLimitedesc(), "el limite es -50");
	}

}
