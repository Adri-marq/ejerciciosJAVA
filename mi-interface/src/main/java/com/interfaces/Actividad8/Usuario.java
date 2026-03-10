package com.interfaces.Actividad8;

public class Usuario implements Validable,Mostrable{
	private String email;
	private String password;

	public Usuario (String email,String password) {
		this.email=email;
		this.password=password;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Usuario: " + email + ", contraseña: " + password;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if(!email.contains("@")) {
			throw new IllegalArgumentException("no contiene @");
		}
		if(password.length() < 8) {
			throw new IllegalArgumentException("debe de tener mas de 8 letras");
		}
		
	}
}
