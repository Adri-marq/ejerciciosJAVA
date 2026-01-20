package com.fm.app;

public class Sintonizador {
//atributos
	private double frecuencia_ini;
	private final double frecuencia_max=108;
	private final double frecuencia_min=80;
//constructo
 public Sintonizador() {
	 this.frecuencia_ini=80;
 }
//metodos
 
 public void up() {
if(frecuencia_ini < frecuencia_max ) {
	frecuencia_ini= frecuencia_ini + 0.5;
}

 }

 public void down() {
if(frecuencia_ini < frecuencia_min ) {
	 frecuencia_ini= frecuencia_ini - 0.5;
	}

	 }

 public void display() {
	 System.out.println("la frecuncia es :"+frecuencia_ini);
}
}