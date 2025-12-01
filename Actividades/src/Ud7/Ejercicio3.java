package Ud7;

import java.util.Scanner;

public class Ejercicio3 {
public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	
	//he creado unas variables y les he dado unos valores
	int cuenta;
	do {
		//pregunto una opcion para poder modificar cuentacorriente
		System.out.println("Que cuenta quieres usar:");
		System.out.println("1) cuenta1 | 2) cuenta2 y cuenta3");
		cuenta=sc.nextInt();
	switch(cuenta){
		case 1:
			Ejercicio1.main(null);
		break;
		case 2:
			Ejercicio2.main(null);
			break;
		default:
			System.out.println("error");
	}
	}while(cuenta!=3);
	
	}
	
}
