package com.interfaces.Actividad3;

public class Wifi implements Conectable{
private boolean conectado;
	
	
public Wifi() {
	this.conectado=false;
}
	@Override
	public void conectar() {
		if(conectado==false) {
			conectado=true;
		}
		System.out.println("Wifi conectado");
	}

	@Override
	public void desconectar() {
		if(conectado==true) {
			conectado=false;
		}
		System.out.println("Wifi desconectado");
	}

	@Override
	public boolean estaConectado() {
		if(conectado==true) {
			System.out.println("Wifi conectado");
			return true;
		}
		System.out.println("Wifi desconectado");
		return false;
	}

}
