package com.interfaces.Actividad7;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		Valorable[] valorable = new Valorable[6];
				
				Valorable p1 = new Producto("camion",12,"1");
				Valorable p2 = new Producto("coche",7,"2");
				Valorable p3 = new Producto("avion",7,"3");
				Valorable p4 = new Producto("grua",30,"4");
				Valorable p5 = new Producto("lancha",87,"5");
				Valorable p6= new Producto("velero",55,"6");
				valorable[0]=p1;
				valorable[1]=p2;
				valorable[2]=p3;
				valorable[3]=p4;
				valorable[4]=p5;
				valorable[5]=p6;
				
				System.out.println( "Normal:");
				 System.out.println(Arrays.toString(valorable));
				
				/*System.out.println("1:nombre A-Z | 2:precio DESC |3: ambos");
				  int opt = sc.nextInt();
				  
				  switch(opt) {
				  case 1:
					  System.out.println("Ordenao por nombre A-Z:");
					  Producto.ordenarPornombreAZ(valorable);
					  System.out.println(Arrays.toString(valorable));
					  break;
				  case 2:
					  System.out.println("Ordenao por precio DESC:");
					 Producto.ordenarPorPrecioDesc(valorable);
					  System.out.println(Arrays.toString(valorable));
					  break;
				  case 3:
					  System.out.println("Ordenao por ambos:");
					  Producto.ordenarPornombreAZ(valorable);
					  System.out.println(Arrays.toString(valorable));
					  Producto.ordenarPorPrecioDesc(valorable);
					  System.out.println(Arrays.toString(valorable));
					  break;
				  }*/
				 
				 Producto[] productos = Arrays.copyOf(valorable, valorable.length, Producto[].class);

				 Arrays.sort(productos);
			        System.out.println("Ordenado por precio ascendente ");
			        System.out.println(Arrays.toString(productos));

			 
			        Arrays.sort(productos, ComparadorProducto.PRECIO_DESC);
			        System.out.println("Ordenado por precio descendente ");
			        System.out.println(Arrays.toString(productos));

			
			        Arrays.sort(productos, ComparadorProducto.CODIGO_AZ);
			        System.out.println("Ordenado por código A-Z ");
			        System.out.println(Arrays.toString(productos));
}
}
