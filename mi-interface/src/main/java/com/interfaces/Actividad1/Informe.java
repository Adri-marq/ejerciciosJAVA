package com.interfaces.Actividad1;

public class Informe implements Imprimible{
	 private String titulo;
	 private String autor;
	 private int paginas;
	 
	 
	 public Informe(String titulo,String autor, int paginas) {
		 this.titulo=titulo;
		 this.autor=autor;
		 this.paginas=paginas;
	 }
	 
	 @Override
	 public String imprimir() {
		return "Titulo: "+titulo+" autor: "+autor+" paginas: "+paginas;
		 
	 }
}
