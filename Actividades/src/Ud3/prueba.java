package Ud3;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int opcion;
	do  {
		System.out.println("1) saludar 2) despedir 3) salir");
		opcion = sc.nextInt();
	switch (opcion) {
		case 1 -> System.out.println("Hola");
		case 2 -> System.out.println("adios");
		case 3 -> System.out.println("saliendo...");
		default -> System.out.println("opcion invalida");
		}
	} while(opcion != 3);
	}

}
