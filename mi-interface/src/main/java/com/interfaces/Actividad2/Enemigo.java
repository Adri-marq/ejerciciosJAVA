package com.interfaces.Actividad2;

public class Enemigo implements Danable{
	private int vida;
	private String tipo;

	public Enemigo(int vida, String tipo) {
		this.vida=vida;
		this.tipo=tipo;
	}

	@Override
	public void recibirdanio(int puntos) {
			vida-=puntos;
		if(vida<=0) {
			System.out.println(tipo +": KO");
		}else if(vida>0){
			System.out.println(tipo+": "+vida);
		}
		
	}
}
