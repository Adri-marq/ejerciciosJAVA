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
	banco banco;
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
		banco = new banco("bankinter");
		cuenta = new CuentaCorriente(0);
		cuenta = new CuentaCorriente(" ",0,0);
		cuenta = new CuentaCorriente(" "," ");
		cuenta = new CuentaCorriente(" "," ",banco);
		cuenta = new CuentaCorriente(" ",banco);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("1.- constructor CuentaCorriente")
	void testsaldoini() {
		System.out.println("\n saldoini \n");
		cuenta = new CuentaCorriente(10);
		cuenta.mostrarinfo();
	}
	
	@Test
	@DisplayName("2.- constructor CuentaCorriente")
	void testsaldoinilimitedescDNI() {
		System.out.println("\n saldoini, limitedesc y dni \n");
		cuenta = new CuentaCorriente("1235435D",10,45);
		cuenta.mostrarinfo();
	}
	
	@Test
	@DisplayName("3.- constructor CuentaCorriente")
	void testNombreDNI() {
		System.out.println("\n nombre y dni \n" );
		cuenta = new CuentaCorriente("carlos","1235435D");
		cuenta.mostrarinfo();
	}
	
	@Test
	@DisplayName("4.- constructor CuentaCorriente")
	void testNombreDNIBanco() {
		System.out.println("\n nombre, dni y banco \n" );
		cuenta = new CuentaCorriente("carlos","1235435D",banco);
		cuenta.mostrarinfo();
	}

	@Test
	@DisplayName("5.- constructor CuentaCorriente")
	void testNombreBancobanco() {
		System.out.println("\n nombrebanco y banco \n" );
		cuenta = new CuentaCorriente("bankinter",banco);
		cuenta.mostrarinfo();
	}
}
