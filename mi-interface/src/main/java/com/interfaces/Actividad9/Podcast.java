package com.interfaces.Actividad9;

public class Podcast implements Reproducible, Mostrable{
	private Estado estado = Estado.stop;
	 private String nombre;
	 private String autor;
	 private int duracion;
	 public Podcast (String nombre , String autor,int duracion) {
		 this.autor=autor;
		 this.nombre=nombre;
		 this.duracion=duracion;
	 }
		
		@Override
		public String mostrar() {
			
			return "Nombre: "+nombre + " - autor: "+autor+" - duracion: "+duracion+"m - estado: "+estado;
		}

		@Override
		public void play() {
		estado=Estado.Play;
		mostrar();
		}

		@Override
		public void pause() {
			if(estado == Estado.Play) {
					estado=Estado.pause;
					mostrar();
			}
			mostrar();
		}

		@Override
		public void stop() {
			estado=Estado.stop;
			mostrar();
		}
}
