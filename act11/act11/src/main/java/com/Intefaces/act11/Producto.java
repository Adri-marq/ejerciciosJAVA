package com.Intefaces.act11;

import java.time.LocalDate;

public class Producto implements Mostrable,Identificable{
private String id;
private String nombre;
private double precio;
private CategoriaProducto categoria;
private LocalDate fechaCaducidad;

public Producto(String nombre,double precio,CategoriaProducto categoria,LocalDate fechaCaducidad) {
this.nombre=nombre;
	this.precio=precio;
	this.categoria=categoria;
	this.fechaCaducidad=fechaCaducidad;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public CategoriaProducto getCategoria() {
	return categoria;
}

public void setCategoria(CategoriaProducto categoria) {
	this.categoria = categoria;
}

public LocalDate getFechaCaducidad() {
	return fechaCaducidad;
}

public void setFechaCaducidad(LocalDate fechaCaducidad) {
	this.fechaCaducidad = fechaCaducidad;
}

 public String toString() {
	 
	 return "nombre: "+nombre+ " - precio: "+precio+" - categoria:"+categoria+" - fecha de caducidad: "+fechaCaducidad;
 }
@Override
public String mostrar() {
	// TODO Auto-generated method stub
	return toString();
}

}
