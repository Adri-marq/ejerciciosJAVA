package com.interfaces.Actividad3;

public class Bluetooth implements Conectable{
	private boolean conectado;
	
	
	public Bluetooth() {
		this.conectado=false;
	}
	@Override
	public void conectar() {
		if(conectado==false) {
			conectado=true;
		}
		System.out.println("Bluetooth conectado");
	}

	@Override
	public void desconectar() {
		if(conectado==true) {
			conectado=false;
		}
		System.out.println("Bluetooth desconectado");
	}

	@Override
	public boolean estaConectado() {
		if(conectado==true) {
			System.out.println("Bluetooth conectado");
			return true;
		}
		System.out.println("Bluetooth desconectado");
		return false;
	}
}
