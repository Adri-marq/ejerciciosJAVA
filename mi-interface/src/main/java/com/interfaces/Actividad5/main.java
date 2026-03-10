package com.interfaces.Actividad5;

public class main {

	public static void main(String[] args) {
		Descuentable[] descuentable = new Descuentable[2];
	
		Producto p1 = new Producto("p1",20);
		Servicio s1 = new Servicio("s1",100.5);
		descuentable[0]=p1;
		descuentable[1]=s1;
		
		for (Descuentable des : descuentable) {
			System.out.println("base: "+des.precioBase()+" descuento:"+des.precioFinal(50));
		}
		
	
	}

}
