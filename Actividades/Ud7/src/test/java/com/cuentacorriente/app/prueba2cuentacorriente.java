package com.cuentacorriente.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class prueba2cuentacorriente {

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
		cuenta = new CuentaCorriente(0);
		cuenta = new CuentaCorriente(" ",0,0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("1.- constructor CuentaCorriente")
	void testsaldoini() {
		cuenta = new CuentaCorriente(10);
		cuenta.mostrarinfo();
	}
	
	@Test
	@DisplayName("1.- constructor CuentaCorriente")
	void testsaldoinilimitedescDNI() {
		cuenta = new CuentaCorriente("1235435D",10,45);
		cuenta.mostrarinfo();
	}

}
