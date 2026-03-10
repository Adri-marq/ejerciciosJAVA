package com.interfaces.Actividad4;

public class Caja {

public boolean Cobrar( MetodoPago mp, double importe) {
	if(mp.pagar(importe)) {
		System.out.println("El pago se ha realizado");
		return true;
	}
	System.out.println("el pago no se ha realizado");
	return false;
}
}
