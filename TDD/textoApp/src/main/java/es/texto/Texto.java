package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {
 private int longmax;
 private String contenido;
	
 //constructor
 public Texto(int i) {
	 if( i<=0)
		 throw new IllegalArgumentException("maxLongitud debe ser > 0");
	this.longmax = i;
	this.contenido="";
	}
	
 public Texto(String string, int i) {
	 if( i<=0)
		 throw new IllegalArgumentException("maxLongitud debe ser > 0");
	 
	 if(string == null)
		 throw new IllegalArgumentException("contenidoInicial no puede ser null");
	
	 if(string != null && string.length()>i)
		 throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
	 
	 
	 this.longmax = i;
		this.contenido=string;
}

 //metodos
 public String getContenido() {
		
		return contenido;
	}
	public int longitud() {
	
		return contenido.length();
	}

	public boolean anadirFinal(char c) {
		if(contenido.length()<longmax) {
		contenido = contenido+c;
		return true;
		}else {
			return false;
		}
	}

	public boolean anadirInicio(char c) {
		
		return false;
	}

}
