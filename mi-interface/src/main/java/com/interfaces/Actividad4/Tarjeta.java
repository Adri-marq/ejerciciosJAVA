package com.interfaces.Actividad4;

public class Tarjeta implements MetodoPago {
private double saldo;
private double limite;


public Tarjeta(double saldo,double limite) {
	this.saldo=saldo;
	this.limite=limite;
}


@Override
public boolean pagar(double importe) {
	if (importe <= limite) {
		if (importe < saldo) {
			saldo-=importe;
			return true;
		}
	}
	
	return false;
}




}
