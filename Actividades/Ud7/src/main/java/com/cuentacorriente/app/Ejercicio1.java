package com.cuentacorriente.app;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	//he creado unas variables y les he dado unos valores
	String nombre, dni;
	int opcion, dinero;
	System.out.println("nombre del titular de la cuenta:");
	nombre = sc.nextLine();
	System.out.println("DNI del titular de la cuenta:");
	dni=sc.nextLine();
	//luego he añadido la clase cuenta corriente
	CuentaCorriente cuenta = new CuentaCorriente(nombre,dni);
	//con un bucle he hecho que muetre la informacion que tiene cuentainfo
	do {
		cuenta.mostrarinfo();
		//pregunto una opcion para poder modificar cuentacorriente
		System.out.println("Que quieres hacer:");
		System.out.println("1) sacar dinero | 2) ingresar dinero | 3) salir");
		opcion=sc.nextInt();
	switch(opcion){
		case 1:
			System.out.println("cuanto dinero deseas sacar:");
			dinero =sc.nextInt();
			cuenta.sacardinero(dinero);
		break;
		case 2:
			System.out.println("cuanto dinero deseas ingresar:");
			dinero =sc.nextInt();
			cuenta.ingresardinero(dinero);
			break;
		case 3:
			System.out.println("adios");
			break;
		default:
			System.out.println("error");
	}
	}while(opcion!=3);
	
	
	}

}
