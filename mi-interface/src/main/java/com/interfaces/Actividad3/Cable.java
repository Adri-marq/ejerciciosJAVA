package com.interfaces.Actividad3;

public class Cable implements Conectable{
	private boolean conectado;
	
	
	public Cable() {
		this.conectado=false;
	}
	@Override
	public void conectar() {
		if(conectado==false) {
			conectado=true;
		}
		System.out.println("Cable conectado");
	}

	@Override
	public void desconectar() {
		if(conectado==true) {
			conectado=false;
		}
		System.out.println("Cable desconectado");
	}

	@Override
	public boolean estaConectado() {
		if(conectado==true) {
			System.out.println("Cable conectado");
			return true;
		}
		System.out.println("Cable desconectado");
		return false;
	}
}
