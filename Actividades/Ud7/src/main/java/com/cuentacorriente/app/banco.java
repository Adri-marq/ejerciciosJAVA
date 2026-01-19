package com.cuentacorriente.app;


public class banco {
	
	 private final String nombre;          // no modificable
	    private double capital;
	    private String direccionCentral;

	    // Constructor con capital por defecto
	    public banco(String nombre) {
	        this.nombre = nombre;
	        this.capital = 5200000;
	    }

	    public String getNombre() {
			return nombre;
		}

	}	

   
