package com.interfaces.prueba;

public class Circulo implements TieneArea{

	 private double radio;

	  public Circulo(double radio){ this.radio = radio; }

	  @Override
	  public double getArea(){
	    return Math.PI * radio * radio;
	  }
}
