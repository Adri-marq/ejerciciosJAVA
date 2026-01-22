package com.fm.app;

public class Sintonizador {
//atributos
	private double frecuencia;
	private final double frecuencia_max=108;
	private final double frecuencia_min=80;
//constructo
 public Sintonizador() {
	 this.frecuencia=80.0;
 }
//metodos
 
 public double getFrecuencia() {
	return frecuencia;
}

 public void setFrecuencia(double frecuencia) {
	this.frecuencia = frecuencia;
 }

 public double getFrecuencia_max() {
	return frecuencia_max;
 }

 public double getFrecuencia_min() {
	return frecuencia_min;
 }

 public double up() {
if(frecuencia < frecuencia_max ) {
	frecuencia = frecuencia + 0.5;
	 return frecuencia;
}else if (frecuencia + 0.5 > frecuencia_max ){
	frecuencia = frecuencia_min;
	return frecuencia;
}
return frecuencia;
}

 public double down() {
if(frecuencia > frecuencia_min ) {
	 frecuencia= frecuencia - 0.5;
	 return frecuencia;	
}else if (frecuencia - 0.5 < frecuencia_min ){
		frecuencia = frecuencia_max;
		return frecuencia;	
}
return frecuencia;

	 }

 public void display() {
	 System.out.println("la frecuencia es :"+frecuencia + "MHz");
}
}