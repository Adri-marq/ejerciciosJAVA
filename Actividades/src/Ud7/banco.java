package Ud7;


public class banco {
	
	 private final String nombre;          // no modificable
	    private double capital;
	    private String direccionCentral;

	    // Constructor con capital por defecto
	    public banco(String nombre) {
	        this.nombre = nombre;
	        this.capital = 5200000;
	    }

	    // Constructor completo
	    public banco(String nombre, double capital, String direccionCentral) {
	        this.nombre = nombre;
	        this.capital = capital;
	        this.direccionCentral = direccionCentral;
	    }
	}	

   
