package com.interfaces.Actividad7;

import java.util.Arrays;

public class Producto  implements Valorable,Mostrable,Comparable<Producto>{
	private String nombre;
	private double precio;
	private String codigo;
		
		
		public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


		public Producto (String nombre, double precio,String codigo) {
			this.nombre=nombre;
			this.precio=precio;
			this.codigo=codigo;
		}


		@Override
		public double getPrecio() {
			// TODO Auto-generated method stub
			return precio;
		}


		@Override
		public String getNombre() {
			// TODO Auto-generated method stub
			return nombre;
		}
		
		@Override
		public String toString() {
		    return nombre + " - " + precio;
		}
		
		static void ordenarPorPrecioAscYNombre(Valorable[] arr) { 
			
			for (int i = 0; i < arr.length - 1; i++) {
				  for (int j = 0; j < arr.length - 1 - i; j++) {
					  if(arr[j].getPrecio() > arr[j+1].getPrecio()) {
						  Valorable num=arr[j];
						  arr[j]=arr[j+1];
						  arr[j+1]=num;
					  }else if(arr[j].getPrecio() == arr[j+1].getPrecio()) {
						  if (arr[j].getNombre().compareToIgnoreCase(arr[j+1].getNombre()) > 0) {
				                Valorable va = arr[j];
				                arr[j] = arr[j+1];
				                arr[j+1] = va;
				            }
					  }
					  
				  }
		}
		}

static void ordenarPornombreAZ(Valorable[] arr) { 
			
			for (int i = 0; i < arr.length - 1; i++) {
				  for (int j = 0; j < arr.length - 1 - i; j++) {
					  if (arr[j].getNombre().compareToIgnoreCase(arr[j+1].getNombre()) > 0) {
			                Valorable va = arr[j];
			                arr[j] = arr[j+1];
			                arr[j+1] = va;
			            }
				  }
			}
		}


static void ordenarPorPrecioDesc(Valorable[] arr) { 
		
			for (int i = 0; i < arr.length - 1; i++) {
				  for (int j = 0; j < arr.length - 1 - i; j++) {
					  if(arr[j].getPrecio() < arr[j+1].getPrecio()) {
						  Valorable va=arr[j];
						  arr[j]=arr[j+1];
						  arr[j+1]=va;
				  }
			}
		}
	
	}


@Override
public String mostrar() {
	// TODO Auto-generated method stub
	return codigo + " - " + nombre + " - " + precio;
}


public int compareTo(Producto o) {
	int comparacion = getNombre().compareTo(o.getNombre());
	if( comparacion == 0) {
		 comparacion = Double.compare(o.getPrecio(), this.precio);
		
	}
	return comparacion;
}

}
