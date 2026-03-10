package com.interfaces.Actividad8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		Validable[] validable = new Validable[6];
		Validable U1 = new Usuario("camion@pepe","1232322");
		Validable U2 = new Usuario("antonio","543234dasd");
		Validable U3 = new Usuario("avion@chato","carlos");
		Validable R4 = new Reserva("1/2/2004",30);
		Validable R5 = new Reserva("2/5/2014",-12);
		Validable R6= new Reserva("21/11/2022",333);
		validable[0]=U1;
		validable[1]=U2;
		validable[2]=U3;
		validable[3]=R4;
		validable[4]=R5;
		validable[5]=R6;
		
		for (Validable vali : validable) {
            try {
                vali.validar();
                System.out.print("\n Validación OK: ");
            } catch (Exception e) {
                System.out.print("\n Error de validación: " + e.getMessage() + " - ");
            }
            System.out.println(((Mostrable)vali).mostrar());
        }
		
		
		
		/*	
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
				
				System.out.println("1:nombre A-Z | 2:precio DESC |3: ambos");
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
				  }
				 
				 Producto[] productos = Arrays.copyOf(valorable, valorable.length, Producto[].class);

				 Arrays.sort(productos);
			        System.out.println("\n=== Ordenado por precio ascendente ===");
			        System.out.println(Arrays.toString(productos));

			 
			        Arrays.sort(productos, ComparadorProducto.PRECIO_DESC);
			        System.out.println("\n=== Ordenado por precio descendente ===");
			        System.out.println(Arrays.toString(productos));

			
			        Arrays.sort(productos, ComparadorProducto.CODIGO_AZ);
			        System.out.println("\n=== Ordenado por código A-Z ===");
			        System.out.println(Arrays.toString(productos));*/
}
}
