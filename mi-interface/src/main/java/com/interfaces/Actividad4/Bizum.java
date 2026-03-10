package com.interfaces.Actividad4;

public class Bizum implements MetodoPago{
	private double saldo;
	private String telefono;


	public Bizum(double saldo,String telefono) {
		this.saldo=saldo;
		this.telefono=telefono;
	}


	@Override
	public boolean pagar(double importe) {
		if (importe < saldo) {
			saldo-=importe;
			return true;
		}
		return false;
	}
}
