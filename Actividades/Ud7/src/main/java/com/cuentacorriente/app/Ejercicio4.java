package com.cuentacorriente.app;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cuenta = new CuentaCorriente("david","122213434A");
		//esto no es visible por lo tanto no lo puedes hacer
		//cuenta.saldo=90;
		cuenta.nombre="matias";
		cuenta.mostrarinfo();
	}

}
