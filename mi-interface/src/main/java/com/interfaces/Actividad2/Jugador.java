package com.interfaces.Actividad2;

public class Jugador implements Danable {
private int vida;
private String nombre;

public Jugador(int vida, String nombre) {
	this.vida=vida;
	this.nombre=nombre;
}

@Override
public void recibirdanio(int puntos) {
		vida-=puntos;
	if(vida<=0) {
		System.out.println(nombre+ ": KO");
	}else if(vida>0){
		System.out.println(nombre+": "+vida);
	}
	
}


}
