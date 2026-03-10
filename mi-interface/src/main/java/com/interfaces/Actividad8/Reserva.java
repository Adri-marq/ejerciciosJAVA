package com.interfaces.Actividad8;

public class Reserva implements Validable,Mostrable{
	private String fecha;
	private int numPersonas;

	public Reserva (String fecha,int numPersonas) {
		this.fecha=fecha;
		this.numPersonas=numPersonas;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Reserva: fecha=" + fecha + ", personas=" + numPersonas;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if(numPersonas <= 0) {
			throw new IllegalArgumentException("debe tener al menos 1 persona");
		}
		
	}
}
