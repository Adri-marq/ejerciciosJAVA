package com.interfaces.Actividad6;

public class Producto  implements Valorable{
	private String nombre;
	private double precio;
	private String codigo;
		
		
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
}
