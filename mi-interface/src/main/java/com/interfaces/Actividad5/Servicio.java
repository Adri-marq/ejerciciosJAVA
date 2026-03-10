package com.interfaces.Actividad5;

public class Servicio implements Descuentable{
private String descripcion;
private double tarifa;
	
	
	public Servicio (String descripcion, double tarifa) {
		this.descripcion=descripcion;
		this.tarifa=tarifa;
	
	}




	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return tarifa;
	}
}