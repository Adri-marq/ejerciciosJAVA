package es.iescamas.Ejemplos3;

public class Tareas {
 private int id;
 private String titulo;
 private String modulo;
 private String estado;
 
 public Tareas(int id, String titulo,String modulo,String estado) {
	 this.estado=estado;
	 this.id=id;
	 this.modulo=modulo;
	 this.titulo=titulo;
 }

 public int getId() {
	return id;
 }

 public String getTitulo() {
	return titulo;
 }

 public String getModulo() {
	return modulo;
 }

 public String getEstado() {
	return estado;
 }
 
 public String toLinea() {
	 return id + ";" + titulo + ";"+ modulo + ";"+estado+".";
	 
 }
}
