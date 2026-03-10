package com.interfaces.Actividad4;

public class Efectivo implements MetodoPago{
	private double dinero;
	
	public Efectivo(double dinero) {
		this.dinero=dinero;
	}
	
	@Override
	public boolean pagar(double importe) {
		if (importe < dinero) {
			dinero-=importe;
			return true;
		}
		return false;
	}

}
